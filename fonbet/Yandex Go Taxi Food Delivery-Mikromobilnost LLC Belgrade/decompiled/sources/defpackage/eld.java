package defpackage;

import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.pay.repository.api.model.offers.CompositeOfferDetails$PaymentMethod$Type;
import com.yandex.plus.pay.repository.api.model.widget.WebPaymentWidgetTimeoutParams;

/* loaded from: classes2.dex */
public final class eld {
    public final String a;
    public final CompositeOfferDetails$PaymentMethod$Type b;
    public final String c;
    public final String d;
    public final PlusThemedImage e;
    public final PlusThemedColor f;
    public final PlusThemedColor g;
    public final dld h;
    public final PlusThemedUrl i;
    public final WebPaymentWidgetTimeoutParams j;

    public eld(String str, CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type, String str2, String str3, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, dld dldVar, PlusThemedUrl plusThemedUrl, WebPaymentWidgetTimeoutParams webPaymentWidgetTimeoutParams) {
        this.a = str;
        this.b = compositeOfferDetails$PaymentMethod$Type;
        this.c = str2;
        this.d = str3;
        this.e = plusThemedImage;
        this.f = plusThemedColor;
        this.g = plusThemedColor2;
        this.h = dldVar;
        this.i = plusThemedUrl;
        this.j = webPaymentWidgetTimeoutParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eld)) {
            return false;
        }
        eld eldVar = (eld) obj;
        return this.a.equals(eldVar.a) && this.b == eldVar.b && jl40.l(this.c, eldVar.c) && this.d.equals(eldVar.d) && this.e.equals(eldVar.e) && this.f.equals(eldVar.f) && this.g.equals(eldVar.g) && jl40.l(this.h, eldVar.h) && jl40.l(this.i, eldVar.i) && jl40.l(this.j, eldVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int c = vfc.c(this.g, vfc.c(this.f, (this.e.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31), 31);
        dld dldVar = this.h;
        int hashCode2 = (c + (dldVar == null ? 0 : dldVar.hashCode())) * 31;
        PlusThemedUrl plusThemedUrl = this.i;
        int hashCode3 = (hashCode2 + (plusThemedUrl == null ? 0 : plusThemedUrl.hashCode())) * 31;
        WebPaymentWidgetTimeoutParams webPaymentWidgetTimeoutParams = this.j;
        return hashCode3 + (webPaymentWidgetTimeoutParams != null ? webPaymentWidgetTimeoutParams.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethod(id=" + this.a + ", type=" + this.b + ", bankName=" + this.c + ", title=" + this.d + ", iconUrl=" + this.e + ", textColor=" + this.f + ", backgroundColor=" + this.g + ", buttonAsset=" + this.h + ", widgetUrls=" + this.i + ", timeoutParams=" + this.j + ')';
    }
}
