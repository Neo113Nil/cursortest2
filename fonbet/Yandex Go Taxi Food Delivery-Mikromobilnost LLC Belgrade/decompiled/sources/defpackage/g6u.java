package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.a;

/* loaded from: classes9.dex */
public final class g6u extends j400 implements fph {
    public final Handler b;
    public final String c;
    public final boolean w;
    public final g6u x;

    public g6u(Handler handler, String str, boolean z) {
        this.b = handler;
        this.c = str;
        this.w = z;
        this.x = z ? this : new g6u(handler, str, true);
    }

    @Override // defpackage.jse
    public final boolean G(fse fseVar) {
        return (this.w && jl40.l(Looper.myLooper(), this.b.getLooper())) ? false : true;
    }

    @Override // defpackage.j400
    public final g6u R() {
        return this.x;
    }

    public final void T(fse fseVar, Runnable runnable) {
        a.e(fseVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        sjh sjhVar = uyj.a;
        mdh.b.o(fseVar, runnable);
    }

    @Override // defpackage.fph
    public final void d(long j, j18 j18Var) {
        iy2 iy2Var = new iy2(18, j18Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.b.postDelayed(iy2Var, j)) {
            j18Var.w(new kn2(12, this, iy2Var));
        } else {
            T(j18Var.x, iy2Var);
        }
    }

    @Override // defpackage.fph
    public final m1k e(long j, Runnable runnable, fse fseVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.b.postDelayed(runnable, j)) {
            return new f6u(0, this, runnable);
        }
        T(fseVar, runnable);
        return ke60.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g6u)) {
            return false;
        }
        g6u g6uVar = (g6u) obj;
        return g6uVar.b == this.b && g6uVar.w == this.w;
    }

    public final int hashCode() {
        return (this.w ? 1231 : 1237) ^ System.identityHashCode(this.b);
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        if (this.b.post(runnable)) {
            return;
        }
        T(fseVar, runnable);
    }

    @Override // defpackage.j400, defpackage.jse
    public final String toString() {
        g6u g6uVar;
        String str;
        sjh sjhVar = uyj.a;
        g6u g6uVar2 = o400.a;
        if (this == g6uVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                g6uVar = g6uVar2.x;
            } catch (UnsupportedOperationException unused) {
                g6uVar = null;
            }
            str = this == g6uVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str == null) {
            str = this.c;
            if (str == null) {
                str = this.b.toString();
            }
            if (this.w) {
                return b64.j(str, ".immediate");
            }
        }
        return str;
    }

    public g6u(Handler handler) {
        this(handler, null, false);
    }
}
