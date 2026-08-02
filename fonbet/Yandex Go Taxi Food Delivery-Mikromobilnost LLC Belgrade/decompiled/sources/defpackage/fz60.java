package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fz60 {
    public final double a;
    public final long b;
    public final boolean c;
    public final double d;

    public fz60(double d, long j, boolean z) {
        Integer num = 1000;
        double doubleValue = num.doubleValue();
        this.a = d;
        this.b = j;
        this.c = z;
        this.d = doubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fz60) {
            fz60 fz60Var = (fz60) obj;
            return Double.compare(this.a, fz60Var.a) == 0 && e3n.d(this.b, fz60Var.b) && this.c == fz60Var.c && Double.compare(this.d, fz60Var.d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        o430 o430Var = e3n.b;
        return Double.hashCode(this.d) + unr0.e(qv10.c(hashCode, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return n.m(", defaultAccuracy=", u1k.a(this.d), Extension.C_BRAKE, b64.v("Reachability(maxSpeed=", jpt0.a(this.a), ", jitter=", e3n.p(this.b), ", useAccuracy="), this.c);
    }
}
