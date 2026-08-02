package xsna;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.PublishInteractorImpl", f = "PublishInteractor.kt", l = {69}, m = "isVideoCompressionEnabled-IoAF18A")
/* loaded from: classes7.dex */
public final class rce0 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rce0(uce0 uce0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable l = this.this$0.l(this);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : new Result(l);
    }
}
