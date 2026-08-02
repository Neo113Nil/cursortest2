package xsna;

import android.app.Activity;
import android.os.Handler;
import com.vk.core.apps.BuildInfo;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: VkUiAppInstallCommand.kt */
/* loaded from: classes7.dex */
public final class avv0 extends dvv0 {
    @Override // xsna.dvv0
    public final void a(String str) {
        if (str == null) {
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                bex0.a.a(r6yVar, JsApiMethodType.INSTALL_BUNDLE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 56);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.getString("url");
            jSONObject.getString("package_name");
            jSONObject.getString("app_title");
            jSONObject.optString("version_name", "");
            jSONObject.optInt("version_code", -1);
        } catch (JSONException e) {
            r6y r6yVar2 = this.b;
            if (r6yVar2 != null) {
                bex0.a.a(r6yVar2, JsApiMethodType.INSTALL_BUNDLE, VkAppsErrors.Client.INVALID_PARAMS, e.getMessage(), null, null, 56);
            }
        }
        if (this.b != null && jgn0.c()) {
            r6y r6yVar3 = this.b;
            if (r6yVar3 != null) {
                bex0.a.a(r6yVar3, JsApiMethodType.INSTALL_BUNDLE, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            return;
        }
        if (!BuildInfo.f()) {
            r6y r6yVar4 = this.b;
            if (r6yVar4 != null) {
                bex0.a.a(r6yVar4, JsApiMethodType.INSTALL_BUNDLE, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
                return;
            }
            return;
        }
        Handler handler = x93.a;
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null || p90.e(b)) {
            r6y r6yVar5 = this.b;
            if (r6yVar5 != null) {
                bex0.a.a(r6yVar5, JsApiMethodType.INSTALL_BUNDLE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 56);
                return;
            }
            return;
        }
        r6y r6yVar6 = this.b;
        if (r6yVar6 != null) {
            bex0.a.a(r6yVar6, JsApiMethodType.INSTALL_BUNDLE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 56);
        }
    }
}
