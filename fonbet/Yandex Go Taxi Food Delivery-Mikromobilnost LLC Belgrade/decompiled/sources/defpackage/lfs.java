package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class lfs {
    public final wp2 a;

    public lfs(AppColor$Palette appColor$Palette) {
        this.a = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfs) && jl40.l(this.a, ((lfs) obj).a) && y7m.b(16.0f, 16.0f);
    }

    public final int hashCode() {
        return Float.hashCode(16.0f) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FrameStyle(bgColor=" + this.a + ", cornerRadius=" + y7m.c(16.0f) + Extension.C_BRAKE;
    }
}
