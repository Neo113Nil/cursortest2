package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.app.WebLeaderboardData;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qbr0 implements izs {
    public final /* synthetic */ ubr0 b;
    public final /* synthetic */ WebApiApplication c;
    public final /* synthetic */ int d;

    public /* synthetic */ qbr0(ubr0 ubr0Var, WebApiApplication webApiApplication, int i) {
        this.b = ubr0Var;
        this.c = webApiApplication;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list = (List) obj;
        boolean isEmpty = list.isEmpty();
        ubr0 ubr0Var = this.b;
        if (isEmpty || gnj.b(ubr0Var.b.b) == null) {
            ubr0Var.c.m(JsApiMethodType.SHOW_LEADER_BOARD_BOX, VkAppsErrors.Client.INVALID_PARAMS, null, null);
        } else {
            ArrayList q = p4g.q(list);
            WebApiApplication webApiApplication = this.c;
            WebLeaderboardData webLeaderboardData = new WebLeaderboardData(webApiApplication, q, this.d);
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            (superappUiRouterBridge != null ? superappUiRouterBridge : null).i(webLeaderboardData, new kld0(ubr0Var, 19), new i6m0(ubr0Var, webApiApplication));
        }
        return s3q0.a;
    }
}
