package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vmc;
import defpackage.wmc;
import defpackage.xmc;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "immediateInput", "debounceInput", "Lymc;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;)Lymc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.CommentValidationStateInteractor$debouncedLoadingStateFlow$1", f = "CommentValidationStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CommentValidationStateInteractor$debouncedLoadingStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CommentValidationStateInteractor$debouncedLoadingStateFlow$1 commentValidationStateInteractor$debouncedLoadingStateFlow$1 = new CommentValidationStateInteractor$debouncedLoadingStateFlow$1(3, (Continuation) obj3);
        commentValidationStateInteractor$debouncedLoadingStateFlow$1.L$0 = (String) obj;
        commentValidationStateInteractor$debouncedLoadingStateFlow$1.L$1 = (String) obj2;
        return commentValidationStateInteractor$debouncedLoadingStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return str == null ? wmc.a : str.equals(str2) ? new xmc(str) : vmc.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
