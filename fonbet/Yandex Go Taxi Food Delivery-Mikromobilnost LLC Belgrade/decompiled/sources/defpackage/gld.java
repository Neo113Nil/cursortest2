package defpackage;

import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.repository.api.model.offers.RichText;

/* loaded from: classes2.dex */
public final class gld {
    public final RichText a;
    public final RichText b;
    public final PlusThemedImage c;
    public final PlusThemedColor d;
    public final String e;

    public gld(RichText richText, RichText richText2, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor, String str) {
        this.a = richText;
        this.b = richText2;
        this.c = plusThemedImage;
        this.d = plusThemedColor;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gld)) {
            return false;
        }
        gld gldVar = (gld) obj;
        return this.a.equals(gldVar.a) && jl40.l(this.b, gldVar.b) && jl40.l(this.c, gldVar.c) && this.d.equals(gldVar.d) && jl40.l(this.e, gldVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RichText richText = this.b;
        int hashCode2 = (hashCode + (richText == null ? 0 : richText.hashCode())) * 31;
        PlusThemedImage plusThemedImage = this.c;
        int c = vfc.c(this.d, (hashCode2 + (plusThemedImage == null ? 0 : plusThemedImage.hashCode())) * 31, 31);
        String str = this.e;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentPromo(benefitTitle=");
        sb.append(this.a);
        sb.append(", additionalTitle=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", paymentMethodId=");
        return b64.p(sb, this.e, ')');
    }
}
