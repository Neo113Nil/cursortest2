package com.ybsdk.api;

import android.content.Context;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import com.adjust.sdk.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.ybsdk.api.entities.YBPaymentMethodProductType;
import com.ybsdk.api.entities.YBPaymentMethodType;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.entities.YBSdkTheme;
import com.ybsdk.api.exceptions.AlreadyInitializedException;
import com.ybsdk.api.exceptions.NotInitializedException;
import com.ybsdk.api.push.YbPushMessage;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.feature.deeplink.api.DeeplinkSource;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import com.ybsdk.network.dto.PaymentMethodProductType;
import com.ybsdk.rconfig.configs.QrScanningUrlWhitelistConfigSchema;
import com.ybsdk.rconfig.configs.StartSessionOnInitConfig;
import com.ybsdk.rconfig.configs.YbDeeplinkTemplateForUrl;
import com.ybsdk.rconfig.configs.YbDeeplinksForUrls;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$InternalQueryParam;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import com.ybsdk.screens.initial.deeplink.i;
import defpackage.a811;
import defpackage.ag51;
import defpackage.awa0;
import defpackage.b64;
import defpackage.bzk0;
import defpackage.c3h;
import defpackage.c4u0;
import defpackage.crp0;
import defpackage.dnp0;
import defpackage.dvc;
import defpackage.dy51;
import defpackage.ef51;
import defpackage.eg51;
import defpackage.eja1;
import defpackage.em3;
import defpackage.fcy0;
import defpackage.ff51;
import defpackage.fg51;
import defpackage.g2g0;
import defpackage.g8e;
import defpackage.gff;
import defpackage.hf51;
import defpackage.hg51;
import defpackage.hh51;
import defpackage.hj51;
import defpackage.i3y;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.jxi;
import defpackage.k2g0;
import defpackage.kg51;
import defpackage.lb7;
import defpackage.lf51;
import defpackage.lfg0;
import defpackage.mf51;
import defpackage.mg51;
import defpackage.mr51;
import defpackage.mth;
import defpackage.n4u0;
import defpackage.nf51;
import defpackage.ng51;
import defpackage.ny61;
import defpackage.ofa0;
import defpackage.og51;
import defpackage.oi51;
import defpackage.p450;
import defpackage.pg51;
import defpackage.pt41;
import defpackage.q960;
import defpackage.qoi0;
import defpackage.qpi0;
import defpackage.rf51;
import defpackage.rxg0;
import defpackage.sd90;
import defpackage.tf51;
import defpackage.th51;
import defpackage.tje;
import defpackage.top0;
import defpackage.tpr;
import defpackage.trp0;
import defpackage.tse;
import defpackage.tt51;
import defpackage.tvv;
import defpackage.uf51;
import defpackage.vez0;
import defpackage.vh51;
import defpackage.vit;
import defpackage.w42;
import defpackage.w691;
import defpackage.wf51;
import defpackage.wt51;
import defpackage.x1u0;
import defpackage.x8g;
import defpackage.xf51;
import defpackage.xui0;
import defpackage.yf51;
import defpackage.zf51;
import defpackage.zui0;
import defpackage.zva0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;

