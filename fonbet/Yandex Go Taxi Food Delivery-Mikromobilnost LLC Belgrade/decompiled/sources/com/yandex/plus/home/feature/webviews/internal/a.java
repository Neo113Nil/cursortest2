package com.yandex.plus.home.feature.webviews.internal;

import android.net.Uri;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$NeedAuthorization$Reason;
import com.yandex.plus.webview.core.resource.WebViewNavigationReason;
import defpackage.EvgenDiagnostic$WebViewType;
import defpackage.bt80;
import defpackage.evu0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.kio;
import defpackage.pt80;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.scc;
import defpackage.skd0;
import defpackage.sls;
import defpackage.srd0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uho;
import defpackage.unr0;
import defpackage.urd0;
import defpackage.v920;
import defpackage.vzg;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;

/* loaded from: classes2.dex */
public abstract class a {
    public final String a;
    public final com.yandex.plus.home.auth.b b;
    public final kio c;
    public final com.yandex.plus.home.feature.webviews.internal.container.b d;
    public final v920 e;
    public final boolean f;
    public String g;
    public final ike h;
    public pzt0 i;
    public Boolean j;

    public a(String str, com.yandex.plus.home.auth.b bVar, kio kioVar, com.yandex.plus.home.feature.webviews.internal.container.b bVar2, v920 v920Var, boolean z, jse jseVar) {
        this.a = str;
        this.b = bVar;
        this.c = kioVar;
        this.d = bVar2;
        this.e = v920Var;
        this.f = z;
        this.g = str;
        this.h = qv10.e(jseVar);
    }

    public final void a(sls slsVar) {
        PlusLogTag plusLogTag = PlusLogTag.UI;
        skd0.b(plusLogTag, "checkAndOpenAuthCallbackUrlElse()");
        String b = b();
        if (b == null) {
            skd0.b(plusLogTag, "authCallbackUrl url is null");
            slsVar.invoke();
        } else if (!this.b.c()) {
            skd0.h(plusLogTag, "is not authorized", null);
            slsVar.invoke();
        } else {
            m(null);
            skd0.b(plusLogTag, "open callback url");
            k(b);
        }
    }

    public abstract String b();

    public abstract String c();

    public final void d(pt80 pt80Var, sls slsVar, tls tlsVar) {
        Object failure;
        String str = pt80Var.c;
        skd0.b(PlusLogTag.UI, "handleNeedAuthorizationMessage() outMessage=" + pt80Var);
        OutMessage$NeedAuthorization$Reason outMessage$NeedAuthorization$Reason = pt80Var.b;
        OutMessage$NeedAuthorization$Reason outMessage$NeedAuthorization$Reason2 = OutMessage$NeedAuthorization$Reason.EXPIRED;
        kio kioVar = this.c;
        if (outMessage$NeedAuthorization$Reason == outMessage$NeedAuthorization$Reason2) {
            uho uhoVar = kioVar.a;
            EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = kioVar.b;
            Map f = kotlin.collections.b.f();
            uhoVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("webview_type", evgenDiagnostic$WebViewType.getEventValue());
            linkedHashMap.put("additional_params", f);
            linkedHashMap.put("_meta", uho.b(new HashMap()));
            uhoVar.c("Error.WebView.Messaging.NeedAuthorization.Expired", linkedHashMap);
            i();
            return;
        }
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str2 = failure != null ? str : null;
        if (str2 != null) {
            pzt0 pzt0Var = this.i;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.i = tje.N(this.h, null, null, new PlusWebPresenterDelegate$handleNeedAuthorizationMessage$4$1(slsVar, this, tlsVar, null), 3);
            m(str2);
            return;
        }
        uho uhoVar2 = kioVar.a;
        EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType2 = kioVar.b;
        Map f2 = kotlin.collections.b.f();
        uhoVar2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("webview_type", evgenDiagnostic$WebViewType2.getEventValue());
        linkedHashMap2.put("additional_params", f2);
        linkedHashMap2.put("error_url", str);
        linkedHashMap2.put("_meta", uho.b(new HashMap()));
        uhoVar2.c("Error.WebView.Messaging.NeedAuthorization.IncorrectURL", linkedHashMap2);
    }

