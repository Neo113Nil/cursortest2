package ru.ok.proto.okmp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import one.video.streaming.oktp.OktpChannel;
import one.video.streaming.oktp.TransportWriter;
import one.video.streaming.tools.LogInterface;
import one.video.streaming.tools.TimeMachine;
import one.video.streaming.tools.exceptions.ProtocolException;
import ru.ok.media.NetStats;
import ru.ok.nativenet.FDUtils;
import ru.ok.proto.PacketStats;
import ru.ok.proto.messages.ProtoMessageBase;
import ru.ok.proto.rtmp.amf.AmfUtil;
import xsna.cpp0;
import xsna.d8h;
import xsna.jdy;
import xsna.k7b0;
import xsna.lhg;
import xsna.m06;
import xsna.mz70;
import xsna.ne7;
import xsna.odj;
import xsna.r490;
import xsna.sl9;
import xsna.tj0;
import xsna.tto0;
import xsna.v8e;
import xsna.zvo0;

/* loaded from: classes9.dex */
public class OkmpClient implements OktpChannel.Listener {
    private static final int BATCH_BUFFER_SIZE = 14240;
    private static final int CONNECT_TIMEOUT_MS = 20000;
    private static final int MAX_MTU = 4000;
    public static final int MAX_RETRANSMIT_FLOOD_BYTES = 100000;
    private static final int MSG_BENCH_BYTES = 6;
    private static final int MSG_DATAGRAM = 4;
    private static final int MSG_FRAME_AUDIO = 2;
    private static final int MSG_FRAME_VIDEO = 1;
    private static final int MSG_INVITE = 0;
    private static final int MSG_INVOKE = 5;
    private static final int MSG_TIMER = 3;
    private static final int PING_TIMEOUT_MS = 20000;
    private static final String TAG = "Publisher";
    private final TimeMachine _timeMachine;
    private int audioSendStreamId;
    private int benchSendStreamId;
    private final m06 bwAudio;
    private final m06 bwInvoke;
    private final m06 bwReverse;
    private final m06 bwVideo;
    private final mz70 config;
    private volatile Runnable emptyBuffersListener;
    private final boolean encryptAudio;
    private final boolean encryptSignalling;
    private final boolean encryptVideo;
    private final FDUtils fdUtils;
    private boolean finalized;
    private final EventHandler handler;
    private int invokeSendStreamId;
    private final zvo0 lastLog;
    private Listener listener;
    private final LogInterface log;
    private NetStats netStats;
    private Thread networkReaderThread;
    private OktpChannel oktpChannel;
    private boolean publishSent;
    private final SocketAddress remoteAddress;
    private final zvo0 shutdownEvent;
    private boolean started;
    private boolean stopped;
    private final int trafficClass;
    private int transactionId;
    private TransportWriter transportWriter;
    private final int videoKeyFrameIntervalMillis;
    private int videoSendStreamId;
    private Map<Integer, ReactionRunnable> reactionMap = new ConcurrentHashMap();
    private boolean firstFrame = true;
    private volatile float retransmitFloodRateMultiplier = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private final PacketStats packetStats = new PacketStats();

    public static class Datagram {
        final ByteBuffer data;
        final SocketAddress remoteAddress;
        final boolean verified;

        public Datagram(ByteBuffer byteBuffer, SocketAddress socketAddress, boolean z) {
            this.data = byteBuffer;
            this.remoteAddress = socketAddress;
            this.verified = z;
        }
    }

    public class EventHandler extends Handler {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private zvo0 lastStatUpdate;
        private byte[] randomData;

        public EventHandler(Looper looper) {
            super(looper);
            this.lastStatUpdate = new zvo0(new tto0());
        }

