package com.yandex.go.superapp.order.multi.old.provider;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.provider.MultiOrderProvider$startOrdersSubscription$1", f = "MultiOrderProvider.kt", l = {402}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MultiOrderProvider$startOrdersSubscription$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $flow;
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiOrderProvider$startOrdersSubscription$1(tpr tprVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$flow = tprVar;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiOrderProvider$startOrdersSubscription$1(this.$flow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiOrderProvider$startOrdersSubscription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$flow;
            g gVar = this.this$0;
            o oVar = new o(tprVar, new MultiOrderProvider$startOrdersSubscription$1$invokeSuspend$$inlined$safeCollect$1(3, null));
            ocz oczVar = new ocz(13, gVar);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(oczVar, this) == coroutineSingletons) {
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
