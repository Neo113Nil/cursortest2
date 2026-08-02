package defpackage;

import android.webkit.WebView;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.uri.c;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.internal.a;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class hfs0 extends kd5 {
    public final WebViewContainer d;
    public final so41 e;
    public final tls f;
    public final wls g;
    public final tls h;
    public final wls i;
    public final e3o0 j;
    public final tls k;
    public final byt0 l;
    public final c m;
    public final long n;
    public final wio o;
    public final hsd0 p;
    public final gfs0 q;
    public final String r;
    public final pgz s;
    public final jse t;

    public hfs0(boolean z, WebViewContainer webViewContainer, so41 so41Var, tls tlsVar, wls wlsVar, tls tlsVar2, wls wlsVar2, e3o0 e3o0Var, tls tlsVar3, ul60 ul60Var, c cVar, long j, wio wioVar, hsd0 hsd0Var, gfs0 gfs0Var, String str, pgz pgzVar, jse jseVar) {
        super(z, webViewContainer);
        this.d = webViewContainer;
        this.e = so41Var;
        this.f = tlsVar;
        this.g = wlsVar;
        this.h = tlsVar2;
        this.i = wlsVar2;
        this.j = e3o0Var;
        this.k = tlsVar3;
        this.l = ul60Var;
        this.m = cVar;
        this.n = j;
        this.o = wioVar;
        this.p = hsd0Var;
        this.q = gfs0Var;
        this.r = str;
        this.s = pgzVar;
        this.t = jseVar;
    }

    @Override // defpackage.kd5
    public final a e() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.s;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "SimpleWebViewControllerDelegate", "create new simple webview controller with WebViewControllerBuilder");
        }
        i3y i3yVar = skd0.a;
        rkd0 a = skd0.a(PlusLogTag.UI);
        com.yandex.plus.webview.api.a aVar = new com.yandex.plus.webview.api.a(this.d, sl91.c(Collections.singletonList(new ffs0(this.q, this.s, this.o, this.p, this.r))), this.l, true, this.t, a);
        aVar.g = this.h;
        aVar.h = new c35(this.i, 1);
        aVar.i = this.f;
        aVar.j = this.g;
        aVar.m = this.n;
        aVar.o = vs41.a;
        aVar.k = this.m;
        aVar.l = false;
        return aVar.a();
    }

    @Override // defpackage.kd5
    public final mn41 f() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.s;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "SimpleWebViewControllerDelegate", "create old simple WebViewControllerImpl controller");
        }
        WebView webView = this.d.getWebView();
        i3y i3yVar = skd0.a;
        return new rn41(webView, skd0.a(PlusLogTag.UI), this.e, null, this.f, this.g, this.h, new w7o0(15, this), this.i, null, this.j, this.l, true, false, 1044);
    }
}
