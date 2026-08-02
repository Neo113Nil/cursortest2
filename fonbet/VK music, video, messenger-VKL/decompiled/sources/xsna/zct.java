package xsna;

/* compiled from: GamesCatalogPWAModalState.kt */
/* loaded from: classes17.dex */
public final class zct {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public zct(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof zct)) {
            return false;
        }
        zct zctVar = (zct) obj;
        return epx.f(this.a, zctVar.a) && epx.f(this.b, zctVar.b) && epx.f(this.c, zctVar.c) && epx.f(this.d, zctVar.d) && epx.f(this.e, zctVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogPWAModalState(iconUrl=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append(this.d);
        sb.append(", actionUrl=");
        return ho8.a(sb, this.e, ')');
    }
}
