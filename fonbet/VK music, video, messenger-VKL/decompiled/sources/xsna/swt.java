package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsForPartialMonthlySyncUseCase.kt */
@b6l(c = "com.vk.superapp.vksteps.domain.GetVkStepsForPartialMonthlySyncUseCase", f = "GetVkStepsForPartialMonthlySyncUseCase.kt", l = {56, 64, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "execute")
/* loaded from: classes6.dex */
public final class swt extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rwt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swt(rwt rwtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rwtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, this);
    }
}
