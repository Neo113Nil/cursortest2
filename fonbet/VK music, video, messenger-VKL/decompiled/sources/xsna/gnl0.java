package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: StorefrontServicesActor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor", f = "StorefrontServicesActor.kt", l = {186}, m = "search")
/* loaded from: classes18.dex */
public final class gnl0 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bnl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnl0(bnl0 bnl0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bnl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return bnl0.q(this.this$0, null, 0, this);
    }
}
