package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import java.util.List;

/* loaded from: classes2.dex */
public final class nhd0 {
    public final PlusPaymentStat$Source a;
    public final PlusPaymentStat$PurchaseType b;
    public final PlusPaymentStat$ButtonType c;
    public final String d;
    public final List e;

    public nhd0(PlusPaymentStat$Source plusPaymentStat$Source, PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType, PlusPaymentStat$ButtonType plusPaymentStat$ButtonType, String str, List list) {
        this.a = plusPaymentStat$Source;
        this.b = plusPaymentStat$PurchaseType;
        this.c = plusPaymentStat$ButtonType;
        this.d = str;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhd0)) {
            return false;
        }
        nhd0 nhd0Var = (nhd0) obj;
        return this.a == nhd0Var.a && this.b == nhd0Var.b && this.c == nhd0Var.c && jl40.l(this.d, nhd0Var.d) && this.e.equals(nhd0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(false) + unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPaymentStatData(source=");
        sb.append(this.a);
        sb.append(", purchaseType=");
        sb.append(this.b);
        sb.append(", buttonType=");
        sb.append(this.c);
        sb.append(", productIdOrTariffId=");
        sb.append(this.d);
        sb.append(", optionIds=");
        return ly3.s(sb, this.e, ", hasSelectedCard=false)");
    }
}
