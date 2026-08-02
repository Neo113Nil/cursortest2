package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class h0s {
    public final Drawable a;
    public final ThemeType b;

    public h0s(Drawable drawable, ThemeType themeType) {
        this.a = drawable;
        this.b = themeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0s)) {
            return false;
        }
        h0s h0sVar = (h0s) obj;
        return jl40.l(this.a, h0sVar.a) && this.b == h0sVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FooterShadowState(shadow=" + this.a + ", theme=" + this.b + Extension.C_BRAKE;
    }
}
