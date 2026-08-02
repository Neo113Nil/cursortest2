package xsna;

/* compiled from: DonutBannerUiModel.kt */
/* loaded from: classes5.dex */
public final class q3u implements syn {
    public final String a;
    public final String b;
    public final ws9 c;

    public q3u(String str, String str2, ws9 ws9Var) {
        this.a = str;
        this.b = str2;
        this.c = ws9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3u)) {
            return false;
        }
        q3u q3uVar = (q3u) obj;
        return epx.f(this.a, q3uVar.a) && epx.f(this.b, q3uVar.b) && epx.f(this.c, q3uVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "GoalCardModel(title=" + this.a + ", subtitle=" + this.b + ", button=" + this.c + ')';
    }
}
