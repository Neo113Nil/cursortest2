package xsna;

/* compiled from: GameAchievementsBannerModel.kt */
/* loaded from: classes17.dex */
public final class g6t {
    public final String a;
    public final int b;
    public final String c;

    public g6t(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6t)) {
            return false;
        }
        g6t g6tVar = (g6t) obj;
        return epx.f(this.a, g6tVar.a) && this.b == g6tVar.b && epx.f(this.c, g6tVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameAchievementsBannerModel(text=");
        sb.append(this.a);
        sb.append(", level=");
        sb.append(this.b);
        sb.append(", sectionTrackCode=");
        return ho8.a(sb, this.c, ')');
    }
}
