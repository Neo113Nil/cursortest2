package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class wq1 extends ContinuationImpl {
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq1(com.monetization.ads.mediation.base.initialize.a aVar, spj spjVar) {
        super(spjVar);
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
