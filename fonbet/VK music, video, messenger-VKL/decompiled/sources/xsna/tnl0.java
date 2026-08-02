package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: StorefrontServicesInteractor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.data.StorefrontServicesInteractorImpl", f = "StorefrontServicesInteractor.kt", l = {181}, m = "getBookmarksCount")
/* loaded from: classes18.dex */
public final class tnl0 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dol0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnl0(dol0 dol0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dol0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
