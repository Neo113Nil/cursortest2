package xsna;

import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.libvideo.autoplay.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.jht0;

/* compiled from: VideoTrailerInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$handleInit$1", f = "VideoTrailerInlineActor.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class amt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ylt0 this$0;

    /* compiled from: VideoTrailerInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$handleInit$1$1", f = "VideoTrailerInlineActor.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ ylt0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ylt0 ylt0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = ylt0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            this.this$0.m(new cbt0(b.C1208b.a().e(((VideoTrailerView$State) ((b2a) this.this$0.b.b).getCurrentState()).d, null), 3));
            ylt0 ylt0Var = this.this$0;
            com.vk.video.focus.api.a aVar = ylt0Var.d;
            b2a b2aVar = (b2a) ylt0Var.b.b;
            aVar.f(((VideoTrailerView$State) b2aVar.getCurrentState()).i, new jht0.a(((VideoTrailerView$State) b2aVar.getCurrentState()).i, ((VideoTrailerView$State) b2aVar.getCurrentState()).d.a1()));
            w1a.b(ylt0Var, null, new gmt0(ylt0Var, null), 3);
            ylt0 ylt0Var2 = this.this$0;
            yg5 yg5Var = ((VideoTrailerView$State) ((b2a) ylt0Var2.b.b).getCurrentState()).e;
            if (yg5Var != null) {
                w1a.b(ylt0Var2, null, new zlt0(yg5Var, ylt0Var2, null), 3);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amt0(ylt0 ylt0Var, spj<? super amt0> spjVar) {
        super(2, spjVar);
        this.this$0 = ylt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new amt0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((amt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            a aVar = new a(this.this$0, null);
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
