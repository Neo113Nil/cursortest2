package ru.ok.proto.okmp;

import ru.ok.proto.QualityController;

/* loaded from: classes9.dex */
public class QualityControllerNativeProxy implements QualityController {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public QualityControllerNativeProxy(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(QualityControllerNativeProxy qualityControllerNativeProxy) {
        if (qualityControllerNativeProxy == null) {
            return 0L;
        }
        return qualityControllerNativeProxy.swigCPtr;
    }

    public static long swigRelease(QualityControllerNativeProxy qualityControllerNativeProxy) {
        if (qualityControllerNativeProxy == null) {
            return 0L;
        }
        if (!qualityControllerNativeProxy.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = qualityControllerNativeProxy.swigCPtr;
        qualityControllerNativeProxy.swigCMemOwn = false;
        qualityControllerNativeProxy.delete();
        return j;
    }

    @Override // ru.ok.proto.QualityController
    public boolean canSwitchUp() {
        return OkmpJNI.QualityControllerNativeProxy_canSwitchUp(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public void debugForceTargetBitrate(long j) {
        OkmpJNI.QualityControllerNativeProxy_debugForceTargetBitrate(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    OkmpJNI.delete_QualityControllerNativeProxy(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    @Override // ru.ok.proto.QualityController
    public boolean getAndResetKeyFrameRequest() {
        return OkmpJNI.QualityControllerNativeProxy_getAndResetKeyFrameRequest(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public long getBandwidth() {
        return OkmpJNI.QualityControllerNativeProxy_getBandwidth(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public long getSelectedBandwidth() {
        return OkmpJNI.QualityControllerNativeProxy_getSelectedBandwidth(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public int getVideoFrameSkipCounter() {
        return OkmpJNI.QualityControllerNativeProxy_getVideoFrameSkipCounter(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public boolean isAudioFrameAllowed() {
        return OkmpJNI.QualityControllerNativeProxy_isAudioFrameAllowed(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public boolean isVideoFrameAllowed() {
        return OkmpJNI.QualityControllerNativeProxy_isVideoFrameAllowed(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public void pause() {
        OkmpJNI.QualityControllerNativeProxy_pause(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public void requestKeyFrame() {
        OkmpJNI.QualityControllerNativeProxy_requestKeyFrame(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public void resume() {
        OkmpJNI.QualityControllerNativeProxy_resume(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public void setKeyFrameInterval(int i) {
        OkmpJNI.QualityControllerNativeProxy_setKeyFrameInterval(this.swigCPtr, this, i);
    }

    @Override // ru.ok.proto.QualityController
    public void setSlowpokeIdx(int i) {
        OkmpJNI.QualityControllerNativeProxy_setSlowpokeIdx(this.swigCPtr, this, i);
    }

    @Override // ru.ok.proto.QualityController
    public void setTargetBitrate(long j) {
        OkmpJNI.QualityControllerNativeProxy_setTargetBitrate(this.swigCPtr, this, j);
    }

    @Override // ru.ok.proto.QualityController
    public void start(long j) {
        OkmpJNI.QualityControllerNativeProxy_start(this.swigCPtr, this, j);
    }

    @Override // ru.ok.proto.QualityController
    public long update() {
        return OkmpJNI.QualityControllerNativeProxy_update(this.swigCPtr, this);
    }

    @Override // ru.ok.proto.QualityController
    public void videoSizeChanged() {
        OkmpJNI.QualityControllerNativeProxy_videoSizeChanged(this.swigCPtr, this);
    }

    public QualityControllerNativeProxy() {
        this(OkmpJNI.new_QualityControllerNativeProxy(), true);
    }
}
