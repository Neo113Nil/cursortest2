package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oli0;
import defpackage.pli0;
import defpackage.rmc;
import defpackage.ski0;
import defpackage.tmc;
import defpackage.wki0;
import defpackage.wls;
import defpackage.zki0;
import defpackage.zmc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltmc;", "it", "Lzy11;", "<anonymous>", "(Ltmc;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.CommentValidationStateInteractor$debouncedLoadingStateFlow$3", f = "CommentValidationStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CommentValidationStateInteractor$debouncedLoadingStateFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zmc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentValidationStateInteractor$debouncedLoadingStateFlow$3(zmc zmcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zmcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CommentValidationStateInteractor$debouncedLoadingStateFlow$3 commentValidationStateInteractor$debouncedLoadingStateFlow$3 = new CommentValidationStateInteractor$debouncedLoadingStateFlow$3(this.this$0, continuation);
        commentValidationStateInteractor$debouncedLoadingStateFlow$3.L$0 = obj;
        return commentValidationStateInteractor$debouncedLoadingStateFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CommentValidationStateInteractor$debouncedLoadingStateFlow$3 commentValidationStateInteractor$debouncedLoadingStateFlow$3 = (CommentValidationStateInteractor$debouncedLoadingStateFlow$3) create((tmc) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        commentValidationStateInteractor$debouncedLoadingStateFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tmc tmcVar = (tmc) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        oli0 oli0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pli0 pli0Var = this.this$0.b;
        rmc rmcVar = tmcVar instanceof rmc ? (rmc) tmcVar : null;
        if (rmcVar != null) {
            zki0 zki0Var = rmcVar.a.d;
            if (zki0Var instanceof wki0) {
                wki0 wki0Var = (wki0) zki0Var;
                oli0Var = new oli0(wki0Var.a, wki0Var.b);
            } else if (jl40.l(zki0Var, ski0.a)) {
                oli0Var = new oli0(null, null);
            }
        }
        pli0Var.a.l(oli0Var);
        return zy11.a;
    }
}
