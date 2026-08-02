package xsna;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import xsna.d5y;
import xsna.p2y;

/* compiled from: JsVkPayLocationDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class q7y extends mg6 implements d5y {
    public xwv0 g;
    public final com.vk.superapp.base.js.bridge.b h;
    public final k7y i;

    public q7y(com.vk.superapp.base.js.bridge.b bVar, k7y k7yVar, xwv0 xwv0Var) {
        super(bVar, xwv0Var);
        this.g = xwv0Var;
        this.h = bVar;
        this.i = k7yVar;
    }

    @Override // xsna.d5y, xsna.b5y
    @JavascriptInterface
    public void VKWebAppGetGeodata(String str) {
        d5y.a.VKWebAppGetGeodata(this, str);
    }

    @Override // xsna.mg6
    public final xwv0 d() {
        return this.g;
    }

    @Override // xsna.b5y
    public final void f0(p2y<GetGeodata$Parameters> p2yVar) {
        this.h.k(new JsMethod("VKWebAppGetGeodata"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), p2yVar.b(), 1, null));
            return;
        }
        GetGeodata$Parameters a = p2yVar.a();
        Context context = ((l7y) this.i.c).l;
        if (context != null) {
            PermissionHelper.a.getClass();
            if (PermissionHelper.b(context, PermissionHelper.h)) {
                k(a, context);
                return;
            }
        }
        j(a.c());
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.g = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.g = null;
    }
}
