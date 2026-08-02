package androidx.camera.view;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import defpackage.dye0;
import defpackage.e9e;
import defpackage.sgb1;
import defpackage.wnw0;
import defpackage.znw0;
import java.util.Objects;

/* loaded from: classes10.dex */
class SurfaceViewImplementation$SurfaceRequestCallback implements SurfaceHolder.Callback {
    private Size mCurrentSurfaceSize;
    private dye0 mOnSurfaceNotInUseListener;
    private znw0 mSurfaceRequest;
    private znw0 mSurfaceRequestToBeInvalidated;
    private Size mTargetSize;
    final /* synthetic */ j this$0;
    private boolean mWasSurfaceProvided = false;
    private boolean mNeedToInvalidate = false;

    public SurfaceViewImplementation$SurfaceRequestCallback(j jVar) {
        this.this$0 = jVar;
    }

    private boolean canProvideSurface() {
        return (this.mWasSurfaceProvided || this.mSurfaceRequest == null || !Objects.equals(this.mTargetSize, this.mCurrentSurfaceSize)) ? false : true;
    }

    private void cancelPreviousRequest() {
        dye0 dye0Var;
        znw0 znw0Var = this.mSurfaceRequest;
        if (znw0Var != null) {
            Objects.toString(znw0Var);
            sgb1.g(3, "SurfaceViewImpl");
            if (!this.mSurfaceRequest.d() || (dye0Var = this.mOnSurfaceNotInUseListener) == null) {
                return;
            }
            ((e) dye0Var).a();
        }
    }

    private void closeSurface() {
        znw0 znw0Var = this.mSurfaceRequest;
        if (znw0Var != null) {
            Objects.toString(znw0Var);
            sgb1.g(3, "SurfaceViewImpl");
            this.mSurfaceRequest.m.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$tryToComplete$0(dye0 dye0Var, wnw0 wnw0Var) {
        sgb1.g(3, "SurfaceViewImpl");
        if (dye0Var != null) {
            ((e) dye0Var).a();
        }
    }

    private boolean tryToComplete() {
        Surface surface = this.this$0.e.getHolder().getSurface();
        if (!canProvideSurface()) {
            return false;
        }
        sgb1.g(3, "SurfaceViewImpl");
        final dye0 dye0Var = this.mOnSurfaceNotInUseListener;
        znw0 znw0Var = this.mSurfaceRequest;
        Objects.requireNonNull(znw0Var);
        znw0Var.b(surface, this.this$0.e.getContext().getMainExecutor(), new e9e() { // from class: androidx.camera.view.i
            @Override // defpackage.e9e
            public final void accept(Object obj) {
                SurfaceViewImplementation$SurfaceRequestCallback.lambda$tryToComplete$0(dye0.this, (wnw0) obj);
            }
        });
        this.mWasSurfaceProvided = true;
        j jVar = this.this$0;
        jVar.d = true;
        jVar.f();
        return true;
    }

    public void setSurfaceRequest(znw0 znw0Var, dye0 dye0Var) {
        cancelPreviousRequest();
        if (this.mNeedToInvalidate) {
            this.mNeedToInvalidate = false;
            znw0Var.d();
            znw0Var.k.b(null);
            return;
        }
        this.mSurfaceRequest = znw0Var;
        this.mOnSurfaceNotInUseListener = dye0Var;
        Size size = znw0Var.b;
        this.mTargetSize = size;
        this.mWasSurfaceProvided = false;
        if (tryToComplete()) {
            return;
        }
        sgb1.g(3, "SurfaceViewImpl");
        this.this$0.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        sgb1.g(3, "SurfaceViewImpl");
        this.mCurrentSurfaceSize = new Size(i2, i3);
        tryToComplete();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        znw0 znw0Var;
        sgb1.g(3, "SurfaceViewImpl");
        if (!this.mNeedToInvalidate || (znw0Var = this.mSurfaceRequestToBeInvalidated) == null) {
            return;
        }
        znw0Var.d();
        znw0Var.k.b(null);
        this.mSurfaceRequestToBeInvalidated = null;
        this.mNeedToInvalidate = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        sgb1.g(3, "SurfaceViewImpl");
        if (this.mWasSurfaceProvided) {
            closeSurface();
        } else {
            cancelPreviousRequest();
        }
        this.mNeedToInvalidate = true;
        znw0 znw0Var = this.mSurfaceRequest;
        if (znw0Var != null) {
            this.mSurfaceRequestToBeInvalidated = znw0Var;
        }
        this.mWasSurfaceProvided = false;
        this.mSurfaceRequest = null;
        this.mOnSurfaceNotInUseListener = null;
        this.mCurrentSurfaceSize = null;
        this.mTargetSize = null;
    }
}
