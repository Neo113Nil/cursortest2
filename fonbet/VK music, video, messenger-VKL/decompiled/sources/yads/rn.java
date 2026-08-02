package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class rn extends ContinuationImpl {
    public zn b;
    public vb3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zn e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(zn znVar, spj spjVar) {
        super(spjVar);
        this.e = znVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return zn.a(this.e, null, this);
    }
}
