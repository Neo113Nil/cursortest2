package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.video.video.VideoView$State;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.awr0;
import xsna.fet0;
import xsna.gdt0;
import xsna.ln50;
import xsna.vjs0;

/* compiled from: VideoAction.kt */
/* loaded from: classes16.dex */
public final class hqs0 extends u1a<VideoView$State, awr0> {
    public final hdt0 c;

    /* compiled from: VideoAction.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.video.VideoInlineActor$1$1", f = "VideoAction.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ m7a $catalogInteractor;
        int label;
        final /* synthetic */ hqs0 this$0;

        /* compiled from: VideoAction.kt */
        /* renamed from: xsna.hqs0$a$a, reason: collision with other inner class name */
        public static final class C3018a<T> implements lsr {
            public final /* synthetic */ hqs0 b;

            public C3018a(hqs0 hqs0Var) {
                this.b = hqs0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                y4a y4aVar = (y4a) obj;
                if (y4aVar instanceof sxm0) {
                    hqs0 hqs0Var = this.b;
                    sxm0 sxm0Var = (sxm0) y4aVar;
                    if (epx.f(((VideoView$State) ((b2a) hqs0Var.b.b).getCurrentState()).d.I0(), sxm0Var.b)) {
                        VideoFile videoFile = ((VideoView$State) ((b2a) hqs0Var.b.b).getCurrentState()).d;
                        videoFile.k3(sxm0Var.c);
                        hqs0Var.m(new gzc(1, videoFile));
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m7a m7aVar, hqs0 hqs0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$catalogInteractor = m7aVar;
            this.this$0 = hqs0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$catalogInteractor, this.this$0, spjVar);
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
                ksr<y4a> b = this.$catalogInteractor.b();
                C3018a c3018a = new C3018a(this.this$0);
                this.label = 1;
                if (b.collect(c3018a, this) == coroutineSingletons) {
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

    public hqs0(m7a m7aVar, b2a b2aVar, hdt0 hdt0Var) {
        super(b2aVar);
        this.c = hdt0Var;
        e(new qn50(0), ln50.a.b, new hto0(2, m7aVar, this));
    }

    public final void w(BlockId.CompositeId compositeId, VideoTransitionSource videoTransitionSource) {
        b2a b2aVar = (b2a) this.b.b;
        VideoRestriction O = ((VideoView$State) b2aVar.getCurrentState()).d.O();
        if (!this.c.c(((VideoView$State) b2aVar.getCurrentState()).d) || O == null) {
            t(new vjs0.c(compositeId, ((VideoView$State) b2aVar.getCurrentState()).d, ((VideoView$State) b2aVar.getCurrentState()).e, videoTransitionSource));
            return;
        }
        gdt0 a2 = qdt0.a(O);
        if (epx.f(a2, gdt0.a.a)) {
            t(new vjs0.c(compositeId, ((VideoView$State) b2aVar.getCurrentState()).d, ((VideoView$State) b2aVar.getCurrentState()).e, videoTransitionSource));
        } else if (epx.f(a2, gdt0.b.a)) {
            t(new vjs0.d(compositeId, ((VideoView$State) b2aVar.getCurrentState()).d, new k4(21, this, compositeId), new ks2(27, this, compositeId)));
        }
    }

    @Override // xsna.u1a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void g(awr0 awr0Var) {
        DonutVideoUiModel.PreviewBadge previewBadge;
        DonutVideoUiModel.DescriptionChip descriptionChip;
        b2a b2aVar = (b2a) this.b.b;
        if (awr0Var instanceof awr0.h) {
            awr0.h hVar = (awr0.h) awr0Var;
            w(hVar.b, hVar.c);
            return;
        }
        if (awr0Var instanceof awr0.b) {
            q();
            return;
        }
        if (awr0Var instanceof awr0.c) {
            r();
            return;
        }
        if (awr0Var instanceof awr0.a) {
            t(new vjs0.b(((awr0.a) awr0Var).b, ((VideoView$State) b2aVar.getCurrentState()).d, ((VideoView$State) b2aVar.getCurrentState()).e, ((VideoView$State) b2aVar.getCurrentState()).d.x8()));
            return;
        }
        if (awr0Var instanceof awr0.f) {
            t(new fet0.e(((VideoView$State) b2aVar.getCurrentState()).d, ((VideoView$State) b2aVar.getCurrentState()).f));
            return;
        }
        if (awr0Var instanceof awr0.g) {
            String str = ((VideoView$State) b2aVar.getCurrentState()).e;
            if (str == null) {
                str = ((VideoView$State) b2aVar.getCurrentState()).d.r();
            }
            awr0.g gVar = (awr0.g) awr0Var;
            v(new VideoCatalogAnalyticsEvent.a(str, gVar.c, gVar.d));
            return;
        }
        DonutVideoAction donutVideoAction = null;
        if (awr0Var instanceof awr0.e) {
            DonutVideoUiModel donutVideoUiModel = ((VideoView$State) b2aVar.getCurrentState()).g;
            if (donutVideoUiModel != null && (descriptionChip = donutVideoUiModel.c) != null) {
                donutVideoAction = descriptionChip.e;
            }
            if (donutVideoAction != null) {
                t(new vjs0.a(((awr0.e) awr0Var).b, donutVideoAction, DonutVideoClickSource.DESCRIPTION));
                return;
            } else {
                awr0.e eVar = (awr0.e) awr0Var;
                w(eVar.b, eVar.c);
                return;
            }
        }
        if (!(awr0Var instanceof awr0.d)) {
            throw new NoWhenBranchMatchedException();
        }
        DonutVideoUiModel donutVideoUiModel2 = ((VideoView$State) b2aVar.getCurrentState()).g;
        if (donutVideoUiModel2 != null && (previewBadge = donutVideoUiModel2.b) != null) {
            donutVideoAction = previewBadge.e;
        }
        if (donutVideoAction != null) {
            t(new vjs0.a(((awr0.d) awr0Var).b, donutVideoAction, DonutVideoClickSource.PAYWALL));
        } else {
            awr0.d dVar = (awr0.d) awr0Var;
            w(dVar.b, dVar.c);
        }
    }
}
