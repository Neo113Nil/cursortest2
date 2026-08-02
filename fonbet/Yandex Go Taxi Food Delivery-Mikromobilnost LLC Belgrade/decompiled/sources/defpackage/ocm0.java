package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.savings.internal.entities.CellType;
import com.ybsdk.feature.savings.internal.entities.SavingProductType;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ocm0 {
    public final rr51 a;
    public final ColorModel b;
    public final CellType c;
    public final SavingProductType d;
    public final ThemedImageUrlEntity e;
    public final ImageScaleTypeEntity f;

    public ocm0(rr51 rr51Var, ColorModel colorModel, CellType cellType, SavingProductType savingProductType, ThemedImageUrlEntity themedImageUrlEntity, ImageScaleTypeEntity imageScaleTypeEntity) {
        this.a = rr51Var;
        this.b = colorModel;
        this.c = cellType;
        this.d = savingProductType;
        this.e = themedImageUrlEntity;
        this.f = imageScaleTypeEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocm0)) {
            return false;
        }
        ocm0 ocm0Var = (ocm0) obj;
        return this.a.equals(ocm0Var.a) && jl40.l(this.b, ocm0Var.b) && this.c == ocm0Var.c && this.d == ocm0Var.d && jl40.l(this.e, ocm0Var.e) && this.f == ocm0Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + vfc.d(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.e;
        return this.f.hashCode() + ((hashCode + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31);
    }

    public final String toString() {
        return "State(div=" + this.a + ", cardBackground=" + this.b + ", cellType=" + this.c + ", productType=" + this.d + ", backgroundImageUrl=" + this.e + ", backgroundImageScaleType=" + this.f + Extension.C_BRAKE;
    }
}
