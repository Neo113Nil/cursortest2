package xsna;

/* compiled from: CommunityWidget.kt */
/* loaded from: classes6.dex */
public final class g5i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;

    public g5i(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5i)) {
            return false;
        }
        g5i g5iVar = (g5i) obj;
        return epx.f(this.a, g5iVar.a) && epx.f(this.b, g5iVar.b) && epx.f(this.c, g5iVar.c) && epx.f(this.d, g5iVar.d) && this.e == g5iVar.e && this.f == g5iVar.f && epx.f(this.g, g5iVar.g) && epx.f(this.h, g5iVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + urd0.a(bh10.a(bh10.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityWidget(name=");
        sb.append(this.a);
        sb.append(", appName=");
        sb.append(this.b);
        sb.append(", appIcon=");
        sb.append(this.c);
        sb.append(", groupName=");
        sb.append(this.d);
        sb.append(", appId=");
        sb.append(this.e);
        sb.append(", groupId=");
        sb.append(this.f);
        sb.append(", code=");
        sb.append(this.g);
        sb.append(", type=");
        return ho8.a(sb, this.h, ')');
    }
}
