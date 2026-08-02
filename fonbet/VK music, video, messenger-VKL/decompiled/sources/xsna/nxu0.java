package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkHealthGoogleFitPermissionsProvider.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.providers.VkHealthGoogleFitPermissionsProvider", f = "VkHealthGoogleFitPermissionsProvider.kt", l = {116, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "onActivityResult")
/* loaded from: classes6.dex */
public final class nxu0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ oxu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxu0(oxu0 oxu0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oxu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0, 0, null, this);
    }
}
