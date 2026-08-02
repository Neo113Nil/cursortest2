package defpackage;

import com.ybsdk.core.design.design.DesignTextStyle;
import com.ybsdk.core.stories.entities.HorizontalAlignmentEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class mrc {
    public final Text.Constant a;
    public final HorizontalAlignmentEntity b;
    public final ColorModel c;
    public final DesignTextStyle d;

    public mrc(Text.Constant constant, HorizontalAlignmentEntity horizontalAlignmentEntity, ColorModel colorModel, DesignTextStyle designTextStyle) {
        this.a = constant;
        this.b = horizontalAlignmentEntity;
        this.c = colorModel;
        this.d = designTextStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrc)) {
            return false;
        }
        mrc mrcVar = (mrc) obj;
        return this.a.equals(mrcVar.a) && this.b == mrcVar.b && jl40.l(this.c, mrcVar.c) && this.d == mrcVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        HorizontalAlignmentEntity horizontalAlignmentEntity = this.b;
        int hashCode2 = (hashCode + (horizontalAlignmentEntity == null ? 0 : horizontalAlignmentEntity.hashCode())) * 31;
        ColorModel colorModel = this.c;
        int hashCode3 = (hashCode2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        DesignTextStyle designTextStyle = this.d;
        return hashCode3 + (designTextStyle != null ? designTextStyle.hashCode() : 0);
    }

    public final String toString() {
        return "CommunicationFullScreenTextEntity(text=" + this.a + ", alignment=" + this.b + ", textColor=" + this.c + ", textStyle=" + this.d + Extension.C_BRAKE;
    }
}
