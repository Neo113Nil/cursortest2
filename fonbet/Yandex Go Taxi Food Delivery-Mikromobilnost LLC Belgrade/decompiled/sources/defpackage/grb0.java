package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class grb0 implements s820 {
    public final byte[] A;
    public final int a;
    public final String b;
    public final String c;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public grb0(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        this.z = i5;
        this.A = bArr;
    }

    public static grb0 a(ef90 ef90Var) {
        int k = ef90Var.k();
        String q = eh20.q(ef90Var.w(ef90Var.k(), StandardCharsets.US_ASCII));
        String w = ef90Var.w(ef90Var.k(), StandardCharsets.UTF_8);
        int k2 = ef90Var.k();
        int k3 = ef90Var.k();
        int k4 = ef90Var.k();
        int k5 = ef90Var.k();
        int k6 = ef90Var.k();
        byte[] bArr = new byte[k6];
        ef90Var.i(0, k6, bArr);
        return new grb0(k, q, w, k2, k3, k4, k5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || grb0.class != obj.getClass()) {
            return false;
        }
        grb0 grb0Var = (grb0) obj;
        return this.a == grb0Var.a && this.b.equals(grb0Var.b) && this.c.equals(grb0Var.c) && this.w == grb0Var.w && this.x == grb0Var.x && this.y == grb0Var.y && this.z == grb0Var.z && Arrays.equals(this.A, grb0Var.A);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A) + ((((((((unr0.b(unr0.b((527 + this.a) * 31, 31, this.b), 31, this.c) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31);
    }

    @Override // defpackage.s820
    public final void populateMediaMetadata(qe10 qe10Var) {
        qe10Var.a(this.a, this.A);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
