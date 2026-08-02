package defpackage;

import java.util.Iterator;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonState;
import ru.yandex.taxi.plus.purchase.AvailableButtonAction;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;

/* loaded from: classes9.dex */
public final class b1v0 {
    public final xdf a;

    public b1v0(xdf xdfVar) {
        this.a = xdfVar;
    }

    public final u0v0 a(dk10 dk10Var, l0v0 l0v0Var) {
        PurchaseStatus purchaseStatus;
        UpgradeStatus upgradeStatus;
        Object obj;
        String str = dk10Var.a;
        String str2 = dk10Var.b;
        if (l0v0Var == null || (purchaseStatus = l0v0Var.c) == null) {
            purchaseStatus = PurchaseStatus.PURCHASE_UNAVAILABLE;
        }
        PurchaseStatus purchaseStatus2 = purchaseStatus;
        if (l0v0Var == null || (upgradeStatus = l0v0Var.d) == null) {
            upgradeStatus = UpgradeStatus.UPGRADE_UNAVAILABLE;
        }
        ButtonState a = wcb1.a(purchaseStatus2, upgradeStatus);
        Iterator it = dk10Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((h37) obj).a == a) {
                break;
            }
        }
        h37 h37Var = (h37) obj;
        boolean g = l0v0Var != null ? fib1.g(l0v0Var) : false;
        boolean d = l0v0Var != null ? fib1.d(l0v0Var) : false;
        boolean c = l0v0Var != null ? fib1.c(l0v0Var) : false;
        String str3 = h37Var != null ? h37Var.b : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = h37Var != null ? h37Var.c : null;
        if (!kib1.b(dk10Var, l0v0Var)) {
            u0v0 u0v0Var = u0v0.j;
            return gib1.c();
        }
        ief iefVar = dk10Var.d;
        fef h = iefVar != null ? gwk0.h(iefVar) : null;
        xdf xdfVar = this.a;
        return new u0v0(xdfVar.a(h, str, false, true), xdfVar.a(h, str2, false, true), xdfVar.a(h, str3, false, true), xdfVar.a(h, str4, false, true), purchaseStatus2 == PurchaseStatus.IN_PROGRESS || upgradeStatus == UpgradeStatus.IN_PROGRESS, l0v0Var != null && (fib1.e(l0v0Var) || fib1.h(l0v0Var)), d ? AvailableButtonAction.BUY : c ? AvailableButtonAction.BUY_INAPP : g ? AvailableButtonAction.UPGRADE : AvailableButtonAction.NONE, purchaseStatus2, l0v0Var != null ? l0v0Var.e : null);
    }
}
