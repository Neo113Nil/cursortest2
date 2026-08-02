package com.yandex.go.taxi.order.domain.interactors;

import com.yandex.go.taxi.order.experiments.ColorizedCarIconExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import defpackage.an91;
import defpackage.e58;
import defpackage.g8h;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.y3h0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class s {
    public final g8h a;
    public final t1b0 b;

    public s(g8h g8hVar, rqo rqoVar) {
        this.a = g8hVar;
        this.b = ((jbh) rqoVar).e(ColorizedCarIconExperiment.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        TaxiOrderCarImageInteractor$carImage$1 taxiOrderCarImageInteractor$carImage$1;
        int i;
        Integer num;
        ColorizedCarIconExperiment colorizedCarIconExperiment;
        if (continuationImpl instanceof TaxiOrderCarImageInteractor$carImage$1) {
            taxiOrderCarImageInteractor$carImage$1 = (TaxiOrderCarImageInteractor$carImage$1) continuationImpl;
            int i2 = taxiOrderCarImageInteractor$carImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderCarImageInteractor$carImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderCarImageInteractor$carImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderCarImageInteractor$carImage$1.label;
                num = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (an91.i(taxiOrder.h.getB()) || ((an91.h(taxiOrder.h.getB()) && jl40.l(taxiOrder.V().g, Driver.v)) || taxiOrder.h.getB() == DriveState.CHECK_IN || taxiOrder.h.getB() == DriveState.EXPIRED)) {
                        return null;
                    }
                    g8h g8hVar = this.a;
                    taxiOrder.x();
                    g8hVar.getClass();
                    int i3 = y3h0.tariff_icon;
                    this.a.getClass();
                    t1b0 t1b0Var = this.b;
                    taxiOrderCarImageInteractor$carImage$1.L$0 = taxiOrder;
                    taxiOrderCarImageInteractor$carImage$1.I$0 = i3;
                    taxiOrderCarImageInteractor$carImage$1.label = 1;
                    obj = t1b0Var.b(taxiOrderCarImageInteractor$carImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    taxiOrder = (TaxiOrder) taxiOrderCarImageInteractor$carImage$1.L$0;
                    kotlin.b.b(obj);
                }
                colorizedCarIconExperiment = (ColorizedCarIconExperiment) obj;
                if (colorizedCarIconExperiment.b && colorizedCarIconExperiment.c.contains(taxiOrder.x())) {
                    num = q5z.S(taxiOrder.V().g.getA());
                }
                String str = taxiOrder.b.f0;
                g8h g8hVar2 = this.a;
                taxiOrder.x();
                g8hVar2.getClass();
                return new e58(y3h0.tariff_icon, num, str);
            }
        }
        taxiOrderCarImageInteractor$carImage$1 = new TaxiOrderCarImageInteractor$carImage$1(this, continuationImpl);
        Object obj2 = taxiOrderCarImageInteractor$carImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderCarImageInteractor$carImage$1.label;
        num = null;
        if (i != 0) {
        }
        colorizedCarIconExperiment = (ColorizedCarIconExperiment) obj2;
        if (colorizedCarIconExperiment.b) {
            num = q5z.S(taxiOrder.V().g.getA());
        }
        String str2 = taxiOrder.b.f0;
        g8h g8hVar22 = this.a;
        taxiOrder.x();
        g8hVar22.getClass();
        return new e58(y3h0.tariff_icon, num, str2);
    }
}
