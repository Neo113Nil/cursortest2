package ru.ok.proto.rtmp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.media.NetStats;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.DataSample;
import ru.ok.media.utils.TimedEvent;
import ru.ok.media.utils.VideoSize;
import ru.ok.proto.NetPublisher;
import ru.ok.proto.PacketStats;
import ru.ok.proto.PublisherConfiguration;
import ru.ok.proto.QualityController;
import ru.ok.proto.rtmp.RtmpClient;
import ru.ok.proto.rtmp.RtmpMessages;
import ru.ok.proto.rtmp.RtmpPublisher;
import xsna.fp;
import xsna.ne7;

/* loaded from: classes9.dex */
public class RtmpPublisher implements NetPublisher {
    private static final int AUDIO_CHUNK_STREAM_ID = 6;
    private static final int DATA_CHUNK_STREAM_ID = 4;
    private static final int MSG_AUDIO_FRAME = 1;
    private static final int MSG_METADATA = 6;
    private static final int MSG_PUBLISH = 7;
    private static final int MSG_UNPUBLISH = 8;
    private static final int MSG_VIDEO_FRAME_LIST = 3;
    private static final int MSG_VIDEO_FRAME_SAMPLE = 4;
    private static final String TAG = "ru.ok.proto.rtmp.RtmpPublisher";
    private static final int VIDEO_CHUNK_STREAM_ID = 5;
    private NetPublisher.Callback callback;
    private Client client;
    private final HandlerThread handlerThread;
    private int lastAudioTimestampMS;
    private final String link;
    private final LoggerInterface logger;
    private boolean paused;
    private boolean publishStarted;
    private int publishStreamId;
    private final PublisherConfiguration publisherConfiguration;
    private final RtmpQualityController qualityController;
    private int retryCount;
    private boolean stopped;
    private byte[] storedAudioHeader;
    private byte[] storedH264Headers;
    private Map<String, Object> storedMetadata;
    private VideoSize videoSize;
    private final TimedEvent lastOKStatus = new TimedEvent();
    private final TimedEvent lastStart = new TimedEvent();
    private int videoRotation = 0;
    private PacketStats mPacketStats = new PacketStats();

    public RtmpPublisher(HandlerThread handlerThread, String str, PublisherConfiguration publisherConfiguration, int i, LoggerInterface loggerInterface) {
        this.handlerThread = handlerThread;
        this.link = str;
        this.client = new Client(handlerThread, str);
        this.qualityController = new RtmpQualityController(i);
        this.publisherConfiguration = publisherConfiguration;
        this.logger = loggerInterface;
    }

    private void checkedStop() {
        Client client = this.client;
        if (client != null) {
            client.stop();
        }
    }

    private void composeAndPushMetadata() {
        pushMetadata(Utils.createMetadata(this.storedH264Headers, this.storedAudioHeader, this.videoRotation));
    }

