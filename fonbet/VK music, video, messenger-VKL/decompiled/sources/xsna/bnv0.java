package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkStepsStore.kt */
@b6l(c = "com.vk.superapp.vksteps.data.store.VkStepsStore", f = "VkStepsStore.kt", l = {53, TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "updateSteps")
/* loaded from: classes6.dex */
public final class bnv0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xmv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnv0(xmv0 xmv0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xmv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        xmv0 xmv0Var = this.this$0;
        qcy<Object>[] qcyVarArr = xmv0.b;
        return xmv0Var.e(null, this);
    }
}
