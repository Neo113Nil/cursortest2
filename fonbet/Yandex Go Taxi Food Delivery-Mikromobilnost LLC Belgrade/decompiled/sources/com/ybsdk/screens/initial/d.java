package com.ybsdk.screens.initial;

import android.content.Context;
import android.os.SystemClock;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.common.entities.SessionEntity$ActionReason;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.common.repositiories.auth.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechGetRemoteConfigBlockingResultTrigger;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.internal.screens.createpin.OnFinishStrategy;
import com.ybsdk.feature.remote.config.api.retriever.RemoteConfigUpdateTrigger;
import com.ybsdk.navigation.InternalScreenIntent;
import com.ybsdk.rconfig.YbSupportConfig;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusScreenParams;
import com.ybsdk.screens.initial.InitialFragmentScreenParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.PendingDeeplinkListConfig$DefaultScreenBehavior;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFinishStrategy;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.aab1;
import defpackage.amt;
import defpackage.asa0;
import defpackage.b3z;
import defpackage.bwv;
import defpackage.cya1;
import defpackage.ds31;
import defpackage.dvw;
import defpackage.dwv;
import defpackage.dxj0;
import defpackage.dzh0;
import defpackage.e3n;
import defpackage.em3;
import defpackage.evu0;
import defpackage.ewv;
import defpackage.f8z0;
import defpackage.fj3;
import defpackage.fwv;
import defpackage.gj3;
import defpackage.gwv;
import defpackage.h791;
import defpackage.hri0;
import defpackage.hwv;
import defpackage.hyb0;
import defpackage.i4u;
import defpackage.iwv;
import defpackage.j18;
import defpackage.j3h;
import defpackage.jqr;
import defpackage.jwv;
import defpackage.k03;
import defpackage.lrp0;
import defpackage.np41;
import defpackage.np51;
import defpackage.nwv;
import defpackage.ny61;
import defpackage.owv;
import defpackage.ppp0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q1e0;
import defpackage.s630;
import defpackage.smv;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uc5;
import defpackage.uzd0;
import defpackage.v10;
import defpackage.v8z0;
import defpackage.vzd0;
import defpackage.w511;
import defpackage.wdp0;
import defpackage.wlp;
import defpackage.ws51;
import defpackage.x4c;
import defpackage.xra0;
import defpackage.xui0;
import defpackage.y750;
import defpackage.ycp0;
import defpackage.ye60;
import defpackage.ylt;
import defpackage.zlt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class d extends uc5 {
    public final InitialFragmentScreenParams B;
    public final wdp0 C;
    public final dxj0 D;
    public final com.ybsdk.common.e E;
    public final k03 F;
    public final np41 G;
    public final com.ybsdk.rconfig.b H;
    public final AppAnalyticsReporter I;
    public final fj3 J;
    public final com.ybsdk.feature.pin.internal.a K;
    public final YBSdkVisualParams L;
    public final f M;
    public final j3h N;
    public final b3z O;
    public final com.ybsdk.screens.registration.a P;
    public final tfl0 Q;
    public final g R;
    public final np51 S;
    public final xui0 T;
    public final ppp0 U;
    public final y750 V;
    public final e W;
    public final xra0 Z;
    public final Context a0;
    public pzt0 b0;

    public d(InitialFragmentScreenParams initialFragmentScreenParams, wdp0 wdp0Var, dxj0 dxj0Var, com.ybsdk.common.e eVar, k03 k03Var, np41 np41Var, com.ybsdk.rconfig.b bVar, AppAnalyticsReporter appAnalyticsReporter, fj3 fj3Var, com.ybsdk.feature.pin.internal.a aVar, hyb0 hyb0Var, YBSdkVisualParams yBSdkVisualParams, f fVar, j3h j3hVar, b3z b3zVar, com.ybsdk.screens.registration.a aVar2, jwv jwvVar, tfl0 tfl0Var, g gVar, np51 np51Var, com.ybsdk.core.common.data.cache.b bVar2, xui0 xui0Var, ppp0 ppp0Var, y750 y750Var, e eVar2, xra0 xra0Var, Context context) {
        super(new smv(24), jwvVar);
        this.B = initialFragmentScreenParams;
        this.C = wdp0Var;
        this.D = dxj0Var;
        this.E = eVar;
        this.F = k03Var;
        this.G = np41Var;
        this.H = bVar;
        this.I = appAnalyticsReporter;
        this.J = fj3Var;
        this.K = aVar;
        this.L = yBSdkVisualParams;
        this.M = fVar;
        this.N = j3hVar;
        this.O = b3zVar;
        this.P = aVar2;
        this.Q = tfl0Var;
        this.R = gVar;
        this.S = np51Var;
        this.T = xui0Var;
        this.U = ppp0Var;
        this.V = y750Var;
        this.W = eVar2;
        this.Z = xra0Var;
        this.a0 = context;
        if (hyb0Var.c == null) {
            hyb0Var.c = Long.valueOf(SystemClock.uptimeMillis());
            hyb0Var.e = hyb0Var.a.b("PIN_OPENING");
        }
        bVar2.o();
        tje.N(ds31.a(this), null, null, new InitialViewModel$2(this, null), 3);
        b3zVar.a(new c(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(d dVar, ContinuationImpl continuationImpl) {
        InitialViewModel$getUserEmail$1 initialViewModel$getUserEmail$1;
        int i;
        Long l;
        Object g;
        dVar.getClass();
        if (continuationImpl instanceof InitialViewModel$getUserEmail$1) {
            initialViewModel$getUserEmail$1 = (InitialViewModel$getUserEmail$1) continuationImpl;
            int i2 = initialViewModel$getUserEmail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialViewModel$getUserEmail$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initialViewModel$getUserEmail$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModel$getUserEmail$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = dVar.M;
                    initialViewModel$getUserEmail$1.label = 1;
                    obj = fVar.a(initialViewModel$getUserEmail$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        g = ((Result) obj).getValue();
                        if (g instanceof Result.Failure) {
                            g = null;
                        }
                        ws51 ws51Var = (ws51) g;
                        if (ws51Var != null) {
                            return ws51Var.h;
                        }
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                l = (Long) obj;
                if (l != null) {
                    long longValue = l.longValue();
                    ppp0 ppp0Var = dVar.U;
                    initialViewModel$getUserEmail$1.label = 2;
                    g = ((com.ybsdk.feature.passport.impl.a) ppp0Var).g(longValue, initialViewModel$getUserEmail$1);
                }
                return null;
            }
        }
        initialViewModel$getUserEmail$1 = new InitialViewModel$getUserEmail$1(dVar, continuationImpl);
        Object obj2 = initialViewModel$getUserEmail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModel$getUserEmail$1.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0130, code lost:
    
        if (r15 == r13) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0336, code lost:
    
        if (r15 == r13) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0265, code lost:
    
        if (r37.f0(r5, r12) == r13) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x027e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0265 -> B:27:0x0269). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(d dVar, InternalSdkState internalSdkState, List list, ContinuationImpl continuationImpl) {
        InitialViewModel$processState$1 initialViewModel$processState$1;
        int i;
        BaseDeeplinkAction baseDeeplinkAction;
        boolean z;
        boolean z2;
        fj3 fj3Var;
        g gVar;
        r0 r0Var;
        Object value;
        FragmentScreen b;
        Object l;
        InternalSdkState internalSdkState2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        Collection arrayList;
        List list2;
        Iterator it;
        Deeplink deeplink;
        FragmentScreen c;
        FragmentScreen b2;
        InternalSdkState internalSdkState3 = internalSdkState;
        com.ybsdk.screens.registration.a aVar = dVar.P;
        dxj0 dxj0Var = dVar.D;
        AppAnalyticsReporter appAnalyticsReporter = dVar.I;
        fj3 fj3Var2 = dVar.J;
        wdp0 wdp0Var = dVar.C;
        g gVar2 = dVar.R;
        YBSdkVisualParams yBSdkVisualParams = dVar.L;
        com.ybsdk.feature.pin.internal.a aVar2 = dVar.K;
        e eVar = dVar.W;
        if (continuationImpl instanceof InitialViewModel$processState$1) {
            initialViewModel$processState$1 = (InitialViewModel$processState$1) continuationImpl;
            int i2 = initialViewModel$processState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialViewModel$processState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initialViewModel$processState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModel$processState$1.label;
                Object obj3 = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        boolean h0 = h0(list);
                        if (h0) {
                            baseDeeplinkAction = null;
                            z = false;
                        } else {
                            if (!n0(list)) {
                                baseDeeplinkAction = null;
                                z = true;
                                z2 = true;
                                em3 em3Var = appAnalyticsReporter.d;
                                fj3Var = fj3Var2;
                                String b3 = com.ybsdk.common.c.b(internalSdkState3);
                                Boolean valueOf = Boolean.valueOf(h0);
                                gVar = gVar2;
                                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                                linkedHashMap.put("value", b3);
                                linkedHashMap.put("buid_required", valueOf);
                                em3Var.a.a("start_session.processed_value", linkedHashMap);
                                if (!(internalSdkState3 instanceof InternalSdkState.Ok)) {
                                    eVar.b();
                                    return list;
                                }
                                if (internalSdkState3 instanceof InternalSdkState.AccountUpgrade) {
                                    initialViewModel$processState$1.label = 1;
                                    j18 j18Var = new j18(1, dvw.b(initialViewModel$processState$1));
                                    j18Var.u();
                                    dxj0Var.r(new i4u(dVar));
                                    if (j18Var.s() != obj2) {
                                        return baseDeeplinkAction;
                                    }
                                } else if ((internalSdkState3 instanceof InternalSdkState.RequestNewAmToken) || (internalSdkState3 instanceof InternalSdkState.Unauthenticated)) {
                                    if (yBSdkVisualParams.getShowLogOut()) {
                                        ((gj3) fj3Var).getClass();
                                        ny61.r("Auth landing screen not implemented");
                                        return null;
                                    }
                                    initialViewModel$processState$1.label = 2;
                                    j18 j18Var2 = new j18(1, dvw.b(initialViewModel$processState$1));
                                    j18Var2.u();
                                    dxj0Var.p(new i4u(dVar));
                                    if (j18Var2.s() != obj2) {
                                        return null;
                                    }
                                } else if (internalSdkState3 instanceof InternalSdkState.YbRegistration) {
                                    if (!z) {
                                        initialViewModel$processState$1.L$0 = internalSdkState3;
                                        initialViewModel$processState$1.label = 3;
                                        Object w = aVar2.c.w(initialViewModel$processState$1);
                                        if (w == obj2) {
                                            obj3 = w;
                                            break;
                                        }
                                    } else {
                                        eVar.b();
                                        return list;
                                    }
                                } else {
                                    if (internalSdkState3 instanceof InternalSdkState.OpenProduct) {
                                        if (z) {
                                            eVar.b();
                                            return list;
                                        }
                                        InternalSdkState.OpenProduct openProduct = (InternalSdkState.OpenProduct) internalSdkState3;
                                        YBProduct product = openProduct.getProduct();
                                        String startLandingUrl = openProduct.getStartLandingUrl();
                                        cya1.a = new amt(product, zlt.a);
                                        appAnalyticsReporter.o.g(startLandingUrl);
                                        return com.ybsdk.navigation.a.b(dVar.N, dVar.G, startLandingUrl, yBSdkVisualParams);
                                    }
                                    if (!(internalSdkState3 instanceof InternalSdkState.ApplicationStatusCheck)) {
                                        if (internalSdkState3 instanceof InternalSdkState.SmsAuthorization) {
                                            if (z2) {
                                                eVar.b();
                                                return list;
                                            }
                                            CodeConfirmationParams.HeaderText.TwoFAText twoFAText = new CodeConfirmationParams.HeaderText.TwoFAText(null, 1, null);
                                            String trackId = ((InternalSdkState.SmsAuthorization) internalSdkState3).getTrackId();
                                            hri0 hri0Var = aVar.b;
                                            CodeConfirmationParams.Authorization authorization = new CodeConfirmationParams.Authorization(twoFAText, null, trackId, null, true, false, aVar.e.n().isEnabled() ? Integer.valueOf(dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_account_subtitle) : null, CodeConfirmationFinishStrategy.Initial.INSTANCE, false, null, "request_key_authorization", 768, null);
                                            OpenScreenRequirement.WithoutRequirements withoutRequirements = OpenScreenRequirement.WithoutRequirements.INSTANCE;
                                            hri0Var.getClass();
                                            return Collections.singletonList(hri0.a(authorization, withoutRequirements));
                                        }
                                        if (internalSdkState3 instanceof InternalSdkState.Support) {
                                            pz40 Y = dVar.Y();
                                            do {
                                                r0Var3 = (r0) Y;
                                                value3 = r0Var3.getValue();
                                            } while (!r0Var3.k(value3, new hwv(dVar.l0(((InternalSdkState.Support) internalSdkState3).getSupportUrl()), yBSdkVisualParams.getShowLogOut(), "SupportAction")));
                                        } else if (internalSdkState3 instanceof InternalSdkState.UpdateRequired) {
                                            pz40 Y2 = dVar.Y();
                                            do {
                                                r0Var2 = (r0) Y2;
                                                value2 = r0Var2.getValue();
                                            } while (!r0Var2.k(value2, fwv.a));
                                        } else if (internalSdkState3 instanceof InternalSdkState.PinTokenClear) {
                                            initialViewModel$processState$1.label = 6;
                                            aVar2.c.E(false);
                                            break;
                                        } else {
                                            if (!(internalSdkState3 instanceof InternalSdkState.PinInput.PinTokenReissue)) {
                                                if (internalSdkState3 instanceof InternalSdkState.PinInput.PinTokenRetry) {
                                                    if (z2) {
                                                        eVar.b();
                                                        return list;
                                                    }
                                                    gVar.a();
                                                    b = aVar2.b(null, true);
                                                    return Collections.singletonList(b);
                                                }
                                                if (internalSdkState3 instanceof InternalSdkState.Error) {
                                                    throw ((InternalSdkState.Error) internalSdkState3).getT();
                                                }
                                                if (!(internalSdkState3 instanceof InternalSdkState.StartSessionDeeplink)) {
                                                    w511.b();
                                                    return null;
                                                }
                                                com.ybsdk.rconfig.b bVar = dVar.H;
                                                bVar.getClass();
                                                if (((CommonFeatureFlag) bVar.d(wlp.B).getData()).isEnabled()) {
                                                    dVar.O.c(((InternalSdkState.StartSessionDeeplink) internalSdkState3).getDeeplink());
                                                    return null;
                                                }
                                                pz40 Y3 = dVar.Y();
                                                do {
                                                    r0Var = (r0) Y3;
                                                    value = r0Var.getValue();
                                                } while (!r0Var.k(value, new hwv(dVar.l0(null), yBSdkVisualParams.getShowLogOut(), "SupportDeeplinkFallback")));
                                                return null;
                                            }
                                            if (z2) {
                                                eVar.b();
                                                return list;
                                            }
                                            initialViewModel$processState$1.L$0 = internalSdkState3;
                                            initialViewModel$processState$1.label = 7;
                                            l = aVar2.c.l(initialViewModel$processState$1);
                                            if (l != obj2) {
                                                internalSdkState2 = internalSdkState3;
                                                if (((Boolean) l).booleanValue()) {
                                                    InternalSdkState.PinInput.PinTokenReissue pinTokenReissue = (InternalSdkState.PinInput.PinTokenReissue) internalSdkState2;
                                                    b2 = ycp0.b(aVar2.b, aab1.g(pinTokenReissue.getActionReason()), OnFinishStrategy.OPEN_INITIAL_PRESENTER, pinTokenReissue.getActionReason() == SessionEntity$ActionReason.PIN_TOKEN_REISSUE_REGISTRATION ? PinScenario.SETUP_PIN : PinScenario.REISSUE_PIN, yBSdkVisualParams.getShowLogOut(), null, 16);
                                                } else {
                                                    b2 = aVar2.b(null, true);
                                                }
                                                return Collections.singletonList(b2);
                                            }
                                        }
                                        return null;
                                    }
                                    if (z2) {
                                        eVar.b();
                                        return list;
                                    }
                                    List requiredApplications = internalSdkState3.getRequiredApplications();
                                    arrayList = new ArrayList();
                                    list2 = requiredApplications;
                                    it = requiredApplications.iterator();
                                    if (!it.hasNext()) {
                                        SessionApplicationEntity sessionApplicationEntity = (SessionApplicationEntity) it.next();
                                        if (nwv.a[sessionApplicationEntity.getType().ordinal()] != 1) {
                                            initialViewModel$processState$1.L$0 = list2;
                                            initialViewModel$processState$1.L$1 = arrayList;
                                            initialViewModel$processState$1.L$2 = it;
                                            initialViewModel$processState$1.L$3 = baseDeeplinkAction;
                                            initialViewModel$processState$1.label = 5;
                                            break;
                                        } else {
                                            initialViewModel$processState$1.L$0 = list2;
                                            initialViewModel$processState$1.L$1 = arrayList;
                                            initialViewModel$processState$1.L$2 = it;
                                            initialViewModel$processState$1.L$3 = sessionApplicationEntity;
                                            initialViewModel$processState$1.label = 4;
                                            aVar2.c.E(false);
                                            if (obj3 != obj2) {
                                                List list3 = list2;
                                                Collection collection = arrayList;
                                                Iterator it2 = it;
                                                c = aVar.c(sessionApplicationEntity.getApplicationId(), true, ChangePhoneStatusScreenParams.Status.INITIAL);
                                                it = it2;
                                                arrayList = collection;
                                                list2 = list3;
                                                if (c != null) {
                                                    arrayList.add(c);
                                                }
                                                baseDeeplinkAction = null;
                                                if (!it.hasNext()) {
                                                    List list4 = (List) arrayList;
                                                    if (!list4.isEmpty()) {
                                                        return list4;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return obj2;
                            }
                            baseDeeplinkAction = null;
                            z = true;
                        }
                        z2 = false;
                        em3 em3Var2 = appAnalyticsReporter.d;
                        fj3Var = fj3Var2;
                        String b32 = com.ybsdk.common.c.b(internalSdkState3);
                        Boolean valueOf2 = Boolean.valueOf(h0);
                        gVar = gVar2;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
                        linkedHashMap2.put("value", b32);
                        linkedHashMap2.put("buid_required", valueOf2);
                        em3Var2.a.a("start_session.processed_value", linkedHashMap2);
                        if (!(internalSdkState3 instanceof InternalSdkState.Ok)) {
                        }
                        break;
                    case 1:
                        kotlin.b.b(obj);
                        return null;
                    case 2:
                        kotlin.b.b(obj);
                        return null;
                    case 3:
                        internalSdkState3 = (InternalSdkState) initialViewModel$processState$1.L$0;
                        kotlin.b.b(obj);
                        baseDeeplinkAction = null;
                        fj3Var = fj3Var2;
                        gVar = gVar2;
                        gVar.a();
                        InternalScreenIntent internalScreenIntent = wdp0Var.a;
                        if (((internalScreenIntent == null || (deeplink = internalScreenIntent.getDeeplink()) == null) ? baseDeeplinkAction : deeplink.getAction()) instanceof DeeplinkAction.Registration) {
                            return Collections.singletonList(com.ybsdk.screens.registration.a.d(dVar.P, ((InternalSdkState.YbRegistration) internalSdkState3).getProduct(), null, false, wdp0Var.b(), 14));
                        }
                        if (!yBSdkVisualParams.getShowLogOut()) {
                            InternalSdkState.YbRegistration ybRegistration = (InternalSdkState.YbRegistration) internalSdkState3;
                            List m0 = dVar.m0(ybRegistration.getProduct(), ybRegistration.getStartLandingUrl());
                            return m0 == null ? Collections.singletonList(com.ybsdk.screens.registration.a.d(dVar.P, ybRegistration.getProduct(), null, true, null, 6)) : m0;
                        }
                        InternalSdkState.YbRegistration ybRegistration2 = (InternalSdkState.YbRegistration) internalSdkState3;
                        List m02 = dVar.m0(ybRegistration2.getProduct(), ybRegistration2.getStartLandingUrl());
                        if (m02 == null) {
                            m02 = Collections.singletonList(com.ybsdk.screens.registration.a.d(dVar.P, ybRegistration2.getProduct(), null, false, wdp0Var.b(), 14));
                        }
                        if (!dVar.B.getDropBackStack()) {
                            return m02;
                        }
                        ((gj3) fj3Var).getClass();
                        ny61.r("Auth landing screen not implemented");
                        return baseDeeplinkAction;
                    case 4:
                        SessionApplicationEntity sessionApplicationEntity2 = (SessionApplicationEntity) initialViewModel$processState$1.L$3;
                        Iterator it3 = (Iterator) initialViewModel$processState$1.L$2;
                        Collection collection2 = (Collection) initialViewModel$processState$1.L$1;
                        List list5 = (List) initialViewModel$processState$1.L$0;
                        kotlin.b.b(obj);
                        c = aVar.c(sessionApplicationEntity2.getApplicationId(), true, ChangePhoneStatusScreenParams.Status.INITIAL);
                        it = it3;
                        arrayList = collection2;
                        list2 = list5;
                        if (c != null) {
                        }
                        baseDeeplinkAction = null;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 5:
                        it = (Iterator) initialViewModel$processState$1.L$2;
                        arrayList = (Collection) initialViewModel$processState$1.L$1;
                        list2 = (List) initialViewModel$processState$1.L$0;
                        kotlin.b.b(obj);
                        c = null;
                        if (c != null) {
                        }
                        baseDeeplinkAction = null;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        kotlin.b.b(obj);
                        gVar = gVar2;
                        gVar.a();
                        i0(dVar, null, null, null, 7);
                        return null;
                    case 7:
                        internalSdkState2 = (InternalSdkState) initialViewModel$processState$1.L$0;
                        kotlin.b.b(obj);
                        l = obj;
                        if (((Boolean) l).booleanValue()) {
                        }
                        return Collections.singletonList(b2);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        initialViewModel$processState$1 = new InitialViewModel$processState$1(dVar, continuationImpl);
        Object obj4 = initialViewModel$processState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModel$processState$1.label;
        Object obj32 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0051, code lost:
    
        if (r11 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(d dVar, ContinuationImpl continuationImpl) {
        InitialViewModel$startInitialLoading$1 initialViewModel$startInitialLoading$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        List list;
        int i2;
        wdp0 wdp0Var = dVar.C;
        InitialFragmentScreenParams initialFragmentScreenParams = dVar.B;
        com.ybsdk.feature.pin.internal.a aVar = dVar.K;
        if (continuationImpl instanceof InitialViewModel$startInitialLoading$1) {
            initialViewModel$startInitialLoading$1 = (InitialViewModel$startInitialLoading$1) continuationImpl;
            int i3 = initialViewModel$startInitialLoading$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                initialViewModel$startInitialLoading$1.label = i3 - Integer.MIN_VALUE;
                Object obj = initialViewModel$startInitialLoading$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModel$startInitialLoading$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(initialFragmentScreenParams instanceof InitialFragmentScreenParams.Default)) {
                        if (initialFragmentScreenParams instanceof InitialFragmentScreenParams.ResponsePreloaded) {
                            i0(dVar, ((InitialFragmentScreenParams.ResponsePreloaded) initialFragmentScreenParams).getInternalSdkState(), null, null, 6);
                        } else {
                            if (!(initialFragmentScreenParams instanceof InitialFragmentScreenParams.VerificationToken)) {
                                w511.b();
                                return null;
                            }
                            i0(dVar, null, ((InitialFragmentScreenParams.VerificationToken) initialFragmentScreenParams).getVerificationToken(), null, 5);
                        }
                        return zy11.a;
                    }
                    e eVar = dVar.W;
                    initialViewModel$startInitialLoading$1.label = 1;
                    obj = eVar.a(initialViewModel$startInitialLoading$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = initialViewModel$startInitialLoading$1.I$0;
                        list = (List) initialViewModel$startInitialLoading$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue() || i2 == 0) {
                            i0(dVar, null, null, list, 3);
                        } else {
                            boolean dropBackStack = ((InitialFragmentScreenParams.Default) initialFragmentScreenParams).getDropBackStack();
                            tfl0 tfl0Var = dVar.Q;
                            if (dropBackStack) {
                                tfl0Var.k(aVar.b(wdp0Var.a(), true));
                            } else {
                                tfl0Var.l(aVar.b(wdp0Var.a(), false));
                            }
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                List list2 = (List) obj;
                int i4 = (!h0(list2) || n0(list2)) ? 1 : 0;
                initialViewModel$startInitialLoading$1.L$0 = list2;
                initialViewModel$startInitialLoading$1.I$0 = i4;
                initialViewModel$startInitialLoading$1.label = 2;
                e = aVar.e(initialViewModel$startInitialLoading$1);
                if (e != coroutineSingletons) {
                    list = list2;
                    obj = e;
                    i2 = i4;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    i0(dVar, null, null, list, 3);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        initialViewModel$startInitialLoading$1 = new InitialViewModel$startInitialLoading$1(dVar, continuationImpl);
        Object obj2 = initialViewModel$startInitialLoading$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModel$startInitialLoading$1.label;
        if (i != 0) {
        }
        List list22 = (List) obj2;
        if (h0(list22)) {
        }
        initialViewModel$startInitialLoading$1.L$0 = list22;
        initialViewModel$startInitialLoading$1.I$0 = i4;
        initialViewModel$startInitialLoading$1.label = 2;
        e = aVar.e(initialViewModel$startInitialLoading$1);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(d dVar, ContinuationImpl continuationImpl) {
        InitialViewModel$tryFetchRemoteConfig$1 initialViewModel$tryFetchRemoteConfig$1;
        int i;
        long j;
        Throwable a;
        xui0 xui0Var = dVar.T;
        if (continuationImpl instanceof InitialViewModel$tryFetchRemoteConfig$1) {
            initialViewModel$tryFetchRemoteConfig$1 = (InitialViewModel$tryFetchRemoteConfig$1) continuationImpl;
            int i2 = initialViewModel$tryFetchRemoteConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialViewModel$tryFetchRemoteConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initialViewModel$tryFetchRemoteConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModel$tryFetchRemoteConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (dVar.B instanceof InitialFragmentScreenParams.Default) {
                        long a2 = s630.a();
                        initialViewModel$tryFetchRemoteConfig$1.J$0 = a2;
                        initialViewModel$tryFetchRemoteConfig$1.label = 1;
                        obj = ((com.ybsdk.rconfig.retriever.d) xui0Var).b(initialViewModel$tryFetchRemoteConfig$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j = a2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = initialViewModel$tryFetchRemoteConfig$1.J$0;
                kotlin.b.b(obj);
                Result result = new Result(((v8z0) obj).a.getValue());
                long a3 = f8z0.a(j);
                a = Result.a(result.getValue());
                if (a != null) {
                    dVar.I.m0.e(TechEvents$TechGetRemoteConfigBlockingResultTrigger.INITIAL_SCREEN, (int) e3n.e(a3), 0);
                    return zy11.a;
                }
                com.ybsdk.rconfig.retriever.d dVar2 = (com.ybsdk.rconfig.retriever.d) xui0Var;
                com.ybsdk.rconfig.retriever.d.c(dVar2, dVar2.i, RemoteConfigUpdateTrigger.INITIAL);
                x4c.g("Failed to update remote config on Initial Screen", a, null, Collections.singletonList(lrp0.y), 4);
                return new Result.Failure(a);
            }
        }
        initialViewModel$tryFetchRemoteConfig$1 = new InitialViewModel$tryFetchRemoteConfig$1(dVar, continuationImpl);
        Object obj2 = initialViewModel$tryFetchRemoteConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModel$tryFetchRemoteConfig$1.label;
        if (i != 0) {
        }
        Result result2 = new Result(((v8z0) obj2).a.getValue());
        long a32 = f8z0.a(j);
        a = Result.a(result2.getValue());
        if (a != null) {
        }
    }

    public static boolean h0(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((Screen) it.next()).getRequirements() instanceof OpenScreenRequirement.WithBuid) {
                return true;
            }
        }
        return false;
    }

    public static void i0(d dVar, InternalSdkState internalSdkState, String str, List list, int i) {
        r0 r0Var;
        Object value;
        InternalSdkState internalSdkState2 = (i & 1) != 0 ? null : internalSdkState;
        String str2 = (i & 2) != 0 ? null : str;
        List list2 = (i & 4) != 0 ? null : list;
        if (!(internalSdkState2 instanceof InternalSdkState.Ok)) {
            pz40 Y = dVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, ewv.a));
        }
        pzt0 pzt0Var = dVar.b0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.b0 = tje.N(ds31.a(dVar), null, null, new InitialViewModel$loadData$2(internalSdkState2, dVar, str2, list2, null), 3);
    }

    public static boolean n0(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((Screen) it.next()).getRequirements() instanceof OpenScreenRequirement.WithBuidOrBankSessionNotRegisteredUser) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x010c -> B:17:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(List list, ContinuationImpl continuationImpl) {
        InitialViewModel$checkRequiredApplications$1 initialViewModel$checkRequiredApplications$1;
        int i;
        Iterator it;
        Collection collection;
        r0 r0Var;
        Object value;
        SessionApplicationEntity sessionApplicationEntity;
        Collection collection2;
        tpr jqrVar;
        if (continuationImpl instanceof InitialViewModel$checkRequiredApplications$1) {
            initialViewModel$checkRequiredApplications$1 = (InitialViewModel$checkRequiredApplications$1) continuationImpl;
            int i2 = initialViewModel$checkRequiredApplications$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialViewModel$checkRequiredApplications$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initialViewModel$checkRequiredApplications$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModel$checkRequiredApplications$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list.isEmpty()) {
                        pz40 Y = Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, new dwv(new Throwable("SessionApplicationEntity list is empty"))));
                        return zy11Var;
                    }
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    collection = (Collection) initialViewModel$checkRequiredApplications$1.L$3;
                    sessionApplicationEntity = (SessionApplicationEntity) initialViewModel$checkRequiredApplications$1.L$2;
                    it = (Iterator) initialViewModel$checkRequiredApplications$1.L$1;
                    collection2 = (Collection) initialViewModel$checkRequiredApplications$1.L$0;
                    kotlin.b.b(obj);
                    jqrVar = new jqr((tpr) obj, new InitialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1(this, null), 3);
                    collection.add(new owv(new jqr(jqrVar, new InitialViewModel$checkRequiredApplications$flows$1$1(sessionApplicationEntity, this, null), 3), 0));
                    collection = collection2;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                collection = (Collection) initialViewModel$checkRequiredApplications$1.L$3;
                sessionApplicationEntity = (SessionApplicationEntity) initialViewModel$checkRequiredApplications$1.L$2;
                it = (Iterator) initialViewModel$checkRequiredApplications$1.L$1;
                collection2 = (Collection) initialViewModel$checkRequiredApplications$1.L$0;
                kotlin.b.b(obj);
                jqrVar = (tpr) obj;
                collection.add(new owv(new jqr(jqrVar, new InitialViewModel$checkRequiredApplications$flows$1$1(sessionApplicationEntity, this, null), 3), 0));
                collection = collection2;
                if (it.hasNext()) {
                    sessionApplicationEntity = (SessionApplicationEntity) it.next();
                    ApplicationTypeEntity type = sessionApplicationEntity.getType();
                    int[] iArr = nwv.a;
                    q1e0 q1e0Var = iArr[type.ordinal()] == 2 ? vzd0.b : uzd0.b;
                    if (iArr[sessionApplicationEntity.getType().ordinal()] == 2) {
                        String applicationId = sessionApplicationEntity.getApplicationId();
                        initialViewModel$checkRequiredApplications$1.L$0 = collection;
                        initialViewModel$checkRequiredApplications$1.L$1 = it;
                        initialViewModel$checkRequiredApplications$1.L$2 = sessionApplicationEntity;
                        initialViewModel$checkRequiredApplications$1.L$3 = collection;
                        initialViewModel$checkRequiredApplications$1.label = 1;
                        Object b = this.P.d.b(applicationId, q1e0Var, initialViewModel$checkRequiredApplications$1);
                        if (b != coroutineSingletons) {
                            collection2 = collection;
                            jqrVar = new jqr((tpr) b, new InitialViewModel$checkRequiredApplications$flows$1$pollingStateFlow$1(this, null), 3);
                            collection.add(new owv(new jqr(jqrVar, new InitialViewModel$checkRequiredApplications$flows$1$1(sessionApplicationEntity, this, null), 3), 0));
                            collection = collection2;
                            if (it.hasNext()) {
                                tpr[] tprVarArr = (tpr[]) kotlin.collections.a.J0((List) collection).toArray(new tpr[0]);
                                InitialViewModel$checkRequiredApplications$4 initialViewModel$checkRequiredApplications$4 = new InitialViewModel$checkRequiredApplications$4(this, null);
                                initialViewModel$checkRequiredApplications$1.L$0 = null;
                                initialViewModel$checkRequiredApplications$1.L$1 = null;
                                initialViewModel$checkRequiredApplications$1.L$2 = null;
                                initialViewModel$checkRequiredApplications$1.L$3 = null;
                                initialViewModel$checkRequiredApplications$1.label = 3;
                                Object a = j.a(new i0(ye60.a, initialViewModel$checkRequiredApplications$4), new v10(tprVarArr, 27), new InitialViewModel$checkRequiredApplications$$inlined$combine$1$3(3, null), initialViewModel$checkRequiredApplications$1, tprVarArr);
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (a != coroutineSingletons2) {
                                    a = zy11Var;
                                }
                                if (a != coroutineSingletons2) {
                                    a = zy11Var;
                                }
                                if (a != coroutineSingletons2) {
                                    a = zy11Var;
                                }
                                if (a != coroutineSingletons) {
                                    return zy11Var;
                                }
                            }
                        }
                    } else {
                        String applicationId2 = sessionApplicationEntity.getApplicationId();
                        initialViewModel$checkRequiredApplications$1.L$0 = collection;
                        initialViewModel$checkRequiredApplications$1.L$1 = it;
                        initialViewModel$checkRequiredApplications$1.L$2 = sessionApplicationEntity;
                        initialViewModel$checkRequiredApplications$1.L$3 = collection;
                        initialViewModel$checkRequiredApplications$1.label = 2;
                        obj = ((com.ybsdk.common.repositiories.applications.b) this.F).f(applicationId2, q1e0Var, initialViewModel$checkRequiredApplications$1);
                        if (obj != coroutineSingletons) {
                            collection2 = collection;
                            jqrVar = (tpr) obj;
                            collection.add(new owv(new jqr(jqrVar, new InitialViewModel$checkRequiredApplications$flows$1$1(sessionApplicationEntity, this, null), 3), 0));
                            collection = collection2;
                            if (it.hasNext()) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        initialViewModel$checkRequiredApplications$1 = new InitialViewModel$checkRequiredApplications$1(this, continuationImpl);
        Object obj2 = initialViewModel$checkRequiredApplications$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModel$checkRequiredApplications$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        InitialViewModel$getRegistrationNext$1 initialViewModel$getRegistrationNext$1;
        int i;
        Object b;
        Throwable a;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof InitialViewModel$getRegistrationNext$1) {
            initialViewModel$getRegistrationNext$1 = (InitialViewModel$getRegistrationNext$1) continuationImpl;
            int i2 = initialViewModel$getRegistrationNext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialViewModel$getRegistrationNext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initialViewModel$getRegistrationNext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialViewModel$getRegistrationNext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.screens.registration.a aVar = this.P;
                    initialViewModel$getRegistrationNext$1.L$0 = str;
                    initialViewModel$getRegistrationNext$1.L$1 = str2;
                    initialViewModel$getRegistrationNext$1.L$2 = str3;
                    initialViewModel$getRegistrationNext$1.label = 1;
                    b = aVar.b(str, str2, str3, initialViewModel$getRegistrationNext$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) initialViewModel$getRegistrationNext$1.L$2;
                    str2 = (String) initialViewModel$getRegistrationNext$1.L$1;
                    str = (String) initialViewModel$getRegistrationNext$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    xra0 xra0Var = this.Z;
                    PendingDeeplinkListConfig$DefaultScreenBehavior pendingDeeplinkListConfig$DefaultScreenBehavior = PendingDeeplinkListConfig$DefaultScreenBehavior.INCLUDE;
                    xra0Var.getClass();
                    xra0Var.b = new asa0((List) b, pendingDeeplinkListConfig$DefaultScreenBehavior);
                }
                a = Result.a(b);
                if (a != null) {
                    pz40 Y = Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new gwv(str, str2, str3, a)));
                }
                return zy11.a;
            }
        }
        initialViewModel$getRegistrationNext$1 = new InitialViewModel$getRegistrationNext$1(this, continuationImpl);
        Object obj2 = initialViewModel$getRegistrationNext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialViewModel$getRegistrationNext$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        return zy11.a;
    }

    public final void j0() {
        iwv iwvVar = (iwv) X();
        boolean z = iwvVar instanceof hwv;
        np41 np41Var = this.G;
        j3h j3hVar = this.N;
        if (z) {
            String str = ((hwv) iwvVar).a;
            h791.f(j3hVar, str, com.ybsdk.feature.webview.api.a.b(np41Var, str, null, null, 6));
            return;
        }
        if (iwvVar instanceof fwv) {
            this.Q.e();
            return;
        }
        if (iwvVar instanceof bwv) {
            String str2 = ((bwv) iwvVar).d;
            if (str2 != null) {
                h791.f(j3hVar, str2, ((com.ybsdk.feature.webview.internal.a) np41Var).f(str2));
                return;
            }
            return;
        }
        if (iwvVar instanceof gwv) {
            tje.N(ds31.a(this), null, null, new InitialViewModel$onErrorPrimaryButtonClick$2(this, iwvVar, null), 3);
        } else {
            this.D.c.clear();
            i0(this, null, null, null, 5);
        }
    }

    public final void k0(String str) {
        if (str != null) {
            h791.f(this.N, str, ((com.ybsdk.feature.webview.internal.a) this.G).f(str));
        }
    }

    public final String l0(String str) {
        if (str == null || evu0.J(str)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        com.ybsdk.rconfig.b bVar = this.H;
        return ((YbSupportConfig) bVar.d(bVar.i.d).getData()).getSupportUrl();
    }

    public final List m0(YBProduct yBProduct, String str) {
        if (str.length() == 0) {
            return null;
        }
        cya1.a = new amt(yBProduct, new ylt());
        this.I.o.g(str);
        return com.ybsdk.navigation.a.b(this.N, this.G, str, this.L);
    }
}
