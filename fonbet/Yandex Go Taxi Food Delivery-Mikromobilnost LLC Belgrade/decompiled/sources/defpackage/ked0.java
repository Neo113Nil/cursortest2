package defpackage;

import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;

/* loaded from: classes2.dex */
public final class ked0 {
    public final String a;
    public final boolean b;
    public final ied0 c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final jed0 g;
    public final PlusThemedColor h;
    public final PlusThemedColor i;

    public ked0(String str, boolean z, ied0 ied0Var, String str2, CharSequence charSequence, CharSequence charSequence2, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2) {
        jed0 jed0Var = plusThemedImage != null ? new jed0(plusThemedImage) : null;
        this.a = str;
        this.b = z;
        this.c = ied0Var;
        this.d = str2;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = jed0Var;
        this.h = plusThemedColor;
        this.i = plusThemedColor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ked0)) {
            return false;
        }
        ked0 ked0Var = (ked0) obj;
        return jl40.l(this.a, ked0Var.a) && this.b == ked0Var.b && jl40.l(this.c, ked0Var.c) && jl40.l(this.d, ked0Var.d) && jl40.l(this.e, ked0Var.e) && jl40.l(this.f, ked0Var.f) && jl40.l(this.g, ked0Var.g) && jl40.l(this.h, ked0Var.h) && jl40.l(this.i, ked0Var.i);
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        CharSequence charSequence = this.e;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        jed0 jed0Var = this.g;
        int hashCode3 = (hashCode2 + (jed0Var == null ? 0 : jed0Var.a.hashCode())) * 31;
        PlusThemedColor plusThemedColor = this.h;
        int hashCode4 = (hashCode3 + (plusThemedColor == null ? 0 : plusThemedColor.hashCode())) * 31;
        PlusThemedColor plusThemedColor2 = this.i;
        return hashCode4 + (plusThemedColor2 != null ? plusThemedColor2.hashCode() : 0);
    }

    public final String toString() {
        return "PlusPayPaymentMethodContent(id=" + this.a + ", isSelected=" + this.b + ", attributes=" + this.c + ", text=" + this.d + ", additionalText=" + ((Object) this.e) + ", promoText=" + ((Object) this.f) + ", icon=" + this.g + ", textColor=" + this.h + ", backgroundColor=" + this.i + ')';
    }
}
