package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.dk31;
import defpackage.fnx0;
import defpackage.ik31;
import defpackage.kgx;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar, k kVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1 tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1) {
            tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1 = (TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Triple triple = (Triple) obj;
                    dk31 dk31Var = (dk31) triple.getFirst();
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) triple.getSecond();
                    fnx0 fnx0Var = (fnx0) triple.getThird();
                    kgx[] kgxVarArr = k.m;
                    ik31 ik31Var = new ik31(dk31Var, mi31.a(fnx0Var.a, null, fnx0Var.d, 29), priceUpdate$PriceLoadingState, false);
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ik31Var, tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1 = new TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
