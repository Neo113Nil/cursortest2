package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Await.kt */
@b6l(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
/* loaded from: classes8.dex */
public final class du5 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public du5() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return fto0.o(null, this);
    }
}
