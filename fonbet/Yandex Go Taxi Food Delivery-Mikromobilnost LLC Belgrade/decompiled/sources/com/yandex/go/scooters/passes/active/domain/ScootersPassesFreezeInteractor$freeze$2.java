package com.yandex.go.scooters.passes.active.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yfo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.domain.ScootersPassesFreezeInteractor$freeze$2", f = "ScootersPassesFreezeInteractor.kt", l = {14}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesFreezeInteractor$freeze$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $passId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesFreezeInteractor$freeze$2(d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersPassesFreezeInteractor$freeze$2(this.this$0, this.$passId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersPassesFreezeInteractor$freeze$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            yfo0 yfo0Var = this.this$0.a;
            String str = this.$passId;
            this.label = 1;
            if (((com.yandex.go.scooters.passes.data.d) yfo0Var).c(str, this) == coroutineSingletons) {
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
