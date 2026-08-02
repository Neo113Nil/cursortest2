package xsna;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: UiQueueTask.java */
/* loaded from: classes2.dex */
public abstract class zzp0<T> implements isx0 {

    @NonNull
    public mla a;
    public final Object b = new Object();
    public volatile d0q0 c;

    @Override // xsna.isx0
    @Nullable
    public final mla b() {
        return this.a;
    }

    public void c(@NonNull Throwable th) {
        Log.e("zzp0", th.getMessage(), th);
    }

    public abstract void d();

    public final void f(d0q0 d0q0Var) {
        synchronized (this.b) {
            this.c = d0q0Var;
        }
    }

    public final void g(@NonNull Throwable th) {
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    nr2.L(th, this.a.b());
                    c0q0 c0q0Var = c0q0.this;
                    c0q0Var.d.f(null);
                    q5o q5oVar = c0q0Var.f;
                    b0q0 b0q0Var = new b0q0(c0q0Var, th);
                    c0q0Var.d.getClass();
                    ((Handler) q5oVar.b).post(b0q0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(T t) {
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    c0q0 c0q0Var = c0q0.this;
                    c0q0Var.d.f(null);
                    q5o q5oVar = c0q0Var.f;
                    a0q0 a0q0Var = new a0q0(c0q0Var, t);
                    c0q0Var.d.getClass();
                    ((Handler) q5oVar.b).post(a0q0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
    }

    public void e(T t) {
    }
}
