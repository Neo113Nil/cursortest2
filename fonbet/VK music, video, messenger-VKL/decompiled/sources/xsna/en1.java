package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AlbumsInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.AlbumsInteractorImpl", f = "AlbumsInteractor.kt", l = {43}, m = "getAlbums-BWLJW6A")
/* loaded from: classes7.dex */
public final class en1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en1(hn1 hn1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hn1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, 0, 0, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
