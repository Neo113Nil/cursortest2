package com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount;

import android.app.Activity;
import android.net.Uri;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.a;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.b1;
import defpackage.due;
import defpackage.jst;
import defpackage.kve;
import defpackage.ogn;
import defpackage.oyr;
import defpackage.rve;
import defpackage.sae;
import defpackage.scc;
import defpackage.tje;
import defpackage.v4a;
import defpackage.xby;
import defpackage.yfa;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import ru.yandex.taxi.eatskit.dto.ErrorType;

/* loaded from: classes13.dex */
public final class a {
    public final Activity a;
    public final due b;
    public final kve c;
    public final rve d;
    public final sae e;

    public a(Activity activity, due dueVar, kve kveVar, rve rveVar, sae saeVar) {
        this.a = activity;
        this.b = dueVar;
        this.c = kveVar;
        this.d = rveVar;
        this.e = saeVar;
    }

    public static String a(String str, LinkedHashMap linkedHashMap) {
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        Uri.Builder clearQuery = buildUpon != null ? buildUpon.clearQuery() : null;
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str2 : kotlin.collections.a.M(queryParameterNames)) {
                String queryParameter = linkedHashMap.containsKey(str2) ? (String) linkedHashMap.get(str2) : parse.getQueryParameter(str2);
                if (clearQuery != null) {
                    clearQuery.appendQueryParameter(str2, queryParameter);
                }
                linkedHashMap.remove(str2);
            }
        }
        for (String str3 : linkedHashMap.keySet()) {
            if (clearQuery != null) {
                clearQuery.appendQueryParameter(str3, (String) linkedHashMap.get(str3));
            }
        }
        return String.valueOf(clearQuery != null ? clearQuery.build() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.Result$Failure] */
    public final boolean b(Uri uri, SharedPaymentsOpenReason sharedPaymentsOpenReason) {
        String failure;
        CorpAccountFlowExperiment.WebViewPersonalAccount webViewPersonalAccount = ((CorpAccountFlowExperiment) this.b.a.b()).h;
        String str = webViewPersonalAccount.a;
        final int i = 0;
        if (str.length() == 0) {
            return false;
        }
        String str2 = webViewPersonalAccount.h;
        if (str2.length() > 0) {
            str = a(str, b.l(new Pair(str2, sharedPaymentsOpenReason.getAnalyticsName())));
        }
        sae saeVar = this.e;
        final int i2 = 1;
        if (uri != null) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str3 : kotlin.collections.a.M(queryParameterNames)) {
                        String queryParameter = uri.getQueryParameter(str3);
                        if (queryParameter != null) {
                            linkedHashMap.put(str3, queryParameter);
                        }
                    }
                }
                failure = a(str, linkedHashMap);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                this.c.getClass();
                String th2 = a.toString();
                xby.l(jst.e, kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", th2), ":", null, null, null, 62), null, new IllegalArgumentException(), oyr.q(th2, " ", a.getMessage(), " ", a.getLocalizedMessage()), 2);
            }
            boolean z = failure instanceof Result.Failure;
            if (!z) {
                b1 b1Var = (b1) saeVar.b;
                b1Var.getClass();
                b1Var.a.a("B2BHome.WebView.MergeParamsFromDeeplinkSuccess", new HashMap(), 1, new HashMap());
            }
            if (!z) {
                str = failure;
            }
            str = str;
        }
        String str4 = str;
        yfa yfaVar = webViewPersonalAccount.f ? new yfa(this) : null;
        b1 b1Var2 = (b1) saeVar.b;
        b1Var2.getClass();
        b1Var2.a.a("B2BHome.WebView.DidStartLoading", new HashMap(), 1, new HashMap());
        final int i3 = 2;
        ogn ognVar = new ogn(new v4a(24, this), new Consumer(this) { // from class: nve
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                String str5;
                int i4 = i;
                a aVar = this.b;
                switch (i4) {
                    case 0:
                        d6j0 d6j0Var = (d6j0) obj;
                        aVar.c.getClass();
                        hst hstVar = jst.e;
                        String X = kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", "WTF", "openCorpPersonalAccountWebView"), ":", null, null, null, 62);
                        String str6 = d6j0Var != null ? d6j0Var.b : null;
                        String str7 = d6j0Var != null ? d6j0Var.c : null;
                        ErrorType errorType = d6j0Var != null ? d6j0Var.e : null;
                        Integer num = d6j0Var != null ? d6j0Var.d : null;
                        StringBuilder v = b64.v("openCorpPersonalAccountWebView ", str6, " ", str7, " ");
                        v.append(errorType);
                        v.append(" ");
                        v.append(num);
                        xby.l(hstVar, X, null, new IllegalArgumentException(), v.toString(), 2);
                        break;
                    case 1:
                        aVar.c.getClass();
                        xby.l(jst.e, kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", "failedAuthConsumer"), ":", null, null, null, 62), null, (Throwable) obj, "failedAuthConsumer", 2);
                        break;
                    default:
                        ua41 ua41Var = (ua41) obj;
                        aVar.c.getClass();
                        if (!(ua41Var instanceof u5o)) {
                            if (!jl40.l(ua41Var, ab60.a)) {
                                if (!(ua41Var instanceof io60)) {
                                    if (!(ua41Var instanceof pne)) {
                                        w511.b();
                                        break;
                                    } else {
                                        str5 = "CookiesState";
                                    }
                                } else {
                                    str5 = "OAuthState";
                                }
                            } else {
                                str5 = "openCorpPersonalNoAuthError";
                            }
                        } else {
                            str5 = "openCorpPersonalAuthError";
                        }
                        String str8 = str5;
                        xby.l(jst.e, kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", str8), ":", null, null, null, 62), null, new IllegalArgumentException(), str8, 2);
                        break;
                }
            }
        }, new Consumer(this) { // from class: nve
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                String str5;
                int i4 = i2;
                a aVar = this.b;
                switch (i4) {
                    case 0:
                        d6j0 d6j0Var = (d6j0) obj;
                        aVar.c.getClass();
                        hst hstVar = jst.e;
                        String X = kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", "WTF", "openCorpPersonalAccountWebView"), ":", null, null, null, 62);
                        String str6 = d6j0Var != null ? d6j0Var.b : null;
                        String str7 = d6j0Var != null ? d6j0Var.c : null;
                        ErrorType errorType = d6j0Var != null ? d6j0Var.e : null;
                        Integer num = d6j0Var != null ? d6j0Var.d : null;
                        StringBuilder v = b64.v("openCorpPersonalAccountWebView ", str6, " ", str7, " ");
                        v.append(errorType);
                        v.append(" ");
                        v.append(num);
                        xby.l(hstVar, X, null, new IllegalArgumentException(), v.toString(), 2);
                        break;
                    case 1:
                        aVar.c.getClass();
                        xby.l(jst.e, kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", "failedAuthConsumer"), ":", null, null, null, 62), null, (Throwable) obj, "failedAuthConsumer", 2);
                        break;
                    default:
                        ua41 ua41Var = (ua41) obj;
                        aVar.c.getClass();
                        if (!(ua41Var instanceof u5o)) {
                            if (!jl40.l(ua41Var, ab60.a)) {
                                if (!(ua41Var instanceof io60)) {
                                    if (!(ua41Var instanceof pne)) {
                                        w511.b();
                                        break;
                                    } else {
                                        str5 = "CookiesState";
                                    }
                                } else {
                                    str5 = "OAuthState";
                                }
                            } else {
                                str5 = "openCorpPersonalNoAuthError";
                            }
                        } else {
                            str5 = "openCorpPersonalAuthError";
                        }
                        String str8 = str5;
                        xby.l(jst.e, kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", str8), ":", null, null, null, 62), null, new IllegalArgumentException(), str8, 2);
                        break;
                }
            }
        }, new Consumer(this) { // from class: nve
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                String str5;
                int i4 = i3;
                a aVar = this.b;
                switch (i4) {
                    case 0:
                        d6j0 d6j0Var = (d6j0) obj;
                        aVar.c.getClass();
                        hst hstVar = jst.e;
                        String X = kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", "WTF", "openCorpPersonalAccountWebView"), ":", null, null, null, 62);
                        String str6 = d6j0Var != null ? d6j0Var.b : null;
                        String str7 = d6j0Var != null ? d6j0Var.c : null;
                        ErrorType errorType = d6j0Var != null ? d6j0Var.e : null;
                        Integer num = d6j0Var != null ? d6j0Var.d : null;
                        StringBuilder v = b64.v("openCorpPersonalAccountWebView ", str6, " ", str7, " ");
                        v.append(errorType);
                        v.append(" ");
                        v.append(num);
                        xby.l(hstVar, X, null, new IllegalArgumentException(), v.toString(), 2);
                        break;
                    case 1:
                        aVar.c.getClass();
                        xby.l(jst.e, kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", "failedAuthConsumer"), ":", null, null, null, 62), null, (Throwable) obj, "failedAuthConsumer", 2);
                        break;
                    default:
                        ua41 ua41Var = (ua41) obj;
                        aVar.c.getClass();
                        if (!(ua41Var instanceof u5o)) {
                            if (!jl40.l(ua41Var, ab60.a)) {
                                if (!(ua41Var instanceof io60)) {
                                    if (!(ua41Var instanceof pne)) {
                                        w511.b();
                                        break;
                                    } else {
                                        str5 = "CookiesState";
                                    }
                                } else {
                                    str5 = "OAuthState";
                                }
                            } else {
                                str5 = "openCorpPersonalNoAuthError";
                            }
                        } else {
                            str5 = "openCorpPersonalAuthError";
                        }
                        String str8 = str5;
                        xby.l(jst.e, kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", str8), ":", null, null, null, 62), null, new IllegalArgumentException(), str8, 2);
                        break;
                }
            }
        });
        boolean z2 = webViewPersonalAccount.b;
        String str5 = webViewPersonalAccount.d;
        String str6 = webViewPersonalAccount.e.a;
        List list = webViewPersonalAccount.g;
        rve rveVar = this.d;
        tje.N(rveVar.e, null, null, new CorpPersonalAccountWebViewRouter$showUrlWithPassport$1(rveVar, str4, ognVar, str6, yfaVar, z2, str5, list, null), 3);
        return true;
    }
}
