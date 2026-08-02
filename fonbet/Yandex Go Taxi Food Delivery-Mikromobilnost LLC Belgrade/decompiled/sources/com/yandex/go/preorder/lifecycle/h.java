package com.yandex.go.preorder.lifecycle;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ pv0 b;

    public h(b2k b2kVar, pv0 pv0Var) {
        this.a = b2kVar;
        this.b = pv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1 sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof SourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1) {
            sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1 = (SourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b);
                    sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(gVar, sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1 = new SourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
