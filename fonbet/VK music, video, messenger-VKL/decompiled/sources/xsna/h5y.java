package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import xsna.d5y;

/* compiled from: JsLocationDelegateStub.kt */
/* loaded from: classes6.dex */
public final class h5y extends ReportableStubDelegate implements d5y {
    public final com.vk.superapp.base.js.bridge.b b;

    public h5y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "location";
    }

    @Override // xsna.d5y, xsna.b5y
    @JavascriptInterface
    public void VKWebAppGetGeodata(String str) {
        d5y.a.VKWebAppGetGeodata(this, str);
    }

    @Override // xsna.b5y
    public final void f0(p2y<GetGeodata$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetGeodata"), p2yVar);
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
