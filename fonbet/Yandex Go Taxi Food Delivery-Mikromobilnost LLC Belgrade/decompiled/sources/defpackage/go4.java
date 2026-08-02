package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class go4 {
    public final String a;
    public final ColorModel b;
    public final ThemedImageUrlEntity c;
    public final boolean d;
    public final w5i0 e;

    public go4(String str, ColorModel colorModel, ThemedImageUrlEntity themedImageUrlEntity, boolean z, w5i0 w5i0Var) {
        this.a = str;
        this.b = colorModel;
        this.c = themedImageUrlEntity;
        this.d = z;
        this.e = w5i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go4)) {
            return false;
        }
        go4 go4Var = (go4) obj;
        return jl40.l(this.a, go4Var.a) && this.b.equals(go4Var.b) && jl40.l(this.c, go4Var.c) && this.d == go4Var.d && jl40.l(this.e, go4Var.e);
    }

    public final int hashCode() {
        int d = vfc.d(this.b, this.a.hashCode() * 31, 31);
        ThemedImageUrlEntity themedImageUrlEntity = this.c;
        int e = unr0.e((d + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31, 31, this.d);
        w5i0 w5i0Var = this.e;
        return e + (w5i0Var != null ? w5i0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BalanceEntity(text=" + this.a + ", color=" + this.b + ", icon=" + this.c + ", shouldShowShimmer=" + this.d + ", radialGradient=" + this.e + Extension.C_BRAKE;
    }
}
