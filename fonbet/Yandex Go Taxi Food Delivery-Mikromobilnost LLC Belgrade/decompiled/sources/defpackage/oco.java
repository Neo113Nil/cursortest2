package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.model.common.tariffcell.EtaUiState$TextStyle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class oco {
    public final CharSequence a;
    public final wp2 b;
    public final EtaUiState$TextStyle c;
    public final wp2 d;
    public final int e;

    public oco(CharSequence charSequence, AppColor$Palette appColor$Palette, EtaUiState$TextStyle etaUiState$TextStyle, wp2 wp2Var, int i) {
        this.a = charSequence;
        this.b = appColor$Palette;
        this.c = etaUiState$TextStyle;
        this.d = wp2Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oco)) {
            return false;
        }
        oco ocoVar = (oco) obj;
        return jl40.l(this.a, ocoVar.a) && jl40.l(this.b, ocoVar.b) && this.c == ocoVar.c && jl40.l(this.d, ocoVar.d) && this.e == ocoVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + n.b(this.d, (this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EtaUiState(text=");
        sb.append((Object) this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", textStyle=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", offsetX=");
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
