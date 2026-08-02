package com.yandex.go.scooters.deeplink;

import defpackage.hxx;
import defpackage.m950;
import defpackage.ny61;
import defpackage.odn0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.qdn0;
import defpackage.s4b1;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class b extends qdn0 {
    public final com.yandex.go.lifecycle.a b;
    public final yvf0 c;

    public b(yvf0 yvf0Var, com.yandex.go.lifecycle.a aVar) {
        this.b = aVar;
        this.c = yvf0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (odn0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, odn0 odn0Var, ContinuationImpl continuationImpl) {
        ScootersDeeplinkHandler$handleDeeplink$1 scootersDeeplinkHandler$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof ScootersDeeplinkHandler$handleDeeplink$1) {
            scootersDeeplinkHandler$handleDeeplink$1 = (ScootersDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = scootersDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    scootersDeeplinkHandler$handleDeeplink$1.L$1 = odn0Var;
                    scootersDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    scootersDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    scootersDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.b.a(scootersDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    odn0Var = (odn0) scootersDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) scootersDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                ((pep0) oep0Var).f((m950) this.c.get(), s4b1.c(odn0Var), hxx.a);
                return zy11.a;
            }
        }
        scootersDeeplinkHandler$handleDeeplink$1 = new ScootersDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = scootersDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        ((pep0) oep0Var).f((m950) this.c.get(), s4b1.c(odn0Var), hxx.a);
        return zy11.a;
    }
}
