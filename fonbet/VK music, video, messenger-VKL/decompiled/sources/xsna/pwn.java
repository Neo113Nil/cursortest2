package xsna;

/* compiled from: DonutBanner.kt */
/* loaded from: classes5.dex */
public final class pwn {
    public final String a;
    public final String b;
    public final String c;
    public final com.vk.donut.design.compose.banner.a d;
    public final gvw e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public pwn(String str, String str2, String str3, com.vk.donut.design.compose.banner.a aVar, gvw gvwVar, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = gvwVar;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwn)) {
            return false;
        }
        pwn pwnVar = (pwn) obj;
        return epx.f(this.a, pwnVar.a) && epx.f(this.b, pwnVar.b) && epx.f(this.c, pwnVar.c) && epx.f(this.d, pwnVar.d) && epx.f(this.e, pwnVar.e) && epx.f(this.f, pwnVar.f) && epx.f(this.g, pwnVar.g) && epx.f(this.h, pwnVar.h) && epx.f(this.i, pwnVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        gvw gvwVar = this.e;
        int hashCode4 = (hashCode3 + (gvwVar == null ? 0 : gvwVar.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutBanner(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", discount=");
        sb.append(this.c);
        sb.append(", cardsContent=");
        sb.append(this.d);
        sb.append(", infoBanner=");
        sb.append(this.e);
        sb.append(", aboutButtonUrl=");
        sb.append(this.f);
        sb.append(", settingsUrl=");
        sb.append(this.g);
        sb.append(", goalsUrl=");
        sb.append(this.h);
        sb.append(", regularSupportUrl=");
        return ho8.a(sb, this.i, ')');
    }
}
