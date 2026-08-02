package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.vibration.js.bridge.api.events.TapticImpactOccurred$Parameters;
import com.vk.superapp.vibration.js.bridge.api.events.TapticNotificationOccurred$Parameters;
import com.vk.superapp.vibration.js.bridge.api.events.TapticSelectionChanged$Parameters;
import xsna.l6y;

/* compiled from: JsVibrationDelegateStub.kt */
/* loaded from: classes6.dex */
public final class n6y extends ReportableStubDelegate implements l6y {
    public final com.vk.superapp.base.js.bridge.b b;

    public n6y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "vibration";
    }

    @Override // xsna.k6y
    public final void L0(p2y<TapticImpactOccurred$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppTapticImpactOccurred"), p2yVar);
    }

    @Override // xsna.l6y, xsna.k6y
    @JavascriptInterface
    public void VKWebAppTapticImpactOccurred(String str) {
        l6y.a.VKWebAppTapticImpactOccurred(this, str);
    }

    @Override // xsna.l6y, xsna.k6y
    @JavascriptInterface
    public void VKWebAppTapticNotificationOccurred(String str) {
        l6y.a.VKWebAppTapticNotificationOccurred(this, str);
    }

    @Override // xsna.l6y, xsna.k6y
    @JavascriptInterface
    public void VKWebAppTapticSelectionChanged(String str) {
        l6y.a.VKWebAppTapticSelectionChanged(this, str);
    }

    @Override // xsna.k6y
    public final void X0(p2y<TapticNotificationOccurred$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppTapticNotificationOccurred"), p2yVar);
    }

    @Override // xsna.k6y
    public final void x(p2y<TapticSelectionChanged$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppTapticSelectionChanged"), p2yVar);
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
