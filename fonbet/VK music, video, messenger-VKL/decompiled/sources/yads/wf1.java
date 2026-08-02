package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class wf1 extends SuspendLambda implements wzs {
    public final /* synthetic */ ag1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf1(ag1 ag1Var, spj spjVar) {
        super(2, spjVar);
        this.b = ag1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new wf1(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new wf1(this.b, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        return ((uh1) this.b.b).c("LightBundleScriptUrl");
    }
}
