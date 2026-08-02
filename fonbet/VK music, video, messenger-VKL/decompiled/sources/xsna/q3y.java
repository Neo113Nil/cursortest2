package xsna;

import android.graphics.Rect;
import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.core.js.bridge.api.events.BecameInteractive$Parameters;
import com.vk.superapp.core.js.bridge.api.events.CallAPIMethod$Parameters;
import com.vk.superapp.core.js.bridge.api.events.Close$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetClientVersion$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetConfig$Parameters;
import com.vk.superapp.core.js.bridge.api.events.GetLaunchParams$Parameters;
import com.vk.superapp.core.js.bridge.api.events.Init$Parameters;
import com.vk.superapp.core.js.bridge.api.events.SendCustomEvent$Parameters;
import com.vk.superapp.core.js.bridge.api.events.SetViewSettings$Parameters;
import com.vk.superapp.core.js.bridge.api.events.StorageGet$Parameters;
import com.vk.superapp.core.js.bridge.api.events.StorageSet$Parameters;
import xsna.k3y;

/* compiled from: JsCoreDelegateStub.kt */
/* loaded from: classes6.dex */
public final class q3y extends ReportableStubDelegate implements k3y {
    public final com.vk.superapp.base.js.bridge.b b;

    public q3y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.k3y
    public final void B0(String str) {
        C1("sendVKWebAppViewHideEvent");
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "core";
    }

    @Override // xsna.j3y
    public final void C(p2y<Init$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppInit"), p2yVar);
    }

    @Override // xsna.j3y
    public final void J0(p2y<GetLaunchParams$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetLaunchParams"), p2yVar);
    }

    @Override // xsna.j3y
    public final void N(p2y<GetConfig$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetConfig"), p2yVar);
    }

    @Override // xsna.j3y
    public final void O(p2y<StorageGet$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppStorageGet"), p2yVar);
    }

    @Override // xsna.k3y
    public final void U0() {
        C1("setGlAffectsVersion");
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppBecameInteractive(String str) {
        k3y.a.VKWebAppBecameInteractive(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppCallAPIMethod(String str) {
        k3y.a.VKWebAppCallAPIMethod(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppChangeFragment(String str) {
        k3y.a.VKWebAppChangeFragment(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppClose(String str) {
        k3y.a.VKWebAppClose(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppGetClientVersion(String str) {
        k3y.a.VKWebAppGetClientVersion(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppGetConfig(String str) {
        k3y.a.VKWebAppGetConfig(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppGetLaunchParams(String str) {
        k3y.a.VKWebAppGetLaunchParams(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppInit(String str) {
        k3y.a.VKWebAppInit(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppSendCustomEvent(String str) {
        k3y.a.VKWebAppSendCustomEvent(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppSetViewSettings(String str) {
        k3y.a.VKWebAppSetViewSettings(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppStorageGet(String str) {
        k3y.a.VKWebAppStorageGet(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppStorageSet(String str) {
        k3y.a.VKWebAppStorageSet(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppUpdateConfig(String str) {
        k3y.a.VKWebAppUpdateConfig(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppViewHide(String str) {
        k3y.a.VKWebAppViewHide(this, str);
    }

    @Override // xsna.k3y, xsna.j3y
    @JavascriptInterface
    public void VKWebAppViewRestore(String str) {
        k3y.a.VKWebAppViewRestore(this, str);
    }

    @Override // xsna.j3y
    public final void Z0(p2y<StorageSet$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppStorageSet"), p2yVar);
    }

    @Override // xsna.j3y
    public final void i1(p2y<CallAPIMethod$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppCallAPIMethod"), p2yVar);
    }

    @Override // xsna.k3y
    public final void l0() {
        C1("sendVKWebAppInitEvent");
    }

    @Override // xsna.j3y
    public final void m1(p2y<Close$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppClose"), p2yVar);
    }

    @Override // xsna.k3y
    public final void p0(Rect rect) {
        C1("updateInsets");
    }

    @Override // xsna.k3y
    public final void q() {
        C1("sendVKWebAppViewRestoreEvent");
    }

    @Override // xsna.k3y
    public final void t(String str) {
        C1("sendVKWebAppChangeFragmentEvent");
    }

    @Override // xsna.j3y
    public final void t0(p2y<GetClientVersion$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetClientVersion"), p2yVar);
    }

    @Override // xsna.j3y
    public final void x1(p2y<SendCustomEvent$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppSendCustomEvent"), p2yVar);
    }

    @Override // xsna.k3y
    public final void y() {
        C1("sendVKWebAppUpdateConfigEvent");
    }

    @Override // xsna.j3y
    public final void y1(p2y<BecameInteractive$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppBecameInteractive"), p2yVar);
    }

    @Override // xsna.j3y
    public final void z(p2y<SetViewSettings$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppSetViewSettings"), p2yVar);
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
