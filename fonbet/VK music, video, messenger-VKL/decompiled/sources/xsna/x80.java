package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ActivityAnalyticsRepository.kt */
@b6l(c = "com.vk.push.pushsdk.domain.repository.ActivityAnalyticsRepository", f = "ActivityAnalyticsRepository.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "getSendAnalyticsIntervalMs")
/* loaded from: classes5.dex */
public final class x80 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(w80 w80Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = w80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return w80.a(this.this$0, this);
    }
}
