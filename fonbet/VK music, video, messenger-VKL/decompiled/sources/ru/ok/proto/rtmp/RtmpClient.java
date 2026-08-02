package ru.ok.proto.rtmp;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.media.utils.NullOutputStream;
import ru.ok.media.utils.WeightedAverage;
import ru.ok.proto.messages.ProtoMessageBase;
import ru.ok.proto.rtmp.RtmpMessages;
import ru.ok.proto.rtmp.amf.AmfEntry;
import ru.ok.proto.rtmp.amf.AmfUtil;
import xsna.lhg;
import xsna.qlb0;
import xsna.tgw;
import xsna.wlb0;

/* loaded from: classes9.dex */
public class RtmpClient {
    public static final int CHUNK_STREAM_ID = 3;
    private static final int CONTROL_STREAM_ID = 2;
    private static final String ON_METADATA = "onMetaData";
    private static final int PING_INTERVAL_MS = 5000;
    private static final String TAG = "RtmpClient";
    private final AtomicLong allocatedBytes;
    private String appName;
    private final ChunkStreamWriter controlStreamWriter;
    protected final Handler handler;
    private boolean handshaked;
    private CountingDataInputStream input;
    private final String link;
    private CountingDataOutputStream output;
    private Runnable pingRunnable;
    private Thread readThread;
    private int sendBufferBytes;
    private Socket socket;
    private volatile boolean stopped;
    private final Map<Integer, ChunkStreamReader> streamReaders;
    private final Map<Integer, ChunkStreamWriter> streamWriters;
    private int transactionId;
    private int inChunkSize = 128;
    private int outChunkSize = 128;
    private volatile int ackWindowSize = 0;
    private long lastAckSent = 0;
    private Map<Integer, ReactionRunnable> reactionMap = new ConcurrentHashMap();
    private WeightedAverage averagePing = new WeightedAverage(0.2f);

    public interface ReactionRunnable {
        void handle(String str, ByteBuffer byteBuffer) throws ProtocolException;
    }

    public RtmpClient(HandlerThread handlerThread, String str) {
        AtomicLong atomicLong = new AtomicLong(0L);
        this.allocatedBytes = atomicLong;
        this.transactionId = 1;
        this.link = str;
        HashMap hashMap = new HashMap();
        this.streamReaders = hashMap;
        HashMap hashMap2 = new HashMap();
        this.streamWriters = hashMap2;
        ChunkStreamWriter chunkStreamWriter = new ChunkStreamWriter(2);
        this.controlStreamWriter = chunkStreamWriter;
        hashMap2.put(2, chunkStreamWriter);
        hashMap.put(2, new ChunkStreamReader(2, atomicLong) { // from class: ru.ok.proto.rtmp.RtmpClient.1
            @Override // ru.ok.proto.rtmp.ChunkStreamReader
            public void processPacket(byte b, int i, int i2, int i3, ByteBuffer byteBuffer) throws ProtocolException, IOException {
                RtmpClient.this.consumeControlMessageData(b, byteBuffer);
            }
        });
        this.pingRunnable = new Runnable() { // from class: ru.ok.proto.rtmp.RtmpClient.2
            @Override // java.lang.Runnable
            public void run() {
                RtmpClient.this.ping();
            }
        };
        this.handler = new Handler(handlerThread.getLooper());
    }

    private void abortMessage(int i) {
        ChunkStreamReader chunkStreamReader = this.streamReaders.get(Integer.valueOf(i));
        if (chunkStreamReader != null) {
            chunkStreamReader.abortMessage();
        }
    }

