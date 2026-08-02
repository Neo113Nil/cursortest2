package xsna;

/* compiled from: VkBridgeAnalytics.kt */
/* loaded from: classes6.dex */
public final class cnk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public cnk(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnk)) {
            return false;
        }
        cnk cnkVar = (cnk) obj;
        return epx.f(this.a, cnkVar.a) && epx.f(this.b, cnkVar.b) && epx.f(this.c, cnkVar.c) && epx.f(this.d, cnkVar.d) && epx.f(this.e, cnkVar.e) && epx.f(this.f, cnkVar.f) && epx.f(this.g, cnkVar.g);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomEvent(timezone=");
        sb.append(this.a);
        sb.append(", event=");
        sb.append(this.b);
        sb.append(", screen=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", json=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", vkPlatform=");
        return ho8.a(sb, this.g, ')');
    }
}
