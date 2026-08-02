package xsna;

/* compiled from: TrendingHashtag.kt */
/* loaded from: classes17.dex */
public final class spp0 {
    public final String a;
    public final String b;

    public spp0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spp0)) {
            return false;
        }
        spp0 spp0Var = (spp0) obj;
        return epx.f(this.a, spp0Var.a) && epx.f(this.b, spp0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrendingHashtag(hashtag=");
        sb.append(this.a);
        sb.append(", description=");
        return ho8.a(sb, this.b, ')');
    }
}
