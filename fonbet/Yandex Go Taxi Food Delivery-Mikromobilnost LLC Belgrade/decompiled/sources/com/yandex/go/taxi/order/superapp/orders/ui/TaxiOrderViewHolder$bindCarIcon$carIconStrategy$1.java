package com.yandex.go.taxi.order.superapp.orders.ui;

import defpackage.bkx0;
import defpackage.bvc0;
import defpackage.f58;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.ui.TaxiOrderViewHolder$bindCarIcon$carIconStrategy$1", f = "TaxiOrderViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderViewHolder$bindCarIcon$carIconStrategy$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewHolder$bindCarIcon$carIconStrategy$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderViewHolder$bindCarIcon$carIconStrategy$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderViewHolder$bindCarIcon$carIconStrategy$1 taxiOrderViewHolder$bindCarIcon$carIconStrategy$1 = (TaxiOrderViewHolder$bindCarIcon$carIconStrategy$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderViewHolder$bindCarIcon$carIconStrategy$1.invokeSuspend(zy11Var);
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
        f58 f58Var = this.this$0.C0;
        ((CarIndexContainerView) f58Var.b).bind((bvc0) null, new bkx0(25));
        return zy11.a;
    }
}
