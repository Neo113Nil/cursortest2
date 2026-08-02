package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.PublishInteractorImpl", f = "PublishInteractor.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "getVideoInfo-gIAlu-s")
/* loaded from: classes7.dex */
public final class oce0 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oce0(uce0 uce0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object k = this.this$0.k(null, this);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : new Result(k);
    }
}
