package com.yandex.passport.internal.social.esia;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.flags.presentation.v0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.dgc;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.i9a1;
import defpackage.ljs0;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.qke;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes15.dex */
public abstract class m {
    public static final void a(final i0 i0Var, final tls tlsVar, final tls tlsVar2, final tls tlsVar3, final sls slsVar, final sls slsVar2, fid fidVar, final int i) {
        String str;
        o430 o430Var;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(879937420);
        int i2 = i | (btsVar.e(i0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128) | (btsVar.e(tlsVar3) ? 2048 : 1024) | (btsVar.e(slsVar) ? 16384 : 8192) | (btsVar.e(slsVar2) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && btsVar.E()) {
            btsVar.Y();
        } else {
            oz40 b = androidx.compose.runtime.f.b(i0Var.w, btsVar);
            EsiaBindViewModel$Result result = ((EsiaBindViewModel$State) b.getValue()).getResult();
            btsVar.e0(-38253099);
            o430 o430Var2 = did.a;
            if (result != null) {
                btsVar.e0(-2090720450);
                boolean e = ((i2 & 896) == 256) | btsVar.e(result);
                Object Q = btsVar.Q();
                if (e || Q == o430Var2) {
                    Q = new EsiaBindScreenKt$EsiaBindScreen$1$1$1(tlsVar2, result, null);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                zpn.e(btsVar, (wls) Q, result);
                btsVar.t(false);
                aii0 v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    v.d = new wls(i0Var, tlsVar, tlsVar2, tlsVar3, slsVar, slsVar2, i, i3) { // from class: com.yandex.passport.internal.social.esia.j
                        public final /* synthetic */ int a;
                        public final /* synthetic */ i0 b;
                        public final /* synthetic */ tls c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ tls x;
                        public final /* synthetic */ sls y;
                        public final /* synthetic */ sls z;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(1);
                                    m.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(1);
                                    m.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            btsVar.t(false);
            String url = ((EsiaBindViewModel$State) b.getValue()).getUrl();
            btsVar.e0(-38248862);
            if (url != null) {
                boolean isEsiaBindingAppToApp = ((EsiaBindViewModel$State) b.getValue()).isEsiaBindingAppToApp();
                btsVar.e0(-38244131);
                boolean e2 = ((i2 & 112) == 32) | btsVar.e(i0Var);
                Object Q2 = btsVar.Q();
                if (e2 || Q2 == o430Var2) {
                    Q2 = new s0(6, i0Var, tlsVar);
                    btsVar.o0(Q2);
                }
                tls tlsVar4 = (tls) Q2;
                btsVar.t(false);
                btsVar.e0(-38240127);
                boolean e3 = btsVar.e(i0Var);
                Object Q3 = btsVar.Q();
                if (e3 || Q3 == o430Var2) {
                    Q3 = new com.yandex.passport.internal.analytics.a0(6, i0Var);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                z = false;
                str = url;
                o430Var = o430Var2;
                b(isEsiaBindingAppToApp, str, tlsVar4, (tls) Q3, slsVar, slsVar2, btsVar, 516096 & i2);
                btsVar = btsVar;
            } else {
                str = url;
                o430Var = o430Var2;
                z = false;
            }
            btsVar.t(z);
            btsVar.e0(-38233440);
            if (str == null || ((EsiaBindViewModel$State) b.getValue()).isWaitingForEsiaCallback()) {
                com.yandex.passport.common.ui.progress.p.d(i9a1.g(c530.a), null, false, btsVar, 0, 6);
            }
            btsVar.t(z);
            Throwable error = ((EsiaBindViewModel$State) b.getValue()).getError();
            if (error != null) {
                btsVar.e0(-2090695971);
                boolean e4 = ((i2 & 7168) != 2048 ? z : true) | btsVar.e(error);
                Object Q4 = btsVar.Q();
                if (e4 || Q4 == o430Var) {
                    Q4 = new EsiaBindScreenKt$EsiaBindScreen$4$1$1(tlsVar3, error, null);
                    btsVar.o0(Q4);
                }
                btsVar.t(z);
                zpn.e(btsVar, (wls) Q4, error);
            }
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i4 = 1;
            v2.d = new wls(i0Var, tlsVar, tlsVar2, tlsVar3, slsVar, slsVar2, i, i4) { // from class: com.yandex.passport.internal.social.esia.j
                public final /* synthetic */ int a;
                public final /* synthetic */ i0 b;
                public final /* synthetic */ tls c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ tls x;
                public final /* synthetic */ sls y;
                public final /* synthetic */ sls z;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(1);
                            m.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(1);
                            m.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void b(boolean z, String str, tls tlsVar, tls tlsVar2, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1994802167);
        int i3 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024) | (btsVar.e(slsVar) ? 16384 : 8192) | (btsVar.e(slsVar2) ? 131072 : 65536);
        if ((74899 & i3) == 74898 && btsVar.E()) {
            btsVar.Y();
        } else {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.e0(-1994135810);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (Q == o430Var) {
                oz40 j = androidx.compose.runtime.f.j("");
                btsVar.o0(j);
                obj = j;
            }
            oz40 oz40Var = (oz40) obj;
            btsVar.t(false);
            btsVar.e0(-1994132948);
            boolean k = btsVar.k(context);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                WebView webView = new WebView(context);
                i2 = 1;
                webView.setWebViewClient(new EsiaBindWebClient(z, (context.getPackageName() + ".passport").concat("://esia"), tlsVar, tlsVar2, slsVar, slsVar2));
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setDomStorageEnabled(true);
                settings.setUseWideViewPort(true);
                settings.setLoadWithOverviewMode(false);
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                btsVar.o0(webView);
                Q2 = webView;
            } else {
                i2 = 1;
            }
            WebView webView2 = (WebView) Q2;
            btsVar.t(false);
            f530 g = i9a1.g(m4m0.b(ljs0.c, ((agc) btsVar.m(dgc.a)).n, qke.q));
            btsVar.e0(-1994104062);
            boolean e = btsVar.e(webView2);
            Object Q3 = btsVar.Q();
            Object obj2 = Q3;
            if (e || Q3 == o430Var) {
                k kVar = new k(webView2, 0);
                btsVar.o0(kVar);
                obj2 = kVar;
            }
            tls tlsVar3 = (tls) obj2;
            btsVar.t(false);
            btsVar.e0(-1994092112);
            int i4 = ((i3 & 112) == 32 ? i2 : 0) | (btsVar.e(webView2) ? 1 : 0);
            Object Q4 = btsVar.Q();
            Object obj3 = Q4;
            if (i4 != 0 || Q4 == o430Var) {
                v0 v0Var = new v0(i2, str, webView2, oz40Var);
                btsVar.o0(v0Var);
                obj3 = v0Var;
            }
            btsVar.t(false);
            int i5 = i2;
            androidx.compose.ui.viewinterop.b.a(tlsVar3, g, (tls) obj3, btsVar, 0, 0);
            btsVar.e0(-1994081309);
            boolean e2 = btsVar.e(webView2);
            Object Q5 = btsVar.Q();
            Object obj4 = Q5;
            if (e2 || Q5 == o430Var) {
                k kVar2 = new k(webView2, i5);
                btsVar.o0(kVar2);
                obj4 = kVar2;
            }
            btsVar.t(false);
            zpn.a(context, (tls) obj4, btsVar);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.u(z, str, tlsVar, tlsVar2, slsVar, slsVar2, i);
        }
    }
}
