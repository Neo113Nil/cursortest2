package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import defpackage.l0r0;
import defpackage.q6x0;
import defpackage.vjx;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
class AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
    private final l0r0 mCaptureCallback;
    private final AdvancedSessionProcessor$ExtensionMetadataMonitor mExtensionMetadataMonitor;
    private long mOnCaptureStartedTimestamp;
    private final q6x0 mTagBundle;
    private boolean mWillReceiveOnCaptureCompleted;

    public AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(l0r0 l0r0Var, q6x0 q6x0Var, AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor, boolean z) {
        this.mOnCaptureStartedTimestamp = -1L;
        this.mCaptureCallback = l0r0Var;
        this.mTagBundle = q6x0Var;
        this.mExtensionMetadataMonitor = advancedSessionProcessor$ExtensionMetadataMonitor;
        this.mWillReceiveOnCaptureCompleted = z;
    }

    public void onCaptureCompleted(long j, int i, Map<CaptureResult.Key, Object> map) {
        AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor = this.mExtensionMetadataMonitor;
        if (advancedSessionProcessor$ExtensionMetadataMonitor != null) {
            advancedSessionProcessor$ExtensionMetadataMonitor.checkExtensionMetadata(map);
        }
        if (this.mWillReceiveOnCaptureCompleted) {
            this.mCaptureCallback.b(new vjx(j, this.mTagBundle, (Map) map));
            this.mCaptureCallback.c();
        }
    }

    public void onCaptureFailed(int i) {
        this.mCaptureCallback.g();
    }

    public void onCaptureProcessProgressed(int i) {
        this.mCaptureCallback.onCaptureProcessProgressed(i);
    }

    public void onCaptureProcessStarted(int i) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureSequenceAborted(int i) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureSequenceCompleted(int i) {
        if (this.mWillReceiveOnCaptureCompleted) {
            return;
        }
        this.mCaptureCallback.b(new vjx(this.mOnCaptureStartedTimestamp, this.mTagBundle, Collections.EMPTY_MAP));
        this.mCaptureCallback.c();
    }

    public void onCaptureStarted(int i, long j) {
        this.mOnCaptureStartedTimestamp = j;
        this.mCaptureCallback.j();
    }

    public AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(l0r0 l0r0Var, q6x0 q6x0Var, boolean z) {
        this(l0r0Var, q6x0Var, null, z);
    }
}
