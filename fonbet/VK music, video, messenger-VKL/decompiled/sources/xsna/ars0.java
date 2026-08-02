package xsna;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerLegacyForceUpdates$2;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.SnippetTarget;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a5o;
import xsna.fet0;
import xsna.jht0;
import xsna.m0b0;
import xsna.r1a;
import xsna.rmw;
import xsna.wqs0;
import xsna.xqs0;

/* compiled from: VideoLargeListInlineActor.kt */
/* loaded from: classes16.dex */
public final class ars0 extends u1a<VideoLargeListState, wqs0> {
    public final hdt0 c;
    public final com.vk.video.focus.api.a d;
    public final VideoApiHelperRepository e;
    public final anz f;
    public final boolean g;

    /* compiled from: VideoLargeListInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.VideoLargeListInlineActor$autoPlayAction$1", f = "VideoLargeListInlineActor.kt", l = {130}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yg5 $autoPlay;
        final /* synthetic */ wzs<yg5, spj<? super s3q0>, Object> $block;
        int label;

        /* compiled from: VideoLargeListInlineActor.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.VideoLargeListInlineActor$autoPlayAction$1$1", f = "VideoLargeListInlineActor.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
        /* renamed from: xsna.ars0$a$a, reason: collision with other inner class name */
        public static final class C2567a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ yg5 $autoPlay;
            final /* synthetic */ wzs<yg5, spj<? super s3q0>, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2567a(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar, yg5 yg5Var, spj<? super C2567a> spjVar) {
                super(2, spjVar);
                this.$block = wzsVar;
                this.$autoPlay = yg5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2567a(this.$block, this.$autoPlay, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2567a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                C2567a c2567a = new C2567a(this.$block, this.$autoPlay, null);
                this.label = 1;
                if (myc0.k(ge00Var, c2567a, this) == coroutineSingletons) {
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

    /* compiled from: VideoLargeListInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.VideoLargeListInlineActor$setPlayTextureAnd$1", f = "VideoLargeListInlineActor.kt", l = {108}, m = "invokeSuspend")
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

    /* compiled from: VideoLargeListInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.VideoLargeListInlineActor$suspendSetPlayTextureAnd$2", f = "VideoLargeListInlineActor.kt", l = {120}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yg5 $autoPlay;
        final /* synthetic */ com.vk.libvideo.autoplay.a $autoPlayConfig;
        final /* synthetic */ wzs<yg5, spj<? super s3q0>, Object> $block;
        final /* synthetic */ VideoTextureView $videoView;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(yg5 yg5Var, VideoTextureView videoTextureView, com.vk.libvideo.autoplay.a aVar, wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$autoPlay = yg5Var;
            this.$videoView = videoTextureView;
            this.$autoPlayConfig = aVar;
            this.$block = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = new c(this.$autoPlay, this.$videoView, this.$autoPlayConfig, this.$block, spjVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yg5 yg5Var = this.$autoPlay;
                Objects.toString(yvjVar);
                yg5Var.z0(this.$videoView, this.$autoPlayConfig, null);
                wzs<yg5, spj<? super s3q0>, Object> wzsVar = this.$block;
                yg5 yg5Var2 = this.$autoPlay;
                this.L$0 = null;
                this.label = 1;
                if (wzsVar.invoke(yg5Var2, this) == coroutineSingletons) {
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

    public /* synthetic */ ars0(b2a b2aVar, hdt0 hdt0Var, com.vk.video.focus.api.a aVar, VideoApiHelperRepository videoApiHelperRepository, anz anzVar) {
        this(b2aVar, hdt0Var, aVar, videoApiHelperRepository, anzVar, false);
    }

    @Override // xsna.u1a, xsna.uic
    public final void clear() {
        super.clear();
        this.d.d(((VideoLargeListState) ((b2a) this.b.b).getCurrentState()).p);
        y0b0.a(this);
    }

    @Override // xsna.u1a
    public final void g(wqs0 wqs0Var) {
        DonutVideoUiModel.DescriptionChip descriptionChip;
        DonutVideoAction donutVideoAction;
        DonutVideoUiModel.PreviewBadge previewBadge;
        DonutVideoAction donutVideoAction2;
        VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State state;
        fjz fjzVar;
        wqs0 wqs0Var2 = wqs0Var;
        b2a b2aVar = (b2a) this.b.b;
        boolean z = wqs0Var2 instanceof wqs0.i;
        com.vk.video.focus.api.a aVar = this.d;
        if (z) {
            aVar.e(((VideoLargeListState) b2aVar.getCurrentState()).p, new crs0(((wqs0.i) wqs0Var2).c == Lifecycle.State.RESUMED));
            return;
        }
        if (wqs0Var2 instanceof wqs0.h) {
            aVar.e(((VideoLargeListState) b2aVar.getCurrentState()).p, new brs0((wqs0.h) wqs0Var2));
            return;
        }
        fjz fjzVar2 = null;
        if (wqs0Var2 instanceof wqs0.l) {
            wqs0.l lVar = (wqs0.l) wqs0Var2;
            if (lVar instanceof wqs0.l.d) {
                m(new bk30(lVar, 16));
                if (((VideoLargeListState) b2aVar.getCurrentState()).o) {
                    m0b0.a(this);
                    if (((VideoLargeListState) b2aVar.getCurrentState()).t.f || !this.g) {
                        x(new x0b0(this, null));
                        return;
                    }
                    return;
                }
                return;
            }
            if (lVar instanceof wqs0.l.e) {
                y0b0.a(this);
                m(new pey(15));
                return;
            }
            if (lVar instanceof wqs0.l.c) {
                m(new bzw(lVar, 20));
                return;
            }
            if (!(lVar instanceof wqs0.l.a)) {
                if (!(lVar instanceof wqs0.l.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fjz fjzVar3 = ((VideoLargeListState) b2aVar.getCurrentState()).v;
                if (fjzVar3 != null) {
                    fjzVar3.pause();
                    fjzVar3.a();
                }
                m(new vsq(10));
                return;
            }
            wqs0.l.a aVar2 = (wqs0.l.a) lVar;
            if (((VideoLargeListState) b2aVar.getCurrentState()).t.e) {
                yjk0 yjk0Var = aVar2.d;
                ViewGroup viewGroup = aVar2.c;
                if (yjk0Var == null || viewGroup == null) {
                    fjzVar = null;
                } else {
                    yjk0Var.setSpectatorsCounterView(new ziz(this));
                    fjzVar = this.f.D(viewGroup, yjk0Var, true, new ajz(this));
                }
                if (fjzVar != null) {
                    fjzVar.c(((VideoLargeListState) b2aVar.getCurrentState()).d);
                    fjzVar.b(((VideoLargeListState) b2aVar.getCurrentState()).t.f, new p5y(this, 2));
                    fjzVar2 = fjzVar;
                }
            }
            m(new bi0(21, fjzVar2, aVar2));
            return;
        }
        if (wqs0Var2 instanceof wqs0.b) {
            t(new xqs0.c(((wqs0.b) wqs0Var2).b, ((VideoLargeListState) b2aVar.getCurrentState()).d, ((VideoLargeListState) b2aVar.getCurrentState()).d.x8()));
            return;
        }
        if (wqs0Var2 instanceof wqs0.j) {
            t(new xqs0.e(((wqs0.j) wqs0Var2).b, ((VideoLargeListState) b2aVar.getCurrentState()).d));
            return;
        }
        if (wqs0Var2 instanceof wqs0.g) {
            rmw.e eVar = ((wqs0.g) wqs0Var2).c;
            if (eVar instanceof rmw.e.c) {
                rmw.e.c cVar = (rmw.e.c) eVar;
                String a2 = cVar.a();
                if (cVar instanceof rmw.e.c.a) {
                    state = VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.Cancel;
                } else if (cVar instanceof rmw.e.c.b) {
                    state = VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.Error;
                } else if (cVar instanceof rmw.e.c.C3615c) {
                    state = VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.Loading;
                } else {
                    if (!(cVar instanceof rmw.e.c.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    state = VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn.State.Success;
                }
                v(new VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn(a2, state));
                return;
            }
            return;
        }
        if (wqs0Var2 instanceof wqs0.n) {
            t(new fet0.e(((VideoLargeListState) b2aVar.getCurrentState()).d, ((VideoLargeListState) b2aVar.getCurrentState()).e));
            return;
        }
        if (wqs0Var2 instanceof wqs0.q) {
            m(new t810(10));
            return;
        }
        if (wqs0Var2 instanceof wqs0.c) {
            wqs0.c cVar2 = (wqs0.c) wqs0Var2;
            BlockId.CompositeId compositeId = cVar2.b;
            ActionLink m1 = ((VideoLargeListState) b2aVar.getCurrentState()).d.m1();
            if (m1 == null) {
                return;
            }
            if (!epx.f(m1.c, "video")) {
                t(new xqs0.d(compositeId, ((VideoLargeListState) b2aVar.getCurrentState()).d));
                return;
            }
            ActionLinkSnippet actionLinkSnippet = m1.f;
            SnippetTarget snippetTarget = actionLinkSnippet != null ? actionLinkSnippet.f : null;
            int i = snippetTarget == null ? -1 : m0b0.a.$EnumSwitchMapping$0[snippetTarget.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    w1a.b(this, null, new o0b0(m1, this, cVar2, null), 3);
                    return;
                } else if (i == 2) {
                    t(new xqs0.f(compositeId, m1.d));
                    return;
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            t(new r1a.b(m1.e, null));
            return;
        }
        if (wqs0Var2 instanceof wqs0.f) {
            wqs0.f fVar = (wqs0.f) wqs0Var2;
            if (fVar instanceof wqs0.f.a) {
                t(new xqs0.a(((wqs0.f.a) fVar).b, ((VideoLargeListState) b2aVar.getCurrentState()).d, ((VideoLargeListState) b2aVar.getCurrentState()).d.x8(), ((VideoLargeListState) b2aVar.getCurrentState()).b.b + '|' + ((VideoLargeListState) b2aVar.getCurrentState()).b.b));
                return;
            }
            if (fVar instanceof wqs0.f.b) {
                m0b0.a(this);
                x(new xkp(2, null));
                return;
            } else {
                if (!(fVar instanceof wqs0.f.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                t(new xqs0.h(((wqs0.f.c) fVar).b, ((VideoLargeListState) b2aVar.getCurrentState()).d));
                return;
            }
        }
        boolean z2 = wqs0Var2 instanceof wqs0.k;
        hdt0 hdt0Var = this.c;
        if (z2) {
            wqs0.k kVar = (wqs0.k) wqs0Var2;
            if (hdt0Var.c(((VideoLargeListState) b2aVar.getCurrentState()).d)) {
                t(new xqs0.i(kVar.b, ((VideoLargeListState) b2aVar.getCurrentState()).d));
                return;
            }
            yg5 yg5Var = ((VideoLargeListState) b2aVar.getCurrentState()).r;
            if (yg5Var == null || !yg5Var.J()) {
                return;
            }
            x(new p0b0(2, null));
            return;
        }
        if (wqs0Var2 instanceof wqs0.p) {
            wqs0.p pVar = (wqs0.p) wqs0Var2;
            if (pVar instanceof wqs0.p.a) {
                w(new s0b0(this, null));
                return;
            } else {
                if (!(pVar instanceof wqs0.p.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                w(new t0b0(this, null));
                return;
            }
        }
        if (wqs0Var2 instanceof wqs0.a) {
            w(new n0b0(this, null));
            return;
        }
        if (wqs0Var2 instanceof wqs0.o) {
            wqs0.o oVar = (wqs0.o) wqs0Var2;
            if (oVar instanceof wqs0.o.b) {
                m(new xpt(14));
                w(new q0b0(2, null));
                return;
            } else {
                if (!(oVar instanceof wqs0.o.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m(new oqu(23));
                w(new r0b0(oVar, null));
                m0b0.a(this);
                return;
            }
        }
        if (wqs0Var2 instanceof wqs0.d) {
            wqs0.d dVar = (wqs0.d) wqs0Var2;
            DonutVideoUiModel donutVideoUiModel = ((VideoLargeListState) b2aVar.getCurrentState()).g;
            if (donutVideoUiModel == null || (previewBadge = donutVideoUiModel.b) == null || (donutVideoAction2 = previewBadge.e) == null) {
                return;
            }
            t(new xqs0.b(dVar.b, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), DonutVideoClickSource.PAYWALL.h()), 1), donutVideoAction2));
            return;
        }
        if (wqs0Var2 instanceof wqs0.e) {
            wqs0.e eVar2 = (wqs0.e) wqs0Var2;
            DonutVideoUiModel donutVideoUiModel2 = ((VideoLargeListState) b2aVar.getCurrentState()).g;
            if (donutVideoUiModel2 == null || (descriptionChip = donutVideoUiModel2.c) == null || (donutVideoAction = descriptionChip.e) == null) {
                return;
            }
            t(new xqs0.b(eVar2.b, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), DonutVideoClickSource.DESCRIPTION.h()), 1), donutVideoAction));
            return;
        }
        if (wqs0Var2 instanceof wqs0.r) {
            wqs0.r rVar = (wqs0.r) wqs0Var2;
            v(new VideoCatalogAnalyticsEvent.a(((VideoLargeListState) b2aVar.getCurrentState()).d.r(), rVar.c, rVar.d));
        } else {
            if (!(wqs0Var2 instanceof wqs0.m)) {
                throw new NoWhenBranchMatchedException();
            }
            hdt0Var.d(((VideoLargeListState) b2aVar.getCurrentState()).d);
            x(new drs0(2, null));
        }
    }

    @Override // xsna.u1a
    public final VideoLargeListState h(VideoLargeListState videoLargeListState, VideoLargeListState videoLargeListState2) {
        VideoLargeListState videoLargeListState3 = videoLargeListState;
        zhf0 zhf0Var = videoLargeListState3.n;
        boolean z = videoLargeListState3.o;
        mno0 mno0Var = videoLargeListState3.q;
        yg5 yg5Var = videoLargeListState3.r;
        com.vk.libvideo.autoplay.a aVar = videoLargeListState3.s;
        gi5 gi5Var = videoLargeListState3.t;
        Integer num = videoLargeListState3.u;
        fjz fjzVar = videoLargeListState3.v;
        WeakReference<yjk0> weakReference = videoLargeListState3.w;
        WeakReference<ViewGroup> weakReference2 = videoLargeListState3.x;
        kzr0 kzr0Var = videoLargeListState3.y;
        return VideoLargeListState.a(videoLargeListState2, null, false, false, videoLargeListState3.l, videoLargeListState3.m, zhf0Var, z, videoLargeListState3.p, mno0Var, yg5Var, aVar, gi5Var, num, fjzVar, weakReference, weakReference2, kzr0Var, videoLargeListState3.z, videoLargeListState3.A, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public final void w(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        yg5 yg5Var = ((VideoLargeListState) ((b2a) this.b.b).getCurrentState()).r;
        if (yg5Var != null) {
            w1a.b(this, null, new a(wzsVar, yg5Var, null), 3);
        }
    }

    public final void x(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        b2a b2aVar = (b2a) this.b.b;
        yg5 yg5Var = ((VideoLargeListState) b2aVar.getCurrentState()).r;
        VideoTextureView videoTextureView = ((VideoLargeListState) b2aVar.getCurrentState()).z.get();
        com.vk.libvideo.autoplay.a aVar = ((VideoLargeListState) b2aVar.getCurrentState()).s;
        if (yg5Var == null || videoTextureView == null || aVar == null) {
            return;
        }
        w(new b(videoTextureView, aVar, wzsVar, null));
    }

    public final Object y(wzs<? super yg5, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        b2a b2aVar = (b2a) this.b.b;
        yg5 yg5Var = ((VideoLargeListState) b2aVar.getCurrentState()).r;
        VideoTextureView videoTextureView = ((VideoLargeListState) b2aVar.getCurrentState()).z.get();
        com.vk.libvideo.autoplay.a aVar = ((VideoLargeListState) b2aVar.getCurrentState()).s;
        if (yg5Var == null || videoTextureView == null || aVar == null) {
            return s3q0.a;
        }
        bdn bdnVar = bdn.a;
        Object k = myc0.k(ie00.a, new c(yg5Var, videoTextureView, aVar, wzsVar, null), spjVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    public ars0(b2a b2aVar, hdt0 hdt0Var, com.vk.video.focus.api.a aVar, VideoApiHelperRepository videoApiHelperRepository, anz anzVar, boolean z) {
        super(b2aVar);
        this.c = hdt0Var;
        this.d = aVar;
        this.e = videoApiHelperRepository;
        this.f = anzVar;
        this.g = z;
        m0b0.a(this);
        w1a.b(this, null, new xxw(this, null), 3);
        w1a.b(this, null, new iyw(this, null), 3);
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.g()) {
            w1a.b(this, null, new InitDelegateKt$registerLegacyForceUpdates$2(this, null), 3);
        }
        b2a b2aVar2 = (b2a) this.b.b;
        if (z) {
            aVar.f(((VideoLargeListState) b2aVar2.getCurrentState()).p, new l0z(((VideoLargeListState) b2aVar2.getCurrentState()).p, false, ((VideoLargeListState) b2aVar2.getCurrentState()).d.a1(), false));
        } else {
            aVar.f(((VideoLargeListState) b2aVar2.getCurrentState()).p, new jht0.a(((VideoLargeListState) b2aVar2.getCurrentState()).p, ((VideoLargeListState) b2aVar2.getCurrentState()).d.a1()));
        }
        w1a.b(this, null, new hyw(this, null), 3);
    }
}
