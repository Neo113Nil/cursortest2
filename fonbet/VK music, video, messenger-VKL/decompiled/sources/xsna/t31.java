package xsna;

/* compiled from: AdvertisementAwayToken.kt */
/* loaded from: classes6.dex */
public final class t31 {
    public final String a;
    public final int b;

    public t31(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t31)) {
            return false;
        }
        t31 t31Var = (t31) obj;
        return epx.f(this.a, t31Var.a) && this.b == t31Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvertisementAwayToken(adAwayToken=");
        sb.append(this.a);
        sb.append(", tokenExpired=");
        return vu5.b(sb, this.b, ')');
    }
}
