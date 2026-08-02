package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterHostElectionsInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor", f = "MasterHostElectionsInteractor.kt", l = {Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "getArbiterResult-gIAlu-s")
/* loaded from: classes5.dex */
public final class cj10 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nj10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj10(nj10 nj10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nj10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
