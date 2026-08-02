package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageDelete$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetMeta$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetState$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageRead$Parameters;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageWrite$Parameters;
import xsna.x4y;

/* compiled from: JsLocalStorageDelegateStub.kt */
/* loaded from: classes6.dex */
public final class a5y extends ReportableStubDelegate implements x4y {
    public final com.vk.superapp.base.js.bridge.b b;

    public a5y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.w4y
    public final void B(p2y<LocalStorageGetMeta$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppLocalStorageGetMeta"), p2yVar);
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "locale_storage";
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageDelete(String str) {
        x4y.a.VKWebAppLocalStorageDelete(this, str);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageGetMeta(String str) {
        x4y.a.VKWebAppLocalStorageGetMeta(this, str);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageGetState(String str) {
        x4y.a.VKWebAppLocalStorageGetState(this, str);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageRead(String str) {
        x4y.a.VKWebAppLocalStorageRead(this, str);
    }

    @Override // xsna.x4y, xsna.w4y
    @JavascriptInterface
    public void VKWebAppLocalStorageWrite(String str) {
        x4y.a.VKWebAppLocalStorageWrite(this, str);
    }

    @Override // xsna.w4y
    public final void d(p2y<LocalStorageRead$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppLocalStorageRead"), p2yVar);
    }

    @Override // xsna.w4y
    public final void h0(p2y<LocalStorageGetState$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppLocalStorageGetState"), p2yVar);
    }

    @Override // xsna.w4y
    public final void m(p2y<LocalStorageWrite$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppLocalStorageWrite"), p2yVar);
    }

    @Override // xsna.w4y
    public final void r1(p2y<LocalStorageDelete$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppLocalStorageDelete"), p2yVar);
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
