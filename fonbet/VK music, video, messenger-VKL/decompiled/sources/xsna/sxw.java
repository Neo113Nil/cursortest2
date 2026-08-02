package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.tracker.VideoPlayerMode;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$addAnalyticsListener$1", f = "InitDelegate.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class sxw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yg5 $autoPlay;
    final /* synthetic */ ars0 $this_addAnalyticsListener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxw(yg5 yg5Var, ars0 ars0Var, spj<? super sxw> spjVar) {
        super(2, spjVar);
        this.$autoPlay = yg5Var;
        this.$this_addAnalyticsListener = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sxw(this.$autoPlay, this.$this_addAnalyticsListener, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((sxw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            a aVar = new a(this.$autoPlay, this.$this_addAnalyticsListener, null);
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

    /* compiled from: InitDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$addAnalyticsListener$1$1", f = "InitDelegate.kt", l = {261}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yg5 $autoPlay;
        final /* synthetic */ ars0 $this_addAnalyticsListener;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yg5 yg5Var, ars0 ars0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$autoPlay = yg5Var;
            this.$this_addAnalyticsListener = ars0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$autoPlay, this.$this_addAnalyticsListener, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C3704a c3704a;
            Throwable th;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                C3704a c3704a2 = new C3704a(this.$this_addAnalyticsListener);
                this.$autoPlay.f0(c3704a2);
                try {
                    this.L$0 = c3704a2;
                    this.label = 1;
                    if (qsl.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c3704a = c3704a2;
                } catch (Throwable th2) {
                    c3704a = c3704a2;
                    th = th2;
                    this.$autoPlay.T(c3704a);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3704a = (C3704a) this.L$0;
                try {
                    kotlin.a.a(obj);
                } catch (Throwable th3) {
                    th = th3;
                    this.$autoPlay.T(c3704a);
                    throw th;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* compiled from: InitDelegate.kt */
        /* renamed from: xsna.sxw$a$a, reason: collision with other inner class name */
        public static final class C3704a implements hnt0 {
            public final /* synthetic */ ars0 b;

            public C3704a(ars0 ars0Var) {
                this.b = ars0Var;
            }

            @Override // xsna.hnt0
            public final void V3(yg5 yg5Var) {
                c63 c63Var = c63.a;
                if (c63.f && ((VideoLargeListState) ((b2a) this.b.b.b).getCurrentState()).o) {
                    VideoPlayerMode videoPlayerMode = VideoPlayerMode.PREVIEW;
                    if (yg5Var instanceof VideoAutoPlay) {
                        i0q0.j(new tou(5, videoPlayerMode, yg5Var));
                    }
                }
            }

            @Override // xsna.hnt0
            public final void E() {
            }

            @Override // xsna.hnt0
            public final void c2() {
            }

            @Override // xsna.hnt0
            public final void h() {
            }

            @Override // xsna.hnt0
            public final void j() {
            }

            @Override // xsna.hnt0
            public final void t2() {
            }

            @Override // xsna.hnt0
            public final void u() {
            }

            @Override // xsna.hnt0
            public final void K2(VideoAutoPlay videoAutoPlay) {
            }

            @Override // xsna.hnt0
            public final void O(one.video.player.tracks.c cVar) {
            }

            @Override // xsna.hnt0
            public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
            }

            @Override // xsna.hnt0
            public final void S2(long j) {
            }

            @Override // xsna.hnt0
            public final void T0(VideoAutoPlay videoAutoPlay) {
            }

            @Override // xsna.hnt0
            public final void U(VideoAutoPlay videoAutoPlay) {
            }

            @Override // xsna.hnt0
            public final void U0(one.video.player.tracks.b bVar) {
            }

            @Override // xsna.hnt0
            public final void U3(DownloadInfo downloadInfo) {
            }

            @Override // xsna.hnt0
            public final void a(boolean z) {
            }

            @Override // xsna.hnt0
            public final void d4(yg5 yg5Var) {
            }

            @Override // xsna.hnt0
            public final void j4(VideoAutoPlay videoAutoPlay) {
            }

            @Override // xsna.hnt0
            public final void l(x2s0 x2s0Var) {
            }

            @Override // xsna.hnt0
            public final void m4(VideoAutoPlay videoAutoPlay) {
            }

            @Override // xsna.hnt0
            public final void n2(yg5 yg5Var) {
            }

            @Override // xsna.hnt0
            public final void p0(yg5 yg5Var) {
            }

            @Override // xsna.hnt0
            public final void p2(VideoAutoPlay videoAutoPlay) {
            }

            @Override // xsna.hnt0
            public final void q(List<? extends SubtitleRenderItem> list) {
            }

            @Override // xsna.hnt0
            public final void r1(yg5 yg5Var) {
            }

            @Override // xsna.hnt0
            public final void x0(boolean z) {
            }

            @Override // xsna.hnt0
            public final void H(long j, long j2) {
            }

            @Override // xsna.hnt0
            public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
            }

            @Override // xsna.hnt0
            public final void N3(VideoAutoPlay videoAutoPlay, long j) {
            }

            @Override // xsna.hnt0
            public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
            }

            @Override // xsna.hnt0
            public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
            }

            @Override // xsna.hnt0
            public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
            }

            @Override // xsna.hnt0
            public final void z0(VideoAutoPlay videoAutoPlay, int i) {
            }

            @Override // xsna.hnt0
            public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
            }

            @Override // xsna.hnt0
            public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            }

            @Override // xsna.hnt0
            public final void h3(yg5 yg5Var, int i, int i2) {
            }

            @Override // xsna.hnt0
            public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
            }
        }
    }
}
