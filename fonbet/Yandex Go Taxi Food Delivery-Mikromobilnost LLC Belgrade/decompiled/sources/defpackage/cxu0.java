package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes10.dex */
public final class cxu0 {
    public final ThemeType a;
    public final int b;

    public cxu0(int i, ThemeType themeType) {
        this.a = themeType;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxu0)) {
            return false;
        }
        cxu0 cxu0Var = (cxu0) obj;
        return this.a == cxu0Var.a && this.b == cxu0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Style(themeType=" + this.a + ", styleRes=" + this.b + Extension.C_BRAKE;
    }
}
