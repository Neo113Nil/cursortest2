package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g8i0 implements h8i0 {
    public final wp2 a = AppColor$Palette.Control;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8i0) && jl40.l(this.a, ((g8i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Enabled(lottieAnimationColor=" + this.a + Extension.C_BRAKE;
    }
}
