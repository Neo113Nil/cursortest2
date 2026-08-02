package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c9b0 {
    public final ColorModel a;
    public final ThemedImageUrlEntity b;

    public c9b0(ColorModel colorModel, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = colorModel;
        this.b = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9b0)) {
            return false;
        }
        c9b0 c9b0Var = (c9b0) obj;
        return jl40.l(this.a, c9b0Var.a) && this.b.equals(c9b0Var.b);
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        return this.b.hashCode() + ((colorModel == null ? 0 : colorModel.hashCode()) * 31);
    }

    public final String toString() {
        return "Background(backgroundColor=" + this.a + ", backgroundImage=" + this.b + Extension.C_BRAKE;
    }
}
