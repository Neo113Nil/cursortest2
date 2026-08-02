package xsna;

/* compiled from: AdvertBannerState.kt */
/* loaded from: classes2.dex */
public final class g08 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final zzf f;
    public final String g;

    public g08(String str, int i, int i2, int i3, int i4, zzf zzfVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = zzfVar;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g08)) {
            return false;
        }
        g08 g08Var = (g08) obj;
        return epx.f(this.a, g08Var.a) && this.b == g08Var.b && this.c == g08Var.c && this.d == g08Var.d && this.e == g08Var.e && epx.f(this.f, g08Var.f) && epx.f(this.g, g08Var.g);
    }

    public final int hashCode() {
        int a = shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        zzf zzfVar = this.f;
        int hashCode = (a + (zzfVar == null ? 0 : zzfVar.hashCode())) * 31;
        String str = this.g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookmakerState(template=");
        sb.append(this.a);
        sb.append(", adInterval=");
        sb.append(this.b);
        sb.append(", oddsInterval=");
        sb.append(this.c);
        sb.append(", hideInterval=");
        sb.append(this.d);
        sb.append(", delay=");
        sb.append(this.e);
        sb.append(", coefficients=");
        sb.append(this.f);
        sb.append(", requestId=");
        return ho8.a(sb, this.g, ')');
    }
}
