package com.yandex.go.taxi.summary.drive.interactor;

import defpackage.apf;
import defpackage.dk31;
import defpackage.ik31;
import defpackage.iqx0;
import defpackage.mi31;
import defpackage.mrx0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.za31;
import defpackage.zxs0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ apf b;

    public a(vpr vprVar, apf apfVar) {
        this.a = vprVar;
        this.b = apfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DriveTariffsInteractor$stateFlow$$inlined$map$1$2$1 driveTariffsInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        iqx0 iqx0Var;
        if (continuation instanceof DriveTariffsInteractor$stateFlow$$inlined$map$1$2$1) {
            driveTariffsInteractor$stateFlow$$inlined$map$1$2$1 = (DriveTariffsInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ik31 ik31Var = (ik31) obj;
                    dk31 dk31Var = ik31Var.a;
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = ik31Var.c;
                    if (dk31Var.a.isEmpty()) {
                        iqx0Var = new iqx0(EmptyList.a, priceUpdate$PriceLoadingState);
                    } else {
                        za31 za31Var = (za31) dk31Var.a.get(0);
                        apf apfVar = this.b;
                        mrx0 mrx0Var = (mrx0) apfVar.w;
                        List list = za31Var.b;
                        String str = za31Var.d;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((mi31) it.next()).d(str));
                        }
                        iqx0Var = new iqx0(((zxs0) apfVar.x).q(mrx0Var.a(arrayList, ik31Var.c, ik31Var.b, true, dk31Var.d), str), priceUpdate$PriceLoadingState);
                    }
                    driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(iqx0Var, driveTariffsInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        driveTariffsInteractor$stateFlow$$inlined$map$1$2$1 = new DriveTariffsInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveTariffsInteractor$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
