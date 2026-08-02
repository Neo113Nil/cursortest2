package xsna;

/* compiled from: InfoNamesSettings.kt */
/* loaded from: classes5.dex */
public final class fww {
    public final String a;
    public final String b;
    public final String c;

    public fww(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fww)) {
            return false;
        }
        fww fwwVar = (fww) obj;
        return epx.f(this.a, fwwVar.a) && epx.f(this.b, fwwVar.b) && epx.f(this.c, fwwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoNamesSettings(fullName=");
        sb.append(this.a);
        sb.append(", nickname=");
        sb.append(this.b);
        sb.append(", description=");
        return ho8.a(sb, this.c, ')');
    }
}
