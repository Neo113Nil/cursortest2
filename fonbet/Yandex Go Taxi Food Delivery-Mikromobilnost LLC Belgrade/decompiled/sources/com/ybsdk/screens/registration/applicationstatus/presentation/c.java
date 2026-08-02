package com.ybsdk.screens.registration.applicationstatus.presentation;

import android.content.Context;
import android.net.Uri;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.navigation.InternalScreenIntent;
import com.ybsdk.rconfig.YbSupportConfig;
import com.ybsdk.screens.initial.deeplink.PendingDeeplinkListConfig$DefaultScreenBehavior;
import defpackage.a03;
import defpackage.a3h;
import defpackage.ab1;
import defpackage.aqi0;
import defpackage.asa0;
import defpackage.cri0;
import defpackage.dqi0;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.fqi0;
import defpackage.h791;
import defpackage.iqi0;
import defpackage.j3h;
import defpackage.lqi0;
import defpackage.mqi0;
import defpackage.np41;
import defpackage.nqi0;
import defpackage.nvd;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.sls;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.u0e0;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.v0e0;
import defpackage.v5c0;
import defpackage.w691;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xra0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class c extends uc5 {
    public final RegistrationApplicationStatusScreenParams B;
    public final com.ybsdk.screens.registration.domain.interactors.a C;
    public final com.ybsdk.rconfig.b D;
    public final tfl0 E;
    public final AppAnalyticsReporter F;
    public final np41 G;
    public final nvd H;
    public final xra0 I;
    public final j3h J;
    public final ab1 K;
    public final com.ybsdk.screens.initial.a L;
    public final v5c0 M;
    public final a3h N;
    public final Context O;

    public c(RegistrationApplicationStatusScreenParams registrationApplicationStatusScreenParams, com.ybsdk.screens.registration.domain.interactors.a aVar, com.ybsdk.rconfig.b bVar, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, np41 np41Var, nvd nvdVar, iqi0 iqi0Var, xra0 xra0Var, j3h j3hVar, ab1 ab1Var, com.ybsdk.screens.initial.a aVar2, v5c0 v5c0Var, a3h a3hVar, Context context) {
        super(new lqi0(0), iqi0Var);
        this.B = registrationApplicationStatusScreenParams;
        this.C = aVar;
        this.D = bVar;
        this.E = tfl0Var;
        this.F = appAnalyticsReporter;
        this.G = np41Var;
        this.H = nvdVar;
        this.I = xra0Var;
        this.J = j3hVar;
        this.K = ab1Var;
        this.L = aVar2;
        this.M = v5c0Var;
        this.N = a3hVar;
        this.O = context;
        tje.N(ds31.a(this), null, null, new RegistrationApplicationStatusViewModel$loadData$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(c cVar, String str, String str2, ContinuationImpl continuationImpl) {
        RegistrationApplicationStatusViewModel$getRegistrationNext$1 registrationApplicationStatusViewModel$getRegistrationNext$1;
        int i;
        Object a;
        String str3;
        String str4;
        Uri parsedUri;
        Throwable a2;
        r0 r0Var;
        Object value;
        cVar.getClass();
        if (continuationImpl instanceof RegistrationApplicationStatusViewModel$getRegistrationNext$1) {
            registrationApplicationStatusViewModel$getRegistrationNext$1 = (RegistrationApplicationStatusViewModel$getRegistrationNext$1) continuationImpl;
            int i2 = registrationApplicationStatusViewModel$getRegistrationNext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationApplicationStatusViewModel$getRegistrationNext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registrationApplicationStatusViewModel$getRegistrationNext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationApplicationStatusViewModel$getRegistrationNext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.screens.registration.domain.interactors.a aVar = cVar.C;
                    String registrationAction = cVar.B.getRegistrationAction();
                    Deeplink deeplink = ((InternalScreenIntent) cVar.M.b).getDeeplink();
                    String uri = (deeplink == null || (parsedUri = deeplink.getParsedUri()) == null) ? null : parsedUri.toString();
                    registrationApplicationStatusViewModel$getRegistrationNext$1.L$0 = str;
                    registrationApplicationStatusViewModel$getRegistrationNext$1.L$1 = str2;
                    registrationApplicationStatusViewModel$getRegistrationNext$1.label = 1;
                    a = aVar.a(registrationAction, uri, str, registrationApplicationStatusViewModel$getRegistrationNext$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str;
                    str4 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = (String) registrationApplicationStatusViewModel$getRegistrationNext$1.L$1;
                    String str6 = (String) registrationApplicationStatusViewModel$getRegistrationNext$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                    str4 = str5;
                    str3 = str6;
                }
                if (!(a instanceof Result.Failure)) {
                    List list = ((cri0) a).a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Deeplink e = w691.e(cVar.N, Uri.parse((String) it.next()), true, null, false, 12);
                        if (e != null) {
                            arrayList.add(e);
                        }
                    }
                    xra0 xra0Var = cVar.I;
                    PendingDeeplinkListConfig$DefaultScreenBehavior pendingDeeplinkListConfig$DefaultScreenBehavior = PendingDeeplinkListConfig$DefaultScreenBehavior.INCLUDE;
                    xra0Var.getClass();
                    xra0Var.b = new asa0(arrayList, pendingDeeplinkListConfig$DefaultScreenBehavior);
                    cVar.E.j(com.ybsdk.screens.initial.a.c(cVar.L));
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    x4c.g("Exception while getRegistrationNext() in RegistrationApplicationStatusViewModel", a2, null, null, 12);
                    pz40 Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new aqi0(a2, str4, cVar.B.getProduct(), cVar.e0(null), str3)));
                }
                return zy11.a;
            }
        }
        registrationApplicationStatusViewModel$getRegistrationNext$1 = new RegistrationApplicationStatusViewModel$getRegistrationNext$1(cVar, continuationImpl);
        Object obj2 = registrationApplicationStatusViewModel$getRegistrationNext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationApplicationStatusViewModel$getRegistrationNext$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(YBProduct yBProduct, c cVar, Map map, ContinuationImpl continuationImpl) {
        RegistrationApplicationStatusViewModel$openProduct$1 registrationApplicationStatusViewModel$openProduct$1;
        int i;
        r0 r0Var;
        Object value;
        Object b;
        YBProduct yBProduct2;
        Object obj;
        Throwable a;
        r0 r0Var2;
        Object value2;
        cVar.getClass();
        if (continuationImpl instanceof RegistrationApplicationStatusViewModel$openProduct$1) {
            registrationApplicationStatusViewModel$openProduct$1 = (RegistrationApplicationStatusViewModel$openProduct$1) continuationImpl;
            int i2 = registrationApplicationStatusViewModel$openProduct$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationApplicationStatusViewModel$openProduct$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = registrationApplicationStatusViewModel$openProduct$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationApplicationStatusViewModel$openProduct$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pz40 Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new fqi0(unr0.h(Text.Companion, dzh0.ybsdk_authorization_open_product_status_in_progress), i3)));
                    com.ybsdk.screens.registration.domain.interactors.a aVar = cVar.C;
                    registrationApplicationStatusViewModel$openProduct$1.L$0 = yBProduct;
                    registrationApplicationStatusViewModel$openProduct$1.L$1 = map;
                    registrationApplicationStatusViewModel$openProduct$1.label = 1;
                    b = aVar.b(yBProduct, cVar, map, registrationApplicationStatusViewModel$openProduct$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = registrationApplicationStatusViewModel$openProduct$1.L$2;
                        map = (Map) registrationApplicationStatusViewModel$openProduct$1.L$1;
                        yBProduct2 = (YBProduct) registrationApplicationStatusViewModel$openProduct$1.L$0;
                        kotlin.b.b(obj2);
                        b = obj;
                        yBProduct = yBProduct2;
                        a = Result.a(b);
                        if (a != null) {
                            x4c.g("Exception while openProduct() in RegistrationApplicationStatusViewModel", a, null, null, 12);
                            pz40 Y2 = cVar.Y();
                            do {
                                r0Var2 = (r0) Y2;
                                value2 = r0Var2.getValue();
                            } while (!r0Var2.k(value2, new dqi0(yBProduct, cVar.e0(null), a, map)));
                        }
                        return zy11.a;
                    }
                    map = (Map) registrationApplicationStatusViewModel$openProduct$1.L$1;
                    yBProduct = (YBProduct) registrationApplicationStatusViewModel$openProduct$1.L$0;
                    kotlin.b.b(obj2);
                    b = ((Result) obj2).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    b = ((a03) b).a;
                }
                if (!(b instanceof Result.Failure)) {
                    registrationApplicationStatusViewModel$openProduct$1.L$0 = yBProduct;
                    registrationApplicationStatusViewModel$openProduct$1.L$1 = map;
                    registrationApplicationStatusViewModel$openProduct$1.L$2 = b;
                    registrationApplicationStatusViewModel$openProduct$1.label = 2;
                    if (cVar.g0((String) b, registrationApplicationStatusViewModel$openProduct$1) != obj3) {
                        yBProduct2 = yBProduct;
                        obj = b;
                        b = obj;
                        yBProduct = yBProduct2;
                    }
                    return obj3;
                }
                a = Result.a(b);
                if (a != null) {
                }
                return zy11.a;
            }
        }
        registrationApplicationStatusViewModel$openProduct$1 = new RegistrationApplicationStatusViewModel$openProduct$1(cVar, continuationImpl);
        Object obj22 = registrationApplicationStatusViewModel$openProduct$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationApplicationStatusViewModel$openProduct$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        if (r14.h0((defpackage.tpr) r2, r12, r3, r4, r5, r6, r7) != r8) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(c cVar, String str, ContinuationImpl continuationImpl) {
        RegistrationApplicationStatusViewModel$pollRegistrationStatus$1 registrationApplicationStatusViewModel$pollRegistrationStatus$1;
        int i;
        r0 r0Var;
        Object value;
        String str2;
        cVar.getClass();
        if (continuationImpl instanceof RegistrationApplicationStatusViewModel$pollRegistrationStatus$1) {
            registrationApplicationStatusViewModel$pollRegistrationStatus$1 = (RegistrationApplicationStatusViewModel$pollRegistrationStatus$1) continuationImpl;
            int i2 = registrationApplicationStatusViewModel$pollRegistrationStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationApplicationStatusViewModel$pollRegistrationStatus$1.label = i2 - Integer.MIN_VALUE;
                RegistrationApplicationStatusViewModel$pollRegistrationStatus$1 registrationApplicationStatusViewModel$pollRegistrationStatus$12 = registrationApplicationStatusViewModel$pollRegistrationStatus$1;
                Object obj = registrationApplicationStatusViewModel$pollRegistrationStatus$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationApplicationStatusViewModel$pollRegistrationStatus$12.label;
                int i3 = 1;
                int i4 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40 Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new fqi0(unr0.h(Text.Companion, dzh0.ybsdk_authorization_open_pay_card_status_in_progress), i4)));
                    u0e0 u0e0Var = u0e0.b;
                    com.ybsdk.screens.registration.domain.interactors.a aVar = cVar.C;
                    registrationApplicationStatusViewModel$pollRegistrationStatus$12.L$0 = str;
                    registrationApplicationStatusViewModel$pollRegistrationStatus$12.label = 1;
                    obj = aVar.f(str, u0e0Var, registrationApplicationStatusViewModel$pollRegistrationStatus$12);
                    if (obj != obj2) {
                        str2 = str;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = (String) registrationApplicationStatusViewModel$pollRegistrationStatus$12.L$0;
                kotlin.b.b(obj);
                str2 = str3;
                sls registrationApplicationStatusViewModel$pollRegistrationStatus$3 = new RegistrationApplicationStatusViewModel$pollRegistrationStatus$3(0, cVar, c.class, "onTakesTooLong", "onTakesTooLong()V", 0);
                wls registrationApplicationStatusViewModel$pollRegistrationStatus$4 = new RegistrationApplicationStatusViewModel$pollRegistrationStatus$4(cVar, str2, null);
                tls mqi0Var = new mqi0(cVar, str2, i3);
                tls mqi0Var2 = new mqi0(cVar, str2, i4);
                registrationApplicationStatusViewModel$pollRegistrationStatus$12.L$0 = null;
                registrationApplicationStatusViewModel$pollRegistrationStatus$12.label = 2;
            }
        }
        registrationApplicationStatusViewModel$pollRegistrationStatus$1 = new RegistrationApplicationStatusViewModel$pollRegistrationStatus$1(cVar, continuationImpl);
        RegistrationApplicationStatusViewModel$pollRegistrationStatus$1 registrationApplicationStatusViewModel$pollRegistrationStatus$122 = registrationApplicationStatusViewModel$pollRegistrationStatus$1;
        Object obj3 = registrationApplicationStatusViewModel$pollRegistrationStatus$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationApplicationStatusViewModel$pollRegistrationStatus$122.label;
        int i32 = 1;
        int i42 = 2;
        if (i != 0) {
        }
        sls registrationApplicationStatusViewModel$pollRegistrationStatus$32 = new RegistrationApplicationStatusViewModel$pollRegistrationStatus$3(0, cVar, c.class, "onTakesTooLong", "onTakesTooLong()V", 0);
        wls registrationApplicationStatusViewModel$pollRegistrationStatus$42 = new RegistrationApplicationStatusViewModel$pollRegistrationStatus$4(cVar, str2, null);
        tls mqi0Var3 = new mqi0(cVar, str2, i32);
        tls mqi0Var22 = new mqi0(cVar, str2, i42);
        registrationApplicationStatusViewModel$pollRegistrationStatus$122.L$0 = null;
        registrationApplicationStatusViewModel$pollRegistrationStatus$122.label = 2;
    }

    public final String e0(ApplicationStatusFailedException applicationStatusFailedException) {
        String supportUrl;
        if (applicationStatusFailedException != null && (supportUrl = applicationStatusFailedException.getSupportUrl()) != null) {
            if (supportUrl.length() <= 0) {
                supportUrl = null;
            }
            if (supportUrl != null) {
                return supportUrl;
            }
        }
        com.ybsdk.rconfig.b bVar = this.D;
        return ((YbSupportConfig) bVar.d(bVar.i.d).getData()).getSupportUrl();
    }

    public final void f0(String str) {
        h791.f(this.J, str, com.ybsdk.feature.webview.api.a.b(this.G, str, null, null, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r1.h0((defpackage.tpr) r11, r3, r4, r5, r6, new defpackage.bgc(12), r8) != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(String str, ContinuationImpl continuationImpl) {
        RegistrationApplicationStatusViewModel$pollProductOpeningStatus$1 registrationApplicationStatusViewModel$pollProductOpeningStatus$1;
        int i;
        r0 r0Var;
        Object value;
        c cVar;
        String str2;
        if (continuationImpl instanceof RegistrationApplicationStatusViewModel$pollProductOpeningStatus$1) {
            registrationApplicationStatusViewModel$pollProductOpeningStatus$1 = (RegistrationApplicationStatusViewModel$pollProductOpeningStatus$1) continuationImpl;
            int i2 = registrationApplicationStatusViewModel$pollProductOpeningStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationApplicationStatusViewModel$pollProductOpeningStatus$1.label = i2 - Integer.MIN_VALUE;
                RegistrationApplicationStatusViewModel$pollProductOpeningStatus$1 registrationApplicationStatusViewModel$pollProductOpeningStatus$12 = registrationApplicationStatusViewModel$pollProductOpeningStatus$1;
                Object obj = registrationApplicationStatusViewModel$pollProductOpeningStatus$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationApplicationStatusViewModel$pollProductOpeningStatus$12.label;
                Text.Resource resource = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40 Y = Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new fqi0(resource, 3)));
                    v0e0 v0e0Var = v0e0.b;
                    registrationApplicationStatusViewModel$pollProductOpeningStatus$12.L$0 = str;
                    registrationApplicationStatusViewModel$pollProductOpeningStatus$12.L$1 = this;
                    registrationApplicationStatusViewModel$pollProductOpeningStatus$12.label = 1;
                    obj = this.C.d(str, v0e0Var, registrationApplicationStatusViewModel$pollProductOpeningStatus$12);
                    if (obj != coroutineSingletons) {
                        cVar = this;
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c cVar2 = (c) registrationApplicationStatusViewModel$pollProductOpeningStatus$12.L$1;
                String str3 = (String) registrationApplicationStatusViewModel$pollProductOpeningStatus$12.L$0;
                kotlin.b.b(obj);
                str2 = str3;
                cVar = cVar2;
                RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3 registrationApplicationStatusViewModel$pollProductOpeningStatus$3 = new RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3(this, str2, null);
                int i3 = 0;
                mqi0 mqi0Var = new mqi0(this, str2, i3);
                nqi0 nqi0Var = new nqi0(i3);
                registrationApplicationStatusViewModel$pollProductOpeningStatus$12.L$0 = null;
                registrationApplicationStatusViewModel$pollProductOpeningStatus$12.L$1 = null;
                registrationApplicationStatusViewModel$pollProductOpeningStatus$12.label = 2;
            }
        }
        registrationApplicationStatusViewModel$pollProductOpeningStatus$1 = new RegistrationApplicationStatusViewModel$pollProductOpeningStatus$1(this, continuationImpl);
        RegistrationApplicationStatusViewModel$pollProductOpeningStatus$1 registrationApplicationStatusViewModel$pollProductOpeningStatus$122 = registrationApplicationStatusViewModel$pollProductOpeningStatus$1;
        Object obj2 = registrationApplicationStatusViewModel$pollProductOpeningStatus$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationApplicationStatusViewModel$pollProductOpeningStatus$122.label;
        Text.Resource resource2 = null;
        if (i != 0) {
        }
        RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3 registrationApplicationStatusViewModel$pollProductOpeningStatus$32 = new RegistrationApplicationStatusViewModel$pollProductOpeningStatus$3(this, str2, null);
        int i32 = 0;
        mqi0 mqi0Var2 = new mqi0(this, str2, i32);
        nqi0 nqi0Var2 = new nqi0(i32);
        registrationApplicationStatusViewModel$pollProductOpeningStatus$122.L$0 = null;
        registrationApplicationStatusViewModel$pollProductOpeningStatus$122.L$1 = null;
        registrationApplicationStatusViewModel$pollProductOpeningStatus$122.label = 2;
    }

    public final Object h0(tpr tprVar, String str, wls wlsVar, tls tlsVar, tls tlsVar2, sls slsVar, ContinuationImpl continuationImpl) {
        Object collect = tprVar.collect(new i0(new a(new b(wlsVar, this, str, tlsVar2, tlsVar)), new RegistrationApplicationStatusViewModel$pollStatus$4(slsVar, null)), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? collect : zy11Var;
    }
}
