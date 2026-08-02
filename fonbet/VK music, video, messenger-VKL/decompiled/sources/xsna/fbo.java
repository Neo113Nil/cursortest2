package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderView$DownloadedSliderState;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.dto.common.VideoFileOld;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.exo.offline.DownloadInfo;
import xsna.cbo;
import xsna.ln50;
import xsna.on50;
import xsna.zao;

/* compiled from: DownloadedAction.kt */
/* loaded from: classes16.dex */
public final class fbo extends u1a<DownloadedSliderView$DownloadedSliderState, zao> {
    public final gkt0 c;

    /* compiled from: DownloadedAction.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderInlineActor$1$1", f = "DownloadedAction.kt", l = {70}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: DownloadedAction.kt */
        /* renamed from: xsna.fbo$a$a, reason: collision with other inner class name */
        public static final class C2863a<T> implements lsr {
            public final /* synthetic */ fbo b;

            public C2863a(fbo fboVar) {
                this.b = fboVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                this.b.m(new n1d((List) obj, 15));
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return fbo.this.new a(spjVar);
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
                nb9 a = cdn.a(fxc0.B().s().B());
                C2863a c2863a = new C2863a(fbo.this);
                this.label = 1;
                if (a.collect(c2863a, this) == coroutineSingletons) {
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

    public fbo(b2a b2aVar, gkt0 gkt0Var) {
        super(b2aVar);
        this.c = gkt0Var;
        on50 qn50Var = new qn50(0);
        e((2 & 1) != 0 ? on50.a.a : qn50Var, ln50.a.a, new cqf(this, 15));
    }

    @Override // xsna.u1a
    public final void g(zao zaoVar) {
        Object obj;
        zao zaoVar2 = zaoVar;
        b2a b2aVar = (b2a) this.b.b;
        if (zaoVar2 instanceof zao.d) {
            t(new cbo.b(new BlockId.Simple(((zao.d) zaoVar2).b)));
            return;
        }
        if (zaoVar2 instanceof zao.e) {
            Iterator<T> it = ((DownloadedSliderView$DownloadedSliderState) b2aVar.getCurrentState()).e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((czs0) next).a.a1(), ((zao.e) zaoVar2).c)) {
                    r2 = next;
                    break;
                }
            }
            czs0 czs0Var = (czs0) r2;
            if (czs0Var != null) {
                zao.e eVar = (zao.e) zaoVar2;
                v(new VideoCatalogAnalyticsEvent.a(czs0Var.a.W, eVar.d, eVar.e));
                return;
            }
            return;
        }
        if (!(zaoVar2 instanceof zao.f)) {
            if (zaoVar2 instanceof zao.b) {
                zao.b bVar = (zao.b) zaoVar2;
                t(new cbo.a(new BlockId.Simple(bVar.b), bVar.c, DonutVideoClickSource.DESCRIPTION));
                return;
            } else if (zaoVar2 instanceof zao.a) {
                zao.a aVar = (zao.a) zaoVar2;
                t(new cbo.a(new BlockId.Simple(aVar.b), aVar.c, DonutVideoClickSource.PAYWALL));
                return;
            } else {
                if (!(zaoVar2 instanceof zao.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.c.getClass();
                return;
            }
        }
        Iterator<T> it2 = ((DownloadedSliderView$DownloadedSliderState) b2aVar.getCurrentState()).e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (epx.f(((czs0) obj).a.a1(), ((zao.f) zaoVar2).c)) {
                    break;
                }
            }
        }
        czs0 czs0Var2 = (czs0) obj;
        if (czs0Var2 != null) {
            VideoFileOld videoFileOld = czs0Var2.a;
            zao.f fVar = (zao.f) zaoVar2;
            String str = fVar.b;
            if (fVar.d) {
                t(new cbo.d(new BlockId.Simple(str), videoFileOld, fVar.f));
            } else if (fVar.e) {
                t(new cbo.c(new BlockId.Simple(str), videoFileOld, new svd(this, zaoVar2, videoFileOld, 3)));
            } else {
                DownloadInfo x = fxc0.B().s().x(videoFileOld);
                t(new cbo.e(new BlockId.Simple(str), videoFileOld, (x != null ? x.c : null) != DownloadInfo.State.STATE_COMPLETED, (x != null ? x.c : null) != DownloadInfo.State.STATE_STOPPED));
            }
        }
    }

    @Override // xsna.u1a
    public final DownloadedSliderView$DownloadedSliderState h(DownloadedSliderView$DownloadedSliderState downloadedSliderView$DownloadedSliderState, DownloadedSliderView$DownloadedSliderState downloadedSliderView$DownloadedSliderState2) {
        DownloadedSliderView$DownloadedSliderState downloadedSliderView$DownloadedSliderState3 = downloadedSliderView$DownloadedSliderState;
        DownloadedSliderView$DownloadedSliderState downloadedSliderView$DownloadedSliderState4 = downloadedSliderView$DownloadedSliderState2;
        return (!downloadedSliderView$DownloadedSliderState4.e.isEmpty() || downloadedSliderView$DownloadedSliderState3.e.isEmpty()) ? downloadedSliderView$DownloadedSliderState4 : DownloadedSliderView$DownloadedSliderState.a(downloadedSliderView$DownloadedSliderState4, downloadedSliderView$DownloadedSliderState3.e);
    }
}
