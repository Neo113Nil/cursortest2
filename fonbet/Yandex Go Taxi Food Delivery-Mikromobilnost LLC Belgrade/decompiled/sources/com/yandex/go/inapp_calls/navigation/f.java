package com.yandex.go.inapp_calls.navigation;

import android.content.Context;
import com.yandex.go.inapp_calls.analytics.InAppCallsAnalytics$ErrorType;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import com.yandex.go.proxyprovision.j;
import defpackage.clv;
import defpackage.dlv;
import defpackage.ea0;
import defpackage.elv;
import defpackage.fkv;
import defpackage.gkv;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hkv;
import defpackage.jiu;
import defpackage.lgh;
import defpackage.m950;
import defpackage.mjv;
import defpackage.n0k0;
import defpackage.njv;
import defpackage.ny61;
import defpackage.qjv;
import defpackage.qu;
import defpackage.sjv;
import defpackage.tje;
import defpackage.ukv;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class f extends h55 implements m950 {
    public final Context D;
    public final y50 E;
    public final d F;
    public final yvf0 G;
    public final ea0 H;
    public final com.yandex.go.inapp_calls.interactor.permissions.a I;
    public final h3y J;
    public final njv K;
    public final n0k0 L;
    public final com.yandex.go.inapp_calls.repository.c M;
    public final com.yandex.go.inapp_calls.interactor.a N;
    public final lgh O;
    public final j P;

    public f(Context context, y50 y50Var, d dVar, yvf0 yvf0Var, ea0 ea0Var, com.yandex.go.inapp_calls.interactor.permissions.a aVar, h3y h3yVar, njv njvVar, n0k0 n0k0Var, com.yandex.go.inapp_calls.repository.c cVar, com.yandex.go.inapp_calls.interactor.a aVar2, lgh lghVar, j jVar) {
        super(null);
        this.D = context;
        this.E = y50Var;
        this.F = dVar;
        this.G = yvf0Var;
        this.H = ea0Var;
        this.I = aVar;
        this.J = h3yVar;
        this.K = njvVar;
        this.L = n0k0Var;
        this.M = cVar;
        this.N = aVar2;
        this.O = lghVar;
        this.P = jVar;
    }

    public static final void P(f fVar, hkv hkvVar) {
        fVar.A((m950) fVar.G.get(), new sjv(hkvVar.c, hkvVar.a, hkvVar.d), new e(fVar, hkvVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(f fVar, hkv hkvVar, ContinuationImpl continuationImpl) {
        InAppOutgoingCallRouterImpl$handleCallAttempt$1 inAppOutgoingCallRouterImpl$handleCallAttempt$1;
        Object obj;
        int i;
        fVar.getClass();
        if (continuationImpl instanceof InAppOutgoingCallRouterImpl$handleCallAttempt$1) {
            inAppOutgoingCallRouterImpl$handleCallAttempt$1 = (InAppOutgoingCallRouterImpl$handleCallAttempt$1) continuationImpl;
            int i2 = inAppOutgoingCallRouterImpl$handleCallAttempt$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppOutgoingCallRouterImpl$handleCallAttempt$1.label = i2 - Integer.MIN_VALUE;
                obj = inAppOutgoingCallRouterImpl$handleCallAttempt$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppOutgoingCallRouterImpl$handleCallAttempt$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppOutgoingCallRouterImpl$handleCallAttempt$1.L$0 = null;
                    inAppOutgoingCallRouterImpl$handleCallAttempt$1.label = 1;
                    obj = fVar.T(hkvVar, inAppOutgoingCallRouterImpl$handleCallAttempt$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    njv njvVar = fVar.K;
                    InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType = InAppCallsAnalytics$ErrorType.NOT_SUCCEEDED;
                    njvVar.getClass();
                    njv.h(inAppCallsAnalytics$ErrorType);
                    fVar.r(new jiu(22));
                } else {
                    fVar.r(new qu(9));
                }
                return zy11.a;
            }
        }
        inAppOutgoingCallRouterImpl$handleCallAttempt$1 = new InAppOutgoingCallRouterImpl$handleCallAttempt$1(fVar, continuationImpl);
        obj = inAppOutgoingCallRouterImpl$handleCallAttempt$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppOutgoingCallRouterImpl$handleCallAttempt$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new InAppOutgoingCallRouterImpl$onLaunch$1(this, (hkv) obj, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(hkv hkvVar, ContinuationImpl continuationImpl) {
        InAppOutgoingCallRouterImpl$createOutgoingCallPayload$1 inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1;
        int i;
        String str;
        Map f;
        String str2;
        elv elvVar;
        hkv hkvVar2 = hkvVar;
        if (continuationImpl instanceof InAppOutgoingCallRouterImpl$createOutgoingCallPayload$1) {
            inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1 = (InAppOutgoingCallRouterImpl$createOutgoingCallPayload$1) continuationImpl;
            int i2 = inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.label;
                njv njvVar = this.K;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fkv fkvVar = hkvVar2.a;
                    if (fkvVar == null || (str = fkvVar.a) == null) {
                        njvVar.j(hkvVar2.d.b, InAppCallsAnalytics$PhoneCallFallbackReason.EmptyForwardingId, fkvVar != null ? fkvVar.a : null);
                        return null;
                    }
                    gkv gkvVar = hkvVar2.b;
                    if (gkvVar == null || (f = gkvVar.c) == null) {
                        f = kotlin.collections.b.f();
                    }
                    inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.L$0 = hkvVar2;
                    inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.L$1 = str;
                    inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.label = 1;
                    obj = this.N.a(f, inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.L$1;
                    hkv hkvVar3 = (hkv) inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.L$0;
                    kotlin.b.b(obj);
                    str2 = str3;
                    hkvVar2 = hkvVar3;
                }
                elvVar = (elv) obj;
                if (!(elvVar instanceof clv)) {
                    String str4 = hkvVar2.d.b;
                    fkv fkvVar2 = hkvVar2.a;
                    njvVar.j(str4, ((clv) elvVar).a, fkvVar2 != null ? fkvVar2.a : null);
                    return null;
                }
                if (!(elvVar instanceof dlv)) {
                    return null;
                }
                String str5 = hkvVar2.d.b;
                fkv fkvVar3 = hkvVar2.a;
                String str6 = fkvVar3 != null ? fkvVar3.b : null;
                if (str6 == null) {
                    str6 = "";
                }
                return new qjv(this.D, str2, str5, str6, fkvVar3 != null ? fkvVar3.c : null, fkvVar3 != null ? fkvVar3.d : null, fkvVar3 != null ? fkvVar3.e : null, fkvVar3 != null ? fkvVar3.f : null, fkvVar3 != null ? fkvVar3.g : null, fkvVar3 != null ? fkvVar3.h : null, hkvVar2.c, ((dlv) elvVar).a);
            }
        }
        inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1 = new InAppOutgoingCallRouterImpl$createOutgoingCallPayload$1(this, continuationImpl);
        Object obj2 = inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppOutgoingCallRouterImpl$createOutgoingCallPayload$1.label;
        njv njvVar2 = this.K;
        if (i != 0) {
        }
        elvVar = (elv) obj2;
        if (!(elvVar instanceof clv)) {
        }
    }

    public final void S(hkv hkvVar) {
        String str = hkvVar.d.b;
        njv njvVar = this.K;
        njvVar.k("CallSelection", "Show", new Pair[0]);
        mjv mjvVar = njvVar.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("linkage_id", str);
        mjvVar.a.a("InAppCalls.CallSelection.Shown", hashMap, 2, new HashMap());
        A((m950) this.H.get(), hkvVar, new ukv(this, hkvVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(hkv hkvVar, ContinuationImpl continuationImpl) {
        InAppOutgoingCallRouterImpl$startInAppCall$1 inAppOutgoingCallRouterImpl$startInAppCall$1;
        int i;
        qjv qjvVar;
        Object k;
        if (continuationImpl instanceof InAppOutgoingCallRouterImpl$startInAppCall$1) {
            inAppOutgoingCallRouterImpl$startInAppCall$1 = (InAppOutgoingCallRouterImpl$startInAppCall$1) continuationImpl;
            int i2 = inAppOutgoingCallRouterImpl$startInAppCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppOutgoingCallRouterImpl$startInAppCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppOutgoingCallRouterImpl$startInAppCall$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppOutgoingCallRouterImpl$startInAppCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppOutgoingCallRouterImpl$startInAppCall$1.L$0 = null;
                    inAppOutgoingCallRouterImpl$startInAppCall$1.label = 1;
                    obj = R(hkvVar, inAppOutgoingCallRouterImpl$startInAppCall$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        k = ((Result) obj).getValue();
                        Throwable a = Result.a(k);
                        if (a == null) {
                            return Boolean.TRUE;
                        }
                        this.K.getClass();
                        njv.i(a);
                        return Boolean.FALSE;
                    }
                    kotlin.b.b(obj);
                }
                qjvVar = (qjv) obj;
                if (qjvVar != null) {
                    return Boolean.FALSE;
                }
                inAppOutgoingCallRouterImpl$startInAppCall$1.L$0 = null;
                inAppOutgoingCallRouterImpl$startInAppCall$1.L$1 = null;
                inAppOutgoingCallRouterImpl$startInAppCall$1.label = 2;
                k = this.M.k(qjvVar, inAppOutgoingCallRouterImpl$startInAppCall$1);
            }
        }
        inAppOutgoingCallRouterImpl$startInAppCall$1 = new InAppOutgoingCallRouterImpl$startInAppCall$1(this, continuationImpl);
        Object obj3 = inAppOutgoingCallRouterImpl$startInAppCall$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppOutgoingCallRouterImpl$startInAppCall$1.label;
        if (i != 0) {
        }
        qjvVar = (qjv) obj3;
        if (qjvVar != null) {
        }
    }
}
