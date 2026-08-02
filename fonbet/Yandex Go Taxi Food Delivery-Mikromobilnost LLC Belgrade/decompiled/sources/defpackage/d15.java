package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;

/* loaded from: classes2.dex */
public abstract class d15 {
    public static EvgenAnalytics$EvgenButtonType a(PlusPaymentStat$ButtonType plusPaymentStat$ButtonType) {
        int i = c15.b[plusPaymentStat$ButtonType.ordinal()];
        if (i == 1) {
            return EvgenAnalytics$EvgenButtonType.Host;
        }
        if (i == 2) {
            return EvgenAnalytics$EvgenButtonType.Native;
        }
        if (i == 3) {
            return EvgenAnalytics$EvgenButtonType.Web;
        }
        w511.b();
        return null;
    }

    public static EvgenAnalytics$EvgenPurchaseType b(PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType) {
        int i = c15.a[plusPaymentStat$PurchaseType.ordinal()];
        if (i == 1) {
            return EvgenAnalytics$EvgenPurchaseType.Host;
        }
        if (i == 2) {
            return EvgenAnalytics$EvgenPurchaseType.Native;
        }
        if (i == 3) {
            return EvgenAnalytics$EvgenPurchaseType.Web;
        }
        if (i == 4) {
            return EvgenAnalytics$EvgenPurchaseType.InApp;
        }
        w511.b();
        return null;
    }
}
