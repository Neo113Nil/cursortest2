package xsna;

import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import xsna.je;
import xsna.mur;

/* compiled from: AbstractTransformFuture.java */
/* loaded from: classes13.dex */
public abstract class di<I, O, F, T> extends mur.a<O> implements Runnable {
    public static final /* synthetic */ int k = 0;
    public lzi0 i;
    public w7 j;

    /* compiled from: AbstractTransformFuture.java */
    public static final class a<I, O> extends di<I, O, szs<? super I, ? extends O>, O> {
    }

    @Override // xsna.je
    public final void c() {
        lzi0 lzi0Var = this.i;
        boolean z = false;
        if ((lzi0Var != null) & (this.b instanceof je.b)) {
            Object obj = this.b;
            if ((obj instanceof je.b) && ((je.b) obj).a) {
                z = true;
            }
            lzi0Var.cancel(z);
        }
        this.i = null;
        this.j = null;
    }

    @Override // xsna.je
    public final String i() {
        String str;
        lzi0 lzi0Var = this.i;
        w7 w7Var = this.j;
        String i = super.i();
        if (lzi0Var != null) {
            str = "inputFuture=[" + lzi0Var + "], ";
        } else {
            str = "";
        }
        if (w7Var == null) {
            if (i != null) {
                return fo8.a(str, i);
            }
            return null;
        }
        return str + "function=[" + w7Var + X3.j.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        je.c cVar;
        lzi0 lzi0Var = this.i;
        w7 w7Var = this.j;
        if (((this.b instanceof je.b) | (lzi0Var == null)) || (w7Var == 0)) {
            return;
        }
        this.i = null;
        if (lzi0Var.b instanceof je.b) {
            Object obj = this.b;
            if (obj == null) {
                if (lzi0Var.isDone()) {
                    if (je.g.b(this, null, je.h(lzi0Var))) {
                        je.e(this, false);
                        return;
                    }
                    return;
                }
                je.f fVar = new je.f(this, lzi0Var);
                if (je.g.b(this, null, fVar)) {
                    try {
                        lzi0Var.addListener(fVar, kzm.INSTANCE);
                        return;
                    } catch (Throwable th) {
                        try {
                            cVar = new je.c(th);
                        } catch (Error | Exception unused) {
                            cVar = je.c.b;
                        }
                        je.g.b(this, fVar, cVar);
                        return;
                    }
                }
                obj = this.b;
            }
            if (obj instanceof je.b) {
                lzi0Var.cancel(((je.b) obj).a);
                return;
            }
            return;
        }
        try {
            fxc0.y(lzi0Var, "Future was expected to be done: %s", lzi0Var.isDone());
            try {
                Object apply = w7Var.apply(hr80.y(lzi0Var));
                this.j = null;
                ((a) this).k(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    l(th2);
                } finally {
                    this.j = null;
                }
            }
        } catch (Error e) {
            l(e);
        } catch (CancellationException unused2) {
            cancel(false);
        } catch (ExecutionException e2) {
            l(e2.getCause());
        } catch (Exception e3) {
            l(e3);
        }
    }
}
