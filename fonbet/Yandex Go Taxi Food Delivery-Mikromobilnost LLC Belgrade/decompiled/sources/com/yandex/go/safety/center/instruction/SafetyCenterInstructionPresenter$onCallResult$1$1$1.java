package com.yandex.go.safety.center.instruction;

import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.instruction.SafetyCenterInstructionPresenter$onCallResult$1$1$1", f = "SafetyCenterInstructionPresenter.kt", l = {235}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterInstructionPresenter$onCallResult$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ShareRequestParam.NotificationType $notificationType;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterInstructionPresenter$onCallResult$1$1$1(h hVar, ShareRequestParam.NotificationType notificationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$notificationType = notificationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterInstructionPresenter$onCallResult$1$1$1(this.this$0, this.$notificationType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterInstructionPresenter$onCallResult$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            j jVar = hVar.B;
            ShareRequestParam n = jVar.n(hVar.M, this.$notificationType, EmptyList.a);
            this.label = 1;
            if (jVar.l(n, this) == coroutineSingletons) {
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
