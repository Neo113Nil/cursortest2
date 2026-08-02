package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterHostElectionsInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor", f = "MasterHostElectionsInteractor.kt", l = {Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "notifyHostAboutNewMaster-0E7RQCE$push_provider_release")
/* loaded from: classes5.dex */
public final class hj10 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nj10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj10(nj10 nj10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nj10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(null, null, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
