package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsTokenInvalidator.kt */
@b6l(c = "com.vk.push.pushsdk.invalidator.VkpnsTokenInvalidator", f = "VkpnsTokenInvalidator.kt", l = {51}, m = "invalidatePackage")
/* loaded from: classes5.dex */
public final class u5w0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r5w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5w0(r5w0 r5w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = r5w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        r5w0 r5w0Var = this.this$0;
        int i = r5w0.i;
        return r5w0Var.c(null, this);
    }
}
