package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class g72 extends ContinuationImpl {
    public Object b;
    public Context c;
    public z30 d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ j72 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g72(j72 j72Var, spj spjVar) {
        super(spjVar);
        this.g = j72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(false, (Context) null, (sz1) null, (z30) null, (spj) this);
    }
}
