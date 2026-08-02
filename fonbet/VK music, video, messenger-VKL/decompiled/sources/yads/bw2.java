package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class bw2 extends ContinuationImpl {
    public w5 b;
    public v5 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dw2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw2(dw2 dw2Var, spj spjVar) {
        super(spjVar);
        this.e = dw2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