@Metadata(d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d0\u000fH\u0096@¢\u0006\u0004\b\u001e\u0010\u0012J \u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000f2\b\u0010 \u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0096@¢\u0006\u0004\b%\u0010\u0012J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001d0\u000fH\u0097@¢\u0006\u0004\b&\u0010\u0012J.\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\bH\u0096@¢\u0006\u0004\b,\u0010-J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u000fH\u0096@¢\u0006\u0004\b0\u0010\u0012J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0017¢\u0006\u0004\b\r\u00104J#\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\n0\u001dH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0017¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010\u0003J\u0017\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bK\u0010LJ\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020O0\u000f2\u0006\u0010N\u001a\u00020MH\u0096@¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010TJ\u001e\u0010X\u001a\b\u0012\u0004\u0012\u00020V0\u000f2\u0006\u0010U\u001a\u00020\bH\u0096@¢\u0006\u0004\bW\u0010#J!\u0010]\u001a\u00020F2\u0006\u0010Z\u001a\u00020Y2\b\b\u0002\u0010\\\u001a\u00020[H\u0007¢\u0006\u0004\b]\u0010^J\u0017\u0010b\u001a\u00020a2\u0006\u0010`\u001a\u00020_H\u0007¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020FH\u0002¢\u0006\u0004\bd\u0010\u0003J\u001f\u0010i\u001a\u00020F2\u0006\u0010f\u001a\u00020e2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010f\u001a\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010|\u001a\u00020y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0012\u0010\u0080\u0001\u001a\u00020}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0084\u0001\u001a\u00030\u0081\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0088\u0001\u001a\u00030\u0085\u00018F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/ybsdk/api/YBSdk;", "", "<init>", "()V", "Ln4u0;", "Lai51;", "observeStateChanges", "()Ln4u0;", "", "paymentMethodId", "Lyf51;", "trustPaymentMethodTags", "Lxf51;", "getPaymentMethodInfo", "(Ljava/lang/String;Lyf51;)Lxf51;", "Lkotlin/Result;", "Ltf51;", "updateBalance-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBalance", "Ltpr;", "Lfh51;", "observeSdkEvents", "()Ltpr;", "Lag51;", "params", "Leg51;", "getPlusShortcutData", "(Lag51;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "updateTransactions-IoAF18A", "updateTransactions", "splitInfoCountryCode", "Lzf51;", "updatePaymentMethods-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethods", "updatePaymentMethods-IoAF18A", "updatePaymentMethodsInfo-IoAF18A", "updatePaymentMethodsInfo", "Ljava/math/BigDecimal;", "amount", "currency", "Llf51;", "checkPayment-BWLJW6A", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPayment", "Lmf51;", "updateCompactHorizontalWidgetData-IoAF18A", "updateCompactHorizontalWidgetData", "Lcom/ybsdk/api/entities/YBPaymentMethodType;", "paymentMethodType", "(Ljava/lang/String;Lcom/ybsdk/api/entities/YBPaymentMethodType;)Lxf51;", "tagsOfCards", "getCardPromotions", "(Ljava/util/List;)Ljava/util/List;", "Lff51;", "getCardPromotion", "()Lff51;", "Loi51;", "createViewFactory", "()Loi51;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Lvh51;", "resolveUri", "(Landroid/net/Uri;)Lvh51;", "Lhg51;", "makeQRScanningResolver", "()Lhg51;", "Lzy11;", "onPushTokenUpdated", "Lcom/ybsdk/api/push/YbPushMessage;", "ybPushMessage", "", "handlePushMessage", "(Lcom/ybsdk/api/push/YbPushMessage;)Z", "Lcom/ybsdk/api/entities/YBProduct;", CreateApplicationWithProductJsonAdapter.productKey, "Lhf51;", "getCashbackStatus-gIAlu-s", "(Lcom/ybsdk/api/entities/YBProduct;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCashbackStatus", "getSdkVersion", "()Ljava/lang/String;", "deliveryProductType", "Lef51;", "getCardDeliveryApplicationStatus-gIAlu-s", "getCardDeliveryApplicationStatus", "Lhh51;", "initDependencies", "Lkg51;", "additionalParams", "init", "(Lhh51;Lkg51;)V", "Lpg51;", "sdkDependencies", "Lmg51;", "createSdkComponent", "(Lpg51;)Lmg51;", "checkProperInitialization", "Ldnp0;", "daggerSdkComponent", "Landroid/content/Context;", "context", "initRtm", "(Ldnp0;Landroid/content/Context;)V", "ANALYTICS_INIT", "Ljava/lang/String;", "ANALYTICS_SCREEN_FACTORY_COMPONENT_CREATION", "initLock", "Ljava/lang/Object;", "isInitialized", "Z", "_daggerSdkComponent", "Ldnp0;", "Ltt51;", "pushMessageFilter", "Ltt51;", "getDaggerSdkComponent$yb_sdk_sdkRelease", "()Ldnp0;", "Lfg51;", "getProApi", "()Lfg51;", "proApi", "Lnf51;", "getCreditLimitApi", "()Lnf51;", "creditLimitApi", "Luf51;", "getPayLaterApi", "()Luf51;", "payLaterApi", "Lrf51;", "getInternalApi", "()Lrf51;", "internalApi", "Lcom/ybsdk/api/e;", "getInteractor", "()Lcom/ybsdk/api/e;", "interactor", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YBSdk {
    private static final String ANALYTICS_INIT = "BankSdk.Init";
    private static final String ANALYTICS_SCREEN_FACTORY_COMPONENT_CREATION = "BankSdk.YBSdkComponent.Create";
    private static volatile dnp0 _daggerSdkComponent;
    private static volatile boolean isInitialized;
    public static final YBSdk INSTANCE = new YBSdk();
    private static final Object initLock = new Object();
    private static final tt51 pushMessageFilter = new tt51();

    private YBSdk() {
    }

    private final void checkProperInitialization() {
        if (isInitialized) {
            return;
        }
        String d = qoi0.a(YBSdk.class).d();
        if (d == null) {
            d = "";
        }
        throw new NotInitializedException(b64.l("call ", d, ".init() before use ", d));
    }

    public static final mg51 createSdkComponent(pg51 sdkDependencies) {
        YBSdk yBSdk = INSTANCE;
        awa0 awa0Var = (awa0) ((x8g) yBSdk.getDaggerSdkComponent$yb_sdk_sdkRelease()).w0.get();
        awa0Var.getClass();
        zva0 zva0Var = new zva0(awa0Var, ANALYTICS_SCREEN_FACTORY_COMPONENT_CREATION);
        try {
            a811 a811Var = ((og51) ((x8g) yBSdk.getDaggerSdkComponent$yb_sdk_sdkRelease()).q1.a).a;
            ng51 ng51Var = new ng51(sdkDependencies, (c4u0) a811Var.a.get(), (tvv) a811Var.b.get());
            zva0Var.a();
            return ng51Var;
        } finally {
        }
    }

    private final e getInteractor() {
        return (e) ((x8g) getDaggerSdkComponent$yb_sdk_sdkRelease()).p1.get();
    }

    public static final void init(hh51 initDependencies, kg51 additionalParams) {
        synchronized (initLock) {
            long currentTimeMillis = System.currentTimeMillis();
            if (isInitialized) {
                throw new AlreadyInitializedException();
            }
            Thread.setDefaultUncaughtExceptionHandler(new dy51(new lb7(initDependencies.a, 7), Thread.getDefaultUncaughtExceptionHandler()));
            x8g k = jx81.k(new ContextThemeWrapper(initDependencies.a, jx81.K((YBSdkTheme) initDependencies.h.getValue()).getStyleRes()), initDependencies, additionalParams);
            ((com.ybsdk.rconfig.d) k.E1.get()).a();
            INSTANCE.initRtm(k, initDependencies.a);
            vez0.f = new jb7(new g2g0(), ((com.ybsdk.feature.push.impl.a) ((wt51) k.W.get())).a);
            ((q960) k.V0.get()).getClass();
            ((hj51) k.B1.get()).getClass();
            eja1.g = new vit(15, ((pt41) k.G1.get()).a);
            com.ybsdk.rconfig.retriever.d dVar = (com.ybsdk.rconfig.retriever.d) ((xui0) k.F1.get());
            gff gffVar = dVar.a;
            tpr t = kotlinx.coroutines.flow.e.t(gffVar.c);
            tse tseVar = dVar.c;
            com.ybsdk.core.utils.ext.c.a(t, tseVar, new zui0(dVar, 0));
            com.ybsdk.core.utils.ext.c.a(new mth(gffVar.e, 15), tseVar, new zui0(dVar, 1));
            com.ybsdk.core.utils.ext.a.g(initDependencies.a);
            _daggerSdkComponent = k;
            isInitialized = true;
            ((awa0) k.w0.get()).a(System.currentTimeMillis() - currentTimeMillis, ANALYTICS_INIT);
        }
    }

    public static /* synthetic */ void init$default(hh51 hh51Var, kg51 kg51Var, int i, Object obj) {
        if ((i & 2) != 0) {
            kg51Var = new kg51(0);
        }
        init(hh51Var, kg51Var);
    }

    private final void initRtm(dnp0 daggerSdkComponent, Context context) {
        String str;
        String str2;
        trp0 trp0Var = trp0.a;
        x8g x8gVar = (x8g) daggerSdkComponent;
        com.ybsdk.rconfig.b bVar = (com.ybsdk.rconfig.b) x8gVar.A.get();
        qpi0 qpi0Var = (qpi0) x8gVar.S0.get();
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) x8gVar.q.get();
        try {
            str = context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0)).toString();
        } catch (Throwable unused) {
            str = null;
        }
        try {
            String str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str3 == null) {
                str3 = "";
            }
            str2 = str3;
        } catch (Throwable unused2) {
            str2 = null;
        }
        trp0.b = new ofa0(bVar, qpi0Var, appAnalyticsReporter, str, str2, (w42) x8gVar.D1.get());
        trp0.c = str != null ? str2 == null ? str : g8e.p(str, " v", str2) : null;
        Iterator it = trp0.i.iterator();
        while (it.hasNext()) {
            trp0.e((crp0) it.next());
        }
        trp0.i.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: checkPayment-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m344checkPaymentBWLJW6A(String str, BigDecimal bigDecimal, String str2, Continuation<? super Result<lf51>> continuation) {
        YBSdk$checkPayment$1 yBSdk$checkPayment$1;
        int i;
        if (continuation instanceof YBSdk$checkPayment$1) {
            yBSdk$checkPayment$1 = (YBSdk$checkPayment$1) continuation;
            int i2 = yBSdk$checkPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$checkPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$checkPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$checkPayment$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$checkPayment$1.label = 1;
                Object a = interactor.a(str, bigDecimal, str2, yBSdk$checkPayment$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        yBSdk$checkPayment$1 = new YBSdk$checkPayment$1(this, continuation);
        Object obj2 = yBSdk$checkPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$checkPayment$1.label;
        if (i == 0) {
        }
    }

    public oi51 createViewFactory() {
        return (oi51) getInteractor().l.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getCardDeliveryApplicationStatus-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m345getCardDeliveryApplicationStatusgIAlus(String str, Continuation<? super Result<ef51>> continuation) {
        YBSdk$getCardDeliveryApplicationStatus$1 yBSdk$getCardDeliveryApplicationStatus$1;
        int i;
        if (continuation instanceof YBSdk$getCardDeliveryApplicationStatus$1) {
            yBSdk$getCardDeliveryApplicationStatus$1 = (YBSdk$getCardDeliveryApplicationStatus$1) continuation;
            int i2 = yBSdk$getCardDeliveryApplicationStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$getCardDeliveryApplicationStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$getCardDeliveryApplicationStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$getCardDeliveryApplicationStatus$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$getCardDeliveryApplicationStatus$1.label = 1;
                Object b = interactor.b(str, yBSdk$getCardDeliveryApplicationStatus$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        yBSdk$getCardDeliveryApplicationStatus$1 = new YBSdk$getCardDeliveryApplicationStatus$1(this, continuation);
        Object obj2 = yBSdk$getCardDeliveryApplicationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$getCardDeliveryApplicationStatus$1.label;
        if (i == 0) {
        }
    }

    @jxi
    public ff51 getCardPromotion() {
        e interactor = getInteractor();
        interactor.f.W.a.a("public_api.card_promotion.requested", null);
        com.ybsdk.common.repositiories.payment.b bVar = (com.ybsdk.common.repositiories.payment.b) interactor.d;
        return new ff51((String) bVar.l.getValue(), (String) bVar.m.getValue(), ((dvc) bVar.u.getValue()).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List, java.util.List<xf51>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    public List<xf51> getCardPromotions(List<yf51> tagsOfCards) {
        ?? r2;
        com.ybsdk.common.repositiories.payment.b bVar = (com.ybsdk.common.repositiories.payment.b) getInteractor().d;
        List list = (List) bVar.i.getValue();
        if (list != null) {
            r2 = new ArrayList();
            for (Object obj : list) {
                if (((xf51) obj).b.length() == 0) {
                    r2.add(obj);
                }
            }
        } else {
            List<yf51> list2 = tagsOfCards;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((yf51) it.next()).a().contains("YANDEX_BANK_PLUS_CARD")) {
                        r2 = EmptyList.a;
                        break;
                    }
                }
            }
            YBPaymentMethodType yBPaymentMethodType = YBPaymentMethodType.WALLET;
            String str = (String) bVar.l.getValue();
            String str2 = (String) bVar.m.getValue();
            dvc dvcVar = (dvc) bVar.u.getValue();
            PaymentMethodProductType paymentMethodProductType = PaymentMethodProductType.WALLET;
            i3y i3yVar = bVar.o;
            r2 = Collections.singletonList(new xf51(yBPaymentMethodType, "", str, str2, dvcVar, null, new wf51((String) i3yVar.getValue(), (String) i3yVar.getValue(), th51.a, null), YBPaymentMethodProductType.WALLET, null, null));
        }
        em3 em3Var = bVar.d.W;
        boolean z = list != null;
        int size = r2.size();
        String obj2 = tagsOfCards.toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("response from network", Boolean.valueOf(z));
        linkedHashMap.put("promosCount", Integer.valueOf(size));
        linkedHashMap.put("trustTagsList", obj2);
        em3Var.a.a("public_api.cards_promotion.requested", linkedHashMap);
        return r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getCashbackStatus-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m346getCashbackStatusgIAlus(YBProduct yBProduct, Continuation<? super Result<hf51>> continuation) {
        YBSdk$getCashbackStatus$1 yBSdk$getCashbackStatus$1;
        int i;
        if (continuation instanceof YBSdk$getCashbackStatus$1) {
            yBSdk$getCashbackStatus$1 = (YBSdk$getCashbackStatus$1) continuation;
            int i2 = yBSdk$getCashbackStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$getCashbackStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$getCashbackStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$getCashbackStatus$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$getCashbackStatus$1.label = 1;
                Object c = interactor.c(yBProduct, yBSdk$getCashbackStatus$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        yBSdk$getCashbackStatus$1 = new YBSdk$getCashbackStatus$1(this, continuation);
        Object obj2 = yBSdk$getCashbackStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$getCashbackStatus$1.label;
        if (i == 0) {
        }
    }

    public final nf51 getCreditLimitApi() {
        checkProperInitialization();
        return (nf51) ((x8g) getDaggerSdkComponent$yb_sdk_sdkRelease()).a1.get();
    }

    public final dnp0 getDaggerSdkComponent$yb_sdk_sdkRelease() {
        checkProperInitialization();
        dnp0 dnp0Var = _daggerSdkComponent;
        if (dnp0Var == null) {
            return null;
        }
        return dnp0Var;
    }

    public final rf51 getInternalApi() {
        checkProperInitialization();
        return (rf51) ((x8g) getDaggerSdkComponent$yb_sdk_sdkRelease()).L1.get();
    }

    public final uf51 getPayLaterApi() {
        checkProperInitialization();
        return (uf51) ((x8g) getDaggerSdkComponent$yb_sdk_sdkRelease()).A1.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xf51 getPaymentMethodInfo(String paymentMethodId, yf51 trustPaymentMethodTags) {
        com.ybsdk.common.repositiories.payment.b bVar = (com.ybsdk.common.repositiories.payment.b) getInteractor().d;
        List list = (List) bVar.i.getValue();
        xf51 xf51Var = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((xf51) next).b.equals(paymentMethodId)) {
                    xf51Var = next;
                    break;
                }
            }
            xf51Var = xf51Var;
        }
        em3 em3Var = bVar.d.W;
        boolean z = xf51Var != null;
        String obj = trustPaymentMethodTags.a().toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("is payment method found", Boolean.valueOf(z));
        linkedHashMap.put("trustTags", obj);
        linkedHashMap.put("paymentMethodId", paymentMethodId);
        em3Var.a.a("public_api.payment_method_info2.requested", linkedHashMap);
        if (xf51Var != null) {
            return xf51Var;
        }
        if (trustPaymentMethodTags.a().contains("YANDEX_BANK_PRO_CARD")) {
            return new xf51(YBPaymentMethodType.WALLET, paymentMethodId, (String) bVar.q.getValue(), bVar.r, (dvc) bVar.v.getValue(), null, null, YBPaymentMethodProductType.PRO, null, null);
        }
        if (!trustPaymentMethodTags.a().contains("YANDEX_BANK_PLUS_CARD") && trustPaymentMethodTags.a().contains("YANDEX_BANK_CREDIT_LIMIT_CARD")) {
            return new xf51(YBPaymentMethodType.WALLET, paymentMethodId, (String) bVar.s.getValue(), (String) bVar.t.getValue(), (dvc) bVar.w.getValue(), null, null, YBPaymentMethodProductType.CREDIT_LIMIT, null, null);
        }
        return bVar.a(paymentMethodId);
    }

    public Object getPlusShortcutData(ag51 ag51Var, Continuation<? super eg51> continuation) {
        return getInteractor().d(ag51Var, continuation);
    }

    public final fg51 getProApi() {
        checkProperInitialization();
        return (fg51) ((x8g) getDaggerSdkComponent$yb_sdk_sdkRelease()).y1.get();
    }

    public String getSdkVersion() {
        getInteractor().getClass();
        return "0.233.1";
    }

    public boolean handlePushMessage(YbPushMessage ybPushMessage) {
        pushMessageFilter.getClass();
        k2g0 k2g0Var = new k2g0(ybPushMessage.getData());
        if (!k2g0Var.m() || k2g0Var.f() == null || !k2g0Var.l()) {
            String c = new k2g0(ybPushMessage.getData()).c();
            Uri parse = c != null ? Uri.parse(c) : null;
            if (parse == null) {
                return false;
            }
            if (!c3h.k(parse) && !c3h.j(parse)) {
                return false;
            }
        }
        return ((com.ybsdk.feature.push.impl.a) getInteractor().j).e(ybPushMessage.getData());
    }

    public hg51 makeQRScanningResolver() {
        top0 top0Var = getInteractor().q;
        return new com.ybsdk.api.qr.internal.a(top0Var.a, top0Var.b, top0Var.c, top0Var.d, top0Var.e);
    }

    public tpr observeSdkEvents() {
        e interactor = getInteractor();
        return new k(new t0(interactor.t, new PublicApiInteractor$observeSdkEvents$1(interactor, null)), new PublicApiInteractor$observeSdkEvents$2(interactor, null));
    }

    public n4u0 observeStateChanges() {
        e interactor = getInteractor();
        if (((StartSessionOnInitConfig) interactor.o.a.d(x1u0.a).getData()).isCallFromObserveStateChangesEnabled()) {
            tje.N(interactor.a, null, null, new PublicApiInteractor$observeStateChanges$1(interactor, null), 3);
        }
        return interactor.s;
    }

    public void onPushTokenUpdated() {
        e interactor = getInteractor();
        tje.N(interactor.a, null, null, new PublicApiInteractor$onPushTokenUpdated$1(interactor, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh51 resolveUri(Uri uri) {
        Deeplink deeplink;
        Object obj;
        Uri parse;
        if (c3h.j(uri)) {
            e interactor = getInteractor();
            interactor.getClass();
            Uri h = bzk0.h(uri, SdkUri$InternalQueryParam.CALL_SOURCE, DeeplinkSource.PUBLIC_API);
            if (jl40.l(uri.getScheme(), "http") || jl40.l(uri.getScheme(), Constants.SCHEME)) {
                fcy0 fcy0Var = interactor.f.m0;
                String host = uri.getHost();
                String scheme = uri.getScheme();
                String uri2 = uri.toString();
                LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                if (host != null) {
                    linkedHashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, host);
                }
                if (scheme != null) {
                    linkedHashMap.put("sheme", scheme);
                }
                linkedHashMap.put("url", uri2);
                fcy0Var.a.a("tech.resolve_uri_http_scheme", linkedHashMap);
            }
            i iVar = interactor.m;
            String uri3 = h.toString();
            p450 p450Var = iVar.d;
            com.ybsdk.rconfig.b bVar = p450Var.a;
            bVar.getClass();
            QrScanningUrlWhitelistConfigSchema qrScanningUrlWhitelistConfigSchema = (QrScanningUrlWhitelistConfigSchema) bVar.d(lfg0.a).getData();
            ArrayList m0 = kotlin.collections.a.m0(qrScanningUrlWhitelistConfigSchema.getAllowedToOpenWithoutLandingUrlRegexes(), qrScanningUrlWhitelistConfigSchema.getAllowedToOpenUrlRegexes());
            if (!m0.isEmpty()) {
                Iterator it = m0.iterator();
                while (it.hasNext()) {
                    if (p450Var.b.a((String) it.next()).h(uri3)) {
                        qpi0 qpi0Var = iVar.b;
                        com.ybsdk.rconfig.b bVar2 = iVar.a;
                        bVar2.getClass();
                        Iterator<T> it2 = ((YbDeeplinksForUrls) bVar2.d(mr51.a).getData()).getItems().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            YbDeeplinkTemplateForUrl ybDeeplinkTemplateForUrl = (YbDeeplinkTemplateForUrl) obj;
                            boolean h2 = qpi0Var.a(ybDeeplinkTemplateForUrl.getRegex()).h(uri3);
                            boolean h3 = ybDeeplinkTemplateForUrl.getOriginRegex() != null ? qpi0Var.a(ybDeeplinkTemplateForUrl.getOriginRegex()).h("PUBLIC_API") : true;
                            if (h2 && h3) {
                                break;
                            }
                        }
                        YbDeeplinkTemplateForUrl ybDeeplinkTemplateForUrl2 = (YbDeeplinkTemplateForUrl) obj;
                        String deeplinkTemplate = ybDeeplinkTemplateForUrl2 != null ? ybDeeplinkTemplateForUrl2.getDeeplinkTemplate() : null;
                        Uri i = (deeplinkTemplate == null || (parse = Uri.parse(deeplinkTemplate)) == null) ? null : sd90.i(parse, kotlin.collections.b.i(new Pair(SdkUri$QueryParam.URL.getParamValue(), uri3), new Pair(SdkUri$QueryParam.AGREEMENT_ID.getParamValue(), null), new Pair(SdkUri$QueryParam.AUTOPAYMENT_ID.getParamValue(), null)));
                        if (i == null || (deeplink = w691.e(iVar.c, i, false, null, false, 4)) == null) {
                            deeplink = com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.WebView(uri3, false, WebViewScreenParams.Auth.YANDEX, new WebViewAppearanceOption.ShowToolbar(new WebViewControl(WebViewControl.Type.ARROW, null, 2, null), false, null, null, 14, null), null, Boolean.TRUE), DeeplinkNavigation.Add.INSTANCE);
                        }
                        if (deeplink == null) {
                            deeplink = w691.e(interactor.i, h, false, null, false, 12);
                        }
                        if (deeplink != null) {
                            return new YBSdkScreenIntent$Deeplink(deeplink);
                        }
                    }
                }
            }
            deeplink = null;
            if (deeplink == null) {
            }
            if (deeplink != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: updateBalance-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m347updateBalanceIoAF18A(Continuation<? super Result<tf51>> continuation) {
        YBSdk$updateBalance$1 yBSdk$updateBalance$1;
        int i;
        if (continuation instanceof YBSdk$updateBalance$1) {
            yBSdk$updateBalance$1 = (YBSdk$updateBalance$1) continuation;
            int i2 = yBSdk$updateBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$updateBalance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$updateBalance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$updateBalance$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$updateBalance$1.label = 1;
                Object g = interactor.g(yBSdk$updateBalance$1);
                return g == coroutineSingletons ? coroutineSingletons : g;
            }
        }
        yBSdk$updateBalance$1 = new YBSdk$updateBalance$1(this, continuation);
        Object obj2 = yBSdk$updateBalance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$updateBalance$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: updateCompactHorizontalWidgetData-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m348updateCompactHorizontalWidgetDataIoAF18A(Continuation<? super Result<mf51>> continuation) {
        YBSdk$updateCompactHorizontalWidgetData$1 yBSdk$updateCompactHorizontalWidgetData$1;
        int i;
        if (continuation instanceof YBSdk$updateCompactHorizontalWidgetData$1) {
            yBSdk$updateCompactHorizontalWidgetData$1 = (YBSdk$updateCompactHorizontalWidgetData$1) continuation;
            int i2 = yBSdk$updateCompactHorizontalWidgetData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$updateCompactHorizontalWidgetData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$updateCompactHorizontalWidgetData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$updateCompactHorizontalWidgetData$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$updateCompactHorizontalWidgetData$1.label = 1;
                Object h = interactor.h(yBSdk$updateCompactHorizontalWidgetData$1);
                return h == coroutineSingletons ? coroutineSingletons : h;
            }
        }
        yBSdk$updateCompactHorizontalWidgetData$1 = new YBSdk$updateCompactHorizontalWidgetData$1(this, continuation);
        Object obj2 = yBSdk$updateCompactHorizontalWidgetData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$updateCompactHorizontalWidgetData$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: updatePaymentMethods-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m349updatePaymentMethodsIoAF18A(Continuation<? super Result<zf51>> continuation) {
        YBSdk$updatePaymentMethods$2 yBSdk$updatePaymentMethods$2;
        int i;
        if (continuation instanceof YBSdk$updatePaymentMethods$2) {
            yBSdk$updatePaymentMethods$2 = (YBSdk$updatePaymentMethods$2) continuation;
            int i2 = yBSdk$updatePaymentMethods$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$updatePaymentMethods$2.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$updatePaymentMethods$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$updatePaymentMethods$2.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$updatePaymentMethods$2.label = 1;
                Object i3 = interactor.i(yBSdk$updatePaymentMethods$2);
                return i3 == coroutineSingletons ? coroutineSingletons : i3;
            }
        }
        yBSdk$updatePaymentMethods$2 = new YBSdk$updatePaymentMethods$2(this, continuation);
        Object obj2 = yBSdk$updatePaymentMethods$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$updatePaymentMethods$2.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: updatePaymentMethods-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m350updatePaymentMethodsgIAlus(String str, Continuation<? super Result<zf51>> continuation) {
        YBSdk$updatePaymentMethods$1 yBSdk$updatePaymentMethods$1;
        int i;
        if (continuation instanceof YBSdk$updatePaymentMethods$1) {
            yBSdk$updatePaymentMethods$1 = (YBSdk$updatePaymentMethods$1) continuation;
            int i2 = yBSdk$updatePaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$updatePaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$updatePaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$updatePaymentMethods$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$updatePaymentMethods$1.label = 1;
                Object j = interactor.j(str, yBSdk$updatePaymentMethods$1);
                return j == coroutineSingletons ? coroutineSingletons : j;
            }
        }
        yBSdk$updatePaymentMethods$1 = new YBSdk$updatePaymentMethods$1(this, continuation);
        Object obj2 = yBSdk$updatePaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$updatePaymentMethods$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @jxi
    /* renamed from: updatePaymentMethodsInfo-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m351updatePaymentMethodsInfoIoAF18A(Continuation<? super Result<? extends List<xf51>>> continuation) {
        YBSdk$updatePaymentMethodsInfo$1 yBSdk$updatePaymentMethodsInfo$1;
        int i;
        if (continuation instanceof YBSdk$updatePaymentMethodsInfo$1) {
            yBSdk$updatePaymentMethodsInfo$1 = (YBSdk$updatePaymentMethodsInfo$1) continuation;
            int i2 = yBSdk$updatePaymentMethodsInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$updatePaymentMethodsInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$updatePaymentMethodsInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$updatePaymentMethodsInfo$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$updatePaymentMethodsInfo$1.label = 1;
                Object k = interactor.k(yBSdk$updatePaymentMethodsInfo$1);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }
        yBSdk$updatePaymentMethodsInfo$1 = new YBSdk$updatePaymentMethodsInfo$1(this, continuation);
        Object obj2 = yBSdk$updatePaymentMethodsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$updatePaymentMethodsInfo$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: updateTransactions-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m352updateTransactionsIoAF18A(Continuation<? super Result<? extends List<Object>>> continuation) {
        YBSdk$updateTransactions$1 yBSdk$updateTransactions$1;
        int i;
        if (continuation instanceof YBSdk$updateTransactions$1) {
            yBSdk$updateTransactions$1 = (YBSdk$updateTransactions$1) continuation;
            int i2 = yBSdk$updateTransactions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBSdk$updateTransactions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBSdk$updateTransactions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBSdk$updateTransactions$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e interactor = getInteractor();
                yBSdk$updateTransactions$1.label = 1;
                interactor.f.W.a.a("public_api.transactions_update.initiated", null);
                EmptyList emptyList = EmptyList.a;
                return emptyList == coroutineSingletons ? coroutineSingletons : emptyList;
            }
        }
        yBSdk$updateTransactions$1 = new YBSdk$updateTransactions$1(this, continuation);
        Object obj2 = yBSdk$updateTransactions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBSdk$updateTransactions$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jxi
    public xf51 getPaymentMethodInfo(String paymentMethodId, YBPaymentMethodType paymentMethodType) {
        String str;
        com.ybsdk.common.repositiories.payment.b bVar = (com.ybsdk.common.repositiories.payment.b) getInteractor().d;
        List list = (List) bVar.i.getValue();
        xf51 xf51Var = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = paymentMethodId;
                    break;
                }
                Object next = it.next();
                str = paymentMethodId;
                if (((xf51) next).b.equals(str)) {
                    xf51Var = next;
                    break;
                }
            }
            xf51Var = xf51Var;
        } else {
            str = paymentMethodId;
        }
        em3 em3Var = bVar.d.W;
        boolean z = xf51Var != null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("is payment method found", Boolean.valueOf(z));
        em3Var.a.a("public_api.payment_method_info.requested", linkedHashMap);
        return xf51Var == null ? new xf51(YBPaymentMethodType.WALLET, str, (String) bVar.l.getValue(), (String) bVar.p.getValue(), new dvc(bVar.a, rxg0.ybsdk_ic_yandex_wallet), null, null, YBPaymentMethodProductType.WALLET, null, null) : xf51Var;
    }
}
