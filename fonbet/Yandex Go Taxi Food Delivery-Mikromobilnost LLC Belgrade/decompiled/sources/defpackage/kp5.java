package defpackage;

import com.yandex.go.rida.bids.state.BidsBoostButtonUiState$BoostStyle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kp5 {
    public final String a;
    public final BidsBoostButtonUiState$BoostStyle b;
    public final boolean c;

    public kp5(String str, BidsBoostButtonUiState$BoostStyle bidsBoostButtonUiState$BoostStyle, boolean z) {
        this.a = str;
        this.b = bidsBoostButtonUiState$BoostStyle;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp5)) {
            return false;
        }
        kp5 kp5Var = (kp5) obj;
        return jl40.l(this.a, kp5Var.a) && this.b == kp5Var.b && this.c == kp5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidsBoostButtonUiState(text=");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
