package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.repository.TariffsRepository$setSelectedTariff$1", f = "TariffsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TariffsRepository$setSelectedTariff$1 extends SuspendLambda implements wls {
    final /* synthetic */ gnx0 $tariffSelectionChange;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffsRepository$setSelectedTariff$1(k kVar, gnx0 gnx0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$tariffSelectionChange = gnx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffsRepository$setSelectedTariff$1(this.this$0, this.$tariffSelectionChange, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TariffsRepository$setSelectedTariff$1 tariffsRepository$setSelectedTariff$1 = (TariffsRepository$setSelectedTariff$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tariffsRepository$setSelectedTariff$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        gnx0 gnx0Var = this.$tariffSelectionChange;
        fnx0 fnx0Var = gnx0Var.a;
        boolean z = gnx0Var.b;
        kgx[] kgxVarArr = k.m;
        kVar.p(fnx0Var, z, false);
        return zy11.a;
    }
}
