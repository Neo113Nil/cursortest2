package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.analytics.js.bridge.api.events.TrackEvent$Parameters;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import xsna.r1y;

/* compiled from: JsAnalyticsDelegateStub.kt */
/* loaded from: classes6.dex */
public final class t1y extends ReportableStubDelegate implements r1y {
    public final com.vk.superapp.base.js.bridge.b b;

    public t1y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "analytics";
    }

    @Override // xsna.r1y, xsna.p1y
    @JavascriptInterface
    public void VKWebAppGetMyTrackerId(String str) {
        r1y.a.VKWebAppGetMyTrackerId(this, str);
    }

    @Override // xsna.r1y, xsna.p1y
    @JavascriptInterface
    public void VKWebAppTrackEvent(String str) {
        r1y.a.VKWebAppTrackEvent(this, str);
    }

    @Override // xsna.p1y
    public final void j(p2y<TrackEvent$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppTrackEvent"), p2yVar);
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
