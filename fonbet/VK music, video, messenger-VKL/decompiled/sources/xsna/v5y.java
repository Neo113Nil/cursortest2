package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.permission.js.bridge.api.events.GetGrantedPermissions$Parameters;
import xsna.p2y;

/* compiled from: JsPermissionBridge.kt */
/* loaded from: classes6.dex */
public interface v5y {

    /* compiled from: JsPermissionBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppGetGrantedPermissions(v5y v5yVar, String str) {
            try {
                GetGrantedPermissions$Parameters a = GetGrantedPermissions$Parameters.a((GetGrantedPermissions$Parameters) new Gson().fromJson(str, GetGrantedPermissions$Parameters.class));
                GetGrantedPermissions$Parameters.b(a);
                v5yVar.L(new p2y<>(a, str));
            } catch (Exception e) {
                v5yVar.L(new p2y<>(new p2y.a(e), str));
            }
        }
    }

    void L(p2y<GetGrantedPermissions$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppGetGrantedPermissions(String str);
}
