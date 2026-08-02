package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: StorefrontServicesInteractor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.data.StorefrontServicesInteractorImpl", f = "StorefrontServicesInteractor.kt", l = {VersionConstants.PRODUCT_MAJOR_VERSION, 146}, m = "loadServices-gIAlu-s")
/* loaded from: classes18.dex */
public final class ynl0 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dol0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynl0(dol0 dol0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dol0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.f(0, this);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : new Result(f);
    }
}
