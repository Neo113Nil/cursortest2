package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes11.dex */
public final class htu extends itu {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final htu f;

    public htu(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new htu(handler, str, true);
    }

    @Override // xsna.itu, xsna.osl
    public final ogn J(long j, final Runnable runnable, kotlin.coroutines.d dVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new ogn() { // from class: xsna.ftu
                @Override // xsna.ogn
                public final void dispose() {
                    htu.this.c.removeCallbacks(runnable);
                }
            };
        }
        V(dVar, runnable);
        return t570.b;
    }

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        V(dVar, runnable);
    }

    @Override // xsna.ovj
    public final boolean S(kotlin.coroutines.d dVar) {
        return (this.e && epx.f(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // xsna.ge00
    public final ge00 U() {
        return this.f;
    }

    public final void V(kotlin.coroutines.d dVar, Runnable runnable) {
        iyx.b(dVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        bdn bdnVar = bdn.a;
        wgl.c.P(dVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof htu)) {
            return false;
        }
        htu htuVar = (htu) obj;
        return htuVar.c == this.c && htuVar.e == this.e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.e ? 1231 : 1237);
    }

    @Override // xsna.osl
    public final void s(long j, final lq9 lq9Var) {
        Runnable runnable = new Runnable() { // from class: xsna.gtu
            @Override // java.lang.Runnable
            public final void run() {
                lq9.this.A(this, s3q0.a);
            }
        };
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            lq9Var.r(new yr3(1, this, runnable));
        } else {
            V(lq9Var.f, runnable);
        }
    }

    @Override // xsna.ge00, xsna.ovj
    public final String toString() {
        ge00 ge00Var;
        String str;
        bdn bdnVar = bdn.a;
        ge00 ge00Var2 = ie00.a;
        if (this == ge00Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ge00Var = ge00Var2.U();
            } catch (UnsupportedOperationException unused) {
                ge00Var = null;
            }
            str = this == ge00Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = this.c.toString();
        }
        return this.e ? fo8.a(str2, ".immediate") : str2;
    }

    public htu(Handler handler) {
        this(handler, null, false);
    }
}
