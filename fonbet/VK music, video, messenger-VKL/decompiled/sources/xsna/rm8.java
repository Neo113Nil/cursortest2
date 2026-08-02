package xsna;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BufferedChannel.kt */
@b6l(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes11.dex */
public final class rm8 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nm8<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm8(nm8 nm8Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nm8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        nm8<Object> nm8Var = this.this$0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = nm8.e;
        Object H = nm8Var.H(null, 0, 0L, this);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : new kbb(H);
    }
}
