package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.dating.sdk.js.bridge.api.events.CaptureProtection$Parameters;
import com.vk.superapp.dating.sdk.js.bridge.api.events.GetPermissions$Parameters;
import com.vk.superapp.dating.sdk.js.bridge.api.events.NavigateToSettings$Parameters;
import xsna.y3y;

/* compiled from: JsDatingSdkDelegateStub.kt */
/* loaded from: classes6.dex */
public final class c4y extends ReportableStubDelegate implements y3y {
    public final com.vk.superapp.base.js.bridge.b b;

    public c4y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "miniapp_permission";
    }

    @Override // xsna.x3y
    public final void P(p2y<GetPermissions$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetPermissions"), p2yVar);
    }

    @Override // xsna.y3y, xsna.x3y
    @JavascriptInterface
    public void VKWebAppCaptureProtection(String str) {
        y3y.a.VKWebAppCaptureProtection(this, str);
    }

    @Override // xsna.y3y, xsna.x3y
    @JavascriptInterface
    public void VKWebAppGetPermissions(String str) {
        y3y.a.VKWebAppGetPermissions(this, str);
    }

    @Override // xsna.y3y, xsna.x3y
    @JavascriptInterface
    public void VKWebAppNavigateToSettings(String str) {
        y3y.a.VKWebAppNavigateToSettings(this, str);
    }

    @Override // xsna.x3y
    public final void Z(p2y<CaptureProtection$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppCaptureProtection"), p2yVar);
    }

    @Override // xsna.x3y
    public final void w0(p2y<NavigateToSettings$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppNavigateToSettings"), p2yVar);
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final com.vk.superapp.base.js.bridge.b z1() {
        return this.b;
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
