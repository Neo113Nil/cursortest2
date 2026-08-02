package xsna;

/* compiled from: AccountZstdDict.kt */
/* loaded from: classes18.dex */
public final class ft {
    public final String a;
    public final String b;
    public final String c;

    public ft(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft)) {
            return false;
        }
        ft ftVar = (ft) obj;
        return epx.f(this.a, ftVar.a) && epx.f(this.b, ftVar.b) && epx.f(this.c, ftVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountZstdDict(link=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", hash=");
        return ho8.a(sb, this.c, ')');
    }
}
