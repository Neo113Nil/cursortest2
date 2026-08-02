package com.yandex.go.chargers.deeplink;

import com.yandex.go.chargers.api.ChargersOpenReason;
import defpackage.hxx;
import defpackage.m2a;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.tq9;
import defpackage.v770;
import defpackage.vq9;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class b extends vq9 {
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
        return d(oep0Var, (tq9) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, tq9 tq9Var, ContinuationImpl continuationImpl) {
        ChargersDeeplinkHandler$handleDeeplink$1 chargersDeeplinkHandler$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof ChargersDeeplinkHandler$handleDeeplink$1) {
            chargersDeeplinkHandler$handleDeeplink$1 = (ChargersDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = chargersDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    chargersDeeplinkHandler$handleDeeplink$1.L$1 = tq9Var;
                    chargersDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    chargersDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    chargersDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.b.a(chargersDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tq9Var = (tq9) chargersDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) chargersDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                ((pep0) oep0Var).f((m950) this.c.get(), new m2a(ChargersOpenReason.DEEPLINK, tq9Var.a()), hxx.a);
                return zy11.a;
            }
        }
        chargersDeeplinkHandler$handleDeeplink$1 = new ChargersDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = chargersDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        ((pep0) oep0Var).f((m950) this.c.get(), new m2a(ChargersOpenReason.DEEPLINK, tq9Var.a()), hxx.a);
        return zy11.a;
    }
}
