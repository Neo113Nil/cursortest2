package xsna;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.permission.js.bridge.api.events.GetGrantedPermissions$Parameters;
import kotlin.collections.builders.ListBuilder;
import xsna.p2y;
import xsna.w5y;

/* compiled from: JsPermissionBaseDelegateImpl.kt */
/* loaded from: classes6.dex */
public abstract class u5y implements w5y {
    public final foi b;
    public final com.vk.superapp.base.js.bridge.b c;
    public final bpn0 d = new bpn0(new z3i(this, 24));
    public final bpn0 e = new bpn0(new tju(this, 5));

    public u5y(s13 s13Var, foi foiVar, com.vk.superapp.base.js.bridge.b bVar) {
        this.b = foiVar;
        this.c = bVar;
    }

    @Override // xsna.v5y
    public final void L(p2y<GetGrantedPermissions$Parameters> p2yVar) {
        this.c.k(new JsMethod("VKWebAppGetGrantedPermissions"), p2yVar.b());
        if (!(p2yVar.a instanceof p2y.a)) {
            qro0.c(new ni0(9, this, p2yVar.a().c()));
        } else {
            ((nvp) this.e.getValue()).a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    @Override // xsna.w5y, xsna.v5y
    @JavascriptInterface
    public void VKWebAppGetGrantedPermissions(String str) {
        w5y.a.VKWebAppGetGrantedPermissions(this, str);
    }

    public abstract ListBuilder a(Context context);
}
