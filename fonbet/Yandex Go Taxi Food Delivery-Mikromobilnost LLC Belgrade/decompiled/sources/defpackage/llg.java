package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class llg {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public llg(boolean z, boolean z2, int i) {
        boolean z3 = (i & 1) == 0;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        boolean z4 = (i & 8) == 0;
        boolean z5 = (i & 16) == 0;
        this.a = z3;
        this.b = z;
        this.c = z2;
        this.d = z4;
        this.e = z5;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llg)) {
            return false;
        }
        llg llgVar = (llg) obj;
        return this.a == llgVar.a && this.b == llgVar.b && this.c == llgVar.c && this.d == llgVar.d && this.e == llgVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = qv10.u("DashboardShimmerViewState(isBalanceShimmerEnabled=", ", isButtonsShimmerEnabled=", ", isBalanceSubtitleShimmerEnabled=", this.a, this.b);
        nnm.v(", isCreditAccountShimmerEnabled=", ", isSplitShimmerEnabled=", u, this.c, this.d);
        return x4e.i(u, this.e, Extension.C_BRAKE);
    }

    public llg() {
        this(false, false, 31);
    }
}
