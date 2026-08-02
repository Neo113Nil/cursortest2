package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OkioStorage.kt */
@b6l(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {236, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "writeScope")
/* loaded from: classes.dex */
public final class az70 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bz70<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az70(bz70 bz70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bz70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
