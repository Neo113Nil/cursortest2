package xsna;

import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.aex0;
import xsna.bex0;

/* compiled from: VkUiGetPhoneNumberCommand.kt */
/* loaded from: classes6.dex */
public final class hwv0 implements aex0.b {
    public final /* synthetic */ jwv0 a;

    public hwv0(jwv0 jwv0Var) {
        this.a = jwv0Var;
    }

    @Override // xsna.aex0.b
    public final void a() {
        jwv0 jwv0Var = this.a;
        r6y r6yVar = jwv0Var.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.GET_PHONE_NUMBER, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
        }
        tau0 tau0Var = jwv0Var.d;
        if (tau0Var != null) {
            tau0Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_PHONE, MiniAppSettingsBoxAction.DENY);
        }
    }
}
