package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GoogleFitUtils.kt */
@b6l(c = "com.vk.superapp.vksteps.utils.GoogleFitUtils$getCurrentVkStepsAccountId$2", f = "GoogleFitUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class o9u extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
    int label;

    public o9u() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new o9u(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
        return ((o9u) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        p9u.a.getClass();
        tw8 tw8Var = p9u.c;
        qcy<Object> qcyVar = p9u.b[0];
        String b = tw8Var.b();
        if (drm0.N(b)) {
            return null;
        }
        return b;
    }
}
