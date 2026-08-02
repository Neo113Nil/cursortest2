package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hx8 implements fex0 {
    public final String a;
    public final Set b;
    public final String c;
    public final wp2 d;
    public final yfv e;
    public final ajz0 f;
    public final x2v0 g;
    public final d47 h;
    public final fx8 i;
    public final zh j;

    public hx8(String str, Set set, String str2, AppColor$Palette appColor$Palette, yfv yfvVar, ajz0 ajz0Var, x2v0 x2v0Var, d47 d47Var, fx8 fx8Var, zh zhVar) {
        this.a = str;
        this.b = set;
        this.c = str2;
        this.d = appColor$Palette;
        this.e = yfvVar;
        this.f = ajz0Var;
        this.g = x2v0Var;
        this.h = d47Var;
        this.i = fx8Var;
        this.j = zhVar;
    }

    @Override // defpackage.fex0
    public final String b() {
        return this.a;
    }

    @Override // defpackage.fex0
    public final Set c() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx8)) {
            return false;
        }
        hx8 hx8Var = (hx8) obj;
        return jl40.l(this.a, hx8Var.a) && jl40.l(this.b, hx8Var.b) && jl40.l(this.c, hx8Var.c) && jl40.l(this.d, hx8Var.d) && this.e.equals(hx8Var.e) && this.f.equals(hx8Var.f) && jl40.l(this.g, hx8Var.g) && this.h.equals(hx8Var.h) && this.i.equals(hx8Var.i) && this.j.equals(hx8Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.a.hashCode() + n.b(this.d, unr0.b(g8e.e(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31)) * 31)) * 31;
        x2v0 x2v0Var = this.g;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((hashCode + (x2v0Var == null ? 0 : x2v0Var.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CarouselCellUiState(uniqueKey=" + this.a + ", uniqueKeys=" + this.b + ", id=" + this.c + ", backgroundColor=" + this.d + ", imageUiState=" + this.e + ", titleUiState=" + this.f + ", subtitleUiState=" + this.g + ", buttonUiState=" + this.h + ", carouselCellUiAction=" + this.i + ", accessibilityUiState=" + this.j + Extension.C_BRAKE;
    }
}
