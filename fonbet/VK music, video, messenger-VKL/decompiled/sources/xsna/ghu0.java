package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser_events.VkAppEvent;
import com.vkontakte.android.R;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ghu0 implements izs {
    public final /* synthetic */ ihu0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ghu0(ihu0 ihu0Var, boolean z) {
        this.b = ihu0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ihu0 ihu0Var = this.b;
        fvv0 fvv0Var = ihu0Var.e;
        fvv0Var.t().u = false;
        ihu0Var.d.s();
        ((t9u0) ihu0Var.k.getValue()).a.onNext(VkAppEvent.VK_APP_FAVORITE_STATUS_CHANGED);
        ihu0Var.c.r(JsApiEvent.FAVORITE_RESULT, new JSONObject().put("result", false));
        if (this.c) {
            int i = fvv0Var.h() ? R.string.vk_apps_games_removed_from_favorites : R.string.vk_apps_app_removed_from_favorites;
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            superappUiRouterBridge.j(((ggu0) ihu0Var.h.c).b.getString(i));
        }
        return s3q0.a;
    }
}
