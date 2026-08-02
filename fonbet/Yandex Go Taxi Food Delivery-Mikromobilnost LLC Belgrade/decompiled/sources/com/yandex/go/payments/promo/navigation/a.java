package com.yandex.go.payments.promo.navigation;

import defpackage.ci3;
import defpackage.fx60;
import defpackage.hxx;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.rfz0;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class a extends rfz0 {
    public final fx60 b;
    public final yvf0 c;

    public a(fx60 fx60Var, ci3 ci3Var) {
        this.b = fx60Var;
        this.c = ci3Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ContinuationImpl continuationImpl) {
        TipsDeeplinkHandler$handleDeeplink$1 tipsDeeplinkHandler$handleDeeplink$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof TipsDeeplinkHandler$handleDeeplink$1) {
            tipsDeeplinkHandler$handleDeeplink$1 = (TipsDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = tipsDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tipsDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tipsDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tipsDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    tipsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    tipsDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    tipsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    tipsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    tipsDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.b.c(events$Zalogin$LoginContext, tipsDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oep0Var = (oep0) tipsDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue) {
                    ((pep0) oep0Var).f((m950) this.c.get(), zy11Var, hxx.a);
                }
                return zy11Var;
            }
        }
        tipsDeeplinkHandler$handleDeeplink$1 = new TipsDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = tipsDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tipsDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
        }
        return zy11Var2;
    }
}
