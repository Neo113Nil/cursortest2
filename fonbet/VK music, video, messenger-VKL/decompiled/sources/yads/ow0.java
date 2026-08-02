package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class ow0 extends ContinuationImpl {
    public sw0 b;
    public eo2 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sw0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(sw0 sw0Var, spj spjVar) {
        super(spjVar);
        this.e = sw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
