package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class vi2 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ yi2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi2(yi2 yi2Var, spj spjVar) {
        super(spjVar);
        this.c = yi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return yi2.a(0L, null, null, null, this.c, null, this);
    }
}
