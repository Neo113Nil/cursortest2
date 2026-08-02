package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: StorefrontServicesActor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor", f = "StorefrontServicesActor.kt", l = {300}, m = "invalidateBookmarksCounter")
/* loaded from: classes18.dex */
public final class cnl0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bnl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnl0(bnl0 bnl0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bnl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return bnl0.m(this.this$0, this);
    }
}
