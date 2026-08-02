package xsna;

import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a8a;
import xsna.dai;
import xsna.omt0;

/* compiled from: VideoTrailerView.kt */
/* loaded from: classes.dex */
public final class tmt0 extends m2a<vmt0, omt0, umt0> {

    /* compiled from: VideoTrailerView.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$BlockView$HandleLayoutInfo$1$1", f = "VideoTrailerView.kt", l = {285}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<omt0, s3q0> $onAction;
        final /* synthetic */ a8a $scope;
        final /* synthetic */ vmt0 $state;
        Object L$0;
        int label;
        final /* synthetic */ tmt0 this$0;

        /* compiled from: VideoTrailerView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$BlockView$HandleLayoutInfo$1$1$1", f = "VideoTrailerView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.tmt0$a$a, reason: collision with other inner class name */
        public static final class C3758a extends SuspendLambda implements wzs<a8a.a, spj<? super s3q0>, Object> {
            final /* synthetic */ izs<omt0, s3q0> $onAction;
            final /* synthetic */ Ref$ObjectRef<a8a.a> $previousLayoutInfo;
            final /* synthetic */ vmt0 $state;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ tmt0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3758a(Ref$ObjectRef<a8a.a> ref$ObjectRef, izs<? super omt0, s3q0> izsVar, vmt0 vmt0Var, tmt0 tmt0Var, spj<? super C3758a> spjVar) {
                super(2, spjVar);
                this.$previousLayoutInfo = ref$ObjectRef;
                this.$onAction = izsVar;
                this.$state = vmt0Var;
                this.this$0 = tmt0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3758a c3758a = new C3758a(this.$previousLayoutInfo, this.$onAction, this.$state, this.this$0, spjVar);
                c3758a.L$0 = obj;
                return c3758a;
            }

