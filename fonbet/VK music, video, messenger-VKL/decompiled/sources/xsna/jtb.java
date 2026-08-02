package xsna;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.games.presentation.utils.HapticHelper;
import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vk.superapp.base.js.bridge.data.VKWebAppPermission;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.g5y.a;
import xsna.ne10;
import xsna.yk8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jtb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jtb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        ux90 T;
        switch (this.b) {
            case 0:
                ((ktb) this.c).d(0, (ArrayList) this.d, (List) this.e);
                return s3q0.a;
            case 1:
                View view = (View) this.c;
                yvj yvjVar = (yvj) this.d;
                mc90 mc90Var = (mc90) this.e;
                fdi.D(view, HapticHelper.LIGHT);
                myc0.h(yvjVar, null, null, new net(mc90Var, null), 3);
                return s3q0.a;
            case 2:
                g5y g5yVar = (g5y) this.c;
                GetGeodata$Parameters getGeodata$Parameters = (GetGeodata$Parameters) this.d;
                FragmentActivity fragmentActivity = (FragmentActivity) this.e;
                xwv0 xwv0Var = g5yVar.g;
                if (xwv0Var != null) {
                    xwv0Var.R(Collections.singletonList(VKWebAppPermission.LOCATION));
                }
                xwv0 xwv0Var2 = g5yVar.g;
                if (xwv0Var2 == null || (T = xwv0Var2.T()) == null || !T.a(VkUiPermissionsHandler.Permissions.GEO)) {
                    SuperappUiRouterBridge.a.f fVar = SuperappUiRouterBridge.a.f.a;
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    superappUiRouterBridge.g0(fVar, g5yVar.new a(getGeodata$Parameters, fragmentActivity));
                    s13 s13Var = g5yVar.i;
                    if (s13Var != null) {
                        s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_GEO, MiniAppSettingsBoxAction.SHOW);
                    }
                } else {
                    g5yVar.k(getGeodata$Parameters, fragmentActivity);
                }
                return s3q0.a;
            case 3:
                ne10 ne10Var = (ne10) this.c;
                Object obj = (Context) this.d;
                gzs gzsVar = (gzs) this.e;
                ne10.a aVar = ne10Var.b;
                if (obj instanceof ey50) {
                    ((ey50) obj).Y().H(aVar);
                }
                gzsVar.invoke();
                ne10Var.a = null;
                return s3q0.a;
            case 4:
                Context context = (Context) this.c;
                gzs gzsVar2 = (gzs) this.d;
                gzs gzsVar3 = (gzs) this.e;
                VkAlertData.b bVar = new VkAlertData.b(context.getString(R.string.vk_qr_auth_open_internal_camera_alert_title), context.getString(R.string.vk_qr_auth_open_internal_camera_alert_message), (VkAlertData.DialogType) null, new VkAlertData.a(context.getString(R.string.vk_qr_auth_open_internal_camera_alert_open_btn), null), new VkAlertData.a(context.getString(R.string.vk_qr_auth_open_internal_camera_alert_cancel_btn), null), 36);
                SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).R(e3m.h(context), bVar, new rr1(gzsVar2, gzsVar3, gzsVar3));
                return s3q0.a;
            default:
                ofl0 ofl0Var = (ofl0) this.c;
                float I0 = ((azl) this.d).I0(uco.b(((uco) ((wh50) this.e).getValue()).a));
                ofl0Var.getClass();
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                long j = l5g.b;
                return yk8.a.h(new Pair[]{new Pair(valueOf, new l5g(l5g.c(14, j, 0.8f))), new Pair(Float.valueOf(0.1f), new l5g(l5g.c(14, j, 0.66f))), new Pair(Float.valueOf(0.5f), new l5g(l5g.c(14, j, 0.33f))), new Pair(Float.valueOf(0.9f), new l5g(l5g.c(14, j, 0.05f))), new Pair(Float.valueOf(1.0f), new l5g(l5g.j))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, I0 * 0.154f, 8);
        }
    }
}
