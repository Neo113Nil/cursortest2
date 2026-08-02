package com.ybsdk.feature.card.internal.samsungpay;

import android.content.Context;
import android.os.Bundle;
import com.samsung.android.sdk.samsungpay.v2.PartnerInfo;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.card.CardManager;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import com.ybsdk.rconfig.configs.SamsungPayFeature;
import defpackage.czl0;
import defpackage.dvw;
import defpackage.dzl0;
import defpackage.g8e;
import defpackage.gzl0;
import defpackage.id8;
import defpackage.if8;
import defpackage.jd8;
import defpackage.kol0;
import defpackage.ny61;
import defpackage.ov3;
import defpackage.qq7;
import defpackage.scc;
import defpackage.trp0;
import defpackage.uqp0;
import defpackage.w511;
import defpackage.wm8;
import defpackage.wwg;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class d {
    public final wm8 a;
    public final Context b;
    public final jd8 c;
    public final ov3 d;
    public com.samsung.android.sdk.samsungpay.v2.d e;
    public CardManager f;

    public d(wm8 wm8Var, Context context, jd8 jd8Var, ov3 ov3Var) {
        this.a = wm8Var;
        this.b = context;
        this.c = jd8Var;
        this.d = ov3Var;
    }

    public static void b(d dVar, String str, Integer num, Bundle bundle, Throwable th, String str2, int i) {
        Integer num2 = (i & 2) != 0 ? null : num;
        if ((i & 4) != 0) {
            bundle = null;
        }
        Throwable th2 = (i & 8) != 0 ? null : th;
        String str3 = (i & 16) != 0 ? null : str2;
        dVar.getClass();
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("errorReason")) : null;
        String string = bundle != null ? bundle.getString("errorReasonMessage") : null;
        uqp0 uqp0Var = new uqp0(str, num2, valueOf, string, th2, str3);
        qq7 qq7Var = dVar.c.a.l;
        LinkedHashMap w = g8e.w(4, "error", str);
        if (num2 != null) {
            w.put("error_code", num2);
        }
        if (valueOf != null) {
            w.put("reason_code", valueOf);
        }
        if (string != null) {
            w.put("reason_message", string);
        }
        qq7Var.a.a("card.main_screen.samsungpay.error", w);
        trp0 trp0Var = trp0.a;
        trp0.e(uqp0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r1 == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SamsungPayInteractor$initialize$1 samsungPayInteractor$initialize$1;
        int i;
        SamsungPayState.InitializationResult initializationResult;
        int i2;
        CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult cardMainScreenEvents$CardMainScreenSamsungpayInitializationResult;
        SamsungPayState.InitializationResult initializationResult2;
        CardManager cardManager;
        Object a;
        gzl0 gzl0Var;
        SamsungPayState.InitializationResult initializationResult3;
        if (continuationImpl instanceof SamsungPayInteractor$initialize$1) {
            samsungPayInteractor$initialize$1 = (SamsungPayInteractor$initialize$1) continuationImpl;
            int i3 = samsungPayInteractor$initialize$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                samsungPayInteractor$initialize$1.label = i3 - Integer.MIN_VALUE;
                Object obj = samsungPayInteractor$initialize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = samsungPayInteractor$initialize$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Bundle g = wwg.g(new Pair("PartnerServiceType", SpaySdk.ServiceType.APP2APP.toString()));
                    Map<String, String> serviceIds = ((SamsungPayFeature) ((if8) this.a).a.d(com.ybsdk.rconfig.configs.b.a).getData()).getServiceIds();
                    Context context = this.b;
                    String str = serviceIds.get(context.getPackageName());
                    if (str == null) {
                        b(this, "The package of the app isn't found in yb_samsung_pay_feature", null, null, null, context.getPackageName(), 14);
                        return new a(SamsungPayState.InitializationResult.NOT_SUPPORTED);
                    }
                    PartnerInfo partnerInfo = new PartnerInfo(str, g);
                    this.e = new com.samsung.android.sdk.samsungpay.v2.d(context, partnerInfo);
                    this.f = new CardManager(context, partnerInfo);
                    samsungPayInteractor$initialize$1.label = 1;
                    kol0 kol0Var = new kol0(dvw.b(samsungPayInteractor$initialize$1));
                    com.samsung.android.sdk.samsungpay.v2.d dVar = this.e;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.C(new c(kol0Var, this));
                    obj = kol0Var.a();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gzl0Var = (gzl0) samsungPayInteractor$initialize$1.L$1;
                            initializationResult3 = (SamsungPayState.InitializationResult) samsungPayInteractor$initialize$1.L$0;
                            kotlin.b.b(obj);
                            return new a(initializationResult3, (List) obj, gzl0Var);
                        }
                        initializationResult2 = (SamsungPayState.InitializationResult) samsungPayInteractor$initialize$1.L$0;
                        kotlin.b.b(obj);
                        gzl0 gzl0Var2 = (gzl0) obj;
                        samsungPayInteractor$initialize$1.L$0 = initializationResult2;
                        samsungPayInteractor$initialize$1.L$1 = gzl0Var2;
                        samsungPayInteractor$initialize$1.label = 3;
                        kol0 kol0Var2 = new kol0(dvw.b(samsungPayInteractor$initialize$1));
                        cardManager = this.f;
                        if (cardManager == null) {
                            cardManager = null;
                        }
                        cardManager.n(null, new czl0(kol0Var2, this));
                        a = kol0Var2.a();
                        if (a != coroutineSingletons) {
                            obj = a;
                            gzl0Var = gzl0Var2;
                            initializationResult3 = initializationResult2;
                            return new a(initializationResult3, (List) obj, gzl0Var);
                        }
                        return coroutineSingletons;
                    }
                    kotlin.b.b(obj);
                }
                initializationResult = (SamsungPayState.InitializationResult) obj;
                qq7 qq7Var = this.c.a.l;
                i2 = id8.c[initializationResult.ordinal()];
                if (i2 != 1) {
                    cardMainScreenEvents$CardMainScreenSamsungpayInitializationResult = CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult.NOT_SUPPORTED;
                } else if (i2 == 2) {
                    cardMainScreenEvents$CardMainScreenSamsungpayInitializationResult = CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult.NEED_UPDATE;
                } else if (i2 == 3) {
                    cardMainScreenEvents$CardMainScreenSamsungpayInitializationResult = CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult.NEED_ACTIVATION;
                } else {
                    if (i2 != 4) {
                        w511.b();
                        return null;
                    }
                    cardMainScreenEvents$CardMainScreenSamsungpayInitializationResult = CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult.READY;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardMainScreenEvents$CardMainScreenSamsungpayInitializationResult.getOriginalValue());
                qq7Var.a.a("card.main_screen.samsungpay.initialization", linkedHashMap);
                if (initializationResult == SamsungPayState.InitializationResult.READY) {
                    return new a(initializationResult);
                }
                samsungPayInteractor$initialize$1.L$0 = initializationResult;
                samsungPayInteractor$initialize$1.label = 2;
                kol0 kol0Var3 = new kol0(dvw.b(samsungPayInteractor$initialize$1));
                List<String> g2 = scc.g("walletDMId", "deviceId");
                com.samsung.android.sdk.samsungpay.v2.d dVar2 = this.e;
                if (dVar2 == null) {
                    dVar2 = null;
                }
                dVar2.D(g2, new dzl0(kol0Var3, this));
                Object a2 = kol0Var3.a();
                if (a2 != coroutineSingletons) {
                    initializationResult2 = initializationResult;
                    obj = a2;
                    gzl0 gzl0Var22 = (gzl0) obj;
                    samsungPayInteractor$initialize$1.L$0 = initializationResult2;
                    samsungPayInteractor$initialize$1.L$1 = gzl0Var22;
                    samsungPayInteractor$initialize$1.label = 3;
                    kol0 kol0Var22 = new kol0(dvw.b(samsungPayInteractor$initialize$1));
                    cardManager = this.f;
                    if (cardManager == null) {
                    }
                    cardManager.n(null, new czl0(kol0Var22, this));
                    a = kol0Var22.a();
                    if (a != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        samsungPayInteractor$initialize$1 = new SamsungPayInteractor$initialize$1(this, continuationImpl);
        Object obj2 = samsungPayInteractor$initialize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = samsungPayInteractor$initialize$1.label;
        if (i != 0) {
        }
        initializationResult = (SamsungPayState.InitializationResult) obj2;
        qq7 qq7Var2 = this.c.a.l;
        i2 = id8.c[initializationResult.ordinal()];
        if (i2 != 1) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, cardMainScreenEvents$CardMainScreenSamsungpayInitializationResult.getOriginalValue());
        qq7Var2.a.a("card.main_screen.samsungpay.initialization", linkedHashMap2);
        if (initializationResult == SamsungPayState.InitializationResult.READY) {
        }
    }
}
