package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BufferedChannel.kt */
@b6l(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
/* loaded from: classes11.dex */
public final class qm8<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nm8<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm8(nm8 nm8Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nm8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object G = nm8.G(this.this$0, this);
        return G == CoroutineSingletons.COROUTINE_SUSPENDED ? G : new kbb(G);
    }
}
