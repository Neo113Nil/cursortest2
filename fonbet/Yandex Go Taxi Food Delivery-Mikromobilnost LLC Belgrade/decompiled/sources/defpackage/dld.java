package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.RichText;

/* loaded from: classes2.dex */
public final class dld {
    public final RichText a;
    public final RichText b;

    public dld(RichText richText, RichText richText2) {
        this.a = richText;
        this.b = richText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dld)) {
            return false;
        }
        dld dldVar = (dld) obj;
        return jl40.l(this.a, dldVar.a) && jl40.l(this.b, dldVar.b);
    }

    public final int hashCode() {
        RichText richText = this.a;
        int hashCode = (richText == null ? 0 : richText.hashCode()) * 31;
        RichText richText2 = this.b;
        return hashCode + (richText2 != null ? richText2.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonAsset(badgeText=" + this.a + ", subtitleText=" + this.b + ')';
    }
}
