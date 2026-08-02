package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public final class js00 {
    public final String a;
    public final String b;
    public final float c;
    public final float d;
    public final String e;
    public final boolean f;
    public final Map g;
    public final ThemeType h;

    public js00(String str, String str2, float f, float f2, String str3, boolean z, Map map, ThemeType themeType) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = f2;
        this.e = str3;
        this.f = z;
        this.g = map;
        this.h = themeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js00)) {
            return false;
        }
        js00 js00Var = (js00) obj;
        return jl40.l(this.a, js00Var.a) && this.b.equals(js00Var.b) && Float.compare(this.c, js00Var.c) == 0 && Float.compare(this.d, js00Var.d) == 0 && this.e.equals(js00Var.e) && this.f == js00Var.f && this.g.equals(js00Var.g) && this.h == js00Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.d(unr0.e(unr0.b(g8e.c(this.d, g8e.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("MapStyleConfig(name=", this.a, ", style=", this.b, ", jamStrokeWidth=");
        vfc.x(v, this.c, ", jamOutlineWidth=", this.d, ", jamOutlineColor=");
        tse0.y(this.e, ", jamIsInnerOutlineEnabled=", ", jamStyleColors=", v, this.f);
        v.append(this.g);
        v.append(", themeType=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
