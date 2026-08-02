package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class hz0 extends ContinuationImpl {
    public iz0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iz0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(iz0 iz0Var, spj spjVar) {
        super(spjVar);
        this.d = iz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(false, this);
    }
}
