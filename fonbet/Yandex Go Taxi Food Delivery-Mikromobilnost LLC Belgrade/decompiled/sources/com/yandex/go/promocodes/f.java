package com.yandex.go.promocodes;

import defpackage.fx60;
import defpackage.kqe0;
import defpackage.nrf0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.oni0;
import defpackage.pni0;
import defpackage.sls;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class f extends pni0 {
    public final com.yandex.go.lifecycle.a b;
    public final yvf0 c;
    public final fx60 d;

    public f(com.yandex.go.lifecycle.a aVar, yvf0 yvf0Var, fx60 fx60Var) {
        this.b = aVar;
        this.c = yvf0Var;
        this.d = fx60Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(new kqe0(6, oep0Var, this, new nrf0(((oni0) obj).a(), v770Var)), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r5.b.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v4, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kqe0 kqe0Var, ContinuationImpl continuationImpl) {
        ReferralTypedDeeplinkHandler$waitForUserAuthorized$1 referralTypedDeeplinkHandler$waitForUserAuthorized$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        kqe0 kqe0Var2;
        sls slsVar;
        if (continuationImpl instanceof ReferralTypedDeeplinkHandler$waitForUserAuthorized$1) {
            referralTypedDeeplinkHandler$waitForUserAuthorized$1 = (ReferralTypedDeeplinkHandler$waitForUserAuthorized$1) continuationImpl;
            int i2 = referralTypedDeeplinkHandler$waitForUserAuthorized$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                referralTypedDeeplinkHandler$waitForUserAuthorized$1.label = i2 - Integer.MIN_VALUE;
                obj = referralTypedDeeplinkHandler$waitForUserAuthorized$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = referralTypedDeeplinkHandler$waitForUserAuthorized$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    referralTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = kqe0Var;
                    referralTypedDeeplinkHandler$waitForUserAuthorized$1.label = 1;
                    kqe0Var2 = kqe0Var;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        slsVar = (sls) referralTypedDeeplinkHandler$waitForUserAuthorized$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            slsVar.invoke();
                        }
                        return zy11.a;
                    }
                    ?? r6 = (sls) referralTypedDeeplinkHandler$waitForUserAuthorized$1.L$0;
                    kotlin.b.b(obj);
                    kqe0Var2 = r6;
                }
                Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                referralTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = kqe0Var2;
                referralTypedDeeplinkHandler$waitForUserAuthorized$1.label = 2;
                obj = this.d.c(events$Zalogin$LoginContext, referralTypedDeeplinkHandler$waitForUserAuthorized$1);
                if (obj != coroutineSingletons) {
                    slsVar = kqe0Var2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        referralTypedDeeplinkHandler$waitForUserAuthorized$1 = new ReferralTypedDeeplinkHandler$waitForUserAuthorized$1(this, continuationImpl);
        obj = referralTypedDeeplinkHandler$waitForUserAuthorized$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = referralTypedDeeplinkHandler$waitForUserAuthorized$1.label;
        if (i != 0) {
        }
        Events$Zalogin$LoginContext events$Zalogin$LoginContext2 = Events$Zalogin$LoginContext.DEEPLINK;
        referralTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = kqe0Var2;
        referralTypedDeeplinkHandler$waitForUserAuthorized$1.label = 2;
        obj = this.d.c(events$Zalogin$LoginContext2, referralTypedDeeplinkHandler$waitForUserAuthorized$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
