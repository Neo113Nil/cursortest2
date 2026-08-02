package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Hoverable.kt */
@b6l(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE}, m = "emitEnter", v = 1)
/* loaded from: classes11.dex */
public final class qgv extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sgv this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgv(sgv sgvVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sgvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return sgv.i2(this.this$0, this);
    }
}
