package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsEditVkDeps.kt */
@b6l(c = "com.vk.clips.edit.impl.deps.ClipsEditVkDeps$requestExecutor$2$1$executeApiRequest$3", f = "ClipsEditVkDeps.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class vvd extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ boolean $awaitNetwork;
    final /* synthetic */ xy2<Object> $call;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvd(xy2<Object> xy2Var, boolean z, spj<? super vvd> spjVar) {
        super(2, spjVar);
        this.$call = xy2Var;
        this.$awaitNetwork = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vvd(this.$call, this.$awaitNetwork, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((vvd) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        iz2 A = yfb.A(this.$call);
        A.n = this.$awaitNetwork;
        this.label = 1;
        Object p = evj.p(A, this);
        return p == coroutineSingletons ? coroutineSingletons : p;
    }
}
