package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkHealthHuaweiHealthPermissionsProvider.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.providers.VkHealthHuaweiHealthPermissionsProvider", f = "VkHealthHuaweiHealthPermissionsProvider.kt", l = {147, 151, 158}, m = "onActivityResult")
/* loaded from: classes6.dex */
public final class uxu0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yxu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxu0(yxu0 yxu0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yxu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, 0, 0, null, this);
    }
}
