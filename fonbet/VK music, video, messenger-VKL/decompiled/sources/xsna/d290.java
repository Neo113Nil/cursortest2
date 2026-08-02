package xsna;

/* compiled from: AdsState.kt */
/* loaded from: classes2.dex */
public final class d290 {
    public final String a;
    public final long b;

    public d290(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d290)) {
            return false;
        }
        d290 d290Var = (d290) obj;
        return epx.f(this.a, d290Var.a) && this.b == d290Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayBanner(bannerId=");
        sb.append(this.a);
        sb.append(", startAt=");
        return vu5.a(')', this.b, sb);
    }
}
