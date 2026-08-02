package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class b1f0 {
    public final CharSequence a;
    public final wp2 b;
    public final String c;

    public b1f0(CharSequence charSequence, AppColor$Palette appColor$Palette, String str) {
        this.a = charSequence;
        this.b = appColor$Palette;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1f0)) {
            return false;
        }
        b1f0 b1f0Var = (b1f0) obj;
        return this.a.equals(b1f0Var.a) && jl40.l(this.b, b1f0Var.b) && jl40.l(this.c, b1f0Var.c);
    }

    public final int hashCode() {
        int b = n.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceUiState(text=");
        sb.append((Object) this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
