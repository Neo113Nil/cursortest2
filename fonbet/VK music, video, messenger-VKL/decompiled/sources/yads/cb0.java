package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class cb0 extends ContinuationImpl {
    public db0 b;
    public wa0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ db0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(db0 db0Var, spj spjVar) {
        super(spjVar);
        this.e = db0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
