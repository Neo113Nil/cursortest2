package com.yandex.go.taxi.order.common;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.jq60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.common.OrderFragmentPresenterDelegate$attach$1", f = "OrderFragmentPresenterDelegate.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderFragmentPresenterDelegate$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onActiveOrdersUpdated;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFragmentPresenterDelegate$attach$1(f fVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$onActiveOrdersUpdated = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderFragmentPresenterDelegate$attach$1(this.this$0, this.$onActiveOrdersUpdated, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderFragmentPresenterDelegate$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(((e0) this.this$0.r).n());
            jq60 jq60Var = new jq60(i2, this.$onActiveOrdersUpdated);
            this.label = 1;
            if (t.collect(jq60Var, this) == coroutineSingletons) {
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
