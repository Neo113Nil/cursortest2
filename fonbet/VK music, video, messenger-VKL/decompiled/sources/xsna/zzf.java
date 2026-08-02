package xsna;

/* compiled from: AdvertBannerState.kt */
/* loaded from: classes2.dex */
public final class zzf {
    public final String a;
    public final String b;
    public final String c;

    public zzf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return epx.f(this.a, zzfVar.a) && epx.f(this.b, zzfVar.b) && epx.f(this.c, zzfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Coefficients(first=");
        sb.append(this.a);
        sb.append(", second=");
        sb.append(this.b);
        sb.append(", tie=");
        return ho8.a(sb, this.c, ')');
    }
}
