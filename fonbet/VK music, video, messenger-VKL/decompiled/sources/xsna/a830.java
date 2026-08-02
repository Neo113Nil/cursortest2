package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.money.MoneyTransfer;

/* compiled from: moneyTransferFragmentHelper.kt */
/* loaded from: classes3.dex */
public final class a830 {
    public final boolean a;
    public final VKList<MoneyTransfer> b;

    public a830(VKList vKList, boolean z) {
        this.a = z;
        this.b = vKList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a830)) {
            return false;
        }
        a830 a830Var = (a830) obj;
        return this.a == a830Var.a && epx.f(this.b, a830Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MoneyTransferListWithSbp(isSbpAvailable=" + this.a + ", list=" + this.b + ')';
    }
}
