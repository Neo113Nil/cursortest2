package xsna;

import com.vk.dto.common.Good;

/* compiled from: ProductDescriptionItem.kt */
/* loaded from: classes18.dex */
public final class ynd0 {
    public final CharSequence a;
    public final CharSequence b;
    public final Good c;

    public ynd0(CharSequence charSequence, CharSequence charSequence2, Good good) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = good;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynd0)) {
            return false;
        }
        ynd0 ynd0Var = (ynd0) obj;
        return epx.f(this.a, ynd0Var.a) && epx.f(this.b, ynd0Var.b) && epx.f(this.c, ynd0Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.c.hashCode() + u11.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "ProductDescriptionItem(sku=" + ((Object) this.a) + ", description=" + ((Object) this.b) + ", product=" + this.c + ')';
    }
}
