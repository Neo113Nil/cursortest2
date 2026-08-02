package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CoverChooseInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.coverchoose.domain.interactor.CoverChooseInteractorImpl", f = "CoverChooseInteractor.kt", l = {23}, m = "saveCover-gIAlu-s")
/* loaded from: classes7.dex */
public final class c1k extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d1k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1k(d1k d1kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d1kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
