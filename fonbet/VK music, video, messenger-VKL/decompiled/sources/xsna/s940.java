package xsna;

/* compiled from: MusicAnalyticsQueryParams.kt */
/* loaded from: classes3.dex */
public final class s940 {
    public final i7z a;
    public final int b;

    public s940(i7z i7zVar, int i) {
        this.a = i7zVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s940)) {
            return false;
        }
        s940 s940Var = (s940) obj;
        return epx.f(this.a, s940Var.a) && this.b == s940Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicAnalyticsQueryParams(limitQueryParams=");
        sb.append(this.a);
        sb.append(", analyticsTypeFlags=");
        return vu5.b(sb, this.b, ')');
    }
}
