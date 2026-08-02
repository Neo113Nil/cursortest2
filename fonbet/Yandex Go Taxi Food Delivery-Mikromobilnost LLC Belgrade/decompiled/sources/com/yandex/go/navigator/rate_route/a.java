package com.yandex.go.navigator.rate_route;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.domain.b0;
import defpackage.ny61;
import defpackage.par;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final par a;
    public final b0 b;

    public a(par parVar, b0 b0Var) {
        this.a = parVar;
        this.b = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RateRouteAddressInteractor$addressAtRouteStop$1 rateRouteAddressInteractor$addressAtRouteStop$1;
        int i;
        if (continuationImpl instanceof RateRouteAddressInteractor$addressAtRouteStop$1) {
            rateRouteAddressInteractor$addressAtRouteStop$1 = (RateRouteAddressInteractor$addressAtRouteStop$1) continuationImpl;
            int i2 = rateRouteAddressInteractor$addressAtRouteStop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rateRouteAddressInteractor$addressAtRouteStop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rateRouteAddressInteractor$addressAtRouteStop$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rateRouteAddressInteractor$addressAtRouteStop$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = this.a.e;
                    if (str.length() != 0) {
                        return str;
                    }
                    rateRouteAddressInteractor$addressAtRouteStop$1.L$0 = null;
                    rateRouteAddressInteractor$addressAtRouteStop$1.label = 1;
                    obj = this.b.a(rateRouteAddressInteractor$addressAtRouteStop$1);
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
                return ((Address) obj).D1();
            }
        }
        rateRouteAddressInteractor$addressAtRouteStop$1 = new RateRouteAddressInteractor$addressAtRouteStop$1(this, continuationImpl);
        Object obj3 = rateRouteAddressInteractor$addressAtRouteStop$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rateRouteAddressInteractor$addressAtRouteStop$1.label;
        if (i != 0) {
        }
        return ((Address) obj3).D1();
    }
}
