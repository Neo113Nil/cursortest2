package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import defpackage.aa31;
import defpackage.p7s;
import defpackage.vz5;

/* loaded from: classes11.dex */
public final class a {
    public final vz5 a;
    public aa31 b;
    public p7s c;
    public boolean d;

    public a(vz5 vz5Var) {
        int i = vz5Var.b;
        if (i < 21 || (i & 3) != 1) {
            throw FormatException.a();
        }
        this.a = vz5Var;
    }

    public final int a(int i, int i2, int i3) {
        boolean z = this.d;
        vz5 vz5Var = this.a;
        return z ? vz5Var.b(i2, i) : vz5Var.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public final p7s b() {
        p7s p7sVar = this.c;
        if (p7sVar != null) {
            return p7sVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = a(i3, 8, i2);
        }
        int a = a(8, 7, a(8, 8, a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = a(8, i4, a);
        }
        int i5 = this.a.b;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = a(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = a(i8, 8, i);
        }
        p7s a2 = p7s.a(a, i);
        if (a2 == null) {
            a2 = p7s.a(a ^ 21522, i ^ 21522);
        }
        this.c = a2;
        if (a2 != null) {
            return a2;
        }
        throw FormatException.a();
    }

    public final aa31 c() {
        aa31 aa31Var = this.b;
        if (aa31Var != null) {
            return aa31Var;
        }
        int i = this.a.b;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return aa31.c(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = a(i7, i6, i5);
            }
        }
        aa31 b = aa31.b(i5);
        if (b != null && (b.a * 4) + 17 == i) {
            this.b = b;
            return b;
        }
        for (int i8 = 5; i8 >= 0; i8--) {
            for (int i9 = i - 9; i9 >= i3; i9--) {
                i4 = a(i8, i9, i4);
            }
        }
        aa31 b2 = aa31.b(i4);
        if (b2 == null || (b2.a * 4) + 17 != i) {
            throw FormatException.a();
        }
        this.b = b2;
        return b2;
    }

    public final void d() {
        if (this.c == null) {
            return;
        }
        DataMask dataMask = DataMask.values()[this.c.b];
        vz5 vz5Var = this.a;
        int i = vz5Var.b;
        dataMask.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (dataMask.a(i2, i3)) {
                    vz5Var.a(i3, i2);
                }
            }
        }
    }
}
