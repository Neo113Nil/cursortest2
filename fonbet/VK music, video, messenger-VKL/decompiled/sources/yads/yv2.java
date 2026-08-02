package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.eyx;
import xsna.spj;

/* loaded from: classes10.dex */
public final class yv2 extends ContinuationImpl {
    public dw2 b;
    public Object c;
    public w5 d;
    public v5 e;
    public eyx f;
    public /* synthetic */ Object g;
    public final /* synthetic */ dw2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv2(dw2 dw2Var, spj spjVar) {
        super(spjVar);
        this.h = dw2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
