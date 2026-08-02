package com.yandex.go.requirements.comment.summary.ui.v3.ui.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s;
import defpackage.tse;
import defpackage.wls;
import defpackage.y0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.ui.router.AIRequirementsCommentModalRouter$content$1$1$1", f = "AIRequirementsCommentModalRouter.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AIRequirementsCommentModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.requirements.comment.summary.ui.v3.domain.a $aIRequirementsCommentUiActionInteractor;
    final /* synthetic */ y0 $action;
    final /* synthetic */ s $innerNavigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIRequirementsCommentModalRouter$content$1$1$1(com.yandex.go.requirements.comment.summary.ui.v3.domain.a aVar, y0 y0Var, s sVar, Continuation continuation) {
        super(2, continuation);
        this.$aIRequirementsCommentUiActionInteractor = aVar;
        this.$action = y0Var;
        this.$innerNavigator = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AIRequirementsCommentModalRouter$content$1$1$1(this.$aIRequirementsCommentUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AIRequirementsCommentModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.requirements.comment.summary.ui.v3.domain.a aVar = this.$aIRequirementsCommentUiActionInteractor;
            y0 y0Var = this.$action;
            s sVar = this.$innerNavigator;
            this.label = 1;
            if (aVar.a(y0Var, sVar, this) == coroutineSingletons) {
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
