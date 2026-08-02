package xsna;

import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class k660 implements hki0 {
    public VkCardForm.b b;
    public final boolean c;

    public k660() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k660)) {
            return false;
        }
        k660 k660Var = (k660) obj;
        return epx.f(this.b, k660Var.b) && this.c == k660Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        VkCardForm.b bVar = this.b;
        return Boolean.hashCode(this.c) + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    @Override // xsna.hki0, xsna.jjv0
    public final int n1(int i) {
        return this.c ? 4 : 0;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewCardFormItem(cardData=");
        sb.append(this.b);
        sb.append(", hasSeparator=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public /* synthetic */ k660(int i) {
        this(null, false);
    }

    public k660(VkCardForm.b bVar, boolean z) {
        this.b = bVar;
        this.c = z;
    }
}
