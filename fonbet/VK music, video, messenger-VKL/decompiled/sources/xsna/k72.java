package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidContentCaptureManager.android.kt */
@b6l(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {205, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "boundsUpdatesEventLoop$ui", v = 1)
/* loaded from: classes11.dex */
public final class k72 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b72 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k72(b72 b72Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = b72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
