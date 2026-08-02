package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.LinkedHashMap;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: JsVkBrowserCoreBridgeExt.kt */
/* loaded from: classes6.dex */
public final class b7y {
    public static final void a(x6y x6yVar, VkAppsErrors.Client client, LinkedHashMap linkedHashMap) {
        bex0.a.a(x6yVar, JsApiMethodType.OPEN_EXTERNAL_LINK, client, null, new Pair("state_description", new JSONObject(linkedHashMap)), null, 52);
    }
}
