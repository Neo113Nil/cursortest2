package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public abstract class oa {
    public pa[] a;
    public int b;
    public int c;
    public k0v0 w;

    public final pa d() {
        pa paVar;
        k0v0 k0v0Var;
        synchronized (this) {
            try {
                pa[] paVarArr = this.a;
                if (paVarArr == null) {
                    paVarArr = h();
                    this.a = paVarArr;
                } else if (this.b >= paVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(paVarArr, paVarArr.length * 2);
                    this.a = (pa[]) copyOf;
                    paVarArr = (pa[]) copyOf;
                }
                int i = this.c;
                do {
                    paVar = paVarArr[i];
                    if (paVar == null) {
                        paVar = e();
                        paVarArr[i] = paVar;
                    }
                    i++;
                    if (i >= paVarArr.length) {
                        i = 0;
                    }
                } while (!paVar.a(this));
                this.c = i;
                this.b++;
                k0v0Var = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (k0v0Var != null) {
            k0v0Var.x(1);
        }
        return paVar;
    }

    public abstract pa e();

    public abstract pa[] h();

    public final void i(pa paVar) {
        k0v0 k0v0Var;
        int i;
        Continuation[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                k0v0Var = this.w;
                if (i2 == 0) {
                    this.c = 0;
                }
                b = paVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b) {
            if (continuation != null) {
                continuation.resumeWith(zy11.a);
            }
        }
        if (k0v0Var != null) {
            k0v0Var.x(-1);
        }
    }

    public final k0v0 j() {
        k0v0 k0v0Var;
        synchronized (this) {
            k0v0Var = this.w;
            if (k0v0Var == null) {
                int i = this.b;
                k0v0Var = new k0v0(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
                k0v0Var.g(Integer.valueOf(i));
                this.w = k0v0Var;
            }
        }
        return k0v0Var;
    }
}
