package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InterestEmoji.kt */
@b6l(c = "com.vk.onboardingscreens.impl.recomthemes.presentation.view.InterestEmojiKt$InterestEmoji$emojiDrawableVersion$2$1", f = "InterestEmoji.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ldx extends SuspendLambda implements wzs<qhd0<Integer>, spj<? super s3q0>, Object> {
    final /* synthetic */ gep $emoji;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldx(gep gepVar, spj<? super ldx> spjVar) {
        super(2, spjVar);
        this.$emoji = gepVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ldx ldxVar = new ldx(this.$emoji, spjVar);
        ldxVar.L$0 = obj;
        return ldxVar;
    }

    @Override // xsna.wzs
    public final Object invoke(qhd0<Integer> qhd0Var, spj<? super s3q0> spjVar) {
        return ((ldx) create(qhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qhd0 qhd0Var = (qhd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            m3g m3gVar = new m3g(ucp.d.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hms(new mp3(16, this.$emoji, qhd0Var), 4)), 23);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (qhd0Var.T(m3gVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
