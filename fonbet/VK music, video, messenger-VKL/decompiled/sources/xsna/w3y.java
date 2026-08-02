package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.dating.js.bridge.api.events.AllowLocationPermission$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.GetPushToken$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.ImageShare$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.InAppUpdate$Parameters;

/* compiled from: JsDatingDelegateStub.kt */
/* loaded from: classes6.dex */
public final class w3y extends ReportableStubDelegate implements t3y {
    public final com.vk.superapp.base.js.bridge.b b;

    public w3y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "dating";
    }

    @Override // xsna.s3y
    public final void S(p2y<InAppUpdate$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppInAppUpdate"), p2yVar);
    }

    @Override // xsna.t3y, xsna.s3y
    @JavascriptInterface
    public void VKWebAppAllowLocationPermission(String str) {
        super.VKWebAppAllowLocationPermission(str);
    }

    @Override // xsna.t3y, xsna.s3y
    @JavascriptInterface
    public void VKWebAppGetPushToken(String str) {
        super.VKWebAppGetPushToken(str);
    }

    @Override // xsna.t3y, xsna.s3y
    @JavascriptInterface
    public void VKWebAppImageShare(String str) {
        super.VKWebAppImageShare(str);
    }

    @Override // xsna.t3y, xsna.s3y
    @JavascriptInterface
    public void VKWebAppInAppUpdate(String str) {
        super.VKWebAppInAppUpdate(str);
    }

    @Override // xsna.s3y
    public final void b1(p2y<ImageShare$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppImageShare"), p2yVar);
    }

    @Override // xsna.s3y
    public final void s1(p2y<AllowLocationPermission$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppAllowLocationPermission"), p2yVar);
    }

    @Override // xsna.s3y
    public final void t1(p2y<GetPushToken$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetPushToken"), p2yVar);
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final com.vk.superapp.base.js.bridge.b z1() {
        return this.b;
    }
}
