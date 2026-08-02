package com.yandex.go.taxi.order.details.v1.elements.payment;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.u6j;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ u6j b;

    public f(g gVar, u6j u6jVar) {
        this.a = gVar;
        this.b = u6jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DetailsCardPaymentStateRepository$special$$inlined$map$1$1 detailsCardPaymentStateRepository$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof DetailsCardPaymentStateRepository$special$$inlined$map$1$1) {
            detailsCardPaymentStateRepository$special$$inlined$map$1$1 = (DetailsCardPaymentStateRepository$special$$inlined$map$1$1) continuation;
            int i2 = detailsCardPaymentStateRepository$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardPaymentStateRepository$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardPaymentStateRepository$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardPaymentStateRepository$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    detailsCardPaymentStateRepository$special$$inlined$map$1$1.L$0 = null;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$1.L$1 = null;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$1.L$2 = null;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, detailsCardPaymentStateRepository$special$$inlined$map$1$1) == coroutineSingletons) {
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
        detailsCardPaymentStateRepository$special$$inlined$map$1$1 = new DetailsCardPaymentStateRepository$special$$inlined$map$1$1(this, continuation);
        Object obj2 = detailsCardPaymentStateRepository$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardPaymentStateRepository$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
