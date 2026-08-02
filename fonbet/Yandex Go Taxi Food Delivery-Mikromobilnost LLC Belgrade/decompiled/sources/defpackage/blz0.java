package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class blz0 implements mer0 {
    public final e5r0 a;
    public final ThemeType b;

    public blz0(e5r0 e5r0Var, ThemeType themeType) {
        this.a = e5r0Var;
        this.b = themeType;
    }

    @Override // defpackage.mer0
    public final boolean a(mer0 mer0Var) {
        if (!(mer0Var instanceof blz0)) {
            return false;
        }
        e5r0 e5r0Var = this.a;
        String str = e5r0Var.a;
        e5r0 e5r0Var2 = ((blz0) mer0Var).a;
        return jl40.l(str, e5r0Var2.a) && jl40.l(e5r0Var.c, e5r0Var2.c);
    }

    @Override // defpackage.mer0
    public final boolean b(mer0 mer0Var) {
        if (!(mer0Var instanceof blz0)) {
            return false;
        }
        blz0 blz0Var = (blz0) mer0Var;
        return this.a.b == blz0Var.a.b && blz0Var.b == this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blz0)) {
            return false;
        }
        blz0 blz0Var = (blz0) obj;
        return this.a.equals(blz0Var.a) && this.b == blz0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToggleSettingUiItem(toggleSetting=" + this.a + ", themeType=" + this.b + Extension.C_BRAKE;
    }
}
