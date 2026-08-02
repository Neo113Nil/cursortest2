package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HuaweiUtils.kt */
@b6l(c = "com.vk.superapp.vksteps.utils.HuaweiUtils$getCurrentVkStepsAccountId$2", f = "HuaweiUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class llv extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
    int label;

    public llv() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new llv(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
        return ((llv) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        mlv.a.getClass();
        tw8 tw8Var = mlv.c;
        qcy<Object> qcyVar = mlv.b[0];
        String b = tw8Var.b();
        if (drm0.N(b)) {
            return null;
        }
        return b;
    }
}