    private void reconnect(int i) {
        if (this.stopped || !this.handlerThread.isAlive()) {
            return;
        }
        Client client = this.client;
        if (client != null) {
            client.stop();
        }
        this.retryCount++;
        Client client2 = new Client(this.handlerThread, this.link);
        this.client = client2;
        client2.startDelayed(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retryAfterError(int i) {
        this.qualityController.blockTransmission(true);
        Client client = this.client;
        if (client != null) {
            client.stop();
        }
        this.client = null;
        if (this.stopped || this.paused) {
            return;
        }
        long elapsed = this.lastOKStatus.elapsed();
        NetPublisher.Callback callback = this.callback;
        if (shouldRetry()) {
            callback.handleRetrying(callback.getId());
            String str = TAG;
            StringBuilder b = fp.b(elapsed, "Failed to start publishing; retrying: time=", "; retry count=");
            b.append(this.retryCount);
            Log.e(str, b.toString());
            reconnect(Math.max(0, 2000 - ((int) this.lastStart.elapsed())));
            return;
        }
        String str2 = TAG;
        StringBuilder b2 = fp.b(elapsed, "Failed to start publishing: time=", "; retry count=");
        b2.append(this.retryCount);
        Log.e(str2, b2.toString());
        callback.handleError(callback.getId(), i);
        this.stopped = true;
    }

    private void setSocketSendBuffer(int i) {
        Client client = this.client;
        if (client != null) {
            client.setSocketSendBuffer(i);
        }
    }

    private boolean shouldRetry() {
        long elapsed = this.lastOKStatus.elapsed();
        PublisherConfiguration publisherConfiguration = this.publisherConfiguration;
        if (elapsed > publisherConfiguration.reconnectTimeout) {
            return false;
        }
        long j = publisherConfiguration.retryCount;
        return j <= 0 || ((long) this.retryCount) <= j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPublishing() {
        NetPublisher.Callback callback = this.callback;
        if (this.publishStarted) {
            callback.handleRestarted(callback.getId());
        } else {
            this.publishStarted = true;
            callback.handlePublishingStart(callback.getId());
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public long getBitrate() {
        Client client = this.client;
        if (client != null) {
            return client.getBitrate();
        }
        return 0L;
    }

    @Override // ru.ok.proto.NetPublisher
    @NonNull
    public String getDebugInfo() {
        return "";
    }

    @Override // ru.ok.proto.NetPublisher
    public String getName() {
        return "RTMP/OK/Java";
    }

    @Override // ru.ok.proto.NetPublisher
    public NetStats getNetStats() {
        return null;
    }

    @Override // ru.ok.proto.NetPublisher
    public long getNetworkBW(long j) {
        return -1L;
    }

    @Override // ru.ok.proto.NetPublisher
    @NonNull
    public PacketStats getPacketStats() {
        PacketStats packetStats = new PacketStats(this.mPacketStats);
        Client client = this.client;
        if (client != null) {
            packetStats.mBytesSent = client.getTotalBytesSent() + packetStats.mBytesSent;
            packetStats.mBytesReceived = this.client.getTotalBytesReceived() + packetStats.mBytesReceived;
            long audioPacketsSent = this.client.getAudioPacketsSent();
            packetStats.mAudioPacketsSent += audioPacketsSent;
            packetStats.mAudioPacketsDelivered += audioPacketsSent;
            packetStats.mAudioPacketsLost += this.client.getAudioPacketsDropped();
            long videoPacketsSent = this.client.getVideoPacketsSent();
            packetStats.mVideoPacketsSent += videoPacketsSent;
            packetStats.mVideoPacketsDelivered += videoPacketsSent;
            packetStats.mVideoPacketsLost += this.client.getVideoPacketsDropped();
        }
        return packetStats;
    }

    @Override // ru.ok.proto.NetPublisher
    public QualityController getQualityController() {
        return this.qualityController;
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean isConnectionChecked() {
        return true;
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean isPaused() {
        return this.paused;
    }

    @Override // ru.ok.proto.NetPublisher
    public void pause() {
        this.paused = true;
    }

    @Override // ru.ok.proto.NetPublisher
    public void publishStream(String str) {
        this.client.publishStream(str);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pushAACAudioFrame(ByteBuffer byteBuffer, boolean z, int i, int i2) {
        Client client;
        if (z) {
            int limit = byteBuffer.limit();
            byte[] bArr = new byte[limit];
            byteBuffer.get(bArr);
            byteBuffer.position(byteBuffer.position() - limit);
            this.storedAudioHeader = bArr;
            composeAndPushMetadata();
        }
        if (this.stopped || (client = this.client) == null) {
            return;
        }
        client.pushAACAudioFrame(byteBuffer, z, i);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pushH264Frame(DataSample dataSample, boolean z, int i, int i2) {
        Client client;
        if (this.stopped || (client = this.client) == null) {
            return;
        }
        client.pushH264Frame(dataSample, z, i);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pushH264Headers(byte[] bArr, int i) {
        Client client;
        if (bArr != null) {
            this.storedH264Headers = (byte[]) bArr.clone();
            composeAndPushMetadata();
        } else {
            this.storedH264Headers = null;
        }
        if (this.stopped || (client = this.client) == null) {
            return;
        }
        client.pushH264Headers(bArr, i);
    }

    public void pushMetadata(Map<String, Object> map) {
        if (this.stopped) {
            return;
        }
        this.storedMetadata = map;
        Client client = this.client;
        if (client != null) {
            client.pushMetadata(map);
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public void resume() {
        this.paused = false;
        if (this.client == null) {
            NetPublisher.Callback callback = this.callback;
            callback.handleRetrying(callback.getId());
            this.lastStart.signal();
            reconnect(0);
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean sendBenchBytes(int i) {
        return false;
    }

    @Override // ru.ok.proto.NetPublisher
    public void setCallback(NetPublisher.Callback callback) {
        this.callback = callback;
    }

    @Override // ru.ok.proto.NetPublisher
    public void setVideoRotation(int i) {
        ne7.t(TAG, "setVideoRotation(" + i + ")");
        if (this.videoRotation != i) {
            this.videoRotation = i;
            composeAndPushMetadata();
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public void setVideoSize(VideoSize videoSize) {
        if (videoSize.equals(this.videoSize)) {
            return;
        }
        this.videoSize = videoSize;
    }

    @Override // ru.ok.proto.NetPublisher
    public void start() {
        this.lastOKStatus.signalOnce();
        this.lastStart.signal();
        this.client.start();
    }

    @Override // ru.ok.proto.NetPublisher
    public void stop() {
        this.stopped = true;
        checkedStop();
    }

    @Override // ru.ok.proto.NetPublisher
    public void updateBuffers() {
        setSocketSendBuffer(this.qualityController.getRecommendedSocketBufferBytes());
    }

    public class Client extends RtmpClient {
        private boolean aacHeaderSent;
        private long audioPacketsDropped;
        private long audioPacketsSent;
        private boolean h264HeadersSent;
        private final SamplesHandler handler;
        private boolean keyFrameSent;
        private int maxTimestamp;
        private boolean publishStarted;
        private AtomicBoolean stopping;
        private String streamName;
        private long videoPacketsDropped;
        private long videoPacketsSent;

        public class SamplesHandler extends Handler {
            public SamplesHandler(Looper looper) {
                super(looper);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0124 A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:2:0x0000, B:16:0x0019, B:20:0x0023, B:22:0x002b, B:24:0x0110, B:26:0x0124, B:29:0x0052, B:33:0x005c, B:34:0x0062, B:35:0x0079, B:38:0x00a0, B:41:0x00a6, B:42:0x00aa, B:43:0x00ab, B:45:0x00df, B:37:0x007e), top: B:1:0x0000, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void handleMessage(Message message) {
                int remaining;
                int i;
                try {
                    int i2 = message.arg1;
                    int i3 = message.what;
                    if (i3 == 1) {
                        Client client = Client.this;
                        client.maxTimestamp = Math.max(client.maxTimestamp, i2);
                        ByteBuffer byteBuffer = (ByteBuffer) message.obj;
                        remaining = byteBuffer.remaining();
                        Client client2 = Client.this;
                        client2.writeMessage(6, RtmpPublisher.this.publishStreamId, i2, (byte) 8, byteBuffer, false);
                        RtmpPublisher.this.lastOKStatus.signal();
                    } else {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 6) {
                                    Client.this.doSendMetadata((Map) message.obj);
                                    RtmpPublisher.this.lastOKStatus.signal();
                                } else {
                                    if (i3 != 7) {
                                        if (i3 == 8 && Client.this.isHandshaked()) {
                                            if (Client.this.streamName != null) {
                                                RtmpMessages.UnpublishMessage unpublishMessage = new RtmpMessages.UnpublishMessage(Client.this.streamName);
                                                unpublishMessage.setTransactionId(100000.0d);
                                                Client client3 = Client.this;
                                                client3.writeMessage(3, RtmpPublisher.this.publishStreamId, 0, unpublishMessage, (byte) 20);
                                            }
                                        }
                                        return;
                                    }
                                    if (!Client.this.isHandshaked()) {
                                        return;
                                    } else {
                                        Client.this.sendPublish();
                                    }
                                }
                                i = 0;
                            } else {
                                DataSample dataSample = (DataSample) message.obj;
                                try {
                                    int remaining2 = dataSample.remaining();
                                    Client client4 = Client.this;
                                    client4.writeMessage(5, RtmpPublisher.this.publishStreamId, i2, (byte) 9, dataSample.getBuffers(), false);
                                    RtmpPublisher.this.lastOKStatus.signal();
                                    dataSample.release();
                                    i = remaining2;
                                } catch (Throwable th) {
                                    dataSample.release();
                                    throw th;
                                }
                            }
                            Client.this.flush();
                            RtmpPublisher.this.qualityController.dataRemovedFromQueue(i);
                            if (8 != message.what) {
                                Client.this.forceStop();
                                return;
                            }
                            return;
                        }
                        List<ByteBuffer> list = (List) message.obj;
                        remaining = Client.this.getTotalBytes(list);
                        Client client5 = Client.this;
                        client5.maxTimestamp = Math.max(client5.maxTimestamp, i2);
                        Client client6 = Client.this;
                        client6.writeMessage(5, RtmpPublisher.this.publishStreamId, i2, (byte) 9, list, false);
                        RtmpPublisher.this.lastOKStatus.signal();
                    }
                    i = remaining;
                    Client.this.flush();
                    RtmpPublisher.this.qualityController.dataRemovedFromQueue(i);
                    if (8 != message.what) {
                    }
                } catch (Exception e) {
                    Client.this.abort();
                    Client.this.handleError(10, e);
                }
            }
        }

        public Client(HandlerThread handlerThread, String str) {
            super(handlerThread, str);
            this.keyFrameSent = false;
            this.h264HeadersSent = false;
            this.aacHeaderSent = false;
            this.stopping = new AtomicBoolean(false);
            this.handler = new SamplesHandler(handlerThread.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void forceStop() {
            super.stop();
        }

        private byte getFlvHeaderByte(int i, int i2) {
            return (byte) ((i << 4) | i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTotalBytes(List<ByteBuffer> list) {
            Iterator<ByteBuffer> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().remaining();
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendPublish$0() {
            sendMessage(RtmpPublisher.this.publishStreamId, new RtmpMessages.PublishMessage(this.streamName, "live"), null);
            RtmpPublisher.this.qualityController.blockTransmission(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendPublish$1(String str, ByteBuffer byteBuffer) throws ProtocolException {
            RtmpMessages.CreateStreamResponse createStreamResponse = new RtmpMessages.CreateStreamResponse();
            createStreamResponse.deserialize(byteBuffer);
            RtmpPublisher.this.publishStreamId = (int) createStreamResponse.getStreamId();
            executeOnWorker(new Runnable() { // from class: ru.ok.proto.rtmp.f
                @Override // java.lang.Runnable
                public final void run() {
                    RtmpPublisher.Client.this.lambda$sendPublish$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendPublish$2(String str, ByteBuffer byteBuffer) throws ProtocolException {
            RtmpMessages.ServerResponse serverResponse = new RtmpMessages.ServerResponse();
            serverResponse.deserialize(byteBuffer);
            if (serverResponse.isError()) {
                throw new ProtocolException("Failed to connect: response = " + serverResponse.toString());
            }
            if (serverResponse.getInformation().getCode().equals("NetConnection.Connect.Success")) {
                sendMessage(new RtmpMessages.CreateStreamRequest(), new RtmpClient.ReactionRunnable() { // from class: ru.ok.proto.rtmp.e
                    @Override // ru.ok.proto.rtmp.RtmpClient.ReactionRunnable
                    public final void handle(String str2, ByteBuffer byteBuffer2) {
                        RtmpPublisher.Client.this.lambda$sendPublish$1(str2, byteBuffer2);
                    }
                });
            } else {
                throw new ProtocolException("Unexpected connect response: " + serverResponse.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void publishStream(String str) {
            this.streamName = str;
            SamplesHandler samplesHandler = this.handler;
            samplesHandler.sendMessage(samplesHandler.obtainMessage(7));
        }

        private void pushVideoFrame(DataSample dataSample, boolean z, int i) {
            if (isStopped() || !this.publishStarted) {
                dataSample.release();
                this.videoPacketsDropped++;
                return;
            }
            if (!this.keyFrameSent) {
                if (!z) {
                    this.videoPacketsDropped++;
                    RtmpPublisher.this.qualityController.requestKeyFrame();
                    return;
                }
                this.keyFrameSent = true;
            }
            this.videoPacketsSent++;
            RtmpPublisher.this.qualityController.dataPushedToQueue(dataSample.remaining());
            SamplesHandler samplesHandler = this.handler;
            samplesHandler.sendMessage(samplesHandler.obtainMessage(4, i, 0, dataSample));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendPublish() {
            RtmpMessages.ConnectRequest connectRequest = new RtmpMessages.ConnectRequest();
            connectRequest.getCommandObject().setApp(getAppName());
            connectRequest.getCommandObject().setTcUrl(getLink());
            connectRequest.getCommandObject().setNetType(RtmpPublisher.this.logger.getNetType());
            sendMessage(connectRequest, new RtmpClient.ReactionRunnable() { // from class: ru.ok.proto.rtmp.d
                @Override // ru.ok.proto.rtmp.RtmpClient.ReactionRunnable
                public final void handle(String str, ByteBuffer byteBuffer) {
                    RtmpPublisher.Client.this.lambda$sendPublish$2(str, byteBuffer);
                }
            });
        }

        private void storeAVCFrameHeaders(ByteBuffer byteBuffer, boolean z, byte b) {
            byteBuffer.put(getFlvHeaderByte(z ? 1 : 2, 7));
            byteBuffer.put(b);
            byteBuffer.put((byte) 0);
            byteBuffer.put((byte) 0);
            byteBuffer.put((byte) 0);
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void afterHandshake() {
            super.afterHandshake();
            NetPublisher.Callback callback = RtmpPublisher.this.callback;
            callback.handleHandshakeComplete(callback.getId());
        }

        public void doSendMetadata(Map<String, Object> map) {
            writeMessage(4, RtmpPublisher.this.publishStreamId, this.maxTimestamp + 1, new RtmpMessages.SetDataFrameMessage("onMetaData", map), (byte) 18);
        }

        public long getAudioPacketsDropped() {
            return this.audioPacketsDropped;
        }

        public long getAudioPacketsSent() {
            return this.audioPacketsSent;
        }

        public long getVideoPacketsDropped() {
            return this.videoPacketsDropped;
        }

        public long getVideoPacketsSent() {
            return this.videoPacketsSent;
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void handleError(int i, @Nullable Throwable th) {
            super.handleError(i, th);
            if (this != RtmpPublisher.this.client) {
                return;
            }
            RtmpPublisher.this.retryAfterError(i);
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void handleStatus(RtmpMessages.ServerResponse serverResponse) {
            if (this == RtmpPublisher.this.client && "NetStream.Publish.Start".equalsIgnoreCase(serverResponse.getInformation().getCode())) {
                RtmpPublisher.this.startPublishing();
                RtmpPublisher.this.lastOKStatus.signal();
                RtmpPublisher.this.retryCount = 0;
                executeOnWorker(new Runnable() { // from class: ru.ok.proto.rtmp.RtmpPublisher.Client.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Client.this.publishStarted = true;
                        if (RtmpPublisher.this.storedMetadata != null) {
                            Client client = Client.this;
                            client.doSendMetadata(RtmpPublisher.this.storedMetadata);
                            RtmpPublisher.this.storedMetadata = null;
                        }
                    }
                });
            }
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void handleStopped() {
            super.handleStopped();
            if (this != RtmpPublisher.this.client) {
                return;
            }
            NetPublisher.Callback callback = RtmpPublisher.this.callback;
            callback.handleStopped(callback.getId());
        }

        public void pushAACAudioFrame(ByteBuffer byteBuffer, boolean z, int i) {
            if (isStopped() || !this.publishStarted) {
                this.audioPacketsDropped++;
                return;
            }
            if (z) {
                this.aacHeaderSent = true;
            } else if (!this.aacHeaderSent) {
                if (RtmpPublisher.this.storedAudioHeader == null) {
                    this.audioPacketsDropped++;
                    return;
                }
                pushAACAudioFrame(ByteBuffer.wrap(RtmpPublisher.this.storedAudioHeader), true, i);
            }
            int limit = byteBuffer.limit();
            if (limit > 0) {
                ByteBuffer allocate = ByteBuffer.allocate(limit + 2);
                allocate.put((byte) -83);
                allocate.put((byte) (!z ? 1 : 0));
                byteBuffer.get(allocate.array(), allocate.position() + allocate.arrayOffset(), limit);
                allocate.position(0);
                pushAudioFrame(allocate, i);
            }
        }

        public void pushAudioFrame(ByteBuffer byteBuffer, int i) {
            if (isStopped() || !this.publishStarted) {
                this.audioPacketsDropped++;
                return;
            }
            this.audioPacketsSent++;
            RtmpPublisher.this.qualityController.dataPushedToQueue(byteBuffer.remaining());
            int i2 = i - RtmpPublisher.this.lastAudioTimestampMS;
            RtmpPublisher.this.lastAudioTimestampMS = i;
            if (i2 > 0 && i2 < 500) {
                RtmpPublisher.this.qualityController.audioPushedToQueue(i2);
            }
            SamplesHandler samplesHandler = this.handler;
            samplesHandler.sendMessage(samplesHandler.obtainMessage(1, i, 0, byteBuffer));
        }

        public void pushH264Frame(DataSample dataSample, boolean z, int i) {
            if (!this.h264HeadersSent) {
                if (RtmpPublisher.this.storedH264Headers == null) {
                    this.videoPacketsDropped++;
                    return;
                }
                pushH264Headers(RtmpPublisher.this.storedH264Headers, i);
            }
            ByteBuffer allocate = ByteBuffer.allocate(5);
            storeAVCFrameHeaders(allocate, z, (byte) 1);
            if (dataSample.remaining() <= 4) {
                dataSample.release();
                this.videoPacketsDropped++;
                return;
            }
            allocate.limit(allocate.position());
            allocate.position(0);
            List<ByteBuffer> buffers = dataSample.getBuffers();
            ArrayList arrayList = new ArrayList(buffers.size() + 1);
            arrayList.add(allocate);
            arrayList.addAll(buffers);
            dataSample.setBuffers(arrayList);
            pushVideoFrame(dataSample, z, i);
        }

        public void pushH264Headers(byte[] bArr, int i) {
            if (bArr != null) {
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 5);
                storeAVCFrameHeaders(allocate, true, (byte) 0);
                allocate.put(bArr);
                allocate.position(0);
                pushVideoFrame(Collections.singletonList(allocate), i);
                this.h264HeadersSent = true;
            }
        }

        public void pushMetadata(Map<String, Object> map) {
            if (isStopped() || !this.publishStarted) {
                return;
            }
            SamplesHandler samplesHandler = this.handler;
            samplesHandler.sendMessage(samplesHandler.obtainMessage(6, 0, 0, map));
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void start() {
            RtmpPublisher.this.lastStart.signal();
            super.start();
            this.maxTimestamp = Integer.MIN_VALUE;
        }

        public void startDelayed(int i) {
            this.handler.postDelayed(new Runnable() { // from class: ru.ok.proto.rtmp.RtmpPublisher.Client.2
                @Override // java.lang.Runnable
                public void run() {
                    Client.this.start();
                }
            }, i);
        }

        @Override // ru.ok.proto.rtmp.RtmpClient
        public void stop() {
            if (this.stopping.getAndSet(true)) {
                return;
            }
            if (!RtmpPublisher.this.handlerThread.isAlive()) {
                forceStop();
                return;
            }
            SamplesHandler samplesHandler = this.handler;
            samplesHandler.sendMessage(samplesHandler.obtainMessage(8));
            this.handler.postDelayed(new Runnable() { // from class: ru.ok.proto.rtmp.c
                @Override // java.lang.Runnable
                public final void run() {
                    RtmpPublisher.Client.this.forceStop();
                }
            }, 6000L);
        }

        public void pushVideoFrame(List<ByteBuffer> list, int i) {
            if (!isStopped() && this.publishStarted) {
                this.videoPacketsSent++;
                RtmpPublisher.this.qualityController.dataPushedToQueue(getTotalBytes(list));
                SamplesHandler samplesHandler = this.handler;
                samplesHandler.sendMessage(samplesHandler.obtainMessage(3, i, 0, list));
                return;
            }
            this.videoPacketsDropped++;
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public void dropBenchBytes() {
    }

    @Override // ru.ok.proto.NetPublisher
    public void setBitrates(long j, long j2) {
    }
}
