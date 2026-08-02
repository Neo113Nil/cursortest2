package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class vz1 extends ContinuationImpl {
    public oi b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zz1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz1(zz1 zz1Var, spj spjVar) {
        super(spjVar);
        this.d = zz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return zz1.a(this.d, (oi) null, this);
    }
}