        private byte[] allocateGarbageBuffer(int i) {
            ne7.m(OkmpClient.TAG, "allocateGarbageBuffer(" + i + ")");
            byte[] bArr = this.randomData;
            if (bArr == null || bArr.length < i) {
                this.randomData = new byte[i];
                new Random().nextBytes(this.randomData);
            }
            return Arrays.copyOf(this.randomData, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:94:0x030d  */
        /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3 && i != 4) {
                ne7.m(OkmpClient.TAG, "handleMessage() - msg={" + OkmpClient.getMsgName(message.what) + ", " + message.arg1 + ", " + message.arg2 + "}");
            }
            try {
                OktpChannel oktpChannel = OkmpClient.this.oktpChannel;
                OkmpClient.this.retransmitFloodRateMultiplier;
                boolean z = true;
                switch (message.what) {
                    case 0:
                        oktpChannel.connect(20000);
                        OkmpClient.this.handler.sendMessage(OkmpClient.this.handler.obtainMessage(3));
                        break;
                    case 1:
                        ByteBuffer byteBuffer = (ByteBuffer) message.obj;
                        if (message.arg1 == 0) {
                            z = false;
                        }
                        if (OkmpClient.this.log.enabled()) {
                            OkmpClient.this.bwVideo.a(byteBuffer.remaining());
                        }
                        int sendStreamPushPacket = oktpChannel.sendStreamPushPacket(OkmpClient.this.videoSendStreamId, byteBuffer, -1, z);
                        if (sendStreamPushPacket != 0) {
                            ne7.t(OkmpClient.TAG, " Dropped " + sendStreamPushPacket + " video frames from queue while pushing frame, size=" + byteBuffer.remaining() + " isKey=" + z);
                            if (OkmpClient.this.log.enabled()) {
                                OkmpClient.this.log.message("Drop V " + sendStreamPushPacket);
                            }
                        }
                        if (OkmpClient.this.firstFrame) {
                            oktpChannel.resume();
                            OkmpClient.this.firstFrame = false;
                        }
                        oktpChannel.flush();
                        break;
                    case 2:
                        ByteBuffer byteBuffer2 = (ByteBuffer) message.obj;
                        if (OkmpClient.this.log.enabled()) {
                            OkmpClient.this.bwAudio.a(byteBuffer2.remaining());
                        }
                        int sendStreamPushPacket2 = oktpChannel.sendStreamPushPacket(OkmpClient.this.audioSendStreamId, byteBuffer2, -1, true);
                        if (sendStreamPushPacket2 != 0) {
                            ne7.t(OkmpClient.TAG, " Dropped " + sendStreamPushPacket2 + " audio frames from queue");
                            if (OkmpClient.this.log.enabled()) {
                                OkmpClient.this.log.message("Drop A " + sendStreamPushPacket2);
                            }
                        }
                        if (OkmpClient.this.firstFrame) {
                            oktpChannel.resume();
                            OkmpClient.this.firstFrame = false;
                        }
                        oktpChannel.flush();
                        break;
                    case 3:
                        if (oktpChannel != null) {
                            oktpChannel.flush();
                            if (!OkmpClient.this.stopped || OkmpClient.this.shutdownEvent.a(0L) < 10000) {
                                OkmpClient.this.handler.sendMessageDelayed(OkmpClient.this.handler.obtainMessage(3), 50L);
                                break;
                            }
                        }
                        break;
                    case 4:
                        Datagram datagram = (Datagram) message.obj;
                        if (OkmpClient.this.log.enabled()) {
                            OkmpClient.this.bwReverse.a(datagram.data.remaining());
                        }
                        if (OkmpClient.this.remoteAddress.equals(datagram.remoteAddress)) {
                            oktpChannel.process(datagram.verified, datagram.data);
                        }
                        Runnable runnable = OkmpClient.this.emptyBuffersListener;
                        if ((OkmpClient.this.stopped || runnable != null) && oktpChannel.bytesPending() <= 0) {
                            if (runnable != null) {
                                OkmpClient.this.emptyBuffersListener = null;
                                runnable.run();
                            } else if (OkmpClient.this.stopped) {
                                ne7.t(OkmpClient.TAG, "Buffer empty - closing channel");
                                oktpChannel.close();
                            }
                        }
                        if (OkmpClient.this.log.enabled() && OkmpClient.this.lastLog.a(2147483647L) > 2000) {
                            OkmpClient.this.lastLog.b();
                            OkmpClient.this.logStats();
                            break;
                        }
                        break;
                    case 5:
                        if (OkmpClient.this.log.enabled()) {
                            OkmpClient.this.bwInvoke.a(((ByteBuffer) message.obj).remaining());
                        }
                        oktpChannel.sendStreamPushPacket(OkmpClient.this.invokeSendStreamId, (ByteBuffer) message.obj, -1, true);
                        oktpChannel.flush();
                        break;
                    case 6:
                        int max = Math.max(10, message.arg1);
                        ByteBuffer wrap = ByteBuffer.wrap(allocateGarbageBuffer(max));
                        wrap.putInt(max - 4);
                        wrap.put((byte) 3);
                        wrap.position(0);
                        wrap.limit(max);
                        oktpChannel.sendStreamPushPacket(OkmpClient.this.benchSendStreamId, wrap, -1, true);
                        if (OkmpClient.this.firstFrame) {
                            oktpChannel.resume();
                            OkmpClient.this.firstFrame = false;
                        }
                        oktpChannel.flush();
                        break;
                }
                if (oktpChannel != null && this.lastStatUpdate.a(10000L) > 1000) {
                    OkmpClient.this.netStats = new NetStats(oktpChannel.getMTU(), oktpChannel.getAverageLossRateSlow(), (int) oktpChannel.getAverageRTT(), (float) oktpChannel.getRetransmitOverhead());
                    this.lastStatUpdate.b();
                }
                if ((oktpChannel == null || oktpChannel.isClosed()) && !OkmpClient.this.stopped) {
                    ne7.t(OkmpClient.TAG, "OKMP connection closed");
                    OkmpClient.this.abort();
                    OkmpClient.this.listener.onClose(10);
                    OkmpClient.this.finalized = true;
                }
            } catch (IOException e) {
                e = e;
                if (OkmpClient.this.stopped) {
                    ne7.J(OkmpClient.TAG, "OKMP net error: " + e);
                    OkmpClient.this.abort();
                    OkmpClient.this.listener.onClose(10);
                }
            } catch (ProtocolException e2) {
                e = e2;
                if (OkmpClient.this.stopped) {
                }
            }
        }

