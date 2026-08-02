package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dam0 {
    public final rbv a;
    public final ColorModel b;
    public final ColorModel c;
    public final ColorModel d;
    public final ThemedImageUrlEntity e;

    public dam0(rbv rbvVar, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = rbvVar;
        this.b = colorModel;
        this.c = colorModel2;
        this.d = colorModel3;
        this.e = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dam0)) {
            return false;
        }
        dam0 dam0Var = (dam0) obj;
        return this.a.equals(dam0Var.a) && this.b.equals(dam0Var.b) && this.c.equals(dam0Var.c) && this.d.equals(dam0Var.d) && jl40.l(this.e, dam0Var.e);
    }

    public final int hashCode() {
        int d = vfc.d(this.d, vfc.d(this.c, vfc.d(this.b, this.a.hashCode() * 31, 31), 31), 31);
        ThemedImageUrlEntity themedImageUrlEntity = this.e;
        return d + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Theme(cellImage=");
        sb.append(this.a);
        sb.append(", cardBackground=");
        sb.append(this.b);
        sb.append(", titleTextColor=");
        smw0.z(sb, this.c, ", imageTextColor=", this.d, ", backgroundImageUrl=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
