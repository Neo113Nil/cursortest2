package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@b6l(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {134, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "onScrollCaptureImageRequest", v = 1)
/* loaded from: classes11.dex */
public final class lqi extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kqi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqi(kqi kqiVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kqiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return kqi.a(this.this$0, null, null, this);
    }
}
