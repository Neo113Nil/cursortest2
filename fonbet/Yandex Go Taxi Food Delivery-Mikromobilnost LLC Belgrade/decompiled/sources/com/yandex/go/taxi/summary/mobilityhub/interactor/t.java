package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import defpackage.d0l0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;

    public t(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1 transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1;
        int i;
        Pair pair;
        zzs B;
        zzs B2;
        if (continuation instanceof TransportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1) {
            transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1 = (TransportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d0l0 d0l0Var = (d0l0) obj;
                    Address h = d0l0Var.h();
                    if (h != null && (B = h.B()) != null) {
                        Point point = new Point(B.a, B.b);
                        Address b = d0l0Var.b();
                        if (b != null && (B2 = b.B()) != null) {
                            pair = new Pair(point, new Point(B2.a, B2.b));
                            if (pair != null) {
                                transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.L$0 = null;
                                transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.L$1 = null;
                                transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.L$2 = null;
                                transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.L$3 = null;
                                transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.L$4 = null;
                                transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.label = 1;
                                if (this.a.emit(pair, transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    pair = null;
                    if (pair != null) {
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
        transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1 = new TransportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
