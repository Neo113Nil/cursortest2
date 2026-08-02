package xsna;

import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import xsna.aex0;

/* compiled from: VkUiGetPhoneNumberCommand.kt */
/* loaded from: classes6.dex */
public final class gwv0 implements aex0.b {
    public final /* synthetic */ jwv0 a;

    public gwv0(jwv0 jwv0Var) {
        this.a = jwv0Var;
    }

    @Override // xsna.aex0.b
    public final void a() {
        jwv0 jwv0Var = this.a;
        VkUiPermissionsHandler vkUiPermissionsHandler = jwv0Var.c;
        if (vkUiPermissionsHandler != null) {
            io.reactivex.rxjava3.internal.operators.observable.b0 b = vkUiPermissionsHandler.b(VkUiPermissionsHandler.Permissions.PHONE);
            io.reactivex.rxjava3.disposables.b b2 = jwv0Var.b();
            if (b2 != null) {
                b2.b(b.subscribe(new pw40(new vhs0(jwv0Var, 6), 20), new cgu0(new zyl0(jwv0Var, 21), 2)));
            }
            tau0 tau0Var = jwv0Var.d;
            if (tau0Var != null) {
                tau0Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_PHONE, MiniAppSettingsBoxAction.ALLOW);
            }
        }
    }
}
