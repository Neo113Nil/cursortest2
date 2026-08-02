package one.video.streaming.oktp;

import java.nio.ByteBuffer;
import one.video.streaming.oktp.OktpChannel;
import one.video.streaming.tools.LogInterface;
import one.video.streaming.tools.TimeMachine;

/* loaded from: classes8.dex */
public class OktpJNI {
    public static final native int OktpChannelNative_allocateSendStream(long j, OktpChannelNative oktpChannelNative, int i, int i2);

    public static final native int OktpChannelNative_bytesPending(long j, OktpChannelNative oktpChannelNative);

    public static final native void OktpChannelNative_close(long j, OktpChannelNative oktpChannelNative);

    public static final native void OktpChannelNative_connect(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native void OktpChannelNative_disableFlowControl(long j, OktpChannelNative oktpChannelNative);

    public static final native String OktpChannelNative_dumpToString(long j, OktpChannelNative oktpChannelNative);

    public static final native void OktpChannelNative_enableFloodSending(long j, OktpChannelNative oktpChannelNative, boolean z);

    public static final native void OktpChannelNative_flush(long j, OktpChannelNative oktpChannelNative);

    public static final native float OktpChannelNative_getAuxOverhead(long j, OktpChannelNative oktpChannelNative);

    public static final native float OktpChannelNative_getAverageLossRateFast(long j, OktpChannelNative oktpChannelNative);

    public static final native float OktpChannelNative_getAverageLossRateSlow(long j, OktpChannelNative oktpChannelNative);

    public static final native float OktpChannelNative_getAverageRTT(long j, OktpChannelNative oktpChannelNative);

    public static final native float OktpChannelNative_getAverageRTTJitter(long j, OktpChannelNative oktpChannelNative);

    public static final native long OktpChannelNative_getBytesBuffered(long j, OktpChannelNative oktpChannelNative);

    public static final native long OktpChannelNative_getDatagramLayerBytes(long j, OktpChannelNative oktpChannelNative);

    public static final native float OktpChannelNative_getDatagramOverhead(long j, OktpChannelNative oktpChannelNative);

    public static final native long OktpChannelNative_getEstimatedBitrate(long j, OktpChannelNative oktpChannelNative, long j2);

    public static final native long OktpChannelNative_getEstimatedPayloadDeliveryBitrate(long j, OktpChannelNative oktpChannelNative);

    public static final native long OktpChannelNative_getEstimatedRetransmitBitrate(long j, OktpChannelNative oktpChannelNative);

    public static final native int OktpChannelNative_getExpectedDeliveryDelayMS(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native int OktpChannelNative_getExpectedDeliveryDelaySlowMS(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native long OktpChannelNative_getInactiveTime(long j, OktpChannelNative oktpChannelNative);

    public static final native int OktpChannelNative_getMTU(long j, OktpChannelNative oktpChannelNative);

    public static final native int OktpChannelNative_getMinExpectedDeliveryDelayMS(long j, OktpChannelNative oktpChannelNative);

    public static final native String OktpChannelNative_getOverheadStats(long j, OktpChannelNative oktpChannelNative);

    public static final native float OktpChannelNative_getPacketHeaderOverhead(long j, OktpChannelNative oktpChannelNative);

    public static final native long OktpChannelNative_getPayloadBytesDelivered(long j, OktpChannelNative oktpChannelNative);

    public static final native int OktpChannelNative_getRemoteCloseReason(long j, OktpChannelNative oktpChannelNative);

    public static final native double OktpChannelNative_getRetransmitOverhead(long j, OktpChannelNative oktpChannelNative);

    public static final native boolean OktpChannelNative_isClosed(long j, OktpChannelNative oktpChannelNative);

    public static final native boolean OktpChannelNative_isHandshaked(long j, OktpChannelNative oktpChannelNative);

    public static final native void OktpChannelNative_onHandleReceiveStreamData(long j, OktpChannelNative oktpChannelNative, ByteBuffer byteBuffer, boolean z);

    public static final native void OktpChannelNative_pause(long j, OktpChannelNative oktpChannelNative);

    public static final native void OktpChannelNative_process(long j, OktpChannelNative oktpChannelNative, boolean z, ByteBuffer byteBuffer);

    public static final native void OktpChannelNative_removeListener(long j, OktpChannelNative oktpChannelNative);

    public static final native void OktpChannelNative_resume(long j, OktpChannelNative oktpChannelNative);

    public static final native int OktpChannelNative_sendFloodBytes(long j, OktpChannelNative oktpChannelNative, int i, int i2);

    public static final native void OktpChannelNative_sendReject(long j, OktpChannelNative oktpChannelNative, byte[] bArr);

    public static final native void OktpChannelNative_sendStreamDropBuffer(long j, OktpChannelNative oktpChannelNative, int i, boolean z, boolean z2);

    public static final native float OktpChannelNative_sendStreamGetAverageVelocityFast(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native float OktpChannelNative_sendStreamGetAverageVelocitySlow(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native int OktpChannelNative_sendStreamGetBufferDeepnessBytes(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native int OktpChannelNative_sendStreamGetBufferDeepnessMS(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native int OktpChannelNative_sendStreamGetBufferSizeMS(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native long OktpChannelNative_sendStreamGetOverflowPacketDrops(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native int OktpChannelNative_sendStreamGetPacketsSent(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native int OktpChannelNative_sendStreamGetTotalDrops(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native boolean OktpChannelNative_sendStreamIsKeyFrameRequired(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native boolean OktpChannelNative_sendStreamIsWaitingForSync(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native int OktpChannelNative_sendStreamPushPacket(long j, OktpChannelNative oktpChannelNative, int i, ByteBuffer byteBuffer, int i2, boolean z);

    public static final native void OktpChannelNative_sendStreamSetMaxDeepness(long j, OktpChannelNative oktpChannelNative, int i, int i2, int i3);

    public static final native void OktpChannelNative_sendStreamSetMustEncrypt(long j, OktpChannelNative oktpChannelNative, int i, boolean z);

    public static final native void OktpChannelNative_setFirstBandwidthLimitedPriority(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native void OktpChannelNative_setFloodStream(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native void OktpChannelNative_setKey(long j, OktpChannelNative oktpChannelNative, int i);

    public static final native void OktpChannelNative_setSecret(long j, OktpChannelNative oktpChannelNative, byte[] bArr);

    public static final native void OktpChannelNative_setTargetBitrate(long j, OktpChannelNative oktpChannelNative, int i, float f);

    public static final native byte[] cdata(long j, long j2);

    public static final native void delete_OktpChannelNative(long j);

    public static final native long getCurrentTimeMillis();

    public static final native void memmove(long j, byte[] bArr);

    public static final native long new_OktpChannelNative(TimeMachine timeMachine, KeyExchange keyExchange, OktpChannel.Listener listener, TransportWriter transportWriter, int i, boolean z, boolean z2, LogInterface logInterface, int i2);

    public static final native void setPublisherLogger(PublisherLogger publisherLogger);
}
