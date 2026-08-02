package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlatformTextInputModifierNode.kt */
@b6l(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "establishTextInputSession", v = 1)
/* loaded from: classes11.dex */
public final class mua0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public mua0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lua0.a(null, null, this);
    }
}
