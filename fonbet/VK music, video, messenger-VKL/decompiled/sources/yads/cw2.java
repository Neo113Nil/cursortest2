package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class cw2 extends ContinuationImpl {
    public dw2 b;
    public w5 c;
    public v5 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dw2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw2(dw2 dw2Var, spj spjVar) {
        super(spjVar);
        this.f = dw2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
