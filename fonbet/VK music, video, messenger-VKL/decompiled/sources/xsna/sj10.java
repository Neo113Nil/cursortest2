package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterIPCClient.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.ipc.MasterIPCClient", f = "MasterIPCClient.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "notifyOldMaster-gIAlu-s")
/* loaded from: classes5.dex */
public final class sj10 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ak10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj10(ak10 ak10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ak10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object p = this.this$0.p(null, this);
        return p == CoroutineSingletons.COROUTINE_SUSPENDED ? p : new Result(p);
    }
}
