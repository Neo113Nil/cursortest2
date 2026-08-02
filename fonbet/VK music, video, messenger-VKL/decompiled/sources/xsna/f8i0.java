package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SelectGroupVerificationRepository.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.presentation.SelectGroupVerificationRepository", f = "SelectGroupVerificationRepository.kt", l = {20}, m = "getGroupVerificationData-gIAlu-s")
/* loaded from: classes18.dex */
public final class f8i0 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g8i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8i0(g8i0 g8i0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = g8i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
