package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkButton.kt */
@b6l(c = "com.vk.core.compose.component.VkButtonKt$VkButton$15$1", f = "VkButton.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ahu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ wh50<pco> $lockedWidthDp$delegate;
    final /* synthetic */ wh50<Boolean> $shouldLockWidth$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahu0(boolean z, wh50<pco> wh50Var, wh50<Boolean> wh50Var2, spj<? super ahu0> spjVar) {
        super(2, spjVar);
        this.$isLoading = z;
        this.$lockedWidthDp$delegate = wh50Var;
        this.$shouldLockWidth$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ahu0(this.$isLoading, this.$lockedWidthDp$delegate, this.$shouldLockWidth$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ahu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$lockedWidthDp$delegate.setValue(null);
        this.$shouldLockWidth$delegate.setValue(Boolean.valueOf(this.$isLoading));
        return s3q0.a;
    }
}
