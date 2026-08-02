package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import defpackage.g92;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qmc;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vmc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wmc;
import defpackage.xmc;
import defpackage.ymc;
import defpackage.zls;
import defpackage.zmc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.CommentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1", f = "CommentValidationStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class CommentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ zmc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1(zmc zmcVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = zmcVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CommentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1 commentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1 = new CommentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        commentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        commentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return commentValidationStateInteractor$debouncedLoadingStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr rol0Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ymc ymcVar = (ymc) obj2;
            if (jl40.l(ymcVar, wmc.a)) {
                zmc zmcVar = this.this$0;
                int i2 = zmc.h;
                zmcVar.getClass();
                rol0Var = new g92(2, zmc.a());
            } else if (jl40.l(ymcVar, vmc.a)) {
                rol0Var = new g92(2, qmc.a);
            } else {
                if (!(ymcVar instanceof xmc)) {
                    w511.b();
                    return null;
                }
                zmc zmcVar2 = this.this$0;
                String str = ((xmc) ymcVar).a;
                int i3 = zmc.h;
                zmcVar2.getClass();
                rol0Var = new rol0(new CommentValidationStateInteractor$validateComment$1(zmcVar2, str, null));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(rol0Var, vprVar, this) == coroutineSingletons) {
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
