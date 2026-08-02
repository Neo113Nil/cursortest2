package com.yandex.go.rida.bids.router;

import com.yandex.go.rida.bids.interactor.j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ur5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.router.BidsModalRouter$content$1$1$1", f = "BidsModalRouter.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ur5 $it;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsModalRouter$content$1$1$1(e eVar, ur5 ur5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$it = ur5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidsModalRouter$content$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BidsModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            j jVar = eVar.J;
            ur5 ur5Var = this.$it;
            d dVar = eVar.R;
            this.label = 1;
            if (jVar.a(ur5Var, dVar, this) == coroutineSingletons) {
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
