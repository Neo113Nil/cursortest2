package com.yandex.go.taxi.order.communications;

import defpackage.bvf0;
import defpackage.kpf0;
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
@mvg(c = "com.yandex.go.taxi.order.communications.ToggleCommunicationsViewHolder$bind$1", f = "ToggleCommunicationsViewHolder.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ToggleCommunicationsViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ kpf0 $item;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleCommunicationsViewHolder$bind$1(kpf0 kpf0Var, k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$item = kpf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToggleCommunicationsViewHolder$bind$1(this.$item, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ToggleCommunicationsViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar = this.this$0;
            kpf0 kpf0Var = this.$item;
            this.label = 1;
            int i2 = k.l0;
            kVar.getClass();
            Object n = bvf0.n(new ToggleCommunicationsViewHolder$bindInternal$2(kpf0Var, kVar, null), this);
            if (n != coroutineSingletons) {
                n = zy11Var;
            }
            if (n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
