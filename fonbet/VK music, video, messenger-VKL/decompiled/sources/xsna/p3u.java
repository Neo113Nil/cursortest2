package xsna;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class p3u implements ryn {
    public final String a;
    public final String b;
    public final vs9 c;

    public p3u(String str, String str2, vs9 vs9Var) {
        this.a = str;
        this.b = str2;
        this.c = vs9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3u)) {
            return false;
        }
        p3u p3uVar = (p3u) obj;
        return epx.f(this.a, p3uVar.a) && epx.f(this.b, p3uVar.b) && epx.f(this.c, p3uVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "GoalCard(title=" + this.a + ", subtitle=" + this.b + ", button=" + this.c + ')';
    }
}
