package xsna;

/* compiled from: EasterEggPositionConstraint.kt */
/* loaded from: classes18.dex */
public final class quo {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;

    public quo(long j, long j2, String str, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quo)) {
            return false;
        }
        quo quoVar = (quo) obj;
        return epx.f(this.a, quoVar.a) && this.b == quoVar.b && this.c == quoVar.c && this.d == quoVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EasterEggPositionConstraint(constraintType=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", useServerTime=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
