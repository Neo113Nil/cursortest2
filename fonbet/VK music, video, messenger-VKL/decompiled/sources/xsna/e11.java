package xsna;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class e11 {
    public final String a;
    public final String b;
    public final String c;

    public e11(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e11)) {
            return false;
        }
        e11 e11Var = (e11) obj;
        return epx.f(this.a, e11Var.a) && epx.f(this.b, e11Var.b) && epx.f(this.c, e11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsMarketPromote(buttonText=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", url=");
        return ho8.a(sb, this.c, ')');
    }
}
