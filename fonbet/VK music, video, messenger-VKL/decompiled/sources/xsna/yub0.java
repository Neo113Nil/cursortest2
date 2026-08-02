package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ConnectionPoolImpl.kt */
@b6l(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "acquireWithTimeout-KLykuaI")
/* loaded from: classes12.dex */
public final class yub0 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cvb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yub0(cvb0 cvb0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cvb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0L, null, this);
    }
}
