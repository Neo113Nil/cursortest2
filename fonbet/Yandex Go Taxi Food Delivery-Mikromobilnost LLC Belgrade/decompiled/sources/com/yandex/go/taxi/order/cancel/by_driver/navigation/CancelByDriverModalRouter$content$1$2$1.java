package com.yandex.go.taxi.order.cancel.by_driver.navigation;

import defpackage.agd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pu7;
import defpackage.qu7;
import defpackage.su7;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.by_driver.navigation.CancelByDriverModalRouter$content$1$2$1", f = "CancelByDriverModalRouter.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelByDriverModalRouter$content$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ qu7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelByDriverModalRouter$content$1$2$1(qu7 qu7Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qu7Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelByDriverModalRouter$content$1$2$1(this.this$0, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelByDriverModalRouter$content$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.cancel.by_driver.domain.a aVar = this.this$0.K;
            o2y0 o2y0Var = ((pu7) ((agd) this.$this_buildContent).a).a;
            this.label = 1;
            if (aVar.a(su7.a, o2y0Var, this) == coroutineSingletons) {
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
