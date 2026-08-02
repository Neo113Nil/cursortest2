package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: StorefrontServicesInteractor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.data.StorefrontServicesInteractorImpl", f = "StorefrontServicesInteractor.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "loadMoreAlbums-gIAlu-s")
/* loaded from: classes18.dex */
public final class wnl0 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dol0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnl0(dol0 dol0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dol0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(0, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
