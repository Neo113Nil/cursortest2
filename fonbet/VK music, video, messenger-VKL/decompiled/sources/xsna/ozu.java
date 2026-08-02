package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.zef0;

/* compiled from: HealthConnectClientImpl.kt */
@b6l(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "readRecords")
/* loaded from: classes12.dex */
public final class ozu<T extends zef0> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nzu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozu(nzu nzuVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nzuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
