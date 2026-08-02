package yads;

import android.view.View;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class xa0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ ya0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(ya0 ya0Var, spj spjVar) {
        super(spjVar);
        this.c = ya0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((View) null, (wa0) null, this);
    }
}
