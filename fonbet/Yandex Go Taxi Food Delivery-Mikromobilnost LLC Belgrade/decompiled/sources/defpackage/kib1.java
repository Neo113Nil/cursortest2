package defpackage;

import java.util.Iterator;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonState;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;

/* loaded from: classes6.dex */
public abstract class kib1 {
    public static sca a() {
        return sca.e;
    }

    public static boolean b(dk10 dk10Var, l0v0 l0v0Var) {
        PurchaseStatus purchaseStatus;
        UpgradeStatus upgradeStatus;
        ButtonAction buttonAction;
        ButtonState buttonState;
        h37 h37Var;
        Object obj;
        if (l0v0Var == null || (purchaseStatus = l0v0Var.c) == null) {
            purchaseStatus = PurchaseStatus.PURCHASE_UNAVAILABLE;
        }
        if (l0v0Var == null || (upgradeStatus = l0v0Var.d) == null) {
            upgradeStatus = UpgradeStatus.UPGRADE_UNAVAILABLE;
        }
        if (l0v0Var == null || (buttonAction = l0v0Var.a) == null) {
            buttonAction = ButtonAction.UNSUPPORTED;
        }
        if (upgradeStatus == UpgradeStatus.UPGRADE_UNAVAILABLE || purchaseStatus != PurchaseStatus.PURCHASED) {
            switch (i37.a[purchaseStatus.ordinal()]) {
                case 1:
                    buttonState = ButtonState.IDLE;
                    break;
                case 2:
                    buttonState = ButtonState.PROCESSING;
                    break;
                case 3:
                    buttonState = ButtonState.IDLE;
                    break;
                case 4:
                    buttonState = ButtonState.IDLE;
                    break;
                case 5:
                    buttonState = ButtonState.ERROR;
                    break;
                case 6:
                    buttonState = ButtonState.SUCCESS;
                    break;
                case 7:
                    buttonState = ButtonState.ALREADY_DONE;
                    break;
                default:
                    w511.b();
                    return false;
            }
        } else {
            switch (i37.b[upgradeStatus.ordinal()]) {
                case 1:
                    buttonState = ButtonState.IDLE;
                    break;
                case 2:
                    buttonState = ButtonState.ALREADY_DONE;
                    break;
                case 3:
                    buttonState = ButtonState.PROCESSING;
                    break;
                case 4:
                    buttonState = ButtonState.ERROR;
                    break;
                case 5:
                    buttonState = ButtonState.ERROR;
                    break;
                case 6:
                    buttonState = ButtonState.ALREADY_DONE;
                    break;
                case 7:
                    buttonState = ButtonState.SUCCESS;
                    break;
                default:
                    w511.b();
                    return false;
            }
        }
        if (dk10Var != null) {
            Iterator it = dk10Var.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((h37) obj).a == buttonState) {
                    }
                } else {
                    obj = null;
                }
            }
            h37Var = (h37) obj;
        } else {
            h37Var = null;
        }
        String str = h37Var != null ? h37Var.b : null;
        return (buttonAction == ButtonAction.UNSUPPORTED || h37Var == null || str == null || evu0.J(str)) ? false : true;
    }

    public static final no00 c(lm00 lm00Var) {
        return new no00(lm00Var.a, lm00Var.c, lm00Var.b, lm00Var.d, lm00Var.e, lm00Var.f.size());
    }
}
