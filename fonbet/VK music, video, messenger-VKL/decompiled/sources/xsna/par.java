package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FileStorage.kt */
@b6l(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "writeScope")
/* loaded from: classes12.dex */
public final class par extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qar<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public par(qar qarVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qarVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
