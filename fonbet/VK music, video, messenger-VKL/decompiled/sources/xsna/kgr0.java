package xsna;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import xsna.h7u0;
import xsna.hgr0;

/* compiled from: VKSuperAppWebCallback.kt */
/* loaded from: classes6.dex */
public final class kgr0 implements xc80 {
    public final /* synthetic */ agu0 b;
    public final ofc0 c;
    public final hgr0.c d;

    public kgr0(ofc0 ofc0Var, hgr0.c cVar, agu0 agu0Var) {
        this.b = agu0Var;
        this.c = ofc0Var;
        this.d = cVar;
    }

    @Override // xsna.xc80
    public final boolean A() {
        return true;
    }

    @Override // xsna.xc80
    public final void B(Throwable th) {
        this.b.B(th);
    }

    @Override // xsna.xc80
    public final VkBrowserMenuFactory a() {
        return this.d.a();
    }

    @Override // xsna.xc80
    public final void b(boolean z) {
        this.d.b().e.b(z);
    }

    @Override // xsna.yc80
    public final void c(ArrayList arrayList, zx90 zx90Var, gwg gwgVar) {
        this.b.c(arrayList, zx90Var, gwgVar);
    }

    @Override // xsna.xc80
    public final boolean i() {
        return this.b.c.i();
    }

    @Override // xsna.xc80
    public final boolean j(String str) {
        return hgr0.this.Ma(str);
    }

    @Override // xsna.xc80
    public final void k() {
        this.b.k();
    }

    @Override // xsna.xc80
    public final void m(boolean z) {
        if (z) {
            fxv0.a.a(nvv0.a);
            ok8 ok8Var = (ok8) this.c.invoke();
            if (ok8Var != null) {
                ok8Var.close();
            }
        }
    }

    @Override // xsna.xc80
    public final void n() {
        this.b.n();
    }

    @Override // xsna.xc80
    public final void o(WebIdentityContext webIdentityContext) {
        this.b.o(webIdentityContext);
    }

    @Override // xsna.xc80
    public final void p(Intent intent) {
        this.b.p(intent);
    }

    @Override // xsna.xc80
    public final void q() {
        this.b.q();
    }

    @Override // xsna.xc80
    public final void s() {
        MenuApiApplicationsCache.b.h();
    }

    @Override // xsna.xc80
    public final void t(boolean z) {
        this.b.t(z);
    }

    @Override // xsna.xc80
    public final void u(Intent intent) {
        this.b.u(intent);
    }

    @Override // xsna.xc80
    public final void v(int i, Intent intent) {
        ok8 ok8Var;
        FragmentActivity kn;
        hgr0.c cVar = this.d;
        if (i == -1) {
            Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("postId", 0)) : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("post_id", valueOf);
            cVar.b().d.n(JsApiMethodType.SHOW_WALL_POST_BOX, jSONObject);
            return;
        }
        if (i != 10) {
            cVar.b().d.m(JsApiMethodType.SHOW_WALL_POST_BOX, VkAppsErrors.Client.USER_DENIED, null, null);
            return;
        }
        if (intent != null && intent.getIntExtra("code", 0) == -100 && (ok8Var = (ok8) this.c.invoke()) != null && (kn = ok8Var.Xg().kn()) != null) {
            h7u0.a aVar = new h7u0.a(kn);
            aVar.U(R.string.vk_apps_error_has_occured);
            aVar.c0(R.string.ok, null);
            aVar.m();
        }
        if (intent == null || !intent.hasExtra("code")) {
            cVar.b().d.A(JsApiMethodType.SHOW_WALL_POST_BOX, null);
        } else {
            cVar.b().d.j(JsApiMethodType.SHOW_WALL_POST_BOX, VkAppsErrors.a(intent.getIntExtra("code", 0), intent.getStringExtra("description"), null, Bundle.EMPTY));
        }
    }

    @Override // xsna.xc80
    public final void w() {
        this.b.w();
    }

    @Override // xsna.xc80
    public final void x() {
        this.b.x();
    }

    @Override // xsna.xc80
    public final void y(upn0 upn0Var) {
        ok8 ok8Var = (ok8) this.c.invoke();
        if (ok8Var != null) {
            ok8Var.J4(upn0Var);
        }
    }

    @Override // xsna.xc80
    public final Map<VkUiCommand, dvv0> z(long j) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        Object f0 = superappUiRouterBridge.f0(j);
        Map<VkUiCommand, dvv0> map = f0 instanceof Map ? (Map) f0 : null;
        return map == null ? jgp.b : map;
    }

    @Override // xsna.xc80
    public final void r() {
    }

    @Override // xsna.xc80
    public final void l(int i, String str) {
    }
}
