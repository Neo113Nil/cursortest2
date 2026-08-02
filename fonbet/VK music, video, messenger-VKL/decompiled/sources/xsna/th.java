package xsna;

import java.util.Arrays;
import xsna.vh;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes11.dex */
public abstract class th<S extends vh<?>> {
    public S[] b;
    public int c;
    public int d;
    public xxm0 e;

    public final S b() {
        S s;
        xxm0 xxm0Var;
        synchronized (this) {
            try {
                S[] sArr = this.b;
                if (sArr == null) {
                    sArr = (S[]) f();
                    this.b = sArr;
                } else if (this.c >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.b = (S[]) ((vh[]) copyOf);
                    sArr = (S[]) ((vh[]) copyOf);
                }
                int i = this.d;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = c();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s.a(this));
                this.d = i;
                this.c++;
                xxm0Var = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xxm0Var != null) {
            xxm0Var.v(1);
        }
        return s;
    }

    public abstract S c();

    public abstract vh[] f();

    public final xxm0 g() {
        xxm0 xxm0Var;
        synchronized (this) {
            xxm0Var = this.e;
            if (xxm0Var == null) {
                xxm0Var = new xxm0(this.c);
                this.e = xxm0Var;
            }
        }
        return xxm0Var;
    }

    public final void h(S s) {
        xxm0 xxm0Var;
        int i;
        spj[] b;
        synchronized (this) {
            try {
                int i2 = this.c - 1;
                this.c = i2;
                xxm0Var = this.e;
                if (i2 == 0) {
                    this.d = 0;
                }
                b = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (spj spjVar : b) {
            if (spjVar != null) {
                spjVar.resumeWith(s3q0.a);
            }
        }
        if (xxm0Var != null) {
            xxm0Var.v(-1);
        }
    }
}
