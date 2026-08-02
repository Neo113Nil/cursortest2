package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkHealthHealthConnectPermissionsProvider.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.providers.VkHealthHealthConnectPermissionsProvider", f = "VkHealthHealthConnectPermissionsProvider.kt", l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE}, m = "getSdkStatusSuspended")
/* loaded from: classes6.dex */
public final class rxu0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pxu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxu0(pxu0 pxu0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pxu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, 0L, this);
    }
}
