package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class mo6 {
    public static final mo6 g;
    public final String a;
    public final Drawable b;
    public final float c;
    public final float d;
    public final ThemeType e;
    public final ThemeType f;

    static {
        ThemeType themeType = ThemeType.LIGHT;
        g = new mo6("", null, 0.0f, 0.0f, themeType, themeType);
    }

    public mo6(String str, Drawable drawable, float f, float f2, ThemeType themeType, ThemeType themeType2) {
        this.a = str;
        this.b = drawable;
        this.c = f;
        this.d = f2;
        this.e = themeType;
        this.f = themeType2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo6)) {
            return false;
        }
        mo6 mo6Var = (mo6) obj;
        return jl40.l(this.a, mo6Var.a) && jl40.l(this.b, mo6Var.b) && Float.compare(this.c, mo6Var.c) == 0 && Float.compare(this.d, mo6Var.d) == 0 && this.e == mo6Var.e && this.f == mo6Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + g8e.c(this.d, g8e.c(this.c, (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleUiState(message=");
        sb.append(this.a);
        sb.append(", shadow=");
        sb.append(this.b);
        sb.append(", minZoom=");
        vfc.x(sb, this.c, ", maxZoom=", this.d, ", previousThemeType=");
        sb.append(this.e);
        sb.append(", currentThemeType=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
