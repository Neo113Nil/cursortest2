package xsna;

import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.aex0;

/* compiled from: VKNotificationViewDelegate.kt */
/* loaded from: classes6.dex */
public final class cer0 implements aex0.d {
    public final /* synthetic */ ber0 a;

    public cer0(ber0 ber0Var) {
        this.a = ber0Var;
    }

    @Override // xsna.aex0.d
    public final void a() {
        ber0 ber0Var = this.a;
        ber0Var.a();
        tau0 d = ber0Var.a.d();
        if (d != null) {
            d.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_NOTIFICATIONS, MiniAppSettingsBoxAction.ALLOW);
        }
    }

    @Override // xsna.aex0.d
    public final void b() {
        ber0 ber0Var = this.a;
        ber0Var.c.m(JsApiMethodType.ALLOW_NOTIFICATIONS, VkAppsErrors.Client.USER_DENIED, null, null);
        tau0 d = ber0Var.a.d();
        if (d != null) {
            d.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_NOTIFICATIONS, MiniAppSettingsBoxAction.DENY);
        }
    }

    @Override // xsna.aex0.d
    public final void onCancel() {
        ber0 ber0Var = this.a;
        ber0Var.c.m(JsApiMethodType.ALLOW_NOTIFICATIONS, VkAppsErrors.Client.USER_DENIED, null, null);
        tau0 d = ber0Var.a.d();
        if (d != null) {
            d.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_NOTIFICATIONS, MiniAppSettingsBoxAction.DENY);
        }
    }
}
