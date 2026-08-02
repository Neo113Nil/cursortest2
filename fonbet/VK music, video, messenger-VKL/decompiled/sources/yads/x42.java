package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class x42 extends ContinuationImpl {
    public a52 b;
    public nj2 c;
    public sz1 d;
    public w5 e;
    public v5 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ a52 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x42(a52 a52Var, spj spjVar) {
        super(spjVar);
        this.h = a52Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, null, this);
    }
}
