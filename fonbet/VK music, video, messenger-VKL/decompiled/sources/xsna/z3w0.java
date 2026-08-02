package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsAuthInteractor.kt */
@b6l(c = "com.vk.push.authsdk.VkpnsAuthInteractor", f = "VkpnsAuthInteractor.kt", l = {16}, m = "getIntermediateToken-yxL6bBk")
/* loaded from: classes5.dex */
public final class z3w0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3w0(a4w0 a4w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
