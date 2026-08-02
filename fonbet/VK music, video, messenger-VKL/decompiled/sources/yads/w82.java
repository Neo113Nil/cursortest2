package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class w82 extends ContinuationImpl {
    public z82 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z82 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w82(z82 z82Var, spj spjVar) {
        super(spjVar);
        this.d = z82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return z82.a(this.d, null, this);
    }
}