        public boolean isAlive() {
            return getLooper().getThread().isAlive();
        }
    }

    public interface Listener {
        void onClose(int i);

        void onConnected();
    }

    public interface ReactionRunnable {
        void handle(String str, ByteBuffer byteBuffer);
    }

    public OkmpClient(HandlerThread handlerThread, SocketAddress socketAddress, mz70 mz70Var, boolean z, boolean z2, boolean z3, int i, int i2, LogInterface logInterface, int i3, int i4) {
        this.fdUtils = new FDUtils(i3, i4);
        tto0 tto0Var = new tto0();
        this._timeMachine = tto0Var;
        this.shutdownEvent = new zvo0(tto0Var);
        this.bwAudio = new m06(1000000L, tto0Var);
        this.bwVideo = new m06(1000000L, tto0Var);
        this.bwInvoke = new m06(1000000L, tto0Var);
        this.bwReverse = new m06(1000000L, tto0Var);
        this.lastLog = new zvo0(tto0Var);
        this.videoSendStreamId = -1;
        this.audioSendStreamId = -1;
        this.benchSendStreamId = -1;
        this.invokeSendStreamId = -1;
        this.remoteAddress = socketAddress;
        this.handler = new EventHandler(handlerThread.getLooper());
        this.config = mz70Var;
        this.encryptSignalling = z;
        this.encryptAudio = z2;
        this.encryptVideo = z3;
        this.trafficClass = i;
        this.videoKeyFrameIntervalMillis = i2;
        this.log = logInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void abort() {
        ne7.m(TAG, "abort()");
        this.stopped = true;
    }

    private OktpChannel createOktpChannel(TransportWriter transportWriter, int i, mz70 mz70Var, LogInterface logInterface) {
        return new one.video.streaming.oktp.a(this._timeMachine, new jdy(), this, transportWriter, i, mz70Var, logInterface);
    }

    private int getBuffersRemaining(Collection<ByteBuffer> collection) {
        Iterator<ByteBuffer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().remaining();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getMsgName(int i) {
        switch (i) {
            case 0:
                return "MSG_INVITE";
            case 1:
                return "MSG_FRAME_VIDEO";
            case 2:
                return "MSG_FRAME_AUDIO";
            case 3:
                return "MSG_TIMER";
            case 4:
                return "MSG_DATAGRAM";
            case 5:
                return "MSG_INVOKE";
            case 6:
                return "MSG_BENCH_BYTES";
            default:
                return lhg.a(i, "");
        }
    }

    private void handleInvoke(ByteBuffer byteBuffer) {
        ne7.t(TAG, "handleInvoke() - data=" + r490.f(byteBuffer, true));
        byteBuffer.getInt();
        String readString = AmfUtil.readString(byteBuffer);
        if ("_result".equals(readString)) {
            Double readNumber = AmfUtil.readNumber(byteBuffer);
            ne7.t(TAG, "handleInvoke() - result for transactionID=" + readNumber);
            if (readNumber != null) {
                double doubleValue = readNumber.doubleValue();
                if (ne7.y(1, "OKMP")) {
                    StringBuilder sb = new StringBuilder("Client <- Server: [");
                    sb.append(doubleValue);
                    sb.append("] response, name=");
                    sb.append(readString);
                    sb.append(" [" + byteBuffer.remaining() + "] ");
                    ne7.t("OKMP", sb.toString());
                }
                ReactionRunnable remove = this.reactionMap.remove(Integer.valueOf(readNumber.intValue()));
                if (remove != null) {
                    ne7.t(TAG, "handleInvoke() - reacting...");
                    remove.handle(readString, byteBuffer);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$networkReaderLoop$1(OktpChannel oktpChannel, TransportWriter transportWriter) {
        if (this.oktpChannel == oktpChannel) {
            PacketStats packetStats = this.packetStats;
            packetStats.mAudioPacketsSent = audioSendStreamGetPacketsSent() + packetStats.mAudioPacketsSent;
            PacketStats packetStats2 = this.packetStats;
            packetStats2.mAudioPacketsLost = audioSendStreamGetTotalDrops() + packetStats2.mAudioPacketsLost;
            PacketStats packetStats3 = this.packetStats;
            packetStats3.mVideoPacketsSent = videoSendStreamGetPacketsSent() + packetStats3.mVideoPacketsSent;
            PacketStats packetStats4 = this.packetStats;
            packetStats4.mVideoPacketsLost = videoSendStreamGetTotalDrops() + packetStats4.mVideoPacketsLost;
            this.oktpChannel.removeListener();
            this.oktpChannel = null;
        }
        if (this.transportWriter == transportWriter) {
            long bytesSent = transportWriter.getBytesSent();
            long bytesDropped = transportWriter.getBytesDropped();
            StringBuilder sb = new StringBuilder("updating bytes sent: ");
            sb.append(this.packetStats.mBytesSent);
            tj0.d(sb, " += ", bytesSent, ", dropped: ");
            sb.append(this.packetStats.mBytesDropped);
            sb.append(" += ");
            sb.append(bytesDropped);
            ne7.m(TAG, sb.toString());
            PacketStats packetStats5 = this.packetStats;
            packetStats5.mBytesSent += bytesSent;
            packetStats5.mBytesDropped += bytesDropped;
            this.transportWriter = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStats() {
        this.log.message("send stats: video=" + r490.h((long) this.bwVideo.f) + " audio=" + r490.h((long) this.bwAudio.f) + " invoke=" + r490.h((long) this.bwInvoke.f) + " reverse=" + r490.h((long) this.bwReverse.f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: networkReaderLoop, reason: merged with bridge method [inline-methods] */
    public void lambda$start$0(FileDescriptorRefCountWrapper fileDescriptorRefCountWrapper) {
        ne7.m(TAG, "networkReaderLoop() - enter");
        try {
            try {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(BATCH_BUFFER_SIZE);
                tto0 tto0Var = new tto0();
                long j = -1;
                int i = 0;
                while (true) {
                    if ((j < 0 ? 0L : tto0Var.currentTimeMillis() - j) > 10000 || this.finalized) {
                        break;
                    }
                    if (this.stopped && j < 0) {
                        j = tto0Var.currentTimeMillis();
                    }
                    if (!this.handler.isAlive()) {
                        ne7.t(TAG, "handler is dead");
                        break;
                    }
                    allocateDirect.clear();
                    int receiveBatch = this.fdUtils.receiveBatch(fileDescriptorRefCountWrapper.getFD(), allocateDirect, 4000, 1000);
                    if (receiveBatch >= 0) {
                        for (int i2 = 0; i2 < receiveBatch; i2++) {
                            int i3 = allocateDirect.getShort() & 65535;
                            if (allocateDirect.remaining() < i3) {
                                throw new RuntimeException("Invalid batch received");
                            }
                            this.packetStats.mBytesReceived += i3;
                            ByteBuffer allocate = ByteBuffer.allocate(i3);
                            allocateDirect.get(allocate.array(), allocate.arrayOffset(), i3);
                            boolean z = true;
                            if (allocate.get(0) != 1) {
                                z = false;
                            }
                            EventHandler eventHandler = this.handler;
                            eventHandler.sendMessage(eventHandler.obtainMessage(4, new Datagram(allocate, this.remoteAddress, z)));
                        }
                    } else if (i % 5 == 0) {
                        ne7.J(TAG, "receive: I/O error " + receiveBatch);
                        i++;
                    }
                }
            } catch (Exception e) {
                this.listener.onClose(12);
                ne7.n(TAG, "listener thread unexpected error: " + e);
            }
            fileDescriptorRefCountWrapper.release();
            abort();
            this.handler.post(new v8e(this, this.oktpChannel, this.transportWriter, 2));
            ne7.m(TAG, "networkReaderLoop() - exit");
        } catch (Throwable th) {
            fileDescriptorRefCountWrapper.release();
            throw th;
        }
    }

    public long audioSendStreamGetBufferDeepnessMS() {
        return this.oktpChannel.sendStreamGetBufferDeepnessMS(this.audioSendStreamId);
    }

    public long audioSendStreamGetPacketsSent() {
        OktpChannel oktpChannel = this.oktpChannel;
        if (oktpChannel != null) {
            return oktpChannel.sendStreamGetPacketsSent(this.audioSendStreamId);
        }
        return 0L;
    }

    public long audioSendStreamGetTotalDrops() {
        OktpChannel oktpChannel = this.oktpChannel;
        if (oktpChannel != null) {
            return oktpChannel.sendStreamGetTotalDrops(this.audioSendStreamId);
        }
        return 0L;
    }

    public void audioSendStreamSetMaxDeepness(int i, int i2) {
        this.oktpChannel.sendStreamSetMaxDeepness(this.audioSendStreamId, i, i2);
    }

    public long getAudioPacketsLost() {
        return audioSendStreamGetTotalDrops() + this.packetStats.mAudioPacketsLost;
    }

    public long getAudioPacketsSent() {
        return audioSendStreamGetPacketsSent() + this.packetStats.mAudioPacketsSent;
    }

    public int getAudioSendStreamId() {
        return this.audioSendStreamId;
    }

    public float getAverageRTT() {
        return this.oktpChannel.getAverageRTT();
    }

    public long getBitrate() {
        TransportWriter transportWriter = this.transportWriter;
        if (transportWriter != null) {
            return transportWriter.getBitrate();
        }
        return 0L;
    }

    public long getBytesDropped() {
        long j = this.packetStats.mBytesDropped;
        TransportWriter transportWriter = this.transportWriter;
        return j + (transportWriter != null ? transportWriter.getBytesDropped() : 0L);
    }

    public long getBytesReceived() {
        return this.packetStats.mBytesReceived;
    }

    public long getBytesSent() {
        long j = this.packetStats.mBytesSent;
        TransportWriter transportWriter = this.transportWriter;
        return j + (transportWriter != null ? transportWriter.getBytesSent() : 0L);
    }

    public long getEstimatedBandwidth(long j) {
        return this.oktpChannel.getEstimatedBitrate(j);
    }

    public float getEstimatedLossFast() {
        return this.oktpChannel.getAverageLossRateFast();
    }

    public float getEstimatedLossSlow() {
        return this.oktpChannel.getAverageLossRateSlow();
    }

    public int getExpectedDeliveryDelayMS(int i) {
        return this.oktpChannel.getExpectedDeliveryDelayMS(i);
    }

    public long getInactiveTime() {
        return this.oktpChannel.getInactiveTime();
    }

    public int getMTU() {
        return this.oktpChannel.getMTU();
    }

    public NetStats getNetStats() {
        return this.netStats;
    }

    public PacketStats getPacketStats() {
        PacketStats packetStats = new PacketStats();
        packetStats.mBytesSent = getBytesSent();
        packetStats.mBytesDropped = getBytesDropped();
        packetStats.mAudioPacketsLost = getAudioPacketsLost();
        packetStats.mAudioPacketsSent = getAudioPacketsSent();
        packetStats.mVideoPacketsLost = getVideoPacketsLost();
        packetStats.mVideoPacketsSent = getVideoPacketsSent();
        return packetStats;
    }

    public float getRetransmitFloodMultiplier() {
        return this.retransmitFloodRateMultiplier;
    }

    public long getVideoPacketsLost() {
        return videoSendStreamGetTotalDrops() + this.packetStats.mVideoPacketsLost;
    }

    public long getVideoPacketsSent() {
        return videoSendStreamGetPacketsSent() + this.packetStats.mVideoPacketsSent;
    }

    public int getVideoSendStreamId() {
        return this.videoSendStreamId;
    }

    @Override // one.video.streaming.oktp.OktpChannel.Listener
    public void handleIncomingData(ByteBuffer byteBuffer, boolean z) {
        byte b = byteBuffer.get();
        if (b == 0) {
            handleInvoke(byteBuffer);
        } else if (b == 1) {
            handleVideo(byteBuffer);
        } else {
            if (b != 2) {
                return;
            }
            handleAudio(byteBuffer);
        }
    }

    public boolean isConnectionChecked() {
        return this.oktpChannel.isHandshaked();
    }

    public boolean isPublishSent() {
        return this.publishSent;
    }

    @Override // one.video.streaming.oktp.OktpChannel.Listener
    public void onAccept() {
        ne7.t(TAG, "onAccept()");
        if (this.started) {
            return;
        }
        this.started = true;
        ne7.t(TAG, "onAccept() - calling onConnect()");
        this.listener.onConnected();
    }

    public void pause() {
        ne7.m(TAG, "pause()");
        OktpChannel oktpChannel = this.oktpChannel;
        if (oktpChannel != null) {
            oktpChannel.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pushFrame(Collection<ByteBuffer> collection, int i, int i2, int i3, boolean z, int i4, int i5) {
        String sb;
        ByteBuffer byteBuffer;
        StringBuilder sb2 = new StringBuilder("pushFrame() - ");
        String str = "";
        sb2.append(this.stopped ? "stopped, " : "");
        if (collection == null) {
            sb = "null";
        } else {
            StringBuilder sb3 = new StringBuilder("" + collection.size() + " buffer(s)");
            if (!collection.isEmpty()) {
                sb3.append(" [ ");
                for (ByteBuffer byteBuffer2 : collection) {
                    sb3.append(str);
                    sb3.append(r490.f(byteBuffer2, false));
                    str = ", ";
                }
                sb3.append(" ]");
            }
            sb = sb3.toString();
        }
        sb2.append(sb);
        ne7.m(TAG, sb2.toString());
        if (this.stopped) {
            return;
        }
        int i6 = 1;
        int i7 = i == 1 ? 14 : 11;
        if (collection.size() == 1) {
            byteBuffer = collection.iterator().next();
            if (!byteBuffer.isReadOnly() && byteBuffer.position() > i7) {
                byteBuffer.position(byteBuffer.position() - i7);
                if (byteBuffer == null) {
                    byteBuffer = ByteBuffer.allocate(getBuffersRemaining(collection) + i7);
                    byteBuffer.position(i7);
                    for (ByteBuffer byteBuffer3 : collection) {
                        int position = byteBuffer3.position();
                        k7b0.c(byteBuffer3, byteBuffer, byteBuffer3.remaining());
                        byteBuffer3.position(position);
                    }
                    byteBuffer.position(0);
                }
                int position2 = byteBuffer.position();
                byteBuffer.putInt(byteBuffer.remaining() - 4);
                byteBuffer.put((byte) i);
                byteBuffer.putInt(i4);
                byteBuffer.put((byte) i2);
                byteBuffer.put((byte) i3);
                if (i != 1) {
                    byteBuffer.put((byte) (i5 >> 16));
                    byteBuffer.put((byte) ((i5 >> 8) & 255));
                    byteBuffer.put((byte) (i5 & 255));
                } else {
                    i6 = 2;
                }
                byteBuffer.position(position2);
                ne7.m(TAG, "pushFrame, fmt=" + i2 + " flags=" + i3 + " ts=" + i4);
                EventHandler eventHandler = this.handler;
                eventHandler.sendMessage(eventHandler.obtainMessage(i6, z ? 1 : 0, 0, byteBuffer));
            }
        }
        byteBuffer = null;
        if (byteBuffer == null) {
        }
        int position22 = byteBuffer.position();
        byteBuffer.putInt(byteBuffer.remaining() - 4);
        byteBuffer.put((byte) i);
        byteBuffer.putInt(i4);
        byteBuffer.put((byte) i2);
        byteBuffer.put((byte) i3);
        if (i != 1) {
        }
        byteBuffer.position(position22);
        ne7.m(TAG, "pushFrame, fmt=" + i2 + " flags=" + i3 + " ts=" + i4);
        EventHandler eventHandler2 = this.handler;
        eventHandler2.sendMessage(eventHandler2.obtainMessage(i6, z ? 1 : 0, 0, byteBuffer));
    }

    public void resume() {
        ne7.m(TAG, "resume()");
        OktpChannel oktpChannel = this.oktpChannel;
        if (oktpChannel != null) {
            oktpChannel.resume();
        }
    }

    public void sendBenchBytes(int i) {
        ne7.m(TAG, "sendBenchBytes(" + i + ")");
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Must be called from handler thread");
        }
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.arg1 = i;
        try {
            this.handler.handleMessage(obtain);
        } finally {
            obtain.recycle();
        }
    }

    public void sendMessage(int i, ProtoMessageBase protoMessageBase, ReactionRunnable reactionRunnable) {
        int i2 = this.transactionId + 1;
        this.transactionId = i2;
        protoMessageBase.setTransactionId(i2);
        try {
            ByteBuffer allocate = ByteBuffer.allocate(protoMessageBase.getSize() + 16);
            allocate.putInt(0);
            allocate.put((byte) 0);
            allocate.putInt(i);
            protoMessageBase.serialize(allocate);
            allocate.position(0);
            allocate.putInt(0, allocate.remaining() - 4);
            if (reactionRunnable != null) {
                if (this.reactionMap.size() > 1000) {
                    throw new RuntimeException("Too many pending requests");
                }
                this.reactionMap.put(Integer.valueOf(i2), reactionRunnable);
            }
            StringBuilder a = odj.a(i, i2, "sendMessage(", ") - tid=", ", sending \"");
            a.append(protoMessageBase.getName());
            a.append("\", MSG_INVOKE data=");
            a.append(r490.f(allocate, true));
            ne7.t(TAG, a.toString());
            if (ne7.y(1, "OKMP")) {
                ne7.t("OKMP", "Client -> Server: [" + protoMessageBase.getTransactionId() + "] " + protoMessageBase.getName());
            }
            EventHandler eventHandler = this.handler;
            eventHandler.sendMessage(eventHandler.obtainMessage(5, 0, 0, allocate));
        } catch (ru.ok.proto.rtmp.ProtocolException e) {
            throw new RuntimeException("Failed to serialize message", e);
        }
    }

    public void setEmptyBuffersListener(Runnable runnable) {
        ne7.m(TAG, "setEmptyBuffersListener(" + runnable + ")");
        this.emptyBuffersListener = runnable;
    }

    public void setListener(Listener listener) {
        ne7.m(TAG, "setListener(" + listener + ")");
        this.listener = listener;
    }

    public void setPublishSent(boolean z) {
        ne7.m(TAG, "setPublishSent(" + z + ")");
        this.publishSent = z;
    }

    public void start(int i, int i2) throws IOException {
        ne7.m(TAG, sl9.c(i, i2, "start(", ", ", ")"));
        final FileDescriptorRefCountWrapper fileDescriptorRefCountWrapper = new FileDescriptorRefCountWrapper();
        try {
            DatagramChannel datagramChannel = fileDescriptorRefCountWrapper.getDatagramChannel();
            FDUtils.setNoFragment(fileDescriptorRefCountWrapper.getFD(), true);
            if (this.trafficClass != -1) {
                datagramChannel.socket().setTrafficClass(this.trafficClass);
            }
            datagramChannel.socket().bind(null);
            datagramChannel.socket().setSoTimeout(60000);
            datagramChannel.socket().setSendBufferSize(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            datagramChannel.socket().setReceiveBufferSize(204800);
            datagramChannel.configureBlocking(false);
            datagramChannel.socket().connect(this.remoteAddress);
            cpp0 cpp0Var = new cpp0(i, i2) { // from class: ru.ok.proto.okmp.OkmpClient.1
                private byte[] encryptionKey;

                @Override // xsna.cpp0, one.video.streaming.oktp.TransportWriter
                public void setEncryptionKey(byte[] bArr) {
                    if (bArr == null || Arrays.equals(this.encryptionKey, bArr)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Key changed from ");
                    byte[] bArr2 = this.encryptionKey;
                    sb.append(bArr2 == null ? "<null>" : Integer.valueOf(bArr2.length));
                    sb.append(" to ");
                    sb.append(bArr.length);
                    sb.append(" bytes");
                    ne7.t(OkmpClient.TAG, sb.toString());
                    OkmpClient.this.fdUtils.setKey(bArr);
                    this.encryptionKey = bArr;
                }

                @Override // one.video.streaming.oktp.TransportWriter
                public boolean writeDatagram(ByteBuffer byteBuffer, boolean z, boolean z2) throws IOException {
                    fileDescriptorRefCountWrapper.addRef();
                    long remaining = byteBuffer.remaining();
                    try {
                        int fd = fileDescriptorRefCountWrapper.getFD();
                        if (fd == -1) {
                            throw new SocketException("Attempt to send on closed fd");
                        }
                        int send = OkmpClient.this.fdUtils.send(fd, byteBuffer, z, z2);
                        if (send > 0) {
                            long j = send;
                            this.bytesSent += j;
                            this.bitrateCounter.a(OkmpClient.this._timeMachine.currentTimeMillis(), j);
                            this.bytesDropped = (remaining - j) + this.bytesDropped;
                            return true;
                        }
                        this.bytesDropped += remaining;
                        if (send == -2) {
                            throw new SocketException(lhg.a(send, "Socket returned error "));
                        }
                        ne7.J(OkmpClient.TAG, "writeDatagram: failed to send, result=" + send);
                        return false;
                    } finally {
                        fileDescriptorRefCountWrapper.release();
                    }
                }
            };
            this.transportWriter = cpp0Var;
            OktpChannel createOktpChannel = createOktpChannel(cpp0Var, 20000, this.config, this.log);
            this.oktpChannel = createOktpChannel;
            this.invokeSendStreamId = createOktpChannel.allocateSendStream(0, this.videoKeyFrameIntervalMillis);
            this.audioSendStreamId = this.oktpChannel.allocateSendStream(1, this.videoKeyFrameIntervalMillis);
            this.videoSendStreamId = this.oktpChannel.allocateSendStream(3, this.videoKeyFrameIntervalMillis);
            this.oktpChannel.sendStreamSetMustEncrypt(this.invokeSendStreamId, this.encryptSignalling);
            this.oktpChannel.sendStreamSetMustEncrypt(this.audioSendStreamId, this.encryptAudio);
            this.oktpChannel.sendStreamSetMustEncrypt(this.videoSendStreamId, this.encryptVideo);
            int allocateSendStream = this.oktpChannel.allocateSendStream(1000, this.videoKeyFrameIntervalMillis);
            this.benchSendStreamId = allocateSendStream;
            this.oktpChannel.sendStreamSetMaxDeepness(allocateSendStream, 50, 100000);
            this.oktpChannel.pause();
            EventHandler eventHandler = this.handler;
            eventHandler.sendMessage(eventHandler.obtainMessage(0));
            Thread thread = new Thread(new d8h(3, this, fileDescriptorRefCountWrapper), "okmp-netreader");
            this.networkReaderThread = thread;
            thread.start();
            fileDescriptorRefCountWrapper.addRef();
            fileDescriptorRefCountWrapper.release();
        } catch (Throwable th) {
            fileDescriptorRefCountWrapper.release();
            throw th;
        }
    }

    public void startRetransmitFlood(float f) {
        ne7.m(TAG, "startRetransmitFlood(" + f + ")");
        this.retransmitFloodRateMultiplier = f;
    }

    public void stop() {
        ne7.m(TAG, "stop()");
        this.stopped = true;
        this.shutdownEvent.c();
    }

    public void stopRetransmitFlood() {
        ne7.m(TAG, "stopRetransmitFlood()");
        this.retransmitFloodRateMultiplier = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public long videoSendStreamGetBufferDeepnessMS() {
        return this.oktpChannel.sendStreamGetBufferDeepnessMS(this.videoSendStreamId);
    }

    public long videoSendStreamGetPacketsSent() {
        OktpChannel oktpChannel = this.oktpChannel;
        if (oktpChannel != null) {
            return oktpChannel.sendStreamGetPacketsSent(this.videoSendStreamId);
        }
        return 0L;
    }

    public long videoSendStreamGetTotalDrops() {
        OktpChannel oktpChannel = this.oktpChannel;
        if (oktpChannel != null) {
            return oktpChannel.sendStreamGetTotalDrops(this.videoSendStreamId);
        }
        return 0L;
    }

    public boolean videoSendStreamIsWaitingForSync() {
        return this.oktpChannel.sendStreamIsWaitingForSync(this.videoSendStreamId);
    }

    public void videoSendStreamSetMaxDeepness(int i, int i2) {
        this.oktpChannel.sendStreamSetMaxDeepness(this.videoSendStreamId, i, i2);
    }

    private void handleAudio(ByteBuffer byteBuffer) {
    }

    private void handleVideo(ByteBuffer byteBuffer) {
    }
}
