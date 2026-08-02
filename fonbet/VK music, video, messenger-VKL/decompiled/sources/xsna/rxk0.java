package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StaticBlurScreenContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.StaticBlurScreenContent$Content$1$1$1$1", f = "StaticBlurScreenContent.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class rxk0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $blurAccepted$delegate;
    final /* synthetic */ float $blurSize;
    final /* synthetic */ wh50<dh7> $blurStyle$delegate;
    final /* synthetic */ vg7 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxk0(vg7 vg7Var, float f, wh50<Boolean> wh50Var, wh50<dh7> wh50Var2, spj<? super rxk0> spjVar) {
        super(2, spjVar);
        this.$state = vg7Var;
        this.$blurSize = f;
        this.$blurAccepted$delegate = wh50Var;
        this.$blurStyle$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rxk0(this.$state, this.$blurSize, this.$blurAccepted$delegate, this.$blurStyle$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rxk0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.$blurAccepted$delegate.setValue(Boolean.FALSE);
            this.$state.a.getValue().clear();
            wh50<dh7> wh50Var = this.$blurStyle$delegate;
            wh50Var.setValue(new mmk(this.$blurSize, wh50Var.getValue().d()));
            this.label = 1;
            if (qsl.b(100L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$blurAccepted$delegate.setValue(Boolean.TRUE);
        return s3q0.a;
    }
}
