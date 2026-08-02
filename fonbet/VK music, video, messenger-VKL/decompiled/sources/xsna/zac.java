package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dz40;

/* compiled from: Chip.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.chips.ChipKt$ChipConcerts$1$1", f = "Chip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class zac extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dz40.d.b $chip;
    final /* synthetic */ rg50 $iconReplayNonce$delegate;
    final /* synthetic */ wh50<String> $previousUrl$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zac(dz40.d.b bVar, wh50<String> wh50Var, rg50 rg50Var, spj<? super zac> spjVar) {
        super(2, spjVar);
        this.$chip = bVar;
        this.$previousUrl$delegate = wh50Var;
        this.$iconReplayNonce$delegate = rg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zac(this.$chip, this.$previousUrl$delegate, this.$iconReplayNonce$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zac) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!epx.f(this.$previousUrl$delegate.getValue(), this.$chip.c) && this.$chip.c.length() > 0 && this.$chip.a) {
            this.$iconReplayNonce$delegate.C(this.$iconReplayNonce$delegate.getIntValue() + 1);
            this.$previousUrl$delegate.setValue(this.$chip.c);
        }
        return s3q0.a;
    }
}
