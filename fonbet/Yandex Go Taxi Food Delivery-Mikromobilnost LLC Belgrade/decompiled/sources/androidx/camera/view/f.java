package androidx.camera.view;

import android.graphics.Rect;
import android.util.Rational;
import defpackage.ar7;
import defpackage.br7;
import defpackage.fye0;
import defpackage.rxe0;
import defpackage.sgb1;
import defpackage.tob1;
import defpackage.znw0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class f implements rxe0 {
    public final /* synthetic */ PreviewView a;

    public f(PreviewView previewView) {
        this.a = previewView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rxe0
    public final void a(final znw0 znw0Var) {
        j jVar;
        if (!tob1.d()) {
            this.a.getContext().getMainExecutor().execute(new Runnable() { // from class: androidx.camera.view.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.a.mSurfaceProvider.a(znw0Var);
                }
            });
            return;
        }
        sgb1.g(3, "PreviewView");
        br7 br7Var = znw0Var.e;
        this.a.mCameraInfoInternal = br7Var.f();
        fye0 fye0Var = this.a.mPreviewViewMeteringPointFactory;
        Rect n = br7Var.f().n();
        fye0Var.getClass();
        fye0Var.a = new Rational(n.width(), n.height());
        synchronized (fye0Var) {
            fye0Var.c = n;
        }
        znw0Var.c(this.a.getContext().getMainExecutor(), new e(this, br7Var, znw0Var));
        PreviewView previewView = this.a;
        if (!PreviewView.shouldReuseImplementation(previewView.mImplementation, znw0Var, previewView.mImplementationMode)) {
            PreviewView previewView2 = this.a;
            boolean shouldUseTextureView = PreviewView.shouldUseTextureView(znw0Var, previewView2.mImplementationMode);
            PreviewView previewView3 = this.a;
            c cVar = previewView3.mPreviewTransform;
            if (shouldUseTextureView) {
                l lVar = new l(previewView3, cVar);
                lVar.i = false;
                lVar.k = new AtomicReference();
                jVar = lVar;
            } else {
                jVar = new j(previewView3, cVar);
            }
            previewView2.mImplementation = jVar;
        }
        ar7 f = br7Var.f();
        PreviewView previewView4 = this.a;
        a aVar = new a(f, previewView4.mPreviewStreamStateLiveData, previewView4.mImplementation);
        this.a.mActiveStreamStateObserver.set(aVar);
        br7Var.a().b(this.a.getContext().getMainExecutor(), aVar);
        this.a.mImplementation.e(znw0Var, new e(this, aVar, br7Var));
        PreviewView previewView5 = this.a;
        if (previewView5.indexOfChild(previewView5.mScreenFlashView) == -1) {
            PreviewView previewView6 = this.a;
            previewView6.addView(previewView6.mScreenFlashView);
        }
    }
}
