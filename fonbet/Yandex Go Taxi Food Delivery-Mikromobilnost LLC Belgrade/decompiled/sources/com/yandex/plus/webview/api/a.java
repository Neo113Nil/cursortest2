package com.yandex.plus.webview.api;

import com.yandex.plus.webview.api.container.WebViewContainerType;
import com.yandex.plus.webview.internal.a;
import com.yandex.plus.webview.internal.security.CombinedWebViewRequestSecurityChecker$Strategy;
import defpackage.adc;
import defpackage.at41;
import defpackage.au2;
import defpackage.bt41;
import defpackage.byt0;
import defpackage.cfs0;
import defpackage.cjc;
import defpackage.ct41;
import defpackage.d7q0;
import defpackage.dah0;
import defpackage.di41;
import defpackage.fjc;
import defpackage.gjc;
import defpackage.hjc;
import defpackage.in41;
import defpackage.j0g;
import defpackage.jse;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.pq41;
import defpackage.qq31;
import defpackage.qq41;
import defpackage.qtd;
import defpackage.r5u;
import defpackage.rq41;
import defpackage.rs41;
import defpackage.so41;
import defpackage.swh;
import defpackage.tcc;
import defpackage.tg21;
import defpackage.tls;
import defpackage.tu41;
import defpackage.us41;
import defpackage.v810;
import defpackage.vn41;
import defpackage.w511;
import defpackage.wls;
import defpackage.ws41;
import defpackage.xm41;
import defpackage.ym41;
import defpackage.zl41;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {
    public final WebViewContainer a;
    public final au2 b;
    public final byt0 c;
    public final boolean d;
    public final jse e;
    public final pgz f;
    public tls g;
    public ct41 h;
    public tls i;
    public wls j;
    public tg21 k;
    public j0g n;
    public boolean l = true;
    public long m = 10000;
    public ws41 o = us41.a;

    public a(WebViewContainer webViewContainer, au2 au2Var, byt0 byt0Var, boolean z, jse jseVar, pgz pgzVar) {
        this.a = webViewContainer;
        this.b = au2Var;
        this.c = byt0Var;
        this.d = z;
        this.e = jseVar;
        this.f = pgzVar;
    }

    public final com.yandex.plus.webview.internal.a a() {
        int i;
        ym41 tu41Var;
        ym41 ym41Var;
        r5u r5uVar = new r5u(this.m, this.n, this.o, this.e);
        List list = this.b.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof zl41) {
                arrayList.add(obj);
            }
        }
        zl41 zl41Var = (zl41) kotlin.collections.a.b0(arrayList);
        if (zl41Var != null) {
            WebViewContainer webViewContainer = this.a;
            webViewContainer.getWebView().setBackgroundColor(zl41Var.m(webViewContainer.getWebView().getContext()));
        }
        ArrayList<in41> o0 = kotlin.collections.a.o0(list, r5uVar);
        swh swhVar = new swh(o0);
        tg21 tg21Var = this.k;
        if (tg21Var == null) {
            tg21Var = new cfs0();
        }
        com.yandex.plus.webview.internal.contract.request.a aVar = new com.yandex.plus.webview.internal.contract.request.a(swhVar, tg21Var);
        qtd qtdVar = new qtd(0, (so41[]) adc.D(o0, so41.class).toArray(new so41[0]));
        qq31 qq31Var = new qq31(9, swhVar);
        tls tlsVar = this.g;
        Object obj2 = this.h;
        if (obj2 == null) {
            obj2 = new v810(0);
        }
        List singletonList = Collections.singletonList(obj2);
        ArrayList D = adc.D(o0, at41.class);
        ArrayList arrayList2 = new ArrayList(tcc.n(D, 10));
        Iterator it = D.iterator();
        while (it.hasNext()) {
            arrayList2.add(new d7q0((at41) it.next()));
        }
        WebViewControllerBuilder$build$controller$1 webViewControllerBuilder$build$controller$1 = new WebViewControllerBuilder$build$controller$1(2, new hjc(kotlin.collections.a.m0(adc.D(o0, ct41.class), kotlin.collections.a.m0(arrayList2, singletonList))), hjc.class, "handleLoadResource", "handleLoadResource(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0);
        cjc cjcVar = new cjc();
        Iterator it2 = adc.D(o0, di41.class).iterator();
        while (it2.hasNext()) {
            cjcVar.a.add((di41) it2.next());
        }
        tls tlsVar2 = this.i;
        wls wlsVar = this.j;
        boolean z = this.l;
        fjc fjcVar = new fjc(adc.D(swhVar.a, at41.class), CombinedWebViewRequestSecurityChecker$Strategy.ALL);
        gjc gjcVar = new gjc();
        Iterator it3 = adc.D(o0, bt41.class).iterator();
        while (it3.hasNext()) {
            gjcVar.a.add((bt41) it3.next());
            cjcVar = cjcVar;
        }
        final com.yandex.plus.webview.internal.a aVar2 = new com.yandex.plus.webview.internal.a(this.a, aVar, qtdVar, this.c, qq31Var, this.d, this.e, tlsVar, webViewControllerBuilder$build$controller$1, tlsVar2, wlsVar, z, fjcVar, cjcVar, gjcVar, this.f);
        Iterator it4 = adc.D(o0, xm41.class).iterator();
        while (true) {
            boolean hasNext = it4.hasNext();
            WebViewContainer webViewContainer2 = aVar2.j;
            if (!hasNext) {
                Iterator it5 = adc.D(o0, rq41.class).iterator();
                if (it5.hasNext()) {
                    if (it5.next() != null) {
                        ny61.u();
                        return null;
                    }
                    if (aVar2.r != null) {
                        throw null;
                    }
                    aVar2.r = new qq41(webViewContainer2);
                    throw null;
                }
                r5u r5uVar2 = (r5u) kotlin.collections.a.R(adc.D(o0, r5u.class));
                if (r5uVar2 != null) {
                    Iterator it6 = adc.D(o0, rs41.class).iterator();
                    while (it6.hasNext()) {
                        r5uVar2.f.add((rs41) it6.next());
                    }
                }
                for (in41 in41Var : o0) {
                    aVar2.s.a.add(in41Var);
                    aVar2.t.add(in41Var);
                    in41Var.i(aVar2, swhVar);
                }
                return aVar2;
            }
            xm41 xm41Var = (xm41) it4.next();
            for (WebViewContainerType webViewContainerType : xm41Var.h()) {
                LinkedHashMap linkedHashMap = aVar2.q;
                if (linkedHashMap.containsKey(webViewContainerType)) {
                    ym41Var = (ym41) linkedHashMap.get(webViewContainerType);
                } else {
                    int i2 = vn41.a[webViewContainerType.ordinal()];
                    if (i2 == 1) {
                        i = dah0.plus_webview_toolbar_container;
                    } else if (i2 == 2) {
                        i = dah0.plus_webview_footer_container;
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        i = dah0.plus_webview_full_size_container;
                    }
                    if (webViewContainerType != WebViewContainerType.TOOLBAR) {
                        tu41Var = new ym41();
                    } else {
                        aVar2.m.a.add(new pq41() { // from class: un41
                            @Override // defpackage.pq41
                            public final void a(String str, String str2, boolean z2) {
                                ((lz40) a.this.p.getValue()).g(new uu41(str, str2, z2));
                            }
                        });
                        tu41Var = new tu41();
                    }
                    linkedHashMap.put(webViewContainerType, tu41Var);
                    ym41Var = tu41Var;
                }
                xm41Var.j(webViewContainerType, ym41Var);
            }
        }
    }
}
