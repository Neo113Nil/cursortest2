package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import xsna.tlo0;

/* compiled from: DonutChipActionButtonRedesignedUiDto.kt */
/* loaded from: classes4.dex */
public final class uyn extends ol60 {
    public final tlo0.h h;
    public final String i;
    public final String j;
    public final DonutPriceTemplate k;
    public final ActionButtonAttachment l;

    public uyn(DonutPriceTemplate donutPriceTemplate, ActionButtonAttachment actionButtonAttachment, String str, String str2, tlo0.h hVar) {
        super(365, 0, 0, 0, null);
        this.h = hVar;
        this.i = str;
        this.j = str2;
        this.k = donutPriceTemplate;
        this.l = actionButtonAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyn)) {
            return false;
        }
        uyn uynVar = (uyn) obj;
        return epx.f(this.h, uynVar.h) && epx.f(this.i, uynVar.i) && epx.f(this.j, uynVar.j) && epx.f(this.k, uynVar.k) && epx.f(this.l, uynVar.l);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.h.a.hashCode() * 31, 31, this.i), 31, this.j);
        DonutPriceTemplate donutPriceTemplate = this.k;
        return Integer.hashCode(0) + ((this.l.hashCode() + ((a + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "DonutChipActionButtonRedesignedUiDto(title=" + this.h + ", priceTitle=" + this.i + ", accessibilityTitle=" + this.j + ", donutPriceTemplate=" + this.k + ", attachment=" + this.l + ", seqId=0)";
    }
}
