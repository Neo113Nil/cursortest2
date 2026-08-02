package yads;

import android.util.SparseArray;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class l01 {
    public final q83 a;
    public final boolean b;
    public final boolean c;
    public final lc2 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public k01 m = new k01();
    public k01 n = new k01();

    public l01(q83 q83Var, boolean z, boolean z2) {
        this.a = q83Var;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new lc2(bArr, 0, 0);
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.k) {
            int i8 = i2 - i;
            byte[] bArr2 = this.g;
            int length = bArr2.length;
            int i9 = this.h + i8;
            if (length < i9) {
                this.g = Arrays.copyOf(bArr2, i9 * 2);
            }
            System.arraycopy(bArr, i, this.g, this.h, i8);
            int i10 = this.h + i8;
            this.h = i10;
            int i11 = 0;
            this.f.a(this.g, 0, i10);
            if (this.f.a(8)) {
                this.f.f();
                int b = this.f.b(2);
                this.f.d(5);
                if (this.f.b()) {
                    this.f.d();
                    if (this.f.b()) {
                        int d = this.f.d();
                        if (!this.c) {
                            this.k = false;
                            k01 k01Var = this.n;
                            k01Var.e = d;
                            k01Var.b = true;
                            return;
                        }
                        if (this.f.b()) {
                            int d2 = this.f.d();
                            if (this.e.indexOfKey(d2) < 0) {
                                this.k = false;
                                return;
                            }
                            cz1 cz1Var = (cz1) this.e.get(d2);
                            dz1 dz1Var = (dz1) this.d.get(cz1Var.a);
                            if (dz1Var.h) {
                                if (!this.f.a(2)) {
                                    return;
                                } else {
                                    this.f.d(2);
                                }
                            }
                            if (this.f.a(dz1Var.j)) {
                                int b2 = this.f.b(dz1Var.j);
                                if (dz1Var.i) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!this.f.a(1)) {
                                        return;
                                    }
                                    z = this.f.c();
                                    if (z) {
                                        if (this.f.a(1)) {
                                            z2 = this.f.c();
                                            z3 = true;
                                            z4 = this.i != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!this.f.b()) {
                                                return;
                                            } else {
                                                i3 = this.f.d();
                                            }
                                            i4 = dz1Var.k;
                                            if (i4 != 0) {
                                                if (!this.f.a(dz1Var.l)) {
                                                    return;
                                                }
                                                int b3 = this.f.b(dz1Var.l);
                                                if (!cz1Var.b || z) {
                                                    i5 = 0;
                                                    i7 = b3;
                                                    i6 = 0;
                                                } else {
                                                    if (!this.f.b()) {
                                                        return;
                                                    }
                                                    i5 = this.f.e();
                                                    i7 = b3;
                                                    i6 = 0;
                                                }
                                            } else if (i4 != 1 || dz1Var.m) {
                                                i5 = 0;
                                                i6 = 0;
                                                i7 = 0;
                                            } else {
                                                if (!this.f.b()) {
                                                    return;
                                                }
                                                int e = this.f.e();
                                                if (!cz1Var.b || z) {
                                                    i5 = 0;
                                                    i7 = 0;
                                                    i11 = e;
                                                    i6 = 0;
                                                } else {
                                                    if (!this.f.b()) {
                                                        return;
                                                    }
                                                    i7 = 0;
                                                    i11 = e;
                                                    i6 = this.f.e();
                                                    i5 = 0;
                                                }
                                            }
                                            k01 k01Var2 = this.n;
                                            k01Var2.c = dz1Var;
                                            k01Var2.d = b;
                                            k01Var2.e = d;
                                            k01Var2.f = b2;
                                            k01Var2.g = d2;
                                            k01Var2.h = z;
                                            k01Var2.i = z3;
                                            k01Var2.j = z2;
                                            k01Var2.k = z4;
                                            k01Var2.l = i3;
                                            k01Var2.m = i7;
                                            k01Var2.n = i5;
                                            k01Var2.o = i11;
                                            k01Var2.p = i6;
                                            k01Var2.a = true;
                                            k01Var2.b = true;
                                            this.k = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (this.i != 5) {
                                }
                                if (z4) {
                                }
                                i4 = dz1Var.k;
                                if (i4 != 0) {
                                }
                                k01 k01Var22 = this.n;
                                k01Var22.c = dz1Var;
                                k01Var22.d = b;
                                k01Var22.e = d;
                                k01Var22.f = b2;
                                k01Var22.g = d2;
                                k01Var22.h = z;
                                k01Var22.i = z3;
                                k01Var22.j = z2;
                                k01Var22.k = z4;
                                k01Var22.l = i3;
                                k01Var22.m = i7;
                                k01Var22.n = i5;
                                k01Var22.o = i11;
                                k01Var22.p = i6;
                                k01Var22.a = true;
                                k01Var22.b = true;
                                this.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        this.k = false;
        this.o = false;
        k01 k01Var = this.n;
        k01Var.b = false;
        k01Var.a = false;
    }
}
