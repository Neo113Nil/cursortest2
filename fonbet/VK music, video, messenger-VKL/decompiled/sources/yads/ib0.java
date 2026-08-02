package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ib0 implements qe {
    public final boolean a;
    public final int b;
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public pe[] g;

    public ib0() {
        this(0);
    }

    public final synchronized pe a() {
        pe peVar;
        try {
            int i = this.e + 1;
            this.e = i;
            int i2 = this.f;
            if (i2 > 0) {
                pe[] peVarArr = this.g;
                int i3 = i2 - 1;
                this.f = i3;
                peVar = peVarArr[i3];
                peVar.getClass();
                this.g[this.f] = null;
            } else {
                pe peVar2 = new pe(0, new byte[this.b]);
                pe[] peVarArr2 = this.g;
                if (i > peVarArr2.length) {
                    this.g = (pe[]) Arrays.copyOf(peVarArr2, peVarArr2.length * 2);
                }
                peVar = peVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return peVar;
    }

    public final int b() {
        return this.b;
    }

    public final synchronized void c() {
        try {
            int i = this.d;
            int i2 = this.b;
            int i3 = mc3.a;
            int i4 = (((i + i2) - 1) / i2) - this.e;
            int i5 = 0;
            int max = Math.max(0, i4);
            int i6 = this.f;
            if (max >= i6) {
                return;
            }
            if (this.c != null) {
                int i7 = i6 - 1;
                while (i5 <= i7) {
                    pe peVar = this.g[i5];
                    peVar.getClass();
                    if (peVar.a == this.c) {
                        i5++;
                    } else {
                        pe peVar2 = this.g[i7];
                        peVar2.getClass();
                        if (peVar2.a != this.c) {
                            i7--;
                        } else {
                            pe[] peVarArr = this.g;
                            peVarArr[i5] = peVar2;
                            peVarArr[i7] = peVar;
                            i7--;
                            i5++;
                        }
                    }
                }
                max = Math.max(max, i5);
                if (max >= this.f) {
                    return;
                }
            }
            Arrays.fill(this.g, max, this.f, (Object) null);
            this.f = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    public ib0(int i) {
        this.a = true;
        this.b = 65536;
        this.f = 0;
        this.g = new pe[100];
        this.c = null;
    }

    public final synchronized void a(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            c();
        }
    }
}
