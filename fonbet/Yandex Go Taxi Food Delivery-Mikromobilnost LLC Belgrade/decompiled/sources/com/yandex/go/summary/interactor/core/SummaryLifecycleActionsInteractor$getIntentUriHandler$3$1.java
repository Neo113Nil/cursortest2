package com.yandex.go.summary.interactor.core;

import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import defpackage.mvg;
import defpackage.nqv0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vqv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$getIntentUriHandler$3$1", f = "SummaryLifecycleActionsInteractor.kt", l = {452}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryLifecycleActionsInteractor$getIntentUriHandler$3$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryLifecycleActionsInteractor$getIntentUriHandler$3$1(t tVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryLifecycleActionsInteractor$getIntentUriHandler$3$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryLifecycleActionsInteractor$getIntentUriHandler$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vqv0 vqv0Var = this.this$0.a0;
            nqv0 nqv0Var = new nqv0(CommentViewSource.DEEPLINK);
            this.label = 1;
            if (vqv0Var.a.emit(nqv0Var, this) == coroutineSingletons) {
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
