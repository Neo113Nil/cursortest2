package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class w3 extends ContinuationImpl {
    public x3 b;
    public jg1 c;
    public pb2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x3 x3Var, spj spjVar) {
        super(spjVar);
        this.f = x3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, null, this);
    }
}
