package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlatformTextInputModifierNode.kt */
@b6l(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "textInputSession", v = 1)
/* loaded from: classes11.dex */
public final class fra extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kra this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fra(kra kraVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kraVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
