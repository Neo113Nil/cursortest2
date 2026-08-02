package xsna;

import com.vk.catalog.mvi.block.video.impl.video.stackedlist.VideosStackedListView$State;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.fet0;
import xsna.qtt0;
import xsna.vjs0;

/* compiled from: VideosStackedListView.kt */
/* loaded from: classes16.dex */
public final class ptt0 extends u1a<VideosStackedListView$State, qtt0> {

    /* compiled from: VideosStackedListView.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.stackedlist.VideosStackedListView$InlineActor$1", f = "VideosStackedListView.kt", l = {202}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ m7a $catalogInteractor;
        int label;
        final /* synthetic */ ptt0 this$0;

        /* compiled from: VideosStackedListView.kt */
        /* renamed from: xsna.ptt0$a$a, reason: collision with other inner class name */
        public static final class C3531a<T> implements lsr {
            public final /* synthetic */ ptt0 b;

            public C3531a(ptt0 ptt0Var) {
                this.b = ptt0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                y4a y4aVar = (y4a) obj;
                if (y4aVar instanceof sxm0) {
                    ptt0 ptt0Var = this.b;
                    sxm0 sxm0Var = (sxm0) y4aVar;
                    if (epx.f(((VideosStackedListView$State) ((b2a) ptt0Var.b.b).getCurrentState()).g.I0(), sxm0Var.b)) {
                        VideoFile videoFile = ((VideosStackedListView$State) ((b2a) ptt0Var.b.b).getCurrentState()).g;
                        videoFile.k3(sxm0Var.c);
                        ptt0Var.m(new lzl0(videoFile, 12));
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m7a m7aVar, ptt0 ptt0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$catalogInteractor = m7aVar;
            this.this$0 = ptt0Var;
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
                C3531a c3531a = new C3531a(this.this$0);
                this.label = 1;
                if (b.collect(c3531a, this) == coroutineSingletons) {
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

    public ptt0(b2a b2aVar, m7a m7aVar) {
        super(b2aVar);
        w1a.b(this, null, new a(m7aVar, this, null), 3);
    }

    @Override // xsna.u1a
    public final void g(qtt0 qtt0Var) {
        DonutVideoUiModel.DescriptionChip descriptionChip;
        DonutVideoAction donutVideoAction;
        DonutVideoUiModel.PreviewBadge previewBadge;
        DonutVideoAction donutVideoAction2;
        qtt0 qtt0Var2 = qtt0Var;
        b2a b2aVar = (b2a) this.b.b;
        if (qtt0Var2 instanceof qtt0.d) {
            t(new vjs0.c(((qtt0.d) qtt0Var2).b, ((VideosStackedListView$State) b2aVar.getCurrentState()).g, null, null));
            return;
        }
        if (qtt0Var2 instanceof qtt0.c) {
            t(new fet0.e(((VideosStackedListView$State) b2aVar.getCurrentState()).g, ((VideosStackedListView$State) b2aVar.getCurrentState()).h));
            return;
        }
        if (qtt0Var2 instanceof qtt0.a) {
            DonutVideoUiModel donutVideoUiModel = ((VideosStackedListView$State) b2aVar.getCurrentState()).k;
            if (donutVideoUiModel == null || (previewBadge = donutVideoUiModel.b) == null || (donutVideoAction2 = previewBadge.e) == null) {
                return;
            }
            t(new vjs0.a(((qtt0.a) qtt0Var2).b, donutVideoAction2, DonutVideoClickSource.PAYWALL));
            return;
        }
        if (!(qtt0Var2 instanceof qtt0.b)) {
            if (!(qtt0Var2 instanceof qtt0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            qtt0.e eVar = (qtt0.e) qtt0Var2;
            v(new VideoCatalogAnalyticsEvent.a(((VideosStackedListView$State) b2aVar.getCurrentState()).g.r(), eVar.c, eVar.d));
            return;
        }
        DonutVideoUiModel donutVideoUiModel2 = ((VideosStackedListView$State) b2aVar.getCurrentState()).k;
        if (donutVideoUiModel2 == null || (descriptionChip = donutVideoUiModel2.c) == null || (donutVideoAction = descriptionChip.e) == null) {
            return;
        }
        t(new vjs0.a(((qtt0.b) qtt0Var2).b, donutVideoAction, DonutVideoClickSource.DESCRIPTION));
    }
}
