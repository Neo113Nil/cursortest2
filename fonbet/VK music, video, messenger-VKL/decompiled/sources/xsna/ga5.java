package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorHeaderLiveCoverVideoPlayer.kt */
@b6l(c = "com.vk.profile.core.livecover.AuthorHeaderLiveCoverVideoPlayerKt$AuthorHeaderLiveCoverVideoPlayer$9$1", f = "AuthorHeaderLiveCoverVideoPlayer.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ga5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<yg5> $autoPlay$delegate;
    final /* synthetic */ mtk0<Boolean> $canPlayState$delegate;
    final /* synthetic */ mtk0<Boolean> $isExpandedState$delegate;
    final /* synthetic */ wh50<Boolean> $pendingSamePageLoopReplay$delegate;
    final /* synthetic */ mtk0<Boolean> $pendingSamePageLoopReplayState$delegate;
    final /* synthetic */ s95 $playbackController;
    Object L$0;
    int label;

    /* compiled from: AuthorHeaderLiveCoverVideoPlayer.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ yg5 b;
        public final /* synthetic */ s95 c;
        public final /* synthetic */ mtk0<Boolean> d;
        public final /* synthetic */ mtk0<Boolean> e;
        public final /* synthetic */ wh50<Boolean> f;

        public a(yg5 yg5Var, s95 s95Var, mtk0<Boolean> mtk0Var, mtk0<Boolean> mtk0Var2, wh50<Boolean> wh50Var) {
            this.b = yg5Var;
            this.c = s95Var;
            this.d = mtk0Var;
            this.e = mtk0Var2;
            this.f = wh50Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            yg5 yg5Var = this.b;
            if (!booleanValue) {
                yg5Var.pause();
                return s3q0.a;
            }
            boolean b = ha5.b(this.d);
            boolean booleanValue2 = this.e.getValue().booleanValue();
            this.c.a(yg5Var, b);
            if (booleanValue2) {
                this.f.setValue(Boolean.FALSE);
                s3q0 s3q0Var = s3q0.a;
                yg5Var.S(false);
            } else {
                yg5Var.play();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga5(wh50<yg5> wh50Var, mtk0<Boolean> mtk0Var, s95 s95Var, mtk0<Boolean> mtk0Var2, mtk0<Boolean> mtk0Var3, wh50<Boolean> wh50Var2, spj<? super ga5> spjVar) {
        super(2, spjVar);
        this.$autoPlay$delegate = wh50Var;
        this.$canPlayState$delegate = mtk0Var;
        this.$playbackController = s95Var;
        this.$isExpandedState$delegate = mtk0Var2;
        this.$pendingSamePageLoopReplayState$delegate = mtk0Var3;
        this.$pendingSamePageLoopReplay$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ga5(this.$autoPlay$delegate, this.$canPlayState$delegate, this.$playbackController, this.$isExpandedState$delegate, this.$pendingSamePageLoopReplayState$delegate, this.$pendingSamePageLoopReplay$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ga5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yg5 value = this.$autoPlay$delegate.getValue();
            if (value == null) {
                return s3q0.a;
            }
            ksr l = rsr.l(nr2.M(new v6(this.$canPlayState$delegate, 4)));
            a aVar = new a(value, this.$playbackController, this.$isExpandedState$delegate, this.$pendingSamePageLoopReplayState$delegate, this.$pendingSamePageLoopReplay$delegate);
            this.L$0 = null;
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
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
