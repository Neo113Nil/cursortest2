package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ d a;
    public final /* synthetic */ k b;

    public f(d dVar, k kVar) {
        this.a = dVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1 tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1) {
            tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1 = (TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1) continuation;
            int i2 = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.L$0 = null;
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.L$1 = null;
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.L$2 = null;
                    tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1 = new TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
