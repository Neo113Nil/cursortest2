package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dz40;
import xsna.sx40;

/* compiled from: Chip.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.chips.ChipKt$ChipDislike$3$1$1$1", f = "Chip.kt", l = {274}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class cbc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dz40.d.C2771d $chip;
    final /* synthetic */ wh50<Boolean> $isTransitioning$delegate;
    final /* synthetic */ izs<sx40, s3q0> $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cbc(izs<? super sx40, s3q0> izsVar, dz40.d.C2771d c2771d, wh50<Boolean> wh50Var, spj<? super cbc> spjVar) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$chip = c2771d;
        this.$isTransitioning$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cbc(this.$onAction, this.$chip, this.$isTransitioning$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cbc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.$isTransitioning$delegate.setValue(Boolean.TRUE);
            this.$onAction.invoke(new sx40.b.i(this.$chip.a));
            this.label = 1;
            if (qsl.b(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$isTransitioning$delegate.setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
