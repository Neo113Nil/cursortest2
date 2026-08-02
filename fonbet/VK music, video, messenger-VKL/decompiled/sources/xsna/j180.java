package xsna;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import xsna.qy50;

/* compiled from: OnBackInvokedInput.android.kt */
/* loaded from: classes12.dex */
public final class j180 implements OnBackAnimationCallback {
    public final /* synthetic */ k180 a;

    public j180(k180 k180Var) {
        this.a = k180Var;
    }

    public final void onBackCancelled() {
        k180 k180Var = this.a;
        jy50 jy50Var = k180Var.a;
        if (jy50Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!k180Var.b) {
            jy50Var.d(k180Var, null);
        }
        py50 py50Var = jy50Var.b;
        if (k180Var.equals(py50Var.h) && -1 == py50Var.g) {
            ly50<?> ly50Var = py50Var.f;
            if (ly50Var == null) {
                ly50Var = py50Var.c(-1);
            }
            py50Var.f = null;
            py50Var.g = 0;
            py50Var.h = null;
            if (ly50Var != null) {
                qy50.a aVar = qy50.a.a;
                ly50Var.a();
            }
            py50Var.a.setValue(qy50.a.a);
        }
        k180Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        hy50 a = ry50.a(backEvent);
        k180 k180Var = this.a;
        jy50 jy50Var = k180Var.a;
        if (jy50Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (k180Var.b) {
            py50 py50Var = jy50Var.b;
            if (k180Var.equals(py50Var.h) && -1 == py50Var.g) {
                ly50<?> ly50Var = py50Var.f;
                if (ly50Var == null) {
                    ly50Var = py50Var.c(-1);
                }
                if (ly50Var != null) {
                    new qy50.b(a, -1);
                    ly50Var.c(a);
                }
                utk0 utk0Var = py50Var.a;
                qy50.b bVar = new qy50.b(a, -1);
                utk0Var.getClass();
                utk0Var.i(null, bVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        hy50 a = ry50.a(backEvent);
        k180 k180Var = this.a;
        jy50 jy50Var = k180Var.a;
        if (jy50Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (k180Var.b) {
            return;
        }
        jy50Var.d(k180Var, a);
        k180Var.b = true;
    }
}
