package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.model.common.address.AddressBodyUiState$AddressTextStyle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class oq0 {
    public final CharSequence a;
    public final wp2 b;
    public final AddressBodyUiState$AddressTextStyle c;
    public final boolean d;
    public final CharSequence e;
    public final wp2 f;
    public final AddressBodyUiState$AddressTextStyle g;
    public final boolean h;
    public final boolean i;

    public oq0(CharSequence charSequence, AppColor$Palette appColor$Palette, AddressBodyUiState$AddressTextStyle addressBodyUiState$AddressTextStyle, boolean z, CharSequence charSequence2, AppColor$Palette appColor$Palette2, AddressBodyUiState$AddressTextStyle addressBodyUiState$AddressTextStyle2, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = appColor$Palette;
        this.c = addressBodyUiState$AddressTextStyle;
        this.d = z;
        this.e = charSequence2;
        this.f = appColor$Palette2;
        this.g = addressBodyUiState$AddressTextStyle2;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq0)) {
            return false;
        }
        oq0 oq0Var = (oq0) obj;
        return jl40.l(this.a, oq0Var.a) && jl40.l(this.b, oq0Var.b) && this.c == oq0Var.c && this.d == oq0Var.d && jl40.l(this.e, oq0Var.e) && jl40.l(this.f, oq0Var.f) && this.g == oq0Var.g && this.h == oq0Var.h && this.i == oq0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + unr0.e((this.g.hashCode() + n.b(this.f, smw0.b(unr0.e((this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressBodyUiState(title=");
        sb.append((Object) this.a);
        sb.append(", titleColor=");
        sb.append(this.b);
        sb.append(", titleTextStyle=");
        sb.append(this.c);
        sb.append(", isTitleAutoSize=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append((Object) this.e);
        sb.append(", subtitleColor=");
        sb.append(this.f);
        sb.append(", subtitleTextStyle=");
        sb.append(this.g);
        sb.append(", isSubtitleAutoSize=");
        sb.append(this.h);
        sb.append(", isShimmering=");
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }
}
