package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class xh2 extends ContinuationImpl {
    public zh2 b;
    public th2 c;
    public uu d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zh2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh2(zh2 zh2Var, spj spjVar) {
        super(spjVar);
        this.f = zh2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((Context) null, (th2) null, this);
    }
}
