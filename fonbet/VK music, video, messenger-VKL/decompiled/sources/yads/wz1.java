package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class wz1 extends ContinuationImpl {
    public sz1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zz1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz1(zz1 zz1Var, spj spjVar) {
        super(spjVar);
        this.d = zz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((Context) null, (sz1) null, this);
    }
}
