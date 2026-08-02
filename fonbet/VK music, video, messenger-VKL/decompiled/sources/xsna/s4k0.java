package xsna;

import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.OneVideoPlayer;
import xsna.o1b0;

/* compiled from: SmartCropInlineActor.kt */
@b6l(c = "com.vk.video.ui.smartcrop.impl.presentation.feature.store.SmartCropInlineActor$resetPlayer$2", f = "SmartCropInlineActor.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class s4k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ SmartCropState $state;
    int label;
    final /* synthetic */ w4k0 this$0;

    /* compiled from: SmartCropInlineActor.kt */
    @b6l(c = "com.vk.video.ui.smartcrop.impl.presentation.feature.store.SmartCropInlineActor$resetPlayer$2$1", f = "SmartCropInlineActor.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ SmartCropState $state;
        int label;
        final /* synthetic */ w4k0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SmartCropState smartCropState, w4k0 w4k0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = smartCropState;
            this.this$0 = w4k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$state, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OneVideoPlayer.d dVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            try {
                OneVideoPlayer oneVideoPlayer = this.$state.c;
                if (oneVideoPlayer != null) {
                    oneVideoPlayer.pause();
                }
                SmartCropState smartCropState = this.$state;
                OneVideoPlayer oneVideoPlayer2 = smartCropState.c;
                if (oneVideoPlayer2 != null && (dVar = smartCropState.d) != null) {
                    oneVideoPlayer2.T(dVar);
                }
                sht0 sht0Var = this.$state.b;
                if (sht0Var != null) {
                    o1b0 o1b0Var = this.this$0.e;
                    o1b0.a aVar = o1b0.a;
                    o1b0Var.f(sht0Var, true);
                }
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4k0(SmartCropState smartCropState, w4k0 w4k0Var, spj<? super s4k0> spjVar) {
        super(2, spjVar);
        this.$state = smartCropState;
        this.this$0 = w4k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new s4k0(this.$state, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((s4k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            a aVar = new a(this.$state, this.this$0, null);
            this.label = 1;
            if (myc0.k(ge00Var, aVar, this) == coroutineSingletons) {
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
