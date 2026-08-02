package com.yandex.go.preorder.lifecycle;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pv0 b;

    public g(vpr vprVar, pv0 pv0Var) {
        this.a = vprVar;
        this.b = pv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1 sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1) {
            sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1 = (SourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address address = (Address) kotlin.collections.a.b0(((d0l0) obj).b);
                    pv0 pv0Var = this.b;
                    boolean l = jl40.l(pv0Var.a.getOriginPoint(), address != null ? address.getOriginPoint() : null);
                    boolean l2 = jl40.l(pv0Var.a.getOriginPoint(), address != null ? address.B() : null);
                    if (!l && !l2) {
                        pv0Var = null;
                    }
                    if (pv0Var != null) {
                        sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(pv0Var, sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1 = new SourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointDestinationChangeListener$addressInfoForLastRouteAddressFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
