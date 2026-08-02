package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fps implements hps {
    public final ThemedImageUrlEntity a;
    public final Text.Constant b;
    public final Text c;
    public final ms d;

    public fps(ThemedImageUrlEntity themedImageUrlEntity, Text.Constant constant, Text.Constant constant2, ms msVar) {
        this.a = themedImageUrlEntity;
        this.b = constant;
        this.c = constant2;
        this.d = msVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fps)) {
            return false;
        }
        fps fpsVar = (fps) obj;
        return this.a.equals(fpsVar.a) && this.b.equals(fpsVar.b) && jl40.l(this.c, fpsVar.c) && this.d.equals(fpsVar.d);
    }

    public final int hashCode() {
        int d = xvz.d(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        return this.d.hashCode() + ((d + (text == null ? 0 : text.hashCode())) * 31);
    }

    public final String toString() {
        return "ResultScreen(image=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
    }
}
