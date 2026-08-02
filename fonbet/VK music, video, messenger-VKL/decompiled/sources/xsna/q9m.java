package xsna;

/* compiled from: DialogAppearanceData.kt */
/* loaded from: classes2.dex */
public final class q9m {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public q9m(int i, long j, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9m)) {
            return false;
        }
        q9m q9mVar = (q9m) obj;
        return epx.f(this.a, q9mVar.a) && this.b == q9mVar.b && epx.f(this.c, q9mVar.c) && epx.f(this.d, q9mVar.d) && this.e == q9mVar.e && this.f == q9mVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qoy.b(urd0.a(urd0.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAppearanceData(name=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", lightThemeData=");
        sb.append(this.c);
        sb.append(", darkThemeData=");
        sb.append(this.d);
        sb.append(", isHidden=");
        sb.append(this.e);
        sb.append(", sort=");
        return vu5.b(sb, this.f, ')');
    }
}
