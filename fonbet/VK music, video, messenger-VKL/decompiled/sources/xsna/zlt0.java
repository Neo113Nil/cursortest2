package xsna;

import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoTrailerInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$collectAutoPlayState$1", f = "VideoTrailerInlineActor.kt", l = {143}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class zlt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yg5 $autoPlay;
    int label;
    final /* synthetic */ ylt0 this$0;

    /* compiled from: VideoTrailerInlineActor.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ylt0 b;

        public a(ylt0 ylt0Var) {
            this.b = ylt0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            gi5 gi5Var = (gi5) obj;
            long c = an10.c((gi5Var.s / 100.0f) * gi5Var.r);
            ylt0 ylt0Var = this.b;
            ((VideoTrailerView$State) ((b2a) ylt0Var.b.b).getCurrentState()).j.p(gi5Var.q);
            ((VideoTrailerView$State) ((b2a) ylt0Var.b.b).getCurrentState()).k.p(c);
            ylt0Var.m(new vgs0(gi5Var, 4));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlt0(yg5 yg5Var, ylt0 ylt0Var, spj<? super zlt0> spjVar) {
        super(2, spjVar);
        this.$autoPlay = yg5Var;
        this.this$0 = ylt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zlt0(this.$autoPlay, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zlt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nb9 i2 = rsr.i(new hi5(this.$autoPlay, null));
            bdn bdnVar = bdn.a;
            ksr q = rsr.q(i2, ie00.a);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (q.collect(aVar, this) == coroutineSingletons) {
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
