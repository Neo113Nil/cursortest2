package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoLargeListInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.VideoLargeListInlineActor$suspendAutoPlayAction$2", f = "VideoLargeListInlineActor.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class ers0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yg5 $autoPlay;
    final /* synthetic */ wzs<yg5, spj<? super s3q0>, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ers0(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar, yg5 yg5Var, spj<? super ers0> spjVar) {
        super(2, spjVar);
        this.$block = wzsVar;
        this.$autoPlay = yg5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ers0(this.$block, this.$autoPlay, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ers0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wzs<yg5, spj<? super s3q0>, Object> wzsVar = this.$block;
            yg5 yg5Var = this.$autoPlay;
            this.label = 1;
            if (wzsVar.invoke(yg5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
