package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMoviePageButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.omt0;

/* compiled from: VideoTrailerInlineActor.kt */
/* loaded from: classes16.dex */
public final class ylt0 extends u1a<VideoTrailerView$State, omt0> {
    public final hdt0 c;
    public final com.vk.video.focus.api.a d;
    public final xlt0 e;

    /* compiled from: VideoTrailerInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$autoPlayAction$1", f = "VideoTrailerInlineActor.kt", l = {185}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yg5 $autoPlay;
        final /* synthetic */ wzs<yg5, spj<? super s3q0>, Object> $block;
        int label;

        /* compiled from: VideoTrailerInlineActor.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$autoPlayAction$1$1", f = "VideoTrailerInlineActor.kt", l = {186}, m = "invokeSuspend")
        /* renamed from: xsna.ylt0$a$a, reason: collision with other inner class name */
        public static final class C4111a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ yg5 $autoPlay;
            final /* synthetic */ wzs<yg5, spj<? super s3q0>, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4111a(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar, yg5 yg5Var, spj<? super C4111a> spjVar) {
                super(2, spjVar);
                this.$block = wzsVar;
                this.$autoPlay = yg5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C4111a(this.$block, this.$autoPlay, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C4111a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar, yg5 yg5Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$block = wzsVar;
            this.$autoPlay = yg5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$block, this.$autoPlay, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                C4111a c4111a = new C4111a(this.$block, this.$autoPlay, null);
                this.label = 1;
                if (myc0.k(ge00Var, c4111a, this) == coroutineSingletons) {
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

    /* compiled from: VideoTrailerInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$setPlayTextureAnd$1", f = "VideoTrailerInlineActor.kt", l = {164}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
        final /* synthetic */ com.vk.libvideo.autoplay.a $autoPlayConfig;
        final /* synthetic */ wzs<yg5, spj<? super s3q0>, Object> $block;
        final /* synthetic */ VideoTextureView $videoView;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(VideoTextureView videoTextureView, com.vk.libvideo.autoplay.a aVar, wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$videoView = videoTextureView;
            this.$autoPlayConfig = aVar;
            this.$block = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$videoView, this.$autoPlayConfig, this.$block, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
            return ((b) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yg5 yg5Var = (yg5) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Objects.toString(yg5Var);
                yg5Var.z0(this.$videoView, this.$autoPlayConfig, null);
                wzs<yg5, spj<? super s3q0>, Object> wzsVar = this.$block;
                this.L$0 = null;
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

    /* compiled from: VideoTrailerInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$stopPlayerBlocking$1", f = "VideoTrailerInlineActor.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yg5 $autoPlay;
        final /* synthetic */ VideoTextureView $videoView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yg5 yg5Var, VideoTextureView videoTextureView, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$autoPlay = yg5Var;
            this.$videoView = videoTextureView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$autoPlay, this.$videoView, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$autoPlay.pause();
            this.$autoPlay.B0().stop();
            this.$autoPlay.b0(this.$videoView);
            return s3q0.a;
        }
    }

    public ylt0(b2a b2aVar, hdt0 hdt0Var, com.vk.video.focus.api.a aVar) {
        super(b2aVar);
        this.c = hdt0Var;
        this.d = aVar;
        this.e = new xlt0();
        w1a.b(this, null, new amt0(this, null), 3);
    }

    @Override // xsna.u1a, xsna.uic
    public final void clear() {
        super.clear();
        this.d.d(((VideoTrailerView$State) ((b2a) this.b.b).getCurrentState()).i);
        y();
    }

    @Override // xsna.u1a
    public final void g(omt0 omt0Var) {
        omt0 omt0Var2 = omt0Var;
        b2a b2aVar = (b2a) this.b.b;
        this.e.getClass();
        boolean z = omt0Var2 instanceof omt0.e;
        int i = 2;
        if (z) {
            CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype eventSubtype = CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype.TRAILER;
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoMoviePageButtonClick(CommonVideoStat$TypeVideoMoviePageButtonClick.EventType.BUTTON_CLICK, eventSubtype, null, 4, null), 2)).q();
        }
        boolean z2 = omt0Var2 instanceof omt0.b;
        com.vk.video.focus.api.a aVar = this.d;
        if (z2) {
            aVar.e(((VideoTrailerView$State) b2aVar.getCurrentState()).i, new bmt0(((omt0.b) omt0Var2).c == Lifecycle.State.RESUMED));
            return;
        }
        if (omt0Var2 instanceof omt0.a) {
            aVar.e(((VideoTrailerView$State) b2aVar.getCurrentState()).i, new lk00((omt0.a) omt0Var2, i));
            return;
        }
        if (omt0Var2 instanceof omt0.c) {
            omt0.c cVar = (omt0.c) omt0Var2;
            if (cVar instanceof omt0.c.a) {
                m(new n9m0(cVar, 19));
                if (((VideoTrailerView$State) b2aVar.getCurrentState()).l) {
                    x(new cmt0(this, null));
                    return;
                }
                return;
            }
            if (!(cVar instanceof omt0.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            y();
            m(new irt(28));
            return;
        }
        if (omt0Var2 instanceof omt0.f) {
            omt0.f fVar = (omt0.f) omt0Var2;
            if (fVar instanceof omt0.f.a) {
                w(new kmt0(2, null));
                return;
            } else {
                if (!(fVar instanceof omt0.f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                w(new lmt0(2, null));
                return;
            }
        }
        if (!(omt0Var2 instanceof omt0.d)) {
            if (z) {
                w(new jmt0(2, null));
                return;
            } else {
                if (!(omt0Var2 instanceof pmt0)) {
                    throw new NoWhenBranchMatchedException();
                }
                x(new fmt0(2, null));
                return;
            }
        }
        omt0.d dVar = (omt0.d) omt0Var2;
        if (dVar instanceof omt0.d.b) {
            m(new ye40(27));
            w(new dmt0(2, null));
        } else {
            if (!(dVar instanceof omt0.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m(new t3v(25));
            w(new emt0(dVar, null));
        }
    }

    @Override // xsna.u1a
    public final VideoTrailerView$State h(VideoTrailerView$State videoTrailerView$State, VideoTrailerView$State videoTrailerView$State2) {
        VideoTrailerView$State videoTrailerView$State3 = videoTrailerView$State;
        return VideoTrailerView$State.a(videoTrailerView$State2, null, videoTrailerView$State3.e, videoTrailerView$State3.f, videoTrailerView$State3.g, videoTrailerView$State3.h, videoTrailerView$State3.i, videoTrailerView$State3.l, videoTrailerView$State3.m, videoTrailerView$State3.n, 775);
    }

    public final void w(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        yg5 yg5Var = ((VideoTrailerView$State) ((b2a) this.b.b).getCurrentState()).e;
        if (yg5Var != null) {
            w1a.b(this, null, new a(wzsVar, yg5Var, null), 3);
        }
    }

    public final void x(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        b2a b2aVar = (b2a) this.b.b;
        yg5 yg5Var = ((VideoTrailerView$State) b2aVar.getCurrentState()).e;
        VideoTextureView videoTextureView = ((VideoTrailerView$State) b2aVar.getCurrentState()).h.get();
        com.vk.libvideo.autoplay.a aVar = ((VideoTrailerView$State) b2aVar.getCurrentState()).f;
        if (yg5Var == null || videoTextureView == null || aVar == null) {
            return;
        }
        w(new b(videoTextureView, aVar, wzsVar, null));
    }

    public final void y() {
        b2a b2aVar = (b2a) this.b.b;
        VideoTextureView videoTextureView = ((VideoTrailerView$State) b2aVar.getCurrentState()).h.get();
        yg5 yg5Var = ((VideoTrailerView$State) b2aVar.getCurrentState()).e;
        if (yg5Var != null) {
            bdn bdnVar = bdn.a;
            myc0.i(ie00.a, new c(yg5Var, videoTextureView, null));
        }
    }
}
