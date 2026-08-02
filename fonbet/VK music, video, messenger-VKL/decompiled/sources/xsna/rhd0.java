package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ProduceState.kt */
@b6l(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE}, m = "awaitDispose", v = 1)
/* loaded from: classes11.dex */
public final class rhd0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ shd0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhd0(shd0 shd0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = shd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.T(null, this);
    }
}
