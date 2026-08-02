package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dz40;

/* compiled from: Chip.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.chips.ChipKt$ChipDislike$1$1", f = "Chip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class bbc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dz40.d.C2771d $chip;
    final /* synthetic */ wh50<Boolean> $isTransitioning$delegate;
    final /* synthetic */ wh50<Boolean> $prevDislikedState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbc(dz40.d.C2771d c2771d, wh50<Boolean> wh50Var, wh50<Boolean> wh50Var2, spj<? super bbc> spjVar) {
        super(2, spjVar);
        this.$chip = c2771d;
        this.$isTransitioning$delegate = wh50Var;
        this.$prevDislikedState$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bbc(this.$chip, this.$isTransitioning$delegate, this.$prevDislikedState$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((bbc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!this.$isTransitioning$delegate.getValue().booleanValue() && this.$chip.a != this.$prevDislikedState$delegate.getValue().booleanValue()) {
            this.$prevDislikedState$delegate.setValue(Boolean.valueOf(this.$chip.a));
        }
        return s3q0.a;
    }
}
