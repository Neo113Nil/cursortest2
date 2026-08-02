package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class iy31 implements mer0 {
    public final f5r0 a;
    public final ThemeType b;

    public iy31(f5r0 f5r0Var, ThemeType themeType) {
        this.a = f5r0Var;
        this.b = themeType;
    }

    @Override // defpackage.mer0
    public final boolean a(mer0 mer0Var) {
        return (mer0Var instanceof iy31) && jl40.l(this.a.a, ((iy31) mer0Var).a.a);
    }

    @Override // defpackage.mer0
    public final boolean b(mer0 mer0Var) {
        if (!(mer0Var instanceof iy31)) {
            return false;
        }
        f5r0 f5r0Var = this.a;
        boolean z = f5r0Var.c;
        iy31 iy31Var = (iy31) mer0Var;
        f5r0 f5r0Var2 = iy31Var.a;
        return z == f5r0Var2.c && f5r0Var.b.equals(f5r0Var2.b) && iy31Var.b == this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy31)) {
            return false;
        }
        iy31 iy31Var = (iy31) obj;
        return this.a.equals(iy31Var.a) && this.b == iy31Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VoiceDownloadButtonUiItem(downloadButton=" + this.a + ", themeType=" + this.b + Extension.C_BRAKE;
    }
}
