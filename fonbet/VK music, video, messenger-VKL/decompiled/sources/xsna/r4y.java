package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCancel$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCancel$Response;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCheck$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyResend$Error;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyResend$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyResend$Response;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyStart$Error;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyStart$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyStart$Response;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifySupported$Parameters;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifySupported$Response;
import org.json.JSONException;
import xsna.q4y;
import xsna.w2z;

/* compiled from: JsLibverifyBridgeImpl.kt */
/* loaded from: classes6.dex */
public final class r4y implements q4y {
    public final com.vk.superapp.base.js.bridge.b a;
    public final v4y b;
    public final bpn0 c = new bpn0(new obh(this, 16));
    public final bpn0 d = new bpn0(new wnh(this, 23));

    public r4y(com.vk.superapp.base.js.bridge.b bVar, v4y v4yVar) {
        this.a = bVar;
        this.b = v4yVar;
    }

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
        String b = p2yVar.b();
        try {
            this.b.a(w2z.c.a);
            b2n0 b2n0Var = (b2n0) this.d.getValue();
            b2n0Var.getClass();
            com.vk.superapp.base.js.bridge.b.p(b2n0Var.a, new JsMethod("VKWebAppLibverifyResend"), new LibverifyResend$Response(null, new LibverifyResend$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
        } catch (IllegalStateException unused) {
            com.vk.superapp.base.js.bridge.b.o(((xvp) this.c.getValue()).a, new JsMethod("VKWebAppLibverifyResend"), new LibverifyResend$Error(null, new LibverifyResend$Error.Data(LibverifyResend$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null)), 1, null), null, null, 12);
        }
    }

    @Override // xsna.q4y
    public final void b(p2y<LibverifySupported$Parameters> p2yVar) {
        String b = p2yVar.b();
        xgx0.a.getClass();
        xgx0.f("[JsLibverifyDelegateImpl] checkIsSupported called");
        boolean z = r55.h().n().a() && r55.h().n().c;
        b2n0 b2n0Var = (b2n0) this.d.getValue();
        b2n0Var.getClass();
        com.vk.superapp.base.js.bridge.b.p(b2n0Var.a, new JsMethod("VKWebAppLibverifySupported"), new LibverifySupported$Response(null, new LibverifySupported$Response.Data(z, 2, b), b, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.q4y
    public final void c(p2y<LibverifyCancel$Parameters> p2yVar) {
        String b = p2yVar.b();
        w2z.a aVar = w2z.a.a;
        v4y v4yVar = this.b;
        v4yVar.a(aVar);
        v4yVar.c = null;
        b2n0 b2n0Var = (b2n0) this.d.getValue();
        b2n0Var.getClass();
        com.vk.superapp.base.js.bridge.b.p(b2n0Var.a, new JsMethod("VKWebAppLibverifyCancel"), new LibverifyCancel$Response(null, new LibverifyCancel$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.q4y
    public final void d(p2y<LibverifyStart$Parameters> p2yVar) {
        v4y v4yVar = this.b;
        String b = p2yVar.b();
        try {
            String c = p2yVar.a().c();
            v4yVar.c = new l7(this, 28);
            v4yVar.a(new w2z.d(c));
            b2n0 b2n0Var = (b2n0) this.d.getValue();
            b2n0Var.getClass();
            com.vk.superapp.base.js.bridge.b.p(b2n0Var.a, new JsMethod("VKWebAppLibverifyStart"), new LibverifyStart$Response(null, new LibverifyStart$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
        } catch (JSONException unused) {
            com.vk.superapp.base.js.bridge.b.o(((xvp) this.c.getValue()).a, new JsMethod("VKWebAppLibverifyStart"), new LibverifyStart$Error(null, new LibverifyStart$Error.Data(LibverifyStart$Error.Data.Type.CLIENT_ERROR, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null)), 1, null), null, null, 12);
        }
    }

    @Override // xsna.q4y
    public final void e(p2y<LibverifyCheck$Parameters> p2yVar) {
        bpn0 bpn0Var = this.c;
        String b = p2yVar.b();
        try {
            this.b.a(new w2z.b(p2yVar.a().c()));
            ((b2n0) this.d.getValue()).a(b);
        } catch (IllegalStateException unused) {
            ((xvp) bpn0Var.getValue()).a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
        } catch (JSONException unused2) {
            ((xvp) bpn0Var.getValue()).a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
        }
    }
}
