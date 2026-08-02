package xsna;

import android.webkit.JavascriptInterface;
import com.android.billingclient.api.BillingClient;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.subscriptions.js.bridge.api.events.CanShowAltPayMethod$Parameters;
import xsna.f6y;

/* compiled from: JsSubscriptionsDelegateStub.kt */
/* loaded from: classes6.dex */
public final class h6y extends ReportableStubDelegate implements f6y {
    public final com.vk.superapp.base.js.bridge.b b;

    public h6y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return BillingClient.FeatureType.SUBSCRIPTIONS;
    }

    @Override // xsna.f6y, xsna.e6y
    @JavascriptInterface
    public void VKWebAppCanShowAltPayMethod(String str) {
        f6y.a.VKWebAppCanShowAltPayMethod(this, str);
    }

    @Override // xsna.e6y
    public final void l(p2y<CanShowAltPayMethod$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppCanShowAltPayMethod"), p2yVar);
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
