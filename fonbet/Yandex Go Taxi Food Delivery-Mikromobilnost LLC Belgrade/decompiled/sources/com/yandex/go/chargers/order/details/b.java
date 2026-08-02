package com.yandex.go.chargers.order.details;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zba;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zba b;

    public b(vpr vprVar, zba zbaVar) {
        this.a = vprVar;
        this.b = zbaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1 chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1) {
            chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1 = (ChargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1) continuation;
            int i2 = chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    for (Object obj3 : ((rl9) obj).a) {
                        if (jl40.l(((taa) obj3).a(), this.b.A)) {
                            chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.L$0 = null;
                            chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.L$1 = null;
                            chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.L$2 = null;
                            chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.L$3 = null;
                            chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(obj3, chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    w511.i("Collection contains no element matching the predicate.");
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                return zy11.a;
            }
        }
        chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1 = new ChargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrderDetailsPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
