package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class lwa implements mwa {
    public final float a;
    public final kdc b;
    public final n4v c;
    public final ThemeType w;
    public final hwa x;

    public lwa(float f, kdc kdcVar, n4v n4vVar, ThemeType themeType, hwa hwaVar) {
        this.a = f;
        this.b = kdcVar;
        this.c = n4vVar;
        this.w = themeType;
        this.x = hwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwa)) {
            return false;
        }
        lwa lwaVar = (lwa) obj;
        return Float.compare(this.a, lwaVar.a) == 0 && jl40.l(this.b, lwaVar.b) && this.c.equals(lwaVar.c) && this.w == lwaVar.w && this.x.equals(lwaVar.x);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + smw0.d(this.b, Float.hashCode(this.a) * 31, 31)) * 31;
        ThemeType themeType = this.w;
        return this.x.hashCode() + ((hashCode + (themeType == null ? 0 : themeType.hashCode())) * 31);
    }

    public final String toString() {
        return "Visible(balance=" + this.a + ", color=" + this.b + ", icon=" + this.c + ", theme=" + this.w + ", modal=" + this.x + Extension.C_BRAKE;
    }
}
