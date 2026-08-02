package com.yandex.go.promocodes;

import com.adjust.sdk.Constants;
import com.yandex.go.promocodes.experiment.BenefitsCenterExperiment;
import defpackage.an5;
import defpackage.drf0;
import defpackage.erf0;
import defpackage.evu0;
import defpackage.fx60;
import defpackage.gd;
import defpackage.kqe0;
import defpackage.mrf0;
import defpackage.nn5;
import defpackage.npb;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.on5;
import defpackage.sls;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes8.dex */
public final class b extends erf0 {
    public final com.yandex.go.lifecycle.a b;
    public final yvf0 c;
    public final yvf0 d;
    public final fx60 e;
    public final an5 f;

    public b(com.yandex.go.lifecycle.a aVar, yvf0 yvf0Var, gd gdVar, fx60 fx60Var, an5 an5Var) {
        this.b = aVar;
        this.c = yvf0Var;
        this.d = gdVar;
        this.e = fx60Var;
        this.f = an5Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (drf0) obj, v770Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, drf0 drf0Var, v770 v770Var, ContinuationImpl continuationImpl) {
        PromocodeTypedDeeplinkHandler$handleDeeplink$1 promocodeTypedDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        oep0 oep0Var2;
        v770 v770Var2;
        drf0 drf0Var2;
        if (continuationImpl instanceof PromocodeTypedDeeplinkHandler$handleDeeplink$1) {
            promocodeTypedDeeplinkHandler$handleDeeplink$1 = (PromocodeTypedDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = promocodeTypedDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promocodeTypedDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                PromocodeTypedDeeplinkHandler$handleDeeplink$1 promocodeTypedDeeplinkHandler$handleDeeplink$12 = promocodeTypedDeeplinkHandler$handleDeeplink$1;
                obj = promocodeTypedDeeplinkHandler$handleDeeplink$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promocodeTypedDeeplinkHandler$handleDeeplink$12.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$0 = oep0Var;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$1 = drf0Var;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$2 = v770Var;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$3 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.label = 1;
                    Object b = ((q) this.f.b).b(promocodeTypedDeeplinkHandler$handleDeeplink$12);
                    if (b != obj2) {
                        oep0Var2 = oep0Var;
                        v770Var2 = v770Var;
                        obj = b;
                        drf0Var2 = drf0Var;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                v770 v770Var3 = (v770) promocodeTypedDeeplinkHandler$handleDeeplink$12.L$2;
                drf0Var2 = (drf0) promocodeTypedDeeplinkHandler$handleDeeplink$12.L$1;
                oep0 oep0Var3 = (oep0) promocodeTypedDeeplinkHandler$handleDeeplink$12.L$0;
                kotlin.b.b(obj);
                v770Var2 = v770Var3;
                oep0Var2 = oep0Var3;
                String a = drf0Var2.a();
                if (((BenefitsCenterExperiment) obj).b) {
                    mrf0 mrf0Var = new mrf0((a == null || evu0.J(a)) ? null : drf0Var2.b(), v770Var2, 2);
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$0 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$1 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$2 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$3 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$4 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$5 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$6 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$7 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.label = 3;
                    Object e = e(new kqe0(i3, oep0Var2, this, mrf0Var), promocodeTypedDeeplinkHandler$handleDeeplink$12);
                    if (e != obj2) {
                        return e;
                    }
                } else {
                    Object nn5Var = (a == null || evu0.J(a)) ? new nn5() : new on5(a);
                    String queryParameter = drf0Var2.b().getQueryParameter("origin");
                    if (queryParameter == null) {
                        queryParameter = Constants.DEEPLINK;
                    }
                    String queryParameter2 = drf0Var2.b().getQueryParameter("section");
                    if (queryParameter2 == null) {
                        queryParameter2 = "discounts";
                    }
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$0 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$1 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$2 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$3 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$4 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$5 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$6 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$7 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.L$8 = null;
                    promocodeTypedDeeplinkHandler$handleDeeplink$12.label = 2;
                    Object e2 = e(new npb(oep0Var2, this, queryParameter, nn5Var, queryParameter2, 4), promocodeTypedDeeplinkHandler$handleDeeplink$12);
                    if (e2 != obj2) {
                        return e2;
                    }
                }
                return obj2;
            }
        }
        promocodeTypedDeeplinkHandler$handleDeeplink$1 = new PromocodeTypedDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        PromocodeTypedDeeplinkHandler$handleDeeplink$1 promocodeTypedDeeplinkHandler$handleDeeplink$122 = promocodeTypedDeeplinkHandler$handleDeeplink$1;
        obj = promocodeTypedDeeplinkHandler$handleDeeplink$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promocodeTypedDeeplinkHandler$handleDeeplink$122.label;
        int i32 = 2;
        if (i != 0) {
        }
        String a2 = drf0Var2.a();
        if (((BenefitsCenterExperiment) obj).b) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r5.b.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sls slsVar, ContinuationImpl continuationImpl) {
        PromocodeTypedDeeplinkHandler$waitForUserAuthorized$1 promocodeTypedDeeplinkHandler$waitForUserAuthorized$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        sls slsVar2;
        if (continuationImpl instanceof PromocodeTypedDeeplinkHandler$waitForUserAuthorized$1) {
            promocodeTypedDeeplinkHandler$waitForUserAuthorized$1 = (PromocodeTypedDeeplinkHandler$waitForUserAuthorized$1) continuationImpl;
            int i2 = promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label = i2 - Integer.MIN_VALUE;
                obj = promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = slsVar;
                    promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        slsVar2 = (sls) promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            slsVar2.invoke();
                        }
                        return zy11.a;
                    }
                    slsVar = (sls) promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0;
                    kotlin.b.b(obj);
                }
                Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = slsVar;
                promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label = 2;
                obj = this.e.c(events$Zalogin$LoginContext, promocodeTypedDeeplinkHandler$waitForUserAuthorized$1);
                if (obj != coroutineSingletons) {
                    slsVar2 = slsVar;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        promocodeTypedDeeplinkHandler$waitForUserAuthorized$1 = new PromocodeTypedDeeplinkHandler$waitForUserAuthorized$1(this, continuationImpl);
        obj = promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label;
        if (i != 0) {
        }
        Events$Zalogin$LoginContext events$Zalogin$LoginContext2 = Events$Zalogin$LoginContext.DEEPLINK;
        promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = slsVar;
        promocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label = 2;
        obj = this.e.c(events$Zalogin$LoginContext2, promocodeTypedDeeplinkHandler$waitForUserAuthorized$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
