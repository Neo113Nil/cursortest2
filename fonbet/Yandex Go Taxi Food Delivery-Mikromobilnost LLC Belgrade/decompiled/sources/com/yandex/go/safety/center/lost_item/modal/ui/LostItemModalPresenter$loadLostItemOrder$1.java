package com.yandex.go.safety.center.lost_item.modal.ui;

import defpackage.dqk0;
import defpackage.irz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v41;
import defpackage.wls;
import defpackage.xqz;
import defpackage.yqz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.ui.LostItemModalPresenter$loadLostItemOrder$1", f = "LostItemModalPresenter.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemModalPresenter$loadLostItemOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ dqk0 $orderId;
    int label;
    final /* synthetic */ yqz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemModalPresenter$loadLostItemOrder$1(yqz yqzVar, dqk0 dqk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yqzVar;
        this.$orderId = dqk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LostItemModalPresenter$loadLostItemOrder$1(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemModalPresenter$loadLostItemOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ((xqz) this.this$0.Dg()).eb(irz.a);
            o c = this.this$0.x.c(this.$orderId);
            v41 v41Var = new v41(7, (xqz) this.this$0.Dg());
            this.label = 1;
            if (c.collect(v41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
