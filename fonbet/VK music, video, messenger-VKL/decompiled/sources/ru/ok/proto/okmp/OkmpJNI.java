package ru.ok.proto.okmp;

import java.nio.ByteBuffer;
import one.video.streaming.tools.TimeMachine;
import ru.ok.media.NetStats;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.DataSample;
import ru.ok.media.utils.VideoSize;
import ru.ok.proto.NetPublisher;
import ru.ok.proto.PacketStats;
import ru.ok.proto.PublisherConfiguration;

/* loaded from: classes9.dex */
public class OkmpJNI {
    public static final native void DMN_throwJavaException(long j, String str, String str2);

    public static final native void OkmpPublisherNative_dropBenchBytes(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native long OkmpPublisherNative_getBitrate(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native String OkmpPublisherNative_getBoundAddress(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native String OkmpPublisherNative_getDebugInfo(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native String OkmpPublisherNative_getInterfaceName(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native String OkmpPublisherNative_getName(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native NetStats OkmpPublisherNative_getNetStats(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native long OkmpPublisherNative_getNetworkBW(long j, OkmpPublisherNative okmpPublisherNative, long j2);

    public static final native PacketStats OkmpPublisherNative_getPacketStats(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native QualityControllerNativeProxy OkmpPublisherNative_getQualityController(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native int OkmpPublisherNative_getQualityControllerStateRaw(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native int[] OkmpPublisherNative_getRecentQueueBlocks(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native long OkmpPublisherNative_getTicks(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native void OkmpPublisherNative_handleMessage(long j, OkmpPublisherNative okmpPublisherNative, int i);

    public static final native boolean OkmpPublisherNative_isConnectionChecked(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native boolean OkmpPublisherNative_isPaused(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native void OkmpPublisherNative_pause(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native void OkmpPublisherNative_publishStream(long j, OkmpPublisherNative okmpPublisherNative, String str);

    public static final native void OkmpPublisherNative_pushAACAudioFrame(long j, OkmpPublisherNative okmpPublisherNative, ByteBuffer byteBuffer, boolean z, int i, int i2);

    public static final native void OkmpPublisherNative_pushH264Frame(long j, OkmpPublisherNative okmpPublisherNative, DataSample dataSample, boolean z, int i, int i2);

    public static final native void OkmpPublisherNative_pushH264Headers(long j, OkmpPublisherNative okmpPublisherNative, byte[] bArr, int i);

    public static final native void OkmpPublisherNative_resume(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native boolean OkmpPublisherNative_sendBenchBytes(long j, OkmpPublisherNative okmpPublisherNative, int i);

    public static final native void OkmpPublisherNative_setBitrates(long j, OkmpPublisherNative okmpPublisherNative, long j2, long j3);

    public static final native void OkmpPublisherNative_setCallback(long j, OkmpPublisherNative okmpPublisherNative, NetPublisher.Callback callback);

    public static final native void OkmpPublisherNative_setVideoRotation(long j, OkmpPublisherNative okmpPublisherNative, int i);

    public static final native void OkmpPublisherNative_setVideoSize(long j, OkmpPublisherNative okmpPublisherNative, VideoSize videoSize);

    public static final native void OkmpPublisherNative_start(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native void OkmpPublisherNative_stop(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native void OkmpPublisherNative_updateBuffers(long j, OkmpPublisherNative okmpPublisherNative);

    public static final native boolean QualityControllerNativeProxy_canSwitchUp(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native void QualityControllerNativeProxy_debugForceTargetBitrate(long j, QualityControllerNativeProxy qualityControllerNativeProxy, long j2);

    public static final native boolean QualityControllerNativeProxy_getAndResetKeyFrameRequest(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native long QualityControllerNativeProxy_getBandwidth(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native long QualityControllerNativeProxy_getSelectedBandwidth(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native int QualityControllerNativeProxy_getVideoFrameSkipCounter(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native boolean QualityControllerNativeProxy_isAudioFrameAllowed(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native boolean QualityControllerNativeProxy_isVideoFrameAllowed(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native void QualityControllerNativeProxy_pause(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native void QualityControllerNativeProxy_requestKeyFrame(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native void QualityControllerNativeProxy_resume(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native void QualityControllerNativeProxy_setKeyFrameInterval(long j, QualityControllerNativeProxy qualityControllerNativeProxy, int i);

    public static final native void QualityControllerNativeProxy_setSlowpokeIdx(long j, QualityControllerNativeProxy qualityControllerNativeProxy, int i);

    public static final native void QualityControllerNativeProxy_setTargetBitrate(long j, QualityControllerNativeProxy qualityControllerNativeProxy, long j2);

    public static final native void QualityControllerNativeProxy_start(long j, QualityControllerNativeProxy qualityControllerNativeProxy, long j2);

    public static final native long QualityControllerNativeProxy_update(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native void QualityControllerNativeProxy_videoSizeChanged(long j, QualityControllerNativeProxy qualityControllerNativeProxy);

    public static final native byte[] cdata(long j, long j2);

    public static final native void delete_OkmpPublisherNative(long j);

    public static final native void delete_PlatformSpecificInfo(long j);

    public static final native void delete_QualityControllerNativeProxy(long j);

    public static final native void memmove(long j, byte[] bArr);

    public static final native long new_OkmpPublisherNative(TimeMachine timeMachine, OkmpHandler okmpHandler, String str, String str2, int i, PublisherConfiguration publisherConfiguration, int i2, LoggerInterface loggerInterface, long j, PlatformSpecificInfo platformSpecificInfo);

    public static final native long new_PlatformSpecificInfo(String str, String str2, String str3, String str4, String str5);

    public static final native long new_QualityControllerNativeProxy();
}
