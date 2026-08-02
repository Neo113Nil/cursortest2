package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.uri.b;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.internal.a;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d35 extends kd5 {
    public final boolean d;
    public final WebViewContainer e;
    public final p3d0 f;
    public final vhw0 g;
    public final sls h;
    public final sls i;
    public final so41 j;
    public final tls k;
    public final wls l;
    public final tls m;
    public final tls n;
    public final wls o;
    public final ul60 p;
    public final b q;
    public final boolean r;
    public final long s;
    public final jse t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d35(boolean z, boolean z2, WebViewContainer webViewContainer, p3d0 p3d0Var, vhw0 vhw0Var, sls slsVar, cl41 cl41Var, so41 so41Var, tls tlsVar, wls wlsVar, tls tlsVar2, tls tlsVar3, wls wlsVar2, ul60 ul60Var, b bVar, boolean z3, long j, jse jseVar, int i) {
        super(z, webViewContainer);
        cl41Var = (i & 64) != 0 ? null : cl41Var;
        tls at3Var = (i & 2048) != 0 ? new at3(24) : tlsVar3;
        this.d = z2;
        this.e = webViewContainer;
        this.f = p3d0Var;
        this.g = vhw0Var;
        this.h = slsVar;
        this.i = cl41Var;
        this.j = so41Var;
        this.k = tlsVar;
        this.l = wlsVar;
        this.m = tlsVar2;
        this.n = at3Var;
        this.o = wlsVar2;
        this.p = ul60Var;
        this.q = bVar;
        this.r = z3;
        this.s = j;
        this.t = jseVar;
    }

    @Override // defpackage.kd5
    public final a e() {
        skd0.b(PlusLogTag.SDK, "create new webview controller with WebViewControllerBuilder");
        i3y i3yVar = skd0.a;
        com.yandex.plus.webview.api.a aVar = new com.yandex.plus.webview.api.a(this.e, sl91.c(kotlin.collections.a.m0(scc.g(new phd0(this.g, this.d), new khd0(new b35(this.h))), j())), this.p, this.r, this.t, skd0.a(PlusLogTag.UI));
        aVar.g = this.m;
        aVar.h = new c35(this.o, 0);
        aVar.i = this.k;
        aVar.j = this.l;
        aVar.m = this.s;
        aVar.o = us41.a;
        aVar.k = this.q;
        aVar.l = false;
        return aVar.a();
    }

    @Override // defpackage.kd5
    public final mn41 f() {
        skd0.b(PlusLogTag.SDK, "create old PlusWebViewController controller");
        return new dsd0(this.e.getWebView(), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r);
    }

    public abstract List j();
}
