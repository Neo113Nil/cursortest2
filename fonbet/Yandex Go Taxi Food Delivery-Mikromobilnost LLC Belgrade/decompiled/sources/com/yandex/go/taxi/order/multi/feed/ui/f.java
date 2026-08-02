package com.yandex.go.taxi.order.multi.feed.ui;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ o2y0 b;

    public f(tpr tprVar, o2y0 o2y0Var) {
        this.a = tprVar;
        this.b = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1 taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1) {
            taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1 = (TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1) continuation;
            int i2 = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.L$0 = null;
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.L$1 = null;
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.L$2 = null;
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1 = new TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
