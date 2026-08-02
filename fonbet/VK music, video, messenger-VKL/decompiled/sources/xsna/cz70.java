package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OkioStorage.kt */
@b6l(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m = "writeData")
/* loaded from: classes.dex */
public final class cz70 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dz70<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz70(dz70 dz70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dz70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
