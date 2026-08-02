package com.ybsdk.di.modules.features;

import android.net.Uri;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechPassportAuthCookiesInjectResultResult;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechPassportAuthCookiesPrepareResultResult;
import defpackage.dsg;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.f8z0;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.gw41;
import defpackage.jqp0;
import defpackage.lrp0;
import defpackage.mqp0;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.s630;
import defpackage.trp0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x {
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public final /* synthetic */ com.ybsdk.common.repositiories.auth.f b;
    public final /* synthetic */ ppp0 c;
    public final /* synthetic */ AppAnalyticsReporter d;
    public final /* synthetic */ ppp0 e;

    public x(com.ybsdk.common.repositiories.auth.f fVar, ppp0 ppp0Var, AppAnalyticsReporter appAnalyticsReporter, ppp0 ppp0Var2) {
        this.b = fVar;
        this.c = ppp0Var;
        this.d = appAnalyticsReporter;
        this.e = ppp0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        WebViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1 webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1;
        int i;
        String str2;
        String str3;
        String str4;
        List W;
        Long l;
        Serializable d;
        if (continuationImpl instanceof WebViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1) {
            webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1 = (WebViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1) continuationImpl;
            int i2 = webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1.label = i2 - Integer.MIN_VALUE;
                WebViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1 webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12 = webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1;
                Object obj = webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String host = Uri.parse(str).getHost();
                    if (host != null) {
                        W = evu0.W(host, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
                        str2 = (String) kotlin.collections.a.b0(W);
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        x4c.g("Cannot parse tld of url", null, str, null, 10);
                    }
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.L$0 = str;
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.L$1 = str2;
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.label = 1;
                    Object a = this.b.a(webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12);
                    if (a != coroutineSingletons) {
                        str3 = str;
                        str4 = str2;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = (String) webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.L$1;
                String str5 = (String) webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.L$0;
                kotlin.b.b(obj);
                str3 = str5;
                l = (Long) obj;
                if (l != null) {
                    return new Result.Failure(new Exception("getPassportUrl error: no uid"));
                }
                long longValue = l.longValue();
                ppp0 ppp0Var = this.c;
                if (str4 == null) {
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.L$0 = null;
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.L$1 = null;
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.label = 2;
                    d = ((com.ybsdk.feature.passport.impl.a) ppp0Var).d(longValue, str3, ClearCryptoProPrefs.COUNTRY, webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12);
                    if (d != coroutineSingletons) {
                        return d;
                    }
                } else {
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.L$0 = null;
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.L$1 = null;
                    webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12.label = 3;
                    Serializable d2 = ((com.ybsdk.feature.passport.impl.a) ppp0Var).d(longValue, str3, str4, webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$12);
                    if (d2 != coroutineSingletons) {
                        return d2;
                    }
                }
                return coroutineSingletons;
            }
        }
        webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1 = new WebViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1(this, continuationImpl);
        WebViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1 webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$122 = webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1;
        Object obj2 = webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$122.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
    }

    public final void b(Object obj, String str) {
        gw41 gw41Var = this.d.v0;
        boolean z = obj instanceof Result.Failure;
        WebviewEvents$TechPassportAuthCookiesInjectResultResult webviewEvents$TechPassportAuthCookiesInjectResultResult = !z ? WebviewEvents$TechPassportAuthCookiesInjectResultResult.OK : WebviewEvents$TechPassportAuthCookiesInjectResultResult.ERROR;
        Throwable a = Result.a(obj);
        String str2 = null;
        String message = a != null ? a.getMessage() : null;
        if (message == null) {
            message = "";
        }
        Map z2 = g8e.z(str, message);
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, webviewEvents$TechPassportAuthCookiesInjectResultResult.getOriginalValue());
        linkedHashMap.put("errors", z2);
        gw41Var.a.a("tech.passport_auth_cookies_inject.result", linkedHashMap);
        if (z) {
            List singletonList = Collections.singletonList(lrp0.t);
            String o = g8e.o("domain: ", str);
            Throwable a2 = Result.a(obj);
            boolean isEmpty = singletonList.isEmpty();
            if (!isEmpty) {
                if (isEmpty) {
                    w511.b();
                    return;
                }
                str2 = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
            }
            if (a2 == null) {
                trp0 trp0Var = trp0.a;
                trp0.e(new mqp0("Passport cookie injection failed", str2, o));
            } else {
                trp0 trp0Var2 = trp0.a;
                trp0.e(new jqp0(a2, "Passport cookie injection failed", o, str2));
            }
        }
    }

    public final void c(Object obj, long j, String str) {
        gw41 gw41Var = this.d.v0;
        String valueOf = String.valueOf(e3n.e(j));
        boolean z = obj instanceof Result.Failure;
        WebviewEvents$TechPassportAuthCookiesPrepareResultResult webviewEvents$TechPassportAuthCookiesPrepareResultResult = !z ? WebviewEvents$TechPassportAuthCookiesPrepareResultResult.OK : WebviewEvents$TechPassportAuthCookiesPrepareResultResult.ERROR;
        Throwable a = Result.a(obj);
        String str2 = null;
        String message = a != null ? a.getMessage() : null;
        if (message == null) {
            message = "";
        }
        Map z2 = g8e.z(str, message);
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (valueOf != null) {
            linkedHashMap.put("duration", valueOf);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, webviewEvents$TechPassportAuthCookiesPrepareResultResult.getOriginalValue());
        linkedHashMap.put("errors", z2);
        gw41Var.a.a("tech.passport_auth_cookies_prepare.result", linkedHashMap);
        if (z) {
            List singletonList = Collections.singletonList(lrp0.t);
            String o = g8e.o("domain: ", str);
            Throwable a2 = Result.a(obj);
            boolean isEmpty = singletonList.isEmpty();
            if (!isEmpty) {
                if (isEmpty) {
                    w511.b();
                    return;
                }
                str2 = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
            }
            if (a2 == null) {
                trp0 trp0Var = trp0.a;
                trp0.e(new mqp0("Passport cookie update failed", str2, o));
            } else {
                trp0 trp0Var2 = trp0.a;
                trp0.e(new jqp0(a2, "Passport cookie update failed", o, str2));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:(1:(1:(7:13|14|15|16|17|18|19)(2:40|41))(6:42|43|44|45|46|(5:48|49|50|(5:53|16|17|18|19)|52)(2:57|58)))(7:62|63|64|65|66|67|(5:69|(2:74|(2:76|52)(3:77|46|(0)(0)))|78|79|80)(3:81|82|83))|25|26)(1:90))(3:98|(1:100)|52)|91|92|(4:94|66|67|(0)(0))|52))|102|6|7|(0)(0)|91|92|(0)|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0224, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0225, code lost:
    
        r5 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a7 A[Catch: all -> 0x0195, TryCatch #4 {all -> 0x0195, blocks: (B:16:0x018e, B:28:0x01a3, B:30:0x01a7, B:32:0x01af, B:35:0x01ce, B:37:0x01ba, B:38:0x01e3, B:39:0x01e8), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01af A[Catch: all -> 0x0195, TryCatch #4 {all -> 0x0195, blocks: (B:16:0x018e, B:28:0x01a3, B:30:0x01a7, B:32:0x01af, B:35:0x01ce, B:37:0x01ba, B:38:0x01e3, B:39:0x01e8), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #7 {all -> 0x019f, blocks: (B:46:0x0144, B:48:0x0158, B:50:0x0174, B:67:0x00fb, B:69:0x00ff, B:71:0x0105, B:74:0x010d, B:78:0x01ee, B:81:0x0213), top: B:66:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ff A[Catch: all -> 0x019f, TryCatch #7 {all -> 0x019f, blocks: (B:46:0x0144, B:48:0x0158, B:50:0x0174, B:67:0x00fb, B:69:0x00ff, B:71:0x0105, B:74:0x010d, B:78:0x01ee, B:81:0x0213), top: B:66:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213 A[Catch: all -> 0x019f, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x019f, blocks: (B:46:0x0144, B:48:0x0158, B:50:0x0174, B:67:0x00fb, B:69:0x00ff, B:71:0x0105, B:74:0x010d, B:78:0x01ee, B:81:0x0213), top: B:66:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        WebViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1 webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1;
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        ?? r5;
        com.ybsdk.common.repositiories.auth.f fVar;
        AppAnalyticsReporter appAnalyticsReporter;
        g050 g050Var;
        ppp0 ppp0Var;
        String str2;
        ppp0 ppp0Var2;
        AppAnalyticsReporter appAnalyticsReporter2;
        g050 g050Var2;
        String str3;
        Long l;
        Object l2;
        long j;
        long j2;
        Object obj4;
        Object value;
        List list;
        g050 g050Var3;
        String str4;
        Object h;
        Object obj5;
        String str5;
        String X;
        Object obj6;
        Result.Failure failure;
        Object obj7;
        g050 g050Var4;
        lrp0 lrp0Var = lrp0.t;
        if (continuationImpl instanceof WebViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1) {
            webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1 = (WebViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1) continuationImpl;
            int i2 = webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label = i2 - Integer.MIN_VALUE;
                obj = webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0 = str;
                    kotlinx.coroutines.sync.a aVar = this.a;
                    webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1 = aVar;
                    fVar = this.b;
                    webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2 = fVar;
                    appAnalyticsReporter = this.d;
                    webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3 = appAnalyticsReporter;
                    ppp0 ppp0Var3 = this.e;
                    webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$4 = ppp0Var3;
                    webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label = 1;
                    if (aVar.a(webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1) != obj2) {
                        g050Var = aVar;
                        ppp0Var = ppp0Var3;
                        str2 = str;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        ppp0 ppp0Var4 = (ppp0) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3;
                        AppAnalyticsReporter appAnalyticsReporter3 = (AppAnalyticsReporter) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2;
                        g050Var2 = (g050) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1;
                        str3 = (String) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            ppp0Var2 = ppp0Var4;
                            appAnalyticsReporter2 = appAnalyticsReporter3;
                        } catch (Throwable th) {
                            th = th;
                            obj3 = null;
                            r5 = g050Var2;
                        }
                        try {
                            l = (Long) obj;
                            if (l != null) {
                                Result.Failure failure2 = new Result.Failure(new IllegalStateException("Can't inject passport cookies, uid is null"));
                                g050Var2.d(null);
                                return failure2;
                            }
                            long longValue = l.longValue();
                            if (str3 != null && str3.length() != 0) {
                                gw41 gw41Var = appAnalyticsReporter2.v0;
                                List singletonList = Collections.singletonList(str3);
                                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                                linkedHashMap.put("domains", singletonList);
                                gw41Var.a.a("tech.passport_auth_cookies_prepare.start", linkedHashMap);
                                long a = s630.a();
                                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0 = str3;
                                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1 = g050Var2;
                                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2 = appAnalyticsReporter2;
                                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3 = ppp0Var2;
                                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.J$0 = longValue;
                                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.J$1 = a;
                                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label = 3;
                                com.ybsdk.feature.passport.impl.a aVar2 = (com.ybsdk.feature.passport.impl.a) ppp0Var2;
                                l2 = aVar2.l(longValue, str3, webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1);
                                if (l2 == obj2) {
                                    return obj2;
                                }
                                j = longValue;
                                j2 = a;
                                obj4 = aVar2;
                                Result result = new Result(l2);
                                long a2 = f8z0.a(j2);
                                value = result.getValue();
                                c(value, a2, str3);
                                if (!(value instanceof Result.Failure)) {
                                }
                            }
                            x4c.g("Can't inject passport cookies, host is null or empty", null, "host: " + str3, Collections.singletonList(lrp0Var), 2);
                            Result.Failure failure3 = new Result.Failure(new IllegalStateException("Can't inject passport cookies, host is null or empty"));
                            g050Var2.d(null);
                            return failure3;
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = g050Var2;
                            obj3 = null;
                            r5 = obj2;
                            r5.d(obj3);
                            throw th;
                        }
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str4 = (String) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3;
                        list = (List) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2;
                        g050Var3 = (g050) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1;
                        str5 = (String) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0;
                        try {
                            try {
                                kotlin.b.b(obj);
                                obj5 = ((Result) obj).getValue();
                                g050Var3 = g050Var3;
                                b(obj5, str5);
                                obj7 = zy11.a;
                                obj6 = null;
                                g050Var4 = g050Var3;
                            } catch (Throwable th3) {
                                th = th3;
                                obj3 = null;
                                r5 = g050Var3;
                            }
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof CancellationException) {
                                boolean isEmpty = list.isEmpty();
                                if (isEmpty) {
                                    X = null;
                                } else {
                                    if (isEmpty) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    X = kotlin.collections.a.X(list, "", null, null, new dsg(16), 30);
                                }
                                trp0 trp0Var = trp0.a;
                                obj6 = null;
                                trp0.e(new jqp0(e, str4, null, X));
                                failure = new Result.Failure(e);
                            } else {
                                failure = new Result.Failure(e);
                                obj6 = null;
                            }
                            obj7 = failure;
                            g050Var4 = g050Var3;
                            g050Var4.d(obj6);
                            return obj7;
                        }
                        g050Var4.d(obj6);
                        return obj7;
                    }
                    j2 = webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.J$1;
                    long j3 = webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.J$0;
                    Object obj8 = (ppp0) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3;
                    appAnalyticsReporter2 = (AppAnalyticsReporter) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2;
                    g050 g050Var5 = (g050) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1;
                    String str6 = (String) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        j = j3;
                        g050Var2 = g050Var5;
                        str3 = str6;
                        l2 = ((Result) obj).getValue();
                        obj4 = obj8;
                        Result result2 = new Result(l2);
                        long a22 = f8z0.a(j2);
                        value = result2.getValue();
                        c(value, a22, str3);
                        if (!(value instanceof Result.Failure)) {
                            g050Var2.d(null);
                            return value;
                        }
                        gw41 gw41Var2 = appAnalyticsReporter2.v0;
                        List singletonList2 = Collections.singletonList(str3);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                        linkedHashMap2.put("domains", singletonList2);
                        gw41Var2.a.a("tech.passport_auth_cookies_inject.start", linkedHashMap2);
                        List singletonList3 = Collections.singletonList(lrp0Var);
                        try {
                            webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0 = str3;
                            webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1 = g050Var2;
                            webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2 = singletonList3;
                            webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3 = "exception when cookieInject start";
                            webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label = 4;
                            h = ((com.ybsdk.feature.passport.impl.a) obj4).h(j, str3, webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1);
                        } catch (Exception e2) {
                            e = e2;
                            list = singletonList3;
                            g050Var3 = g050Var2;
                            str4 = "exception when cookieInject start";
                            if (e instanceof CancellationException) {
                            }
                            obj7 = failure;
                            g050Var4 = g050Var3;
                            g050Var4.d(obj6);
                            return obj7;
                        }
                        if (h != obj2) {
                            str4 = "exception when cookieInject start";
                            obj5 = h;
                            list = singletonList3;
                            g050Var3 = g050Var2;
                            str5 = str3;
                            b(obj5, str5);
                            obj7 = zy11.a;
                            obj6 = null;
                            g050Var4 = g050Var3;
                            g050Var4.d(obj6);
                            return obj7;
                        }
                        return obj2;
                    } catch (Throwable th4) {
                        th = th4;
                        obj3 = null;
                        r5 = g050Var5;
                    }
                    r5.d(obj3);
                    throw th;
                }
                ppp0Var = (ppp0) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$4;
                appAnalyticsReporter = (AppAnalyticsReporter) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3;
                fVar = (com.ybsdk.common.repositiories.auth.f) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2;
                g050Var = (g050) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1;
                str2 = (String) webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0;
                kotlin.b.b(obj);
                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0 = str2;
                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1 = g050Var;
                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2 = appAnalyticsReporter;
                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3 = ppp0Var;
                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$4 = null;
                webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label = 2;
                obj = fVar.a(webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1);
                if (obj != obj2) {
                    AppAnalyticsReporter appAnalyticsReporter4 = appAnalyticsReporter;
                    ppp0Var2 = ppp0Var;
                    appAnalyticsReporter2 = appAnalyticsReporter4;
                    g050Var2 = g050Var;
                    str3 = str2;
                    l = (Long) obj;
                    if (l != null) {
                    }
                }
                return obj2;
            }
        }
        webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1 = new WebViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1(this, continuationImpl);
        obj = webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label;
        if (i != 0) {
        }
        webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$0 = str2;
        webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$1 = g050Var;
        webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$2 = appAnalyticsReporter;
        webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$3 = ppp0Var;
        webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.L$4 = null;
        webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1.label = 2;
        obj = fVar.a(webViewFeatureModule$webViewAuthProviderProvider$1$warmUpCookies$1);
        if (obj != obj2) {
        }
        return obj2;
    }
}
