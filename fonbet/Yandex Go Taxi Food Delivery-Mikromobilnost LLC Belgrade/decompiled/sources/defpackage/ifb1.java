package defpackage;

import com.yandex.go.taxi.order.models.api.response.CardType;
import com.yandex.go.taxi.order.models.api.response.CheckInAction;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.Instruction;
import com.yandex.go.taxi.order.models.api.response.UiConfig;
import ru.yandex.taxi.checkin.CheckInStateActionType;
import ru.yandex.taxi.locationsdk.core.location.SpoofingType;

/* loaded from: classes6.dex */
public abstract class ifb1 {
    public static au2 a;

    public static CheckInStateActionType a(CheckInInfo checkInInfo) {
        int i = gc8.a[checkInInfo.c.a.e.ordinal()];
        if (i == 1) {
            return CheckInStateActionType.QR_CODE;
        }
        if (i == 2) {
            return CheckInStateActionType.SLIDER;
        }
        if (i == 3) {
            return CheckInStateActionType.BUTTON;
        }
        w511.b();
        return null;
    }

    public static kfb1 b(CheckInInfo checkInInfo) {
        UiConfig uiConfig = checkInInfo.c;
        Instruction instruction = checkInInfo.b;
        CardType cardType = uiConfig.b;
        CheckInAction checkInAction = uiConfig.a;
        return cardType == CardType.TWO_BUTTON ? new ic8(instruction.e, checkInAction.a) : cardType == CardType.THREE_BUTTON ? new hc8(instruction.e, checkInAction.a, uiConfig.c.a) : new fc8(checkInAction.a);
    }

    public static final boolean c(k7z k7zVar) {
        SpoofingType spoofingType;
        n6z n6zVar = k7zVar.e;
        ga2 ga2Var = n6zVar instanceof ga2 ? (ga2) n6zVar : null;
        if (ga2Var == null || (spoofingType = ga2Var.b) == null) {
            spoofingType = SpoofingType.None;
        }
        return spoofingType != SpoofingType.None;
    }
}
