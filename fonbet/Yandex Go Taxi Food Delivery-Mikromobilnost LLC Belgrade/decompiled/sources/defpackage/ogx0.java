package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.model.common.tariffcell.TariffNameUiState$TextStyle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ogx0 {
    public final String a;
    public final wp2 b;
    public final TariffNameUiState$TextStyle c;
    public final boolean d;
    public final int e;

    public ogx0(String str, AppColor$Palette appColor$Palette, TariffNameUiState$TextStyle tariffNameUiState$TextStyle, boolean z, int i) {
        this.a = str;
        this.b = appColor$Palette;
        this.c = tariffNameUiState$TextStyle;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogx0)) {
            return false;
        }
        ogx0 ogx0Var = (ogx0) obj;
        return jl40.l(this.a, ogx0Var.a) && jl40.l(this.b, ogx0Var.b) && this.c == ogx0Var.c && this.d == ogx0Var.d && this.e == ogx0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + unr0.e((this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffNameUiState(text=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", textStyle=");
        sb.append(this.c);
        sb.append(", isShimmering=");
        sb.append(this.d);
        sb.append(", offsetX=");
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
