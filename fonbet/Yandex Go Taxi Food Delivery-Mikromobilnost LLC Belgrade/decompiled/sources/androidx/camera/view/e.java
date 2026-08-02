package androidx.camera.view;

import android.util.Size;
import androidx.camera.view.PreviewView;
import defpackage.br7;
import defpackage.dye0;
import defpackage.eye0;
import defpackage.jqs;
import defpackage.sgb1;
import defpackage.w84;
import defpackage.xnw0;
import defpackage.ynw0;
import defpackage.znw0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final /* synthetic */ class e implements ynw0, dye0 {
    public final /* synthetic */ f a;
    public final /* synthetic */ br7 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(f fVar, br7 br7Var, znw0 znw0Var) {
        this.a = fVar;
        this.b = br7Var;
        this.c = znw0Var;
    }

    public void a() {
        a aVar = (a) this.c;
        AtomicReference<a> atomicReference = this.a.a.mActiveStreamStateObserver;
        while (true) {
            if (atomicReference.compareAndSet(aVar, null)) {
                aVar.b(PreviewView.StreamState.IDLE);
                break;
            } else if (atomicReference.get() != aVar) {
                break;
            }
        }
        jqs jqsVar = aVar.e;
        if (jqsVar != null) {
            jqsVar.cancel(false);
            aVar.e = null;
        }
        this.b.a().a(aVar);
    }

    @Override // defpackage.ynw0
    public void d(xnw0 xnw0Var) {
        eye0 eye0Var;
        znw0 znw0Var = (znw0) this.c;
        PreviewView previewView = this.a.a;
        Objects.toString(xnw0Var);
        sgb1.g(3, "PreviewView");
        boolean z = this.b.f().d() == 0;
        c cVar = previewView.mPreviewTransform;
        Size size = znw0Var.b;
        cVar.getClass();
        Objects.toString(xnw0Var);
        Objects.toString(size);
        sgb1.g(3, "PreviewTransform");
        cVar.b = ((w84) xnw0Var).a;
        w84 w84Var = (w84) xnw0Var;
        cVar.c = w84Var.b;
        cVar.e = w84Var.c;
        cVar.a = size;
        cVar.f = z;
        cVar.g = w84Var.d;
        cVar.d = w84Var.e;
        if (((w84) xnw0Var).c == -1 || ((eye0Var = previewView.mImplementation) != null && (eye0Var instanceof j))) {
            previewView.mUseDisplayRotation = true;
        } else {
            previewView.mUseDisplayRotation = false;
        }
        previewView.redrawPreview();
    }

    public /* synthetic */ e(f fVar, a aVar, br7 br7Var) {
        this.a = fVar;
        this.c = aVar;
        this.b = br7Var;
    }
}
