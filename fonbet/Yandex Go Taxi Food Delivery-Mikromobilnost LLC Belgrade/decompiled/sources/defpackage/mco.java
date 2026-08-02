package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mco {
    public final CharSequence a;
    public final wp2 b;
    public final wp2 c;
    public final int d;

    public mco(CharSequence charSequence, AppColor$Palette appColor$Palette, wp2 wp2Var, int i) {
        this.a = charSequence;
        this.b = appColor$Palette;
        this.c = wp2Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mco)) {
            return false;
        }
        mco mcoVar = (mco) obj;
        return jl40.l(this.a, mcoVar.a) && jl40.l(this.b, mcoVar.b) && jl40.l(this.c, mcoVar.c) && this.d == mcoVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "EtaUiState(text=" + ((Object) this.a) + ", textColor=" + this.b + ", backgroundColor=" + this.c + ", bottomPadding=" + this.d + Extension.C_BRAKE;
    }
}
