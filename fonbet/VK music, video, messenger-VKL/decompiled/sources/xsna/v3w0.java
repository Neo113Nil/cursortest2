package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsAuthApi.kt */
@b6l(c = "com.vk.push.authsdk.VkpnsAuthApi", f = "VkpnsAuthApi.kt", l = {36}, m = "getIntermediateToken-yxL6bBk")
/* loaded from: classes5.dex */
public final class v3w0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x3w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3w0(x3w0 x3w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = x3w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
