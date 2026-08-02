package xsna;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ObtainVerificationRepository.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.presentation.ObtainVerificationRepository", f = "ObtainVerificationRepository.kt", l = {69}, m = "unlinkBidProfile-gIAlu-s")
/* loaded from: classes18.dex */
public final class js70 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ks70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js70(ks70 ks70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ks70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable h = this.this$0.h(null, this);
        return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : new Result(h);
    }
}
