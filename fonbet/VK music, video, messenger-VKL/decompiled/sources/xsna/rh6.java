package xsna;

import android.app.Activity;
import com.vk.billing.StorePurchasesManager;
import com.vk.dto.common.data.Subscription;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.notifications.restriction.a;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowWallPostBox$Parameters;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rh6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.music.notifications.restriction.a aVar = (com.vk.music.notifications.restriction.a) this.c;
                String str = (String) this.d;
                MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType = (MusicRestrictionPopupDisplayer.SubscriptionPopupType) this.e;
                Activity activity = (Activity) this.f;
                Subscription subscription = (Subscription) obj;
                s750 s750Var = aVar.b;
                s750Var.X(str, "buy");
                s750Var.j0(str, subscription.t);
                oge0 oge0Var = (oge0) aVar.j.getValue();
                ht8 ht8Var = new ht8(oge0Var);
                com.vk.music.notifications.restriction.b bVar = new com.vk.music.notifications.restriction.b(aVar, str);
                int i = a.C1326a.$EnumSwitchMapping$0[subscriptionPopupType.ordinal()];
                if (i == 1 || i == 2) {
                    StorePurchasesManager.ProrationMode prorationMode = StorePurchasesManager.ProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE;
                    ht8Var.f(activity);
                    ht8Var.c = oge0Var.l(activity, subscription, prorationMode, new gt8(ht8Var, bVar, activity));
                } else {
                    ht8Var.f(activity);
                    ht8Var.c = oge0Var.d(activity, new ft8(ht8Var, bVar, activity), subscription);
                    s750Var.C0(str);
                }
                break;
            default:
                xwv0 xwv0Var = (xwv0) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                x7y x7yVar = (x7y) this.e;
                ShowWallPostBox$Parameters showWallPostBox$Parameters = (ShowWallPostBox$Parameters) this.f;
                if (((Boolean) obj).booleanValue()) {
                    String A = brm0.A(xwv0Var.x(jSONObject), "&", "?");
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (!(superappUiRouterBridge != null ? superappUiRouterBridge : null).T(xwv0Var.getAppId(), A, xwv0Var.h() ? "html_game_from_post" : "html_service_from_post", xwv0Var.o(), xwv0Var.h())) {
                        x7yVar.L0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), showWallPostBox$Parameters.d(), 1, null));
                    }
                } else {
                    x7yVar.L0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), showWallPostBox$Parameters.d(), 1, null));
                }
                break;
        }
        return s3q0.a;
    }
}
