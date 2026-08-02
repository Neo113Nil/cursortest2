package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DynamicsProcessingWrapper.kt */
@b6l(c = "com.vk.music.player.core.audioeffect.normalization.DynamicsProcessingWrapper$setEnabledWithDelay$1", f = "DynamicsProcessingWrapper.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class aro extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ bro this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aro(bro broVar, spj<? super aro> spjVar) {
        super(2, spjVar);
        this.this$0 = broVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new aro(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((aro) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
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
        this.this$0.a();
        return s3q0.a;
    }
}
