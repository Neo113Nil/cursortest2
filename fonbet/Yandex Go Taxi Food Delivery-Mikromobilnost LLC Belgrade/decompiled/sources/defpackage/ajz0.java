package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ajz0 {
    public final String a;
    public final wp2 b;

    public ajz0(String str, AppColor$Palette appColor$Palette) {
        this.a = str;
        this.b = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajz0)) {
            return false;
        }
        ajz0 ajz0Var = (ajz0) obj;
        return jl40.l(this.a, ajz0Var.a) && jl40.l(this.b, ajz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TitleUiState(title=" + this.a + ", titleColor=" + this.b + Extension.C_BRAKE;
    }
}
