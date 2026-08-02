package xsna;

import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.bex0;

/* compiled from: VkUiGetEmailCommand.kt */
/* loaded from: classes6.dex */
public final class fwv0 extends dvv0 {
    public long e;

    @Override // xsna.dvv0
    public final void a(String str) {
        this.e = str != null ? Long.parseLong(str) : 0L;
        VkUiPermissionsHandler vkUiPermissionsHandler = this.c;
        if (vkUiPermissionsHandler != null && vkUiPermissionsHandler.a(VkUiPermissionsHandler.Permissions.EMAIL)) {
            d();
            return;
        }
        if (this.b != null && jgn0.c()) {
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                bex0.a.a(r6yVar, JsApiMethodType.GET_EMAIL, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            return;
        }
        SuperappUiRouterBridge.a.C1869a c1869a = SuperappUiRouterBridge.a.C1869a.a;
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.g0(c1869a, new ewv0(this));
        tau0 tau0Var = this.d;
        if (tau0Var != null) {
            tau0Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_EMAIL, MiniAppSettingsBoxAction.SHOW);
        }
    }

    public final void d() {
        io.reactivex.rxjava3.disposables.b b = b();
        if (b != null) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            b.b(vdx0Var.a().g(this.e).subscribe(new le50(new yyl0(this, 21), 29), new gyq0(new lxh0(this, 15), 3)));
        }
    }
}
