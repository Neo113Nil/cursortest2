package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class fz0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ gz0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(gz0 gz0Var, spj spjVar) {
        super(spjVar);
        this.c = gz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(false, this);
    }
}
