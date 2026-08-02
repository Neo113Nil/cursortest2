package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.PublishInteractorImpl", f = "PublishInteractor.kt", l = {Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "publishDraft-gIAlu-s")
/* loaded from: classes7.dex */
public final class sce0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sce0(uce0 uce0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.e(null, this);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : new Result(e);
    }
}
