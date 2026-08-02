package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: WebAppBridge.kt */
/* loaded from: classes6.dex */
public interface bex0 {

    /* compiled from: WebAppBridge.kt */
    public static final class a {
        public static /* synthetic */ void a(bex0 bex0Var, JsApiMethodType jsApiMethodType, VkAppsErrors.Client client, String str, Pair pair, String str2, int i) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                pair = null;
            }
            if ((i & 16) != 0) {
                str2 = null;
            }
            bex0Var.b(jsApiMethodType, client, str, pair, str2);
        }

        public static /* synthetic */ void b(bex0 bex0Var, JsApiMethodType jsApiMethodType, JSONObject jSONObject, String str, int i) {
            if ((i & 4) != 0) {
                str = null;
            }
            bex0Var.e(jsApiMethodType, jSONObject, str);
        }
    }

    void b(JsApiMethodType jsApiMethodType, VkAppsErrors.Client client, String str, Pair pair, String str2);

    void e(JsApiMethodType jsApiMethodType, JSONObject jSONObject, String str);
}
