package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.e5w0;

/* compiled from: VkpnsPushProviderSdk.kt */
@b6l(c = "com.vk.push.pushsdk.VkpnsPushProviderSdk", f = "VkpnsPushProviderSdk.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 230, 232, 233, 235, 236, 241}, m = "onSdkDisabled")
/* loaded from: classes.dex */
public final class i5w0 extends ContinuationImpl {
    int I$0;
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e5w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5w0(e5w0 e5w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e5w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        e5w0 e5w0Var = this.this$0;
        e5w0.b bVar = e5w0.y;
        return e5w0Var.d(this);
    }
}
