package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AlbumsInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.AlbumsInteractorImpl", f = "AlbumsInteractor.kt", l = {64}, m = "setVideoAlbums")
/* loaded from: classes7.dex */
public final class gn1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn1(hn1 hn1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hn1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(null, null, null, null, this);
    }
}
