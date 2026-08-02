package xsna;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import xsna.svv0;
import xsna.u13;

/* compiled from: AppStateHolderCached.kt */
/* loaded from: classes6.dex */
public final class t93 implements s93 {
    public final s1w0 a;
    public final u13 b;
    public final svv0 c;
    public boolean d;
    public boolean e;

    public t93(s1w0 s1w0Var, u13 u13Var, svv0 svv0Var) {
        this.a = s1w0Var;
        this.b = u13Var;
        this.c = svv0Var;
        if (k()) {
            return;
        }
        u13Var.g = this;
    }

    @Override // xsna.s93
    public final void a() {
        ViewParent parent;
        u13 u13Var = this.b;
        WebView webView = u13Var.a;
        if (this.d) {
            return;
        }
        this.d = true;
        if (!u13Var.l) {
            if (webView != null) {
                this.a.b(webView);
            }
            u13Var.b.a.Y();
            return;
        }
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        if (superappUiRouterBridge.e() != null || webView == null || (parent = webView.getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).removeView(webView);
    }

    @Override // xsna.s93
    public final void b(fvv0 fvv0Var) {
        u13 u13Var = this.b;
        if (!epx.f(u13Var.g, this)) {
            t93 t93Var = u13Var.g;
            if (t93Var != null) {
                t93Var.a();
            }
            u13Var.g = null;
            a();
            u13Var.b.a.X(fvv0Var);
        }
        this.d = false;
        u13Var.g = this;
    }

    @Override // xsna.s93
    public final Integer c() {
        return this.b.m;
    }

    @Override // xsna.s93
    public final void d(boolean z) {
        this.b.j = z;
    }

    @Override // xsna.s93
    public final boolean e() {
        return this.b.j;
    }

    @Override // xsna.s93
    public final boolean f() {
        return this.b.i;
    }

    @Override // xsna.s93
    public final zxx g() {
        return this.b.b;
    }

    @Override // xsna.s93
    public final WebView getView() {
        return this.b.a;
    }

    @Override // xsna.s93
    public final void h(boolean z) {
        this.b.i = z;
    }

    @Override // xsna.s93
    public final u13.a i() {
        return this.b.f;
    }

    @Override // xsna.s93
    public final Boolean j() {
        return this.b.e;
    }

    @Override // xsna.s93
    public final boolean k() {
        String str = this.b.c;
        return !(str == null || drm0.N(str));
    }

    @Override // xsna.s93
    public final void l(String str) {
        this.b.k = str;
    }

    @Override // xsna.s93
    public final void m(String str) {
        this.b.c = str;
    }

    @Override // xsna.s93
    public final void n(u13.a aVar) {
        this.b.f = aVar;
    }

    @Override // xsna.s93
    public final void o(upn0 upn0Var, boolean z) {
        u13 u13Var = this.b;
        u13Var.d = upn0Var;
        u13Var.e = Boolean.valueOf(z);
    }

    @Override // xsna.s93
    public final boolean p() {
        svv0 svv0Var = this.c;
        return (svv0Var instanceof svv0.a) || svv0Var.b();
    }

    @Override // xsna.s93
    public final boolean q() {
        return this.e;
    }

    @Override // xsna.s93
    public final upn0 r() {
        return this.b.d;
    }
}
