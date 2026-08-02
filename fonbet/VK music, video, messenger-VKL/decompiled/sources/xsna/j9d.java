package xsna;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.OneVideoPlayer;
import one.video.view.OneVideoPlayerView;

/* compiled from: ClipPlayer.kt */
@b6l(c = "com.vk.clips.upload.vk.impl.preview.compose.ClipPlayerKt$Player$1$1$1", f = "ClipPlayer.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class j9d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ mtk0<Lifecycle.Event> $lifecycle$delegate;
    final /* synthetic */ izs<lze, s3q0> $onAction;
    final /* synthetic */ mtk0<nwa0> $playbackProgress;
    final /* synthetic */ e3b0 $playerRelatedUiData;
    final /* synthetic */ OneVideoPlayerView $playerView;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: ClipPlayer.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ OneVideoPlayerView c;

        public a(boolean z, OneVideoPlayerView oneVideoPlayerView) {
            this.b = z;
            this.c = oneVideoPlayerView;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            OneVideoPlayer player;
            nwa0 nwa0Var = (nwa0) obj;
            long j = nwa0Var.a;
            boolean z = nwa0Var.c;
            if (!this.b && z && (player = this.c.getPlayer()) != null) {
                player.seekTo(j);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j9d(boolean z, izs<? super lze, s3q0> izsVar, e3b0 e3b0Var, mtk0<? extends Lifecycle.Event> mtk0Var, mtk0<nwa0> mtk0Var2, OneVideoPlayerView oneVideoPlayerView, spj<? super j9d> spjVar) {
        super(2, spjVar);
        this.$isPlaying = z;
        this.$onAction = izsVar;
        this.$playerRelatedUiData = e3b0Var;
        this.$lifecycle$delegate = mtk0Var;
        this.$playbackProgress = mtk0Var2;
        this.$playerView = oneVideoPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        j9d j9dVar = new j9d(this.$isPlaying, this.$onAction, this.$playerRelatedUiData, this.$lifecycle$delegate, this.$playbackProgress, this.$playerView, spjVar);
        j9dVar.L$0 = obj;
        return j9dVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((j9d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$isPlaying && this.$lifecycle$delegate.getValue().h().a(Lifecycle.State.RESUMED)) {
                myc0.h(yvjVar, null, null, new m9d(this.$onAction, this.$playerRelatedUiData.c, null), 3);
            }
            izg0 M = nr2.M(new l1(this.$playbackProgress, 22));
            a aVar = new a(this.$isPlaying, this.$playerView);
            this.L$0 = null;
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
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
