package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EndVideoDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.EndVideoDelegateKt$handleEndVideoAction$1", f = "EndVideoDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class xkp extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public xkp() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xkp xkpVar = new xkp(2, spjVar);
        xkpVar.L$0 = obj;
        return xkpVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((xkp) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        yg5Var.S(false);
        return s3q0.a;
    }
}
