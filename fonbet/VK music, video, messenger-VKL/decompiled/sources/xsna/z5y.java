package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.permission.js.bridge.api.events.GetGrantedPermissions$Parameters;
import xsna.w5y;

/* compiled from: JsPermissionDelegateStub.kt */
/* loaded from: classes6.dex */
public final class z5y extends ReportableStubDelegate implements w5y {
    public final com.vk.superapp.base.js.bridge.b b;

    public z5y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "permission";
    }

    @Override // xsna.v5y
    public final void L(p2y<GetGrantedPermissions$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetGrantedPermissions"), p2yVar);
    }

    @Override // xsna.w5y, xsna.v5y
    @JavascriptInterface
    public void VKWebAppGetGrantedPermissions(String str) {
        w5y.a.VKWebAppGetGrantedPermissions(this, str);
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final com.vk.superapp.base.js.bridge.b z1() {
        return this.b;
    }
}
