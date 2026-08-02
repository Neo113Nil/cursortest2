package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class l741 {
    public final Bitmap a;
    public final ThemeType b;

    public l741(Bitmap bitmap, ThemeType themeType) {
        this.a = bitmap;
        this.b = themeType;
    }

    public final Bitmap a() {
        return this.a;
    }

    public final ThemeType b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l741)) {
            return false;
        }
        l741 l741Var = (l741) obj;
        return this.a.equals(l741Var.a) && this.b == l741Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapWithThemeRouteInfo(bitmap=" + this.a + ", theme=" + this.b + Extension.C_BRAKE;
    }
}
