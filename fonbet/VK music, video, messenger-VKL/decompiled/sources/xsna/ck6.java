package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.xla0;

/* compiled from: BasePinLockView.kt */
@b6l(c = "com.vk.biometrics.lock.impl.presentation.base.view.BasePinLockViewKt$BasePinLockView$3$1$1$2$1", f = "BasePinLockView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ck6 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xla0 $dotColorState;
    final /* synthetic */ wh50<Boolean> $isShaking$delegate;
    final /* synthetic */ f5j0 $shakeController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck6(xla0 xla0Var, f5j0 f5j0Var, wh50<Boolean> wh50Var, spj<? super ck6> spjVar) {
        super(2, spjVar);
        this.$dotColorState = xla0Var;
        this.$shakeController = f5j0Var;
        this.$isShaking$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ck6(this.$dotColorState, this.$shakeController, this.$isShaking$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ck6) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$isShaking$delegate.setValue(Boolean.FALSE);
        if (epx.f(this.$dotColorState, new xla0.b())) {
            f5j0 f5j0Var = this.$shakeController;
            ((zak0) f5j0Var.a).setValue(new e5j0());
            this.$isShaking$delegate.setValue(Boolean.TRUE);
        }
        return s3q0.a;
    }
}
