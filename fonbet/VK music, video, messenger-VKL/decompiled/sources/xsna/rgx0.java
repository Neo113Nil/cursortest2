package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: WebInternalDelegate.kt */
/* loaded from: classes7.dex */
public final class rgx0 implements SuperappUiRouterBridge.d {
    public final /* synthetic */ onx a;

    public rgx0(onx onxVar) {
        this.a = onxVar;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
    public final void a(VkAlertData.a aVar) {
        Object obj = aVar.b;
        if (obj instanceof JSONObject) {
            bex0.a.b(this.a, JsApiMethodType.APP_ALERT, (JSONObject) obj, null, 12);
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
    public final void onDismiss() {
        bex0.a.a(this.a, JsApiMethodType.APP_ALERT, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
    }
}
