package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class p57 implements mer0 {
    public final a5r0 a;
    public final ThemeType b;

    public p57(a5r0 a5r0Var, ThemeType themeType) {
        this.a = a5r0Var;
        this.b = themeType;
    }

    @Override // defpackage.mer0
    public final boolean a(mer0 mer0Var) {
        return (mer0Var instanceof p57) && jl40.l(this.a.b, ((p57) mer0Var).a.b);
    }

    @Override // defpackage.mer0
    public final boolean b(mer0 mer0Var) {
        if (!(mer0Var instanceof p57)) {
            return false;
        }
        p57 p57Var = (p57) mer0Var;
        return jl40.l(this.a.c, p57Var.a.c) && p57Var.b == this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p57)) {
            return false;
        }
        p57 p57Var = (p57) obj;
        return this.a.equals(p57Var.a) && this.b == p57Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonsSettingUiItem(buttonsSettings=" + this.a + ", themeType=" + this.b + Extension.C_BRAKE;
    }
}
