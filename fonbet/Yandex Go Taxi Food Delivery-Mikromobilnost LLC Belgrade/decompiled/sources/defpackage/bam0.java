package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bam0 {
    public final ColorModel a;
    public final ColorModel b;
    public final ColorModel c;
    public final ColorModel d;
    public final ColorModel e;
    public final ColorModel f;
    public final ThemedImageUrlEntity g;
    public final ImageScaleTypeDto h;
    public final ColorModel i;

    public bam0(ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, ColorModel colorModel6, ThemedImageUrlEntity themedImageUrlEntity, ImageScaleTypeDto imageScaleTypeDto, ColorModel colorModel7) {
        this.a = colorModel;
        this.b = colorModel2;
        this.c = colorModel3;
        this.d = colorModel4;
        this.e = colorModel5;
        this.f = colorModel6;
        this.g = themedImageUrlEntity;
        this.h = imageScaleTypeDto;
        this.i = colorModel7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bam0)) {
            return false;
        }
        bam0 bam0Var = (bam0) obj;
        return this.a.equals(bam0Var.a) && this.b.equals(bam0Var.b) && this.c.equals(bam0Var.c) && this.d.equals(bam0Var.d) && this.e.equals(bam0Var.e) && this.f.equals(bam0Var.f) && jl40.l(this.g, bam0Var.g) && this.h == bam0Var.h && this.i.equals(bam0Var.i);
    }

    public final int hashCode() {
        int d = vfc.d(this.f, vfc.d(this.e, vfc.d(this.d, vfc.d(this.c, vfc.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        ThemedImageUrlEntity themedImageUrlEntity = this.g;
        int hashCode = (d + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        ImageScaleTypeDto imageScaleTypeDto = this.h;
        return this.i.hashCode() + ((hashCode + (imageScaleTypeDto != null ? imageScaleTypeDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Theme(cardBackground=");
        sb.append(this.a);
        sb.append(", balanceColor=");
        sb.append(this.b);
        sb.append(", interestTextColor=");
        smw0.z(sb, this.c, ", interestBubbleColor=", this.d, ", titleTextColor=");
        smw0.z(sb, this.e, ", subtitleTextColor=", this.f, ", backgroundImageUrl=");
        sb.append(this.g);
        sb.append(", imageScaleTypeDto=");
        sb.append(this.h);
        sb.append(", descriptionTextColor=");
        return n.o(sb, this.i, Extension.C_BRAKE);
    }
}
