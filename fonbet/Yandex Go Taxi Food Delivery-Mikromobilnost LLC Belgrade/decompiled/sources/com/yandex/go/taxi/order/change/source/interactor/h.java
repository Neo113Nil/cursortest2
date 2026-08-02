package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public h(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChangeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1 changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ChangeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1) {
            changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1 = (ChangeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1) continuation;
            int i2 = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    vpr vprVar = this.a;
                    Iterator it = ((TaxiOrder) obj).i.e().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((com.yandex.go.taxi.order.models.api.e) obj2).getA(), this.b)) {
                            break;
                        }
                    }
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.L$0 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.L$1 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.L$2 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.L$3 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(obj2, changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1 = new ChangeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1(this, continuation);
        Object obj32 = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
