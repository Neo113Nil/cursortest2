package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"T", "Lrsn;", "acc", "value", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.CoroutinesCompatKt$withPreviousEmit$1", f = "CoroutinesCompat.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1 tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1 = new TariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1(3, (Continuation) obj3);
        tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1.L$0 = (rsn) obj;
        tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1.L$1 = obj2;
        return tariffsRepository$pickedTariffOptionsFlow_delegate$lambda$0$$inlined$debounce$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rsn rsnVar = (rsn) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new rsn(rsnVar != null ? rsnVar.b : null, obj2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
