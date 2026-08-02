package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.CameraCaptureFailure$Reason;
import defpackage.bm7;
import defpackage.c06;
import defpackage.i8j0;
import defpackage.j8j0;
import defpackage.q0r0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
class Camera2RequestProcessor$Camera2CallbackWrapper extends CameraCaptureSession.CaptureCallback {
    private final i8j0 mCallback;
    private final boolean mInvokeSequenceCallback;
    private final j8j0 mRequest;
    final /* synthetic */ o this$0;

    public Camera2RequestProcessor$Camera2CallbackWrapper(o oVar, j8j0 j8j0Var, i8j0 i8j0Var, boolean z) {
        this.this$0 = oVar;
        this.mCallback = i8j0Var;
        this.mRequest = j8j0Var;
        this.mInvokeSequenceCallback = z;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        int i;
        i8j0 i8j0Var = this.mCallback;
        j8j0 j8j0Var = this.mRequest;
        o oVar = this.this$0;
        synchronized (oVar.a) {
            try {
                List list = oVar.c;
                i = -1;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        q0r0 q0r0Var = (q0r0) it.next();
                        if (q0r0Var.c().get() == surface) {
                            i = q0r0Var.p;
                            break;
                        }
                        continue;
                    }
                }
            } finally {
            }
        }
        i8j0Var.onCaptureBufferLost(j8j0Var, j, i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.mCallback.onCaptureCompleted(this.mRequest, new c06((CaptureResult) totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.mCallback.onCaptureFailed(this.mRequest, new bm7(CameraCaptureFailure$Reason.ERROR, captureFailure));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.mCallback.onCaptureProgressed(this.mRequest, new c06(captureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        if (this.mInvokeSequenceCallback) {
            this.mCallback.onCaptureSequenceAborted(i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        if (this.mInvokeSequenceCallback) {
            this.mCallback.onCaptureSequenceCompleted(i, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.mCallback.onCaptureStarted(this.mRequest, j2, j);
    }
}
