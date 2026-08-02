package com.yandex.go.loyalty.impl.common.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class e implements tpr {
    public final /* synthetic */ com.yandex.go.navigation.screen.b a;
    public final /* synthetic */ h b;

    public e(com.yandex.go.navigation.screen.b bVar, h hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LoyaltyGeoStateRepository$special$$inlined$map$1$1 loyaltyGeoStateRepository$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof LoyaltyGeoStateRepository$special$$inlined$map$1$1) {
            loyaltyGeoStateRepository$special$$inlined$map$1$1 = (LoyaltyGeoStateRepository$special$$inlined$map$1$1) continuation;
            int i2 = loyaltyGeoStateRepository$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltyGeoStateRepository$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loyaltyGeoStateRepository$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltyGeoStateRepository$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    loyaltyGeoStateRepository$special$$inlined$map$1$1.L$0 = null;
                    loyaltyGeoStateRepository$special$$inlined$map$1$1.L$1 = null;
                    loyaltyGeoStateRepository$special$$inlined$map$1$1.L$2 = null;
                    loyaltyGeoStateRepository$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, loyaltyGeoStateRepository$special$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        loyaltyGeoStateRepository$special$$inlined$map$1$1 = new LoyaltyGeoStateRepository$special$$inlined$map$1$1(this, continuation);
        Object obj2 = loyaltyGeoStateRepository$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltyGeoStateRepository$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
