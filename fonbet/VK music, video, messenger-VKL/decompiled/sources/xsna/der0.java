package xsna;

import android.content.Context;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import xsna.aex0;

/* compiled from: VKNotificationViewDelegate.kt */
/* loaded from: classes6.dex */
public final class der0 implements aex0.d {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ber0 b;

    public der0(Context context, ber0 ber0Var) {
        this.a = context;
        this.b = ber0Var;
    }

    @Override // xsna.aex0.d
    public final void a() {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.o(this.a);
        tau0 d = this.b.a.d();
        if (d != null) {
            d.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GLOBAL_NOTIFICATIONS, MiniAppSettingsBoxAction.ALLOW);
        }
    }

    @Override // xsna.aex0.d
    public final void b() {
        tau0 d = this.b.a.d();
        if (d != null) {
            d.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GLOBAL_NOTIFICATIONS, MiniAppSettingsBoxAction.DENY);
        }
    }

    @Override // xsna.aex0.d
    public final void onCancel() {
        tau0 d = this.b.a.d();
        if (d != null) {
            d.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GLOBAL_NOTIFICATIONS, MiniAppSettingsBoxAction.DENY);
        }
    }
}
