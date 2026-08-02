package xsna;

import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.aex0;
import xsna.bex0;

/* compiled from: VkUiGetEmailCommand.kt */
/* loaded from: classes6.dex */
public final class ewv0 implements aex0.d {
    public final /* synthetic */ fwv0 a;

    public ewv0(fwv0 fwv0Var) {
        this.a = fwv0Var;
    }

    @Override // xsna.aex0.d
    public final void a() {
        fwv0 fwv0Var = this.a;
        VkUiPermissionsHandler vkUiPermissionsHandler = fwv0Var.c;
        if (vkUiPermissionsHandler != null) {
            io.reactivex.rxjava3.internal.operators.observable.b0 b = vkUiPermissionsHandler.b(VkUiPermissionsHandler.Permissions.EMAIL);
            io.reactivex.rxjava3.disposables.b b2 = fwv0Var.b();
            if (b2 != null) {
                b2.b(b.subscribe(new h8l0(new wgm0(fwv0Var, 17), 10), new hmq0(new q8i0(fwv0Var, 29), 7)));
            }
            tau0 tau0Var = fwv0Var.d;
            if (tau0Var != null) {
                tau0Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_EMAIL, MiniAppSettingsBoxAction.ALLOW);
            }
        }
    }

    @Override // xsna.aex0.d
    public final void b() {
        fwv0 fwv0Var = this.a;
        r6y r6yVar = fwv0Var.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.GET_EMAIL, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
        }
        tau0 tau0Var = fwv0Var.d;
        if (tau0Var != null) {
            tau0Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_EMAIL, MiniAppSettingsBoxAction.DENY);
        }
    }

    @Override // xsna.aex0.d
    public final void onCancel() {
        fwv0 fwv0Var = this.a;
        r6y r6yVar = fwv0Var.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.GET_EMAIL, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
        }
        tau0 tau0Var = fwv0Var.d;
        if (tau0Var != null) {
            tau0Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_EMAIL, MiniAppSettingsBoxAction.DENY);
        }
    }
}
