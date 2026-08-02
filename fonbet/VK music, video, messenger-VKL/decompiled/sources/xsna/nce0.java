package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.PublishInteractorImpl", f = "PublishInteractor.kt", l = {65}, m = "getVideoFile-gIAlu-s")
/* loaded from: classes7.dex */
public final class nce0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nce0(uce0 uce0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(null, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
