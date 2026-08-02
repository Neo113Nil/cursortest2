package defpackage;

import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffNameTextStyleUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ngx0 {
    public final String a;
    public final wp2 b;
    public final TariffNameTextStyleUiState c;
    public final int d;

    public ngx0(String str, wp2 wp2Var, TariffNameTextStyleUiState tariffNameTextStyleUiState, int i) {
        this.a = str;
        this.b = wp2Var;
        this.c = tariffNameTextStyleUiState;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngx0)) {
            return false;
        }
        ngx0 ngx0Var = (ngx0) obj;
        return this.a.equals(ngx0Var.a) && jl40.l(this.b, ngx0Var.b) && this.c == ngx0Var.c && this.d == ngx0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "TariffNameUiState(text=" + this.a + ", textColor=" + this.b + ", textStyleUiState=" + this.c + ", bottomPadding=" + this.d + Extension.C_BRAKE;
    }
}
