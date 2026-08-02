package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.json.JsonToken;

/* compiled from: AlbumsInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.AlbumsInteractorImpl", f = "AlbumsInteractor.kt", l = {83, JsonToken.END_ARRAY}, m = "editVideoAlbums-yxL6bBk")
/* loaded from: classes7.dex */
public final class dn1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn1(hn1 hn1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hn1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, null, false, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
