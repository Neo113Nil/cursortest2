package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class no01 {
    public final boolean a;
    public final double b;
    public final float c;
    public final boolean d;
    public final boolean e;

    public no01(boolean z, double d, float f, boolean z2, boolean z3) {
        this.a = z;
        this.b = d;
        this.c = f;
        this.d = z2;
        this.e = z3;
    }

    public final double a() {
        return this.b;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c() {
        return this.d;
    }

    public final float d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no01)) {
            return false;
        }
        no01 no01Var = (no01) obj;
        return this.a == no01Var.a && Double.compare(this.b, no01Var.b) == 0 && Float.compare(this.c, no01Var.c) == 0 && this.d == no01Var.d && this.e == no01Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(g8e.c(this.c, unr0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransfersDashboardShutterSizes(isEnabled=");
        sb.append(this.a);
        sb.append(", collapsedRatio=");
        sb.append(this.b);
        sb.append(", halfRatio=");
        sb.append(this.c);
        sb.append(", expandedStateEnabled=");
        sb.append(this.d);
        return xra1.a(sb, ", collapsedStateEnabled=", this.e, Extension.C_BRAKE);
    }
}
