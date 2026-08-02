package xsna;

/* compiled from: GamesCatalogPWAModalBottomSheet.kt */
/* loaded from: classes17.dex */
public final class tct {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tct(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tct)) {
            return false;
        }
        tct tctVar = (tct) obj;
        return epx.f(this.a, tctVar.a) && epx.f(this.b, tctVar.b) && epx.f(this.c, tctVar.c) && epx.f(this.d, tctVar.d) && epx.f(this.e, tctVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogPWAModalBottomSheet(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", buttonText=");
        return ho8.a(sb, this.e, ')');
    }
}
