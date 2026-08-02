package com.yandex.go.scooters.passes.active.v3.winback.domain;

import com.yandex.go.scooters.passes.data.d;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yfo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.winback.domain.ScootersApplyWinbackInteractor$applyWinback$2", f = "ScootersApplyWinbackInteractor.kt", l = {15}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersApplyWinbackInteractor$applyWinback$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $passId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersApplyWinbackInteractor$applyWinback$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersApplyWinbackInteractor$applyWinback$2(this.this$0, this.$passId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersApplyWinbackInteractor$applyWinback$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            yfo0 yfo0Var = this.this$0.a;
            this.label = 1;
            if (((d) yfo0Var).a(this) == coroutineSingletons) {
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
