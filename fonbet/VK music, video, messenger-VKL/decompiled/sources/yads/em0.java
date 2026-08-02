package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class em0 extends ContinuationImpl {
    public fm0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fm0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(fm0 fm0Var, spj spjVar) {
        super(spjVar);
        this.d = fm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
