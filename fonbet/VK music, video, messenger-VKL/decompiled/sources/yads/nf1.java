package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class nf1 extends ContinuationImpl {
    public qf1 b;
    public qu2 c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ qf1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf1(qf1 qf1Var, spj spjVar) {
        super(spjVar);
        this.f = qf1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
