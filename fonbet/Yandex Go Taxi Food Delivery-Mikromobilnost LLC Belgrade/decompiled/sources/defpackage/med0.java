package defpackage;

import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;

/* loaded from: classes2.dex */
public final class med0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final PlusThemedImage d;
    public final PlusThemedColor e;

    public med0(String str, CharSequence charSequence, CharSequence charSequence2, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = plusThemedImage;
        this.e = plusThemedColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof med0)) {
            return false;
        }
        med0 med0Var = (med0) obj;
        return jl40.l(this.a, med0Var.a) && jl40.l(this.b, med0Var.b) && jl40.l(this.c, med0Var.c) && jl40.l(this.d, med0Var.d) && jl40.l(this.e, med0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int b = smw0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        PlusThemedImage plusThemedImage = this.d;
        return this.e.hashCode() + ((hashCode + (plusThemedImage != null ? plusThemedImage.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlusPayPaymentPromoContent(id=" + this.a + ", primaryPromoText=" + ((Object) this.b) + ", secondaryPromoText=" + ((Object) this.c) + ", imageUrl=" + this.d + ", cardBackgroundColor=" + this.e + ')';
    }
}
