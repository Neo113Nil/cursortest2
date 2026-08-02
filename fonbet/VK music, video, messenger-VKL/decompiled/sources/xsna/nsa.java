package xsna;

import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vkontakte.android.R;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class nsa implements hki0 {
    public final sr90<? extends PayMethodData> b;
    public final int c;
    public final boolean d;

    public nsa() {
        throw null;
    }

    public nsa(sr90 sr90Var, boolean z, int i) {
        int i2 = (i & 2) != 0 ? R.attr.vk_legacy_text_secondary : R.attr.vk_legacy_field_error_border;
        z = (i & 4) != 0 ? false : z;
        this.b = sr90Var;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsa)) {
            return false;
        }
        nsa nsaVar = (nsa) obj;
        return epx.f(this.b, nsaVar.b) && this.c == nsaVar.c && this.d == nsaVar.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    @Override // xsna.hki0, xsna.jjv0
    public final int n1(int i) {
        return 2;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangePayMethodItem(paymentMethod=");
        sb.append(this.b);
        sb.append(", tintAttr=");
        sb.append(this.c);
        sb.append(", hideChangeView=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
