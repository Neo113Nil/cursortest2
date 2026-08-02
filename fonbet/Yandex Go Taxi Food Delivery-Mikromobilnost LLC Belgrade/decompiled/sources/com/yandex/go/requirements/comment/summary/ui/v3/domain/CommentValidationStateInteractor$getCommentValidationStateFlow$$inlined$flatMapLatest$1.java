package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import com.yandex.go.requirements.comment.summary.ui.v3.data.experiment.SummaryCommentValidationExperiment;
import defpackage.g92;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zmc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.CommentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1", f = "CommentValidationStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class CommentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ zmc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1(zmc zmcVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = zmcVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CommentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1 commentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1 = new CommentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        commentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        commentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return commentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = ((SummaryCommentValidationExperiment) obj2).b;
            zmc zmcVar = this.this$0;
            if (z) {
                r0 r0Var = zmcVar.a.a;
                g92Var = new kotlinx.coroutines.flow.o(new jqr(kotlinx.coroutines.flow.e.X(new m0(new com.yandex.go.requirements.comment.summary.ui.v3.data.g(r0Var), com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.p(new com.yandex.go.requirements.comment.summary.ui.v3.data.g(r0Var), r1.c), new CommentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$start$1(null, null)), new CommentValidationStateInteractor$debouncedLoadingStateFlow$1(3, null)), new CommentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1(zmcVar, null)), new CommentValidationStateInteractor$debouncedLoadingStateFlow$3(zmcVar, null), 3), new CommentValidationStateInteractor$debouncedLoadingStateFlow$4(zmcVar, null));
            } else {
                int i2 = zmc.h;
                zmcVar.getClass();
                g92Var = new g92(2, zmc.a());
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
