package xsna;

import androidx.compose.foundation.MutatePriority;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.l06;

/* compiled from: EqualizerSlider.kt */
@b6l(c = "com.vk.music.design.compose.equalizer.BandSliderDraggableState$drag$2", f = "EqualizerSlider.kt", l = {Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class k06 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<pgo, spj<? super s3q0>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ l06 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k06(l06 l06Var, MutatePriority mutatePriority, wzs<? super pgo, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super k06> spjVar) {
        super(2, spjVar);
        this.this$0 = l06Var;
        this.$dragPriority = mutatePriority;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k06(this.this$0, this.$dragPriority, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k06) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ((zak0) this.this$0.e).setValue(Boolean.TRUE);
            l06 l06Var = this.this$0;
            ni50 ni50Var = l06Var.o;
            l06.a aVar = l06Var.n;
            MutatePriority mutatePriority = this.$dragPriority;
            wzs<pgo, spj<? super s3q0>, Object> wzsVar = this.$block;
            this.label = 1;
            if (ni50Var.c(aVar, mutatePriority, wzsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ((zak0) this.this$0.e).setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
