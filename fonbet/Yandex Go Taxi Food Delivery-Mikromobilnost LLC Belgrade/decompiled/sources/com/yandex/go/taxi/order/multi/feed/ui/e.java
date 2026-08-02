package com.yandex.go.taxi.order.multi.feed.ui;

import defpackage.cck0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o2y0 b;

    public e(vpr vprVar, o2y0 o2y0Var) {
        this.a = vprVar;
        this.b = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) {
            taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = (TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(this.b, (cck0) obj);
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = new TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
