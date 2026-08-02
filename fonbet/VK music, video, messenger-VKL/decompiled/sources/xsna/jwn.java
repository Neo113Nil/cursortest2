package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import xsna.tlo0;

/* compiled from: DonutActionButtonRedesignedHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class jwn extends ol60 {
    public final tlo0.h h;
    public final String i;
    public final DonutPriceTemplate j;
    public final String k;
    public final ActionButtonAttachment l;

    public jwn(DonutPriceTemplate donutPriceTemplate, ActionButtonAttachment actionButtonAttachment, String str, String str2, tlo0.h hVar) {
        super(364, 0, 0, 0, null);
        this.h = hVar;
        this.i = str;
        this.j = donutPriceTemplate;
        this.k = str2;
        this.l = actionButtonAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwn)) {
            return false;
        }
        jwn jwnVar = (jwn) obj;
        return epx.f(this.h, jwnVar.h) && epx.f(this.i, jwnVar.i) && epx.f(this.j, jwnVar.j) && epx.f(this.k, jwnVar.k) && epx.f(this.l, jwnVar.l);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = urd0.a(this.h.a.hashCode() * 31, 31, this.i);
        DonutPriceTemplate donutPriceTemplate = this.j;
        return Integer.hashCode(0) + ((this.l.hashCode() + urd0.a((a + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31, 31, this.k)) * 31);
    }

    public final String toString() {
        return "DonutActionButtonRedesignedHolderUiDto(title=" + this.h + ", actionTitle=" + this.i + ", donutPriceTemplate=" + this.j + ", accessibilityTitle=" + this.k + ", attachment=" + this.l + ", seqId=0)";
    }
}
