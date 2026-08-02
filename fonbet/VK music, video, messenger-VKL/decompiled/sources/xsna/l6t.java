package xsna;

/* compiled from: GameBannerModel.kt */
/* loaded from: classes17.dex */
public final class l6t extends uet {
    public final sbt d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public l6t(sbt sbtVar, String str, String str2, String str3, String str4) {
        super(sbtVar.a.b, sbtVar.c, sbtVar.d);
        this.d = sbtVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6t)) {
            return false;
        }
        l6t l6tVar = (l6t) obj;
        return epx.f(this.d, l6tVar.d) && epx.f(this.e, l6tVar.e) && epx.f(this.f, l6tVar.f) && epx.f(this.g, l6tVar.g) && epx.f(this.h, l6tVar.h);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameBannerModel(extendedApp=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", backgroundImageUrl=");
        sb.append(this.g);
        sb.append(", buttonText=");
        return ho8.a(sb, this.h, ')');
    }
}
