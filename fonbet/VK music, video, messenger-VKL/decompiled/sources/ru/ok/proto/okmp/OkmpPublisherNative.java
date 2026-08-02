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
public class OkmpPublisherNative implements NetPublisher {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public OkmpPublisherNative(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(OkmpPublisherNative okmpPublisherNative) {
        if (okmpPublisherNative == null) {
            return 0L;
        }
        return okmpPublisherNative.swigCPtr;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    OkmpJNI.delete_OkmpPublisherNative(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public void dropBenchBytes() {
        OkmpJNI.OkmpPublisherNative_dropBenchBytes(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    @Override // ru.ok.proto.NetPublisher
    public long getBitrate() {
        return OkmpJNI.OkmpPublisherNative_getBitrate(this.swigCPtr, this);
    }

    public String getBoundAddress() {
        return OkmpJNI.OkmpPublisherNative_getBoundAddress(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public String getDebugInfo() {
        return OkmpJNI.OkmpPublisherNative_getDebugInfo(this.swigCPtr, this);
    }

    public String getInterfaceName() {
        return OkmpJNI.OkmpPublisherNative_getInterfaceName(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public String getName() {
        return OkmpJNI.OkmpPublisherNative_getName(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public NetStats getNetStats() {
        return OkmpJNI.OkmpPublisherNative_getNetStats(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public long getNetworkBW(long j) {
        return OkmpJNI.OkmpPublisherNative_getNetworkBW(this.swigCPtr, this, j);
    }

    @Override // ru.ok.proto.NetPublisher
    public PacketStats getPacketStats() {
        return OkmpJNI.OkmpPublisherNative_getPacketStats(this.swigCPtr, this);
    }

    public int getQualityControllerStateRaw() {
        return OkmpJNI.OkmpPublisherNative_getQualityControllerStateRaw(this.swigCPtr, this);
    }

    public int[] getRecentQueueBlocks() {
        return OkmpJNI.OkmpPublisherNative_getRecentQueueBlocks(this.swigCPtr, this);
    }

    public long getTicks() {
        return OkmpJNI.OkmpPublisherNative_getTicks(this.swigCPtr, this);
    }

    public void handleMessage(int i) {
        OkmpJNI.OkmpPublisherNative_handleMessage(this.swigCPtr, this, i);
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean isConnectionChecked() {
        return OkmpJNI.OkmpPublisherNative_isConnectionChecked(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean isPaused() {
        return OkmpJNI.OkmpPublisherNative_isPaused(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pause() {
        OkmpJNI.OkmpPublisherNative_pause(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public void publishStream(String str) {
        OkmpJNI.OkmpPublisherNative_publishStream(this.swigCPtr, this, str);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pushAACAudioFrame(ByteBuffer byteBuffer, boolean z, int i, int i2) {
        OkmpJNI.OkmpPublisherNative_pushAACAudioFrame(this.swigCPtr, this, byteBuffer, z, i, i2);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pushH264Frame(DataSample dataSample, boolean z, int i, int i2) {
        OkmpJNI.OkmpPublisherNative_pushH264Frame(this.swigCPtr, this, dataSample, z, i, i2);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pushH264Headers(byte[] bArr, int i) {
        OkmpJNI.OkmpPublisherNative_pushH264Headers(this.swigCPtr, this, bArr, i);
    }

    @Override // ru.ok.proto.NetPublisher
    public void resume() {
        OkmpJNI.OkmpPublisherNative_resume(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean sendBenchBytes(int i) {
        return OkmpJNI.OkmpPublisherNative_sendBenchBytes(this.swigCPtr, this, i);
    }

    @Override // ru.ok.proto.NetPublisher
    public void setBitrates(long j, long j2) {
        OkmpJNI.OkmpPublisherNative_setBitrates(this.swigCPtr, this, j, j2);
    }

    @Override // ru.ok.proto.NetPublisher
    public void setCallback(NetPublisher.Callback callback) {
        OkmpJNI.OkmpPublisherNative_setCallback(this.swigCPtr, this, callback);
    }

    @Override // ru.ok.proto.NetPublisher
    public void setVideoRotation(int i) {
        OkmpJNI.OkmpPublisherNative_setVideoRotation(this.swigCPtr, this, i);
    }

    @Override // ru.ok.proto.NetPublisher
    public void setVideoSize(VideoSize videoSize) {
        OkmpJNI.OkmpPublisherNative_setVideoSize(this.swigCPtr, this, videoSize);
    }

    @Override // ru.ok.proto.NetPublisher
    public void start() {
        OkmpJNI.OkmpPublisherNative_start(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public void stop() {
        OkmpJNI.OkmpPublisherNative_stop(this.swigCPtr, this);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    @Override // ru.ok.proto.NetPublisher
    public void updateBuffers() {
        OkmpJNI.OkmpPublisherNative_updateBuffers(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.NetPublisher
    public QualityControllerNativeProxy getQualityController() {
        return OkmpJNI.OkmpPublisherNative_getQualityController(this.swigCPtr, this);
    }

    public OkmpPublisherNative(TimeMachine timeMachine, OkmpHandler okmpHandler, String str, String str2, int i, PublisherConfiguration publisherConfiguration, int i2, LoggerInterface loggerInterface, PlatformSpecificInfo platformSpecificInfo) {
        this(OkmpJNI.new_OkmpPublisherNative(timeMachine, okmpHandler, str, str2, i, publisherConfiguration, i2, loggerInterface, PlatformSpecificInfo.getCPtr(platformSpecificInfo), platformSpecificInfo), true);
    }
}
