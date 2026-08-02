package defpackage;

import com.yandex.go.summary.ui.model.common.tariffcell.PriceUiState$TextStyle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class d1f0 {
    public final CharSequence a;
    public final wp2 b;
    public final PriceUiState$TextStyle c;
    public final int d;

    public d1f0(CharSequence charSequence, wp2 wp2Var, PriceUiState$TextStyle priceUiState$TextStyle, int i) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = priceUiState$TextStyle;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1f0)) {
            return false;
        }
        d1f0 d1f0Var = (d1f0) obj;
        return jl40.l(this.a, d1f0Var.a) && jl40.l(this.b, d1f0Var.b) && this.c == d1f0Var.c && this.d == d1f0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "PriceUiState(text=" + ((Object) this.a) + ", textColor=" + this.b + ", textStyle=" + this.c + ", offsetX=" + this.d + Extension.C_BRAKE;
    }
}
