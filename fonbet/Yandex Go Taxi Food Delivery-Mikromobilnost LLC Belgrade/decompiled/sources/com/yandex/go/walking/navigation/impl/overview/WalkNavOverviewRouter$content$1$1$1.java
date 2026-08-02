package com.yandex.go.walking.navigation.impl.overview;

import defpackage.d541;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s441;
import defpackage.t441;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.overview.WalkNavOverviewRouter$content$1$1$1", f = "WalkNavOverviewRouter.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavOverviewRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ d541 $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ t441 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavOverviewRouter$content$1$1$1(t441 t441Var, yfd yfdVar, d541 d541Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = t441Var;
        this.$this_buildContent = yfdVar;
        this.$action = d541Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavOverviewRouter$content$1$1$1(this.this$0, this.$this_buildContent, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavOverviewRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t441 t441Var = this.this$0;
            com.yandex.go.walking.navigation.impl.overview.interactor.a aVar = t441Var.I;
            d541 d541Var = this.$action;
            s441 s441Var = new s441(t441Var);
            this.label = 1;
            if (aVar.a(d541Var, s441Var, this) == coroutineSingletons) {
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