            @Override // xsna.wzs
            public final Object invoke(a8a.a aVar, spj<? super s3q0> spjVar) {
                return ((C3758a) create(aVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, xsna.a8a$a] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ?? r0 = (a8a.a) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                a8a.a aVar = this.$previousLayoutInfo.element;
                a8a.a aVar2 = aVar;
                Float f = null;
                h9x h9xVar = aVar2 != null ? aVar2.f : null;
                h9x h9xVar2 = r0.f;
                long j = r0.b;
                long j2 = r0.c;
                tmt0 tmt0Var = this.this$0;
                if (aVar != null && h9xVar != null && h9xVar2 != null) {
                    a8a.a aVar3 = aVar;
                    long d = h9x.d(h9x.d(h9x.c(h9xVar2.a, h9xVar.a), h9x.c(j, aVar3.b)), h9x.c(j2, aVar3.c));
                    long c = h9x.c(j2, j);
                    tmt0Var.getClass();
                    f = new Float(Math.max(Math.abs((int) (d >> 32)) / Math.max((int) (c >> 32), 1), Math.abs((int) (d & 4294967295L)) / Math.max((int) (c & 4294967295L), 1)));
                }
                this.$onAction.invoke(new omt0.a(this.$state.b, r0, f));
                this.$previousLayoutInfo.element = r0;
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a8a a8aVar, vmt0 vmt0Var, izs<? super omt0, s3q0> izsVar, tmt0 tmt0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$scope = a8aVar;
            this.$state = vmt0Var;
            this.$onAction = izsVar;
            this.this$0 = tmt0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$scope, this.$state, this.$onAction, this.this$0, spjVar);
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
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ksr l = rsr.l(this.$scope.f(this.$state));
                C3758a c3758a = new C3758a(ref$ObjectRef, this.$onAction, this.$state, this.this$0, null);
                this.L$0 = null;
                this.label = 1;
                if (rsr.k(l, c3758a, this) == coroutineSingletons) {
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

    /* compiled from: Effects.kt */
    /* loaded from: classes16.dex */
    public static final class b implements kgn {
        public final /* synthetic */ Lifecycle a;
        public final /* synthetic */ qmt0 b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ vmt0 d;

        public b(Lifecycle lifecycle, qmt0 qmt0Var, izs izsVar, vmt0 vmt0Var) {
            this.a = lifecycle;
            this.b = qmt0Var;
            this.c = izsVar;
            this.d = vmt0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            qmt0 qmt0Var = this.b;
            Lifecycle lifecycle = this.a;
            lifecycle.removeObserver(qmt0Var);
            if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
                this.c.invoke(new omt0.b(this.d.b, Lifecycle.State.STARTED));
            }
        }
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final vmt0 vmt0Var, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        PreviewViewState previewViewState = vmt0Var.c;
        androidx.compose.runtime.a M = aVar.M(-1052639169);
        if ((i & 6) == 0) {
            i2 = (M.J(a8aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(vmt0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1052639169, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView.BlockView.ContentImpl (VideoTrailerView.kt:213)");
            }
            int i3 = ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 9) & 896);
            f(vmt0Var, izsVar, M, i3);
            e(a8aVar, vmt0Var, izsVar, M, (i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i2 >> 6) & 7168));
            d(vmt0Var, izsVar, M, i3);
            dai.b a2 = previewViewState.e().a();
            BlockId blockId = vmt0Var.b;
            q5b0 q5b0Var = vmt0Var.d;
            Object c = kai.c(-952283795, new po7(3, vmt0Var, izsVar), M);
            boolean J = M.J(blockId) | M.J(q5b0Var);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                M.R(c);
            } else {
                c = x;
            }
            a2.c((yzs) c, M, 0);
            com.vk.libvideo.design.compose.base.preview.c.D(previewViewState, ahn.E(q630Var, "movie_trailer_root"), M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.smt0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tmt0.this.b(a8aVar, vmt0Var, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }

    public final void d(vmt0 vmt0Var, izs<? super omt0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        PreviewViewState.n b2;
        PreviewViewState.n a2;
        PreviewViewState.n b3;
        androidx.compose.runtime.a M = aVar.M(-1443508553);
        if ((i & 6) == 0) {
            i2 = i | (M.J(vmt0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1443508553, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView.BlockView.HandleComposableValues (VideoTrailerView.kt:316)");
            }
            BlockId blockId = vmt0Var.b;
            PreviewViewState previewViewState = vmt0Var.c;
            PreviewViewState.p f = previewViewState.f();
            PreviewViewState.n nVar = f instanceof PreviewViewState.n ? (PreviewViewState.n) f : null;
            dai.c a3 = nVar != null ? nVar.a() : null;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (a3 == null) {
                M.K(1944488114);
            } else {
                M.K(62725423);
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new vq6(26, izsVar, vmt0Var);
                    M.R(x);
                }
                a3.c((gzs) x, M, 0);
            }
            M.j();
            PreviewViewState.m g = previewViewState.g();
            dai.c a4 = (g == null || (b3 = g.b()) == null) ? null : b3.a();
            if (a4 == null) {
                M.K(1944641130);
            } else {
                M.K(62730359);
                boolean J = ((i2 & 112) == 32) | M.J(blockId);
                Object x2 = M.x();
                if (J || x2 == c0012a) {
                    x2 = new com.vk.movika.sdk.base.flow.binding.g(28, izsVar, blockId);
                    M.R(x2);
                }
                a4.c((gzs) x2, M, 0);
            }
            M.j();
            previewViewState.h().c(PreviewViewState.Size.VideoMedium16x9, M, 6);
            dai.c b4 = previewViewState.e().b();
            int i3 = i2 & 112;
            boolean J2 = (i3 == 32) | M.J(blockId);
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                x3 = new km1(22, izsVar, blockId);
                M.R(x3);
            }
            b4.c((gzs) x3, M, 0);
            PreviewViewState.a j = previewViewState.j();
            dai.c a5 = (j == null || (a2 = j.a()) == null) ? null : a2.a();
            if (a5 == null) {
                M.K(1945018307);
            } else {
                M.K(62742526);
                boolean J3 = (i3 == 32) | M.J(blockId);
                Object x4 = M.x();
                if (J3 || x4 == c0012a) {
                    x4 = new i5(23, izsVar, blockId);
                    M.R(x4);
                }
                a5.c((gzs) x4, M, 0);
            }
            M.j();
            PreviewViewState.a j2 = previewViewState.j();
            dai.c a6 = (j2 == null || (b2 = j2.b()) == null) ? null : b2.a();
            if (a6 == null) {
                M.K(1945189086);
            } else {
                M.K(62748035);
                boolean J4 = (i3 == 32) | M.J(blockId);
                Object x5 = M.x();
                if (J4 || x5 == c0012a) {
                    x5 = new eg1(19, izsVar, blockId);
                    M.R(x5);
                }
                a6.c((gzs) x5, M, 0);
            }
            M.j();
            TimelineViewState b5 = previewViewState.b();
            dai.c b6 = b5 != null ? b5.b() : null;
            if (b6 == null) {
                M.K(1945368204);
            } else {
                M.K(62753813);
                boolean J5 = (i3 == 32) | M.J(blockId);
                Object x6 = M.x();
                if (J5 || x6 == c0012a) {
                    x6 = new rmt0(0, izsVar, blockId);
                    M.R(x6);
                }
                b6.c((gzs) x6, M, 0);
            }
            M.j();
            TimelineViewState b7 = previewViewState.b();
            dai.d<Long> a7 = b7 != null ? b7.a() : null;
            if (a7 == null) {
                M.K(1945526862);
            } else {
                M.K(62758931);
                boolean J6 = M.J(blockId) | (i3 == 32);
                Object x7 = M.x();
                if (J6 || x7 == c0012a) {
                    x7 = new dnh0(14, izsVar, blockId);
                    M.R(x7);
                }
                a7.c((izs) x7, M, 0);
            }
            M.j();
            previewViewState.e().e().c(Boolean.TRUE, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new rz5(i, 4, this, vmt0Var, izsVar));
        }
    }

    public final void e(a8a a8aVar, vmt0 vmt0Var, izs<? super omt0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        tmt0 tmt0Var;
        androidx.compose.runtime.a M = aVar.M(-1921856974);
        if ((i & 6) == 0) {
            i2 = (M.J(a8aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(vmt0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            tmt0Var = this;
            i2 |= M.J(tmt0Var) ? 2048 : 1024;
        } else {
            tmt0Var = this;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1921856974, i3, -1, "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView.BlockView.HandleLayoutInfo (VideoTrailerView.kt:280)");
            }
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                a aVar2 = new a(a8aVar, vmt0Var, izsVar, tmt0Var, null);
                M.R(aVar2);
                x = aVar2;
            }
            bap.f(vmt0Var, a8aVar, (wzs) x, M, ((i3 >> 3) & 14) | ((i3 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new hrx(this, a8aVar, vmt0Var, izsVar, i, 2));
        }
    }

    public final void f(vmt0 vmt0Var, izs<? super omt0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-696798168);
        if ((i & 6) == 0) {
            i2 = (M.J(vmt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-696798168, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView.BlockView.HandleLifecycle (VideoTrailerView.kt:249)");
            }
            Lifecycle lifecycle = ((f5z) M.r(bvz.a())).getLifecycle();
            BlockId blockId = vmt0Var.b;
            boolean y = ((i2 & 112) == 32) | ((i2 & 14) == 4) | M.y(lifecycle);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new eo3(lifecycle, izsVar, vmt0Var, 14);
                M.R(x);
            }
            bap.b(blockId, lifecycle, (izs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new t050(i, 4, this, vmt0Var, izsVar));
        }
    }
}
