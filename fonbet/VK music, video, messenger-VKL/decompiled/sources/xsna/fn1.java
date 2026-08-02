package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AlbumsInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.AlbumsInteractorImpl", f = "AlbumsInteractor.kt", l = {50}, m = "getAlbumsByVideo-0E7RQCE")
/* loaded from: classes7.dex */
public final class fn1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn1(hn1 hn1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hn1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.f(null, null, this);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : new Result(f);
    }
}
