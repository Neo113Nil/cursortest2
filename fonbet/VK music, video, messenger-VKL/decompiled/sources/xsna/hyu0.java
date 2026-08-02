package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkHealthPermissionsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl", f = "VkHealthPermissionsManagerImpl.kt", l = {292, 296}, m = "requestHealthConnectPermissionsInternal")
/* loaded from: classes6.dex */
public final class hyu0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dyu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyu0(dyu0 dyu0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dyu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return dyu0.q(this.this$0, null, null, null, null, null, this);
    }
}
