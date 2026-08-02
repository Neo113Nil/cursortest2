package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;

/* loaded from: classes2.dex */
public final class pzc0 {
    public final PlusAcquisitionSmartOffer a;
    public final Spanned b;
    public final Drawable c;
    public final Drawable d;

    public pzc0(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, Spanned spanned, Drawable drawable, Drawable drawable2) {
        this.a = plusAcquisitionSmartOffer;
        this.b = spanned;
        this.c = drawable;
        this.d = drawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzc0)) {
            return false;
        }
        pzc0 pzc0Var = (pzc0) obj;
        return jl40.l(this.a, pzc0Var.a) && jl40.l(this.b, pzc0Var.b) && jl40.l(this.c, pzc0Var.c) && jl40.l(this.d, pzc0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Spanned spanned = this.b;
        int hashCode2 = (hashCode + (spanned == null ? 0 : spanned.hashCode())) * 31;
        Drawable drawable = this.c;
        int hashCode3 = (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.d;
        return hashCode3 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final String toString() {
        return "PlusAcquisitionButtonSectionOffer(processedSmartOffer=" + this.a + ", spannedLegals=" + ((Object) this.b) + ", tariffIconDrawable=" + this.c + ", optionIconDrawable=" + this.d + ')';
    }
}
