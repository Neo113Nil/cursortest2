package com.yandex.go.scooters.passes.domain;

import com.yandex.go.scooters.passes.data.model.actions.ScootersUnfreezePassAction;
import com.ybsdk.widgets.common.BlendingGradientView;
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
@mvg(c = "com.yandex.go.scooters.passes.domain.ScootersPassesDocumentsInteractor$handleUnfreeze$3", f = "ScootersPassesDocumentsInteractor.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesDocumentsInteractor$handleUnfreeze$3 extends SuspendLambda implements tls {
    final /* synthetic */ ScootersUnfreezePassAction $action;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesDocumentsInteractor$handleUnfreeze$3(h hVar, ScootersUnfreezePassAction scootersUnfreezePassAction, Continuation continuation) {
        super(1, continuation);
        this.this$0 = hVar;
        this.$action = scootersUnfreezePassAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersPassesDocumentsInteractor$handleUnfreeze$3(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersPassesDocumentsInteractor$handleUnfreeze$3) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.c.d(true);
            yfo0 yfo0Var = this.this$0.b;
            String str = this.$action.a;
            this.label = 1;
            if (((com.yandex.go.scooters.passes.data.d) yfo0Var).f(str, this) == coroutineSingletons) {
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