    private void checkInterrupted() throws InterruptedException {
        if (this.stopped || this.readThread.isInterrupted()) {
            throw new InterruptedException("thread is interrupted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumeControlMessageData(byte b, ByteBuffer byteBuffer) throws ProtocolException, IOException {
        switch (b) {
            case 1:
                if (byteBuffer.remaining() == 4) {
                    this.inChunkSize = byteBuffer.getInt();
                    return;
                } else {
                    throw new ProtocolException("'Set chunk size' message has invalid size: " + byteBuffer.remaining());
                }
            case 2:
                if (byteBuffer.remaining() == 4) {
                    abortMessage(byteBuffer.getInt());
                    return;
                } else {
                    throw new ProtocolException("Abort message has invalid size: " + byteBuffer.remaining());
                }
            case 3:
                if (byteBuffer.remaining() == 4) {
                    return;
                }
                throw new ProtocolException("Acknowledge message has invalid size: " + byteBuffer.remaining());
            case 4:
                processUserControlMessage(byteBuffer);
                return;
            case 5:
                if (byteBuffer.remaining() == 4) {
                    this.ackWindowSize = byteBuffer.getInt();
                    return;
                } else {
                    throw new ProtocolException("'Acknowledge window size' message has invalid size: " + byteBuffer.remaining());
                }
            case 6:
                return;
            default:
                throw new ProtocolException(lhg.a(b, "Unexpected message type: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumeData() throws IOException, ProtocolException {
        byte readByte = this.input.readByte();
        int i = (readByte & 192) >>> 6;
        int i2 = readByte & CharsetEncoder.DEFAULT_REPLACEMENT;
        int readByte2 = i2 <= 1 ? this.input.readByte() & CharsetEncoder.DEFAULT_REPLACEMENT : i2;
        if (i2 == 1) {
            readByte2 += (this.input.readByte() & 255) << 8;
        }
        ChunkStreamReader chunkStreamReader = this.streamReaders.get(Integer.valueOf(readByte2));
        if (chunkStreamReader == null) {
            chunkStreamReader = new ChunkStreamReader(readByte2, this.allocatedBytes) { // from class: ru.ok.proto.rtmp.RtmpClient.4
                @Override // ru.ok.proto.rtmp.ChunkStreamReader
                public void processPacket(byte b, int i3, int i4, int i5, ByteBuffer byteBuffer) throws ProtocolException {
                    RtmpClient.this.processPacket(i3, i4, i5, b, byteBuffer);
                }
            };
            this.streamReaders.put(Integer.valueOf(readByte2), chunkStreamReader);
        }
        chunkStreamReader.readData(this.input, i, this.inChunkSize);
    }

    private int generateTransactionId() {
        int i = this.transactionId;
        this.transactionId = i + 1;
        return i;
    }

    private void handleConnectionQualityChange() {
        handleNetworkPing((int) this.averagePing.getValue());
    }

    private void handlePingResponse(int i) {
        this.averagePing.update(((int) System.currentTimeMillis()) - i);
        handleConnectionQualityChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handshake() throws IOException, ProtocolException, InterruptedException {
        checkInterrupted();
        byte[] bArr = new byte[1536];
        new Random().nextBytes(bArr);
        this.output.write(3);
        this.output.writeInt(intTime());
        this.output.writeInt(0);
        this.output.write(bArr, 0, 1528);
        this.output.flush();
        int read = this.input.read();
        if (read != 3) {
            throw new ProtocolException(tgw.b(read, "Unsupported version of RTMP: ", "; expected: 3"));
        }
        int readInt = this.input.readInt();
        this.input.readInt();
        wlb0.r(this.input, bArr, 0, 1528);
        checkInterrupted();
        this.output.writeInt(readInt);
        this.output.writeInt(intTime());
        this.output.write(bArr, 0, 1528);
        this.output.flush();
        CountingDataInputStream countingDataInputStream = this.input;
        long j = 0;
        while (j < 1536) {
            long j2 = 1536 - j;
            int available = countingDataInputStream.available();
            long skip = available == 0 ? 0L : countingDataInputStream.skip(Math.min(available, j2));
            if (skip == 0) {
                skip = countingDataInputStream.read(wlb0.b, 0, (int) Math.min(j2, 8192));
                if (skip == -1) {
                    break;
                }
            }
            j += skip;
        }
        if (j < 1536) {
            throw new EOFException(qlb0.a(j, "reached end of stream after skipping ", " bytes; 1536 bytes expected"));
        }
    }

    private int intTime() {
        return (int) (System.currentTimeMillis() & 4294967295L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ping() {
        if (this.stopped) {
            return;
        }
        sendPing();
        flush();
        executeOnWorker(this.pingRunnable, 5000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postAbort() {
        executeOnWorker(new Runnable() { // from class: ru.ok.proto.rtmp.RtmpClient.6
            @Override // java.lang.Runnable
            public void run() {
                RtmpClient.this.abort();
            }
        });
    }

    private void processUserControlMessage(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 2) {
            return;
        }
        short s = byteBuffer.getShort();
        if (s == 6) {
            if (byteBuffer.remaining() < 4) {
                return;
            }
            sendPingResponse(byteBuffer.getInt());
        } else {
            if (s != 7 || byteBuffer.remaining() < 4) {
                return;
            }
            handlePingResponse(byteBuffer.getInt());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAck() {
        if (this.ackWindowSize != 0) {
            final long totalBytes = this.output.getTotalBytes();
            if (totalBytes >= this.lastAckSent + this.ackWindowSize) {
                this.lastAckSent = totalBytes;
                executeOnWorker(new Runnable() { // from class: ru.ok.proto.rtmp.RtmpClient.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ByteBuffer allocate = ByteBuffer.allocate(6);
                        allocate.put((byte) 0);
                        allocate.put((byte) 3);
                        allocate.putInt((int) totalBytes);
                        allocate.position(0);
                        RtmpClient.this.writeMessage(2, 0, 0, (byte) 4, allocate, true);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAckWindowSize(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.position(0);
        writeMessage(2, 0, 0, (byte) 5, allocate, false);
    }

    private void sendPing() {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.put((byte) 0);
        allocate.put((byte) 6);
        allocate.putInt((int) System.currentTimeMillis());
        allocate.position(0);
        writeMessage(2, 0, 0, (byte) 4, allocate, false);
    }

    private void sendPingResponse(final int i) {
        executeOnWorker(new Runnable() { // from class: ru.ok.proto.rtmp.RtmpClient.7
            @Override // java.lang.Runnable
            public void run() {
                ByteBuffer allocate = ByteBuffer.allocate(6);
                allocate.put((byte) 0);
                allocate.put((byte) 7);
                allocate.putInt(i);
                allocate.position(0);
                RtmpClient.this.writeMessage(2, 0, 0, (byte) 4, allocate, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChunkSize(int i) {
        if (i == this.outChunkSize) {
            return;
        }
        ByteBuffer putInt = ByteBuffer.allocate(4).putInt(i);
        putInt.position(0);
        writeMessage(2, 0, 0, (byte) 1, putInt, false);
        this.outChunkSize = i;
    }

    private void setPeerAckWindowSize(int i) {
        this.ackWindowSize = i;
    }

    public void abort() {
        stop();
    }

    public void executeOnWorker(Runnable runnable) {
        if (this.stopped) {
            return;
        }
        try {
            this.handler.post(runnable);
        } catch (Exception e) {
            abort();
            handleError(10, e);
        }
    }

    public void flush() {
        CountingDataOutputStream countingDataOutputStream;
        try {
            if (this.stopped || (countingDataOutputStream = this.output) == null) {
                return;
            }
            countingDataOutputStream.flush();
        } catch (IOException e) {
            Log.e(TAG, "IO exception while flushing messages", e);
            handleError(10, e);
            postAbort();
        }
    }

    public String getAppName() {
        return this.appName;
    }

    public long getBitrate() {
        CountingDataOutputStream countingDataOutputStream = this.output;
        if (countingDataOutputStream != null) {
            return countingDataOutputStream.getBitrate();
        }
        return 0L;
    }

    public String getLink() {
        return this.link;
    }

    public long getPingRoundTrip() {
        double value = this.averagePing.getValue();
        if (Double.isNaN(value)) {
            return -1L;
        }
        return (long) value;
    }

    public long getTotalBytesReceived() {
        CountingDataInputStream countingDataInputStream = this.input;
        if (countingDataInputStream != null) {
            return countingDataInputStream.getTotalBytes();
        }
        return 0L;
    }

    public long getTotalBytesSent() {
        CountingDataOutputStream countingDataOutputStream = this.output;
        if (countingDataOutputStream != null) {
            return countingDataOutputStream.getTotalBytes();
        }
        return 0L;
    }

    public void handleError(int i, @Nullable Throwable th) {
        this.output = new CountingDataOutputStream(new NullOutputStream());
    }

    public void handleStopped() {
        this.output = new CountingDataOutputStream(new NullOutputStream());
    }

    public boolean isHandshaked() {
        return this.handshaked;
    }

    public boolean isStopped() {
        return this.stopped;
    }

    public void processPacket(int i, int i2, int i3, byte b, ByteBuffer byteBuffer) throws ProtocolException {
        ReactionRunnable remove;
        if (b != 20) {
            if (b == 18 && ON_METADATA.equals(AmfUtil.readString(byteBuffer))) {
                handleMetadata(byteBuffer);
                return;
            }
            return;
        }
        int position = byteBuffer.position();
        String readString = AmfUtil.readString(byteBuffer);
        if ("_result".equals(readString)) {
            Double readNumber = AmfUtil.readNumber(byteBuffer);
            if (readNumber == null || (remove = this.reactionMap.remove(Integer.valueOf(readNumber.intValue()))) == null) {
                return;
            }
            byteBuffer.position(position);
            remove.handle(readString, byteBuffer);
            return;
        }
        if (!"onStatus".equals(readString)) {
            if (ON_METADATA.equals(readString)) {
                handleMetadata(byteBuffer);
            }
        } else {
            byteBuffer.position(position);
            RtmpMessages.ServerResponse serverResponse = new RtmpMessages.ServerResponse();
            serverResponse.deserialize(byteBuffer);
            handleStatus(serverResponse);
        }
    }

    public void sendMessage(int i, ProtoMessageBase protoMessageBase, ReactionRunnable reactionRunnable) {
        int generateTransactionId = generateTransactionId();
        protoMessageBase.setTransactionId(generateTransactionId);
        writeMessage(3, i, 0, protoMessageBase, (byte) 20);
        if (reactionRunnable != null) {
            if (this.reactionMap.size() > 1000) {
                throw new RuntimeException("Too many pending requests");
            }
            this.reactionMap.put(Integer.valueOf(generateTransactionId), reactionRunnable);
        }
    }

    public void setSocketSendBuffer(int i) {
        try {
            Socket socket = this.socket;
            if (socket == null || this.sendBufferBytes == i) {
                return;
            }
            socket.setSendBufferSize(i);
            this.sendBufferBytes = i;
        } catch (SocketException unused) {
        }
    }

    public void start() {
        if (this.readThread != null) {
            return;
        }
        try {
            final URI uri = new URI(this.link);
            this.appName = uri.getPath().replace(DomExceptionUtils.SEPARATOR, "");
            Thread thread = new Thread(new Runnable() { // from class: ru.ok.proto.rtmp.RtmpClient.3
                @Override // java.lang.Runnable
                public void run() {
                    RtmpClient.this.socket = null;
                    try {
                        try {
                            try {
                                InetAddress byName = InetAddress.getByName(uri.getHost());
                                int port = uri.getPort();
                                RtmpClient rtmpClient = RtmpClient.this;
                                if (port < 0) {
                                    port = 1935;
                                }
                                rtmpClient.socket = Utils.createRtmpSocket(byName, port);
                                RtmpClient.this.input = new CountingDataInputStream(new BufferedInputStream(RtmpClient.this.socket.getInputStream(), 16384));
                                RtmpClient.this.output = new CountingDataOutputStream(new BufferedOutputStream(RtmpClient.this.socket.getOutputStream(), 16384));
                                RtmpClient.this.handshake();
                                RtmpClient.this.executeOnWorker(new Runnable() { // from class: ru.ok.proto.rtmp.RtmpClient.3.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        RtmpClient.this.handshaked = true;
                                        RtmpClient.this.sendAckWindowSize(500000);
                                        RtmpClient.this.setChunkSize(65536);
                                        RtmpClient.this.ping();
                                        RtmpClient.this.afterHandshake();
                                    }
                                });
                                while (!RtmpClient.this.stopped) {
                                    RtmpClient.this.consumeData();
                                    RtmpClient.this.sendAck();
                                }
                            } catch (InterruptedException unused) {
                                Utils.closeSocket(RtmpClient.this.socket);
                                RtmpClient.this.handleStopped();
                                return;
                            } catch (Exception e) {
                                Log.e(RtmpClient.TAG, "Unexpected exception in reader thread", e);
                                RtmpClient.this.postAbort();
                                RtmpClient.this.handleError(12, e);
                            }
                        } catch (IOException e2) {
                            if (RtmpClient.this.stopped) {
                                e2.getMessage();
                            } else {
                                Log.e(RtmpClient.TAG, "Socket exception in reader thread", e2);
                                RtmpClient.this.handleError(10, e2);
                                RtmpClient.this.postAbort();
                            }
                        } catch (ProtocolException e3) {
                            Log.e(RtmpClient.TAG, "Protocol exception in reader thread", e3);
                            RtmpClient.this.postAbort();
                            RtmpClient.this.handleError(11, e3);
                        }
                        Utils.closeSocket(RtmpClient.this.socket);
                        RtmpClient.this.handleStopped();
                        RtmpClient.this.stop();
                    } catch (Throwable th) {
                        Utils.closeSocket(RtmpClient.this.socket);
                        RtmpClient.this.handleStopped();
                        throw th;
                    }
                }
            }, "rtmp client read thread");
            this.readThread = thread;
            thread.start();
        } catch (URISyntaxException e) {
            Log.e(TAG, "Error parsing url \"" + this.link + "\"", e);
            throw new RuntimeException(e);
        }
    }

    public synchronized void stop() {
        this.stopped = true;
        Thread thread = this.readThread;
        if (thread != null) {
            thread.interrupt();
            this.readThread = null;
        }
    }

    public void writeMessage(int i, int i2, int i3, AmfEntry amfEntry, byte b) {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(amfEntry.getSize());
            amfEntry.serialize(allocate);
            allocate.position(0);
            try {
                writeMessage(i, i2, i3, b, allocate, true);
            } catch (ProtocolException e) {
                e = e;
                ProtocolException protocolException = e;
                Log.e(TAG, "Protocol exception while writing message", protocolException);
                handleError(11, protocolException);
                postAbort();
            }
        } catch (ProtocolException e2) {
            e = e2;
        }
    }

    public void executeOnWorker(Runnable runnable, int i) {
        if (this.stopped) {
            return;
        }
        try {
            this.handler.postDelayed(runnable, i);
        } catch (Exception e) {
            abort();
            handleError(10, e);
        }
    }

    public void sendMessage(ProtoMessageBase protoMessageBase, ReactionRunnable reactionRunnable) {
        sendMessage(0, protoMessageBase, reactionRunnable);
    }

    public void writeMessage(int i, int i2, int i3, byte b, ByteBuffer byteBuffer, boolean z) {
        writeMessage(i, i2, i3, b, Collections.singletonList(byteBuffer), z);
    }

    public void writeMessage(int i, int i2, int i3, byte b, List<ByteBuffer> list, boolean z) {
        ChunkStreamWriter chunkStreamWriter = this.streamWriters.get(Integer.valueOf(i));
        if (chunkStreamWriter == null) {
            chunkStreamWriter = new ChunkStreamWriter(i);
            this.streamWriters.put(Integer.valueOf(i), chunkStreamWriter);
        }
        ChunkStreamWriter chunkStreamWriter2 = chunkStreamWriter;
        try {
            CountingDataOutputStream countingDataOutputStream = this.output;
            if (countingDataOutputStream != null && this.handshaked) {
                chunkStreamWriter2.writeMessage(countingDataOutputStream, list, i3, b, i2, this.outChunkSize);
                if (z) {
                    flush();
                }
            }
        } catch (IOException e) {
            Log.e(TAG, "IO exception while writing message", e);
            handleError(10, e);
            postAbort();
        }
    }

    public void afterHandshake() {
    }

    public void handleMetadata(ByteBuffer byteBuffer) {
    }

    public void handleNetworkPing(int i) {
    }

    public void handleStatus(RtmpMessages.ServerResponse serverResponse) {
    }
}
