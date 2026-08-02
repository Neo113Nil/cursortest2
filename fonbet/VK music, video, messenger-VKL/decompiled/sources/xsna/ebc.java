package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Chip.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.chips.ChipKt$MeasureContentWidth$3$1", f = "Chip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ebc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<pco> $measuredWidth$delegate;
    final /* synthetic */ izs<pco, s3q0> $onWidthMeasured;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ebc(izs<? super pco, s3q0> izsVar, wh50<pco> wh50Var, spj<? super ebc> spjVar) {
        super(2, spjVar);
        this.$onWidthMeasured = izsVar;
        this.$measuredWidth$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ebc(this.$onWidthMeasured, this.$measuredWidth$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ebc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onWidthMeasured.invoke(new pco(this.$measuredWidth$delegate.getValue().b));
        return s3q0.a;
    }
}
