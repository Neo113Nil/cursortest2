package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: JsCallsDelegate.kt */
/* loaded from: classes6.dex */
public final class q19 {
    public static x6y b;
    public static final q19 a = new q19();
    public static final JSONObject c = yq.d("reason", "general");

    public final void a() {
        x6y x6yVar = b;
        if (x6yVar != null) {
            bex0.a.a(x6yVar, JsApiMethodType.CALL_JOIN, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
        }
        b = null;
    }
}
