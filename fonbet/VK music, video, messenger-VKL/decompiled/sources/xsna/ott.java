package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetPollsOperation.kt */
@b6l(c = "com.vk.uxpolls.domain.usecase.GetPollsOperation", f = "GetPollsOperation.kt", l = {58, TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "triggerRequest")
/* loaded from: classes6.dex */
public final class ott extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ltt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ott(ltt lttVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lttVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, this);
    }
}
