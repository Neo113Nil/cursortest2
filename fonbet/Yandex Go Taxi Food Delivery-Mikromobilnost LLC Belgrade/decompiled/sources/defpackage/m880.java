package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.order.models.api.status.ActionType;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowAction;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import com.yandex.go.taxi.order.models.api.status.ScreenType;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class m880 extends ad5 {
    public final xdf A;
    public final k7x0 B;
    public final pav C;
    public final oxu0 D;
    public final tt2 E;
    public final OrderStatusWindowNotification F;
    public final o8a0 G;
    public final o2y0 x;
    public final x770 y;
    public final p370 z;

    public m880(o2y0 o2y0Var, x770 x770Var, p370 p370Var, xdf xdfVar, k7x0 k7x0Var, pav pavVar, oxu0 oxu0Var, tt2 tt2Var, OrderStatusWindowNotification orderStatusWindowNotification, o8a0 o8a0Var) {
        super(d880.class);
        this.x = o2y0Var;
        this.y = x770Var;
        this.z = p370Var;
        this.A = xdfVar;
        this.B = k7x0Var;
        this.C = pavVar;
        this.D = oxu0Var;
        this.E = tt2Var;
        this.F = orderStatusWindowNotification;
        this.G = o8a0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        String str = this.F.e;
        String str2 = this.x.b().a;
        x770 x770Var = this.y;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("modal_id", str);
        }
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        x770Var.a.a("RideStatusCard.Closed", hashMap, 1, new HashMap());
        super.Cg();
    }

    public final boolean Kg() {
        DriveState c = this.x.c();
        return c == DriveState.CANCELLED || c == DriveState.FAILED || c == DriveState.EXPIRED;
    }

    public final void Lg(OrderStatusWindowAction orderStatusWindowAction) {
        String eventName;
        if (orderStatusWindowAction != null) {
            ScreenType screenType = orderStatusWindowAction.b;
            ActionType actionType = orderStatusWindowAction.a;
            if (actionType == null || (eventName = actionType.getEventName()) == null) {
                return;
            }
            OrderStatusWindowNotification orderStatusWindowNotification = this.F;
            String str = orderStatusWindowNotification.e;
            String str2 = orderStatusWindowNotification.d;
            String driveState = this.x.c().toString();
            String name = screenType.name();
            String str3 = null;
            if (screenType == ScreenType.UNKNOWN) {
                name = null;
            }
            String str4 = orderStatusWindowAction.c;
            if (str4 != null && !evu0.J(str4)) {
                str3 = str4;
            }
            x770 x770Var = this.y;
            x770Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("button", eventName);
            if (str3 != null) {
                hashMap.put(Constants.DEEPLINK, str3);
            }
            if (str != null) {
                hashMap.put("modal_id", str);
            }
            if (str2 != null) {
                hashMap.put(CRLReasonCodeExtension.REASON, str2);
            }
            if (name != null) {
                hashMap.put(MetaDataField.SCREEN_FIELD, name);
            }
            if (driveState != null) {
                hashMap.put(ACSPConstants.STATUS, driveState);
            }
            x770Var.a.a("RideStatusCard.Tapped", hashMap, 1, new HashMap());
        }
    }
}
