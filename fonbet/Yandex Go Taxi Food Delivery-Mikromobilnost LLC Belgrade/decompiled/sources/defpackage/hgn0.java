package defpackage;

import ru.yandex.taxi.scooters.domain.model.ScootersDetailedOrderOneShotAction;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

/* loaded from: classes6.dex */
public final class hgn0 {
    public final ign0 a;

    public hgn0(ign0 ign0Var) {
        this.a = ign0Var;
    }

    public final boolean a(String str, ScootersOnTheWayAction scootersOnTheWayAction) {
        ScootersDetailedOrderOneShotAction scootersDetailedOrderOneShotAction;
        switch (scootersOnTheWayAction == null ? -1 : ggn0.a[scootersOnTheWayAction.ordinal()]) {
            case -1:
                scootersDetailedOrderOneShotAction = null;
                break;
            case 0:
            default:
                w511.b();
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
                jst.e.u("Action " + scootersOnTheWayAction + " must be handled in BroadcastReceiver");
                return false;
            case 5:
                scootersDetailedOrderOneShotAction = ScootersDetailedOrderOneShotAction.CANCEL;
                break;
            case 6:
                scootersDetailedOrderOneShotAction = ScootersDetailedOrderOneShotAction.FINISH;
                break;
            case 7:
                scootersDetailedOrderOneShotAction = ScootersDetailedOrderOneShotAction.ROUTE;
                break;
        }
        this.a.d(scootersDetailedOrderOneShotAction, str);
        return true;
    }
}
