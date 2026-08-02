package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import defpackage.ap7;
import defpackage.d6z;
import defpackage.i8j0;
import defpackage.j8j0;
import defpackage.xo7;
import java.util.Objects;

/* loaded from: classes10.dex */
class AdvancedSessionProcessor$CallbackAdapter implements i8j0 {
    private final RequestProcessorImpl.Callback mCallback;

    public AdvancedSessionProcessor$CallbackAdapter(RequestProcessorImpl.Callback callback) {
        this.mCallback = callback;
    }

    private RequestProcessorImpl.Request getImplRequest(j8j0 j8j0Var) {
        d6z.n(j8j0Var instanceof AdvancedSessionProcessor$RequestAdapter);
        return ((AdvancedSessionProcessor$RequestAdapter) j8j0Var).getImplRequest();
    }

    @Override // defpackage.i8j0
    public void onCaptureBufferLost(j8j0 j8j0Var, long j, int i) {
        this.mCallback.onCaptureBufferLost(getImplRequest(j8j0Var), j, i);
    }

    @Override // defpackage.i8j0
    public void onCaptureCompleted(j8j0 j8j0Var, ap7 ap7Var) {
        CaptureResult m = ap7Var.m();
        d6z.m("CaptureResult in cameraCaptureResult is not a TotalCaptureResult", m instanceof TotalCaptureResult);
        this.mCallback.onCaptureCompleted(getImplRequest(j8j0Var), (TotalCaptureResult) m);
    }

    @Override // defpackage.i8j0
    public void onCaptureFailed(j8j0 j8j0Var, xo7 xo7Var) {
        Object a = xo7Var.a();
        d6z.m("CameraCaptureFailure does not contain CaptureFailure.", Objects.nonNull(a));
        this.mCallback.onCaptureFailed(getImplRequest(j8j0Var), (CaptureFailure) a);
    }

    @Override // defpackage.i8j0
    public void onCaptureProgressed(j8j0 j8j0Var, ap7 ap7Var) {
        CaptureResult m = ap7Var.m();
        d6z.m("Cannot get CaptureResult from the cameraCaptureResult ", m != null);
        this.mCallback.onCaptureProgressed(getImplRequest(j8j0Var), m);
    }

    @Override // defpackage.i8j0
    public void onCaptureSequenceAborted(int i) {
        this.mCallback.onCaptureSequenceAborted(i);
    }

    @Override // defpackage.i8j0
    public void onCaptureSequenceCompleted(int i, long j) {
        this.mCallback.onCaptureSequenceCompleted(i, j);
    }

    @Override // defpackage.i8j0
    public void onCaptureStarted(j8j0 j8j0Var, long j, long j2) {
        this.mCallback.onCaptureStarted(getImplRequest(j8j0Var), j, j2);
    }
}
