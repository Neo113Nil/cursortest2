package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCancel$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCheck$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyResend$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyStart$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifySupported$Parameters;
import xsna.q4y;

/* compiled from: JsLibverifyBridgeStub.kt */
/* loaded from: classes6.dex */
public final class s4y implements q4y {
    public static final s4y a = new s4y();

    @Override // xsna.q4y
    @JavascriptInterface
    public void VKWebAppLibverifyCancel(String str) {
        q4y.a.VKWebAppLibverifyCancel(this, str);
    }

    @Override // xsna.q4y
    @JavascriptInterface
    public void VKWebAppLibverifyChangeState(String str) {
        q4y.a.VKWebAppLibverifyChangeState(this, str);
    }

    @Override // xsna.q4y
    @JavascriptInterface
    public void VKWebAppLibverifyCheck(String str) {
        q4y.a.VKWebAppLibverifyCheck(this, str);
    }

    @Override // xsna.q4y
    @JavascriptInterface
    public void VKWebAppLibverifyResend(String str) {
        q4y.a.VKWebAppLibverifyResend(this, str);
    }

    @Override // xsna.q4y
    @JavascriptInterface
    public void VKWebAppLibverifyStart(String str) {
        q4y.a.VKWebAppLibverifyStart(this, str);
    }

    @Override // xsna.q4y
    @JavascriptInterface
    public void VKWebAppLibverifySupported(String str) {
        q4y.a.VKWebAppLibverifySupported(this, str);
    }

    @Override // xsna.q4y
    public final void a(p2y<LibverifyResend$Parameters> p2yVar) {
    }

    @Override // xsna.q4y
    public final void b(p2y<LibverifySupported$Parameters> p2yVar) {
    }

    @Override // xsna.q4y
    public final void c(p2y<LibverifyCancel$Parameters> p2yVar) {
    }

    @Override // xsna.q4y
    public final void d(p2y<LibverifyStart$Parameters> p2yVar) {
    }

    @Override // xsna.q4y
    public final void e(p2y<LibverifyCheck$Parameters> p2yVar) {
    }
}
