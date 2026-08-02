package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class zi0 extends ContinuationImpl {
    public w5 b;
    public v5 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dj0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(dj0 dj0Var, spj spjVar) {
        super(spjVar);
        this.e = dj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
