package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: StorefrontServicesInteractor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.data.StorefrontServicesInteractorImpl", f = "StorefrontServicesInteractor.kt", l = {156}, m = "loadServicesSection-0E7RQCE")
/* loaded from: classes18.dex */
public final class znl0 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dol0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znl0(dol0 dol0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dol0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.g(null, 0, this);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : new Result(g);
    }
}
