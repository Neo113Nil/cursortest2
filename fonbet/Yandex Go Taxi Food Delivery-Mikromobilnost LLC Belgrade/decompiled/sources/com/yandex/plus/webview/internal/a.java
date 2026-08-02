package com.yandex.plus.webview.internal;

import android.view.View;
import android.webkit.WebView;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.at41;
import defpackage.byt0;
import defpackage.cjc;
import defpackage.dah0;
import defpackage.djc;
import defpackage.fjc;
import defpackage.gjc;
import defpackage.i3y;
import defpackage.ike;
import defpackage.in41;
import defpackage.jse;
import defpackage.pgz;
import defpackage.qq31;
import defpackage.qq41;
import defpackage.qtd;
import defpackage.qv10;
import defpackage.rn41;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn41;
import defpackage.wls;
import defpackage.wq41;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class a extends rn41 {
    public final WebViewContainer j;
    public final com.yandex.plus.webview.internal.contract.request.a k;
    public final at41 l;
    public final djc m;
    public final gjc n;
    public final ike o;
    public final i3y p;
    public final LinkedHashMap q;
    public qq41 r;
    public final wq41 s;
    public final CopyOnWriteArraySet t;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r10v0, types: [sn41] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(WebViewContainer webViewContainer, com.yandex.plus.webview.internal.contract.request.a aVar, qtd qtdVar, byt0 byt0Var, qq31 qq31Var, boolean z, jse jseVar, tls tlsVar, wls wlsVar, tls tlsVar2, wls wlsVar2, boolean z2, fjc fjcVar, final cjc cjcVar, gjc gjcVar, pgz pgzVar) {
        super((WebView) webViewContainer.findViewById(dah0.plus_webview), pgzVar, qtdVar, qq31Var, tlsVar2, wlsVar2, tlsVar, new WebViewControllerWithContainer$1(3, r4, djc.class, "onStateChanged", "onStateChanged(Ljava/lang/String;Ljava/lang/String;Z)V", 0), wlsVar, new wls() { // from class: sn41
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                int i = r2;
                zy11 zy11Var = zy11.a;
                cjc cjcVar2 = cjcVar;
                String str = (String) obj2;
                switch (i) {
                    case 0:
                        cjcVar2.s(str);
                        break;
                    default:
                        cjcVar2.k(str);
                        break;
                }
                return zy11Var;
            }
        }, new wls() { // from class: sn41
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                int i = r2;
                zy11 zy11Var = zy11.a;
                cjc cjcVar2 = cjcVar;
                String str = (String) obj2;
                switch (i) {
                    case 0:
                        cjcVar2.s(str);
                        break;
                    default:
                        cjcVar2.k(str);
                        break;
                }
                return zy11Var;
            }
        }, byt0Var, z, z2, 4);
        djc djcVar = new djc();
        final int i = 0;
        final int i2 = 1;
        this.j = webViewContainer;
        this.k = aVar;
        this.l = fjcVar;
        this.m = djcVar;
        this.n = gjcVar;
        this.o = qv10.e(jseVar);
        this.p = kotlin.a.a(new tn41(0));
        this.q = new LinkedHashMap();
        wq41 wq41Var = new wq41();
        this.s = wq41Var;
        this.t = new CopyOnWriteArraySet();
        if (webViewContainer.isAttachedToWindow()) {
            Iterator it = wq41Var.a.iterator();
            while (it.hasNext()) {
                ((in41) it.next()).getClass();
            }
        }
        webViewContainer.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.webview.internal.WebViewControllerWithContainer$addOnAttachStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Iterator it2 = a.this.s.a.iterator();
                while (it2.hasNext()) {
                    ((in41) it2.next()).getClass();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                com.yandex.plus.home.common.utils.a.b(a.this.o);
                wq41 wq41Var2 = a.this.s;
                wq41Var2.getClass();
                Iterator it2 = wq41Var2.a.iterator();
                while (it2.hasNext()) {
                    ((in41) it2.next()).e();
                }
            }
        });
    }

    @Override // defpackage.rn41, defpackage.mn41
    public final void loadUrl(String str, Map map) {
        tje.N(this.o, null, null, new WebViewControllerWithContainer$loadUrl$1(this, str, map, null), 3);
    }

    @Override // defpackage.rn41, defpackage.mn41
    public final void onPause() {
        Iterator it = this.s.a.iterator();
        while (it.hasNext()) {
            ((in41) it.next()).getClass();
        }
        super.onPause();
    }

    @Override // defpackage.rn41, defpackage.mn41
    public final void onResume() {
        super.onResume();
        Iterator it = this.s.a.iterator();
        while (it.hasNext()) {
            ((in41) it.next()).getClass();
        }
    }

    @Override // defpackage.rn41, defpackage.mn41
    public final void reload() {
        tje.N(this.o, null, null, new WebViewControllerWithContainer$reload$1(this, null), 3);
    }

    @Override // defpackage.rn41, defpackage.mn41
    public final void stopLoading() {
        tje.N(this.o, null, null, new WebViewControllerWithContainer$stopLoading$1(this, null), 3);
    }
}
