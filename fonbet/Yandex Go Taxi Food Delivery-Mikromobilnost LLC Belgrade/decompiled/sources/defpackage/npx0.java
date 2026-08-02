package defpackage;

import com.yandex.go.taxi.order.tariff_upgrade.analytics.TariffUpgradeButton;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes14.dex */
public final class npx0 {
    public final o61 a;
    public final i3y b = a.b(LazyThreadSafetyMode.NONE, new mpx0(0));

    public npx0(o61 o61Var) {
        this.a = o61Var;
    }

    public final void a(TariffUpgradeButton tariffUpgradeButton) {
        String analyticsName = tariffUpgradeButton.getAnalyticsName();
        o61 o61Var = this.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("button", analyticsName);
        }
        o61Var.a.a("HigherClassCard.DidTapButton", hashMap, 1, new HashMap());
    }
}
