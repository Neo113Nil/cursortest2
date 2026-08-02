package one.video.streaming.oktp;

import androidx.annotation.Keep;
import java.io.IOException;
import java.nio.ByteBuffer;
import one.video.streaming.tools.TimeMachine;
import one.video.streaming.tools.exceptions.ProtocolException;

@Keep
/* loaded from: classes8.dex */
public interface OktpChannel {
    public static final int INVALID_STREAM_ID = -1;

    @Keep
    public interface Listener {
        void handleIncomingData(ByteBuffer byteBuffer, boolean z);

        void onAccept();
    }

    int allocateSendStream(int i, int i2);

    long bytesPending();

    void close() throws IOException, ProtocolException;

    void connect(int i) throws IOException, ProtocolException;

    String dumpToString();

    void flush() throws IOException, ProtocolException;

    float getAverageLossRateFast();

    float getAverageLossRateSlow();

    float getAverageRTT();

    long getEstimatedBitrate(long j);

    int getExpectedDeliveryDelayMS(int i);

    long getInactiveTime();

    int getMTU();

    double getRetransmitOverhead();

    TimeMachine getTimeMachine();

    boolean isClosed();

    boolean isHandshaked();

    void pause();

    void process(boolean z, ByteBuffer byteBuffer) throws ProtocolException, IOException;

    void removeListener();

    void resume();

    void sendReject(byte[] bArr) throws IOException, ProtocolException;

    long sendStreamGetBufferDeepnessMS(int i);

    long sendStreamGetPacketsSent(int i);

    long sendStreamGetTotalDrops(int i);

    boolean sendStreamIsWaitingForSync(int i);

    int sendStreamPushPacket(int i, ByteBuffer byteBuffer, int i2, boolean z) throws ProtocolException;

    void sendStreamSetMaxDeepness(int i, int i2, int i3);

    void sendStreamSetMustEncrypt(int i, boolean z);

    void setKey(int i);

    void setSecret(byte[] bArr);
}