    public final void f(bt80 bt80Var, tls tlsVar) {
        skd0.b(PlusLogTag.UI, "handleNeedLogoutMessage() outMessage=" + bt80Var);
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.i = tje.N(this.h, null, null, new PlusWebPresenterDelegate$handleNeedLogoutMessage$2(this, bt80Var, tlsVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r3.containsAll(r6) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(urd0 urd0Var) {
        Set set;
        List W;
        List W2;
        Uri.Builder buildUpon;
        Uri.Builder clearQuery;
        Uri.Builder buildUpon2;
        Uri.Builder clearQuery2;
        skd0.e(PlusLogTag.UI, "handleUrlLoading() uri=" + urd0Var.getUri());
        if (urd0Var instanceof srd0) {
            srd0 srd0Var = (srd0) urd0Var;
            Uri uri = srd0Var.a;
            if (srd0Var.c != WebViewNavigationReason.REDIRECT) {
                Uri parse = Uri.parse(this.g);
                Set set2 = null;
                String query = uri != null ? uri.getQuery() : null;
                String query2 = parse != null ? parse.getQuery() : null;
                if (jl40.l((uri == null || (buildUpon2 = uri.buildUpon()) == null || (clearQuery2 = buildUpon2.clearQuery()) == null) ? null : clearQuery2.build(), (parse == null || (buildUpon = parse.buildUpon()) == null || (clearQuery = buildUpon.clearQuery()) == null) ? null : clearQuery.build())) {
                    if (query != null) {
                        W2 = evu0.W(query, new String[]{"&"}, (r2 & 4) != 0 ? 0 : 2);
                        set = kotlin.collections.a.N0(W2);
                    } else {
                        set = null;
                    }
                    Set set3 = EmptySet.a;
                    if (set == null) {
                        set = set3;
                    }
                    if (query2 != null) {
                        W = evu0.W(query2, new String[]{"&"}, (r2 & 4) != 0 ? 0 : 2);
                        set2 = kotlin.collections.a.N0(W);
                    }
                    if (set2 != null) {
                        set3 = set2;
                    }
                    if (set.size() == set3.size()) {
                    }
                }
                Object j = this.e.j(uri);
                if (j instanceof Result.Failure) {
                    return true;
                }
                com.yandex.plus.home.feature.webviews.internal.container.b.b(this.d, (vzg) j, true, null, null, null, null, 60);
                return true;
            }
        }
        this.g = urd0Var.getUri().toString();
        return false;
    }

    public final void h() {
        skd0.b(PlusLogTag.UI, "attachView()");
        tje.N(this.h, null, null, new PlusWebPresenterDelegate$onAttachView$1(this, null), 3);
    }

    public abstract void i();

    public abstract void j(String str, List list);

    public final void k(String str) {
        String a;
        com.yandex.plus.home.auth.b bVar = this.b;
        this.j = Boolean.valueOf(bVar.c());
        PlusLogTag plusLogTag = PlusLogTag.UI;
        StringBuilder x = unr0.x("openUrl() url=", str, " openedForAuthorizationState=");
        x.append(this.j);
        skd0.b(plusLogTag, x.toString());
        n(str);
        com.yandex.plus.home.feature.webviews.internal.network.a aVar = null;
        if (!this.f && (a = bVar.a()) != null) {
            aVar = new com.yandex.plus.home.feature.webviews.internal.network.a("OAuth ".concat(a));
        }
        j(str, scc.h(aVar));
    }

    public final void l() {
        tje.N(this.h, null, null, new PlusWebPresenterDelegate$reload$1(this, null), 3);
    }

    public abstract void m(String str);

    public abstract void n(String str);
}
