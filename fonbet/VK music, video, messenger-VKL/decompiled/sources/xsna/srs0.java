package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a8a;
import xsna.dai;
import xsna.mno0;
import xsna.q5b0;
import xsna.q630;
import xsna.rmw;
import xsna.wqs0;

/* compiled from: VideoLargeListView.kt */
/* loaded from: classes.dex */
public final class srs0 extends m2a<xrs0, wqs0, xqs0> {
    public final yqs0 b;

    /* compiled from: VideoLargeListView.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Long> {
        public a(Object obj) {
            super(0, obj, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0);
        }

        @Override // xsna.gzs
        public final Long invoke() {
            return Long.valueOf(qni0.a());
        }
    }

    /* compiled from: VideoLargeListView.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView$BlockView$HandleLayoutInfo$1$1", f = "VideoLargeListView.kt", l = {466}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<wqs0, s3q0> $onAction;
        final /* synthetic */ a8a $scope;
        final /* synthetic */ xrs0 $state;
        Object L$0;
        int label;
        final /* synthetic */ srs0 this$0;

        /* compiled from: VideoLargeListView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView$BlockView$HandleLayoutInfo$1$1$1", f = "VideoLargeListView.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<a8a.a, spj<? super s3q0>, Object> {
            final /* synthetic */ izs<wqs0, s3q0> $onAction;
            final /* synthetic */ Ref$ObjectRef<a8a.a> $previousLayoutInfo;
            final /* synthetic */ xrs0 $state;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ srs0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Ref$ObjectRef<a8a.a> ref$ObjectRef, izs<? super wqs0, s3q0> izsVar, xrs0 xrs0Var, srs0 srs0Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$previousLayoutInfo = ref$ObjectRef;
                this.$onAction = izsVar;
                this.$state = xrs0Var;
                this.this$0 = srs0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$previousLayoutInfo, this.$onAction, this.$state, this.this$0, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(a8a.a aVar, spj<? super s3q0> spjVar) {
                return ((a) create(aVar, spjVar)).invokeSuspend(s3q0.a);
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
                srs0 srs0Var = this.this$0;
                if (aVar != null && h9xVar != null && h9xVar2 != null) {
                    a8a.a aVar3 = aVar;
                    long d = h9x.d(h9x.d(h9x.c(h9xVar2.a, h9xVar.a), h9x.c(j, aVar3.b)), h9x.c(j2, aVar3.c));
                    long c = h9x.c(j2, j);
                    srs0Var.getClass();
                    f = new Float(Math.max(Math.abs((int) (d >> 32)) / Math.max((int) (c >> 32), 1), Math.abs((int) (d & 4294967295L)) / Math.max((int) (c & 4294967295L), 1)));
                }
                this.$onAction.invoke(new wqs0.h(this.$state.b, r0, f, r0.g));
                this.$previousLayoutInfo.element = r0;
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(a8a a8aVar, xrs0 xrs0Var, izs<? super wqs0, s3q0> izsVar, srs0 srs0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$scope = a8aVar;
            this.$state = xrs0Var;
            this.$onAction = izsVar;
            this.this$0 = srs0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$scope, this.$state, this.$onAction, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ksr l = rsr.l(this.$scope.f(this.$state));
                a aVar = new a(ref$ObjectRef, this.$onAction, this.$state, this.this$0, null);
                this.L$0 = null;
                this.label = 1;
                if (rsr.k(l, aVar, this) == coroutineSingletons) {
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
    public static final class c implements kgn {
        public final /* synthetic */ Lifecycle a;
        public final /* synthetic */ mrs0 b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ xrs0 d;

        public c(Lifecycle lifecycle, mrs0 mrs0Var, izs izsVar, xrs0 xrs0Var) {
            this.a = lifecycle;
            this.b = mrs0Var;
            this.c = izsVar;
            this.d = xrs0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            mrs0 mrs0Var = this.b;
            Lifecycle lifecycle = this.a;
            lifecycle.removeObserver(mrs0Var);
            if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
                this.c.invoke(new wqs0.i(this.d.b, Lifecycle.State.STARTED));
            }
        }
    }

    public srs0(yqs0 yqs0Var) {
        super(fpf0.a(xqs0.class));
        this.b = yqs0Var;
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final xrs0 xrs0Var, izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        a8a a8aVar2;
        int i2;
        String a2;
        q630 b2;
        PreviewViewState.j a3;
        izs izsVar2 = izsVar;
        BlockId.CompositeId compositeId = xrs0Var.b;
        VideoCardViewState videoCardViewState = xrs0Var.c;
        androidx.compose.runtime.a M = aVar.M(1019508459);
        if ((i & 6) == 0) {
            a8aVar2 = a8aVar;
            i2 = (M.J(a8aVar2) ? 4 : 2) | i;
        } else {
            a8aVar2 = a8aVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xrs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1019508459, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.ContentImpl (VideoLargeListView.kt:288)");
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 3;
            this.b.a(ksrVar, izsVar2, M, (i3 & 14) | (i4 & 112));
            if (videoCardViewState == null) {
                M.K(-1831843613);
                ja8.a(txj0.q(q630.a.a, 1), M, 6);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.l(new ozn0(this, a8aVar2, xrs0Var, izsVar2, ksrVar, q630Var, i));
                    return;
                }
                return;
            }
            M.K(-1845102313);
            M.j();
            f(xrs0Var, izsVar2, M, (i3 & 896) | (i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            int i5 = i2 & 112;
            int i6 = i2 & 896;
            int i7 = (i2 >> 6) & 7168;
            e(a8aVar, xrs0Var, izsVar2, M, (i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | i7);
            izsVar2 = izsVar;
            d(xrs0Var.b, xrs0Var, izsVar2, M, (i2 & 1008) | i7);
            dai.b a4 = videoCardViewState.a().e().a();
            Object[] objArr = {compositeId, xrs0Var.d, xrs0Var.f, izsVar2};
            Object c2 = kai.c(1992566586, new dsx(xrs0Var, this, izsVar2, 1), M);
            boolean z = false;
            for (Object obj : Arrays.copyOf(objArr, 4)) {
                z |= M.J(obj);
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                M.R(c2);
            } else {
                c2 = x;
            }
            a4.c((yzs) c2, M, 0);
            dai.b b3 = videoCardViewState.b();
            dg0 dg0Var = xrs0Var.e;
            Object c3 = kai.c(-1712940369, new i3(xrs0Var, izsVar2, 3), M);
            boolean J = M.J(dg0Var) | M.J(compositeId) | M.J(izsVar2);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                M.R(c3);
            } else {
                c3 = x2;
            }
            b3.c((yzs) c3, M, 0);
            VideoCardViewState.c c4 = videoCardViewState.c();
            String str = null;
            VideoMetaViewState c5 = c4 != null ? c4.c() : null;
            if (c5 == null) {
                M.K(-1830208953);
                M.j();
                a2 = null;
            } else {
                M.K(495150330);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1507634108, 48, -1, "com.vk.catalog.mvi.block.video.impl.video.list.VideosListView.getVideoTitle (VideosListView.kt:476)");
                }
                VideoMetaViewState.h c6 = c5.c();
                VideoMetaViewState.i iVar = c6 instanceof VideoMetaViewState.i ? (VideoMetaViewState.i) c6 : null;
                mno0 a5 = iVar != null ? iVar.a() : null;
                if (a5 == null) {
                    M.K(1454840315);
                    M.j();
                    a2 = null;
                } else {
                    M.K(1432403654);
                    a2 = ((mno0.i) a5).a(0, M);
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            int i8 = (i2 >> 12) & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-480913175, i8, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.getPinBadgeTextForTest (VideoLargeListView.kt:539)");
            }
            PreviewViewState.y i9 = videoCardViewState.a().i();
            PreviewViewState.k kVar = i9 instanceof PreviewViewState.k ? (PreviewViewState.k) i9 : null;
            mno0 a6 = (kVar == null || (a3 = kVar.a()) == null) ? null : a3.a();
            if (a6 == null) {
                M.K(1126680910);
                M.j();
            } else {
                M.K(1698912531);
                String a7 = a6.a(0, M);
                M.j();
                str = a7;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, q630Var);
            qni0 qni0Var = qni0.a;
            boolean y = M.y(qni0Var);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new a(qni0Var);
                M.R(x3);
            }
            gzs gzsVar = (gzs) ((fcy) x3);
            boolean z2 = (i6 == 256) | (i5 == 32);
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new o6i0(7, izsVar2, xrs0Var);
                M.R(x4);
            }
            q630 a8 = v630.a(F, gzsVar, (izs) x4);
            boolean J2 = M.J(a2) | (i5 == 32) | M.J(str);
            Object x5 = M.x();
            if (J2 || x5 == c0012a) {
                x5 = new isg(xrs0Var, a2, str, 8);
                M.R(x5);
            }
            b2 = egi0.b(a8, false, (izs) x5);
            com.vk.libvideo.design.compose.video.videocard.a.d(videoCardViewState, b2, M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            final izs izsVar3 = izsVar2;
            s2.l(new wzs() { // from class: xsna.prs0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    srs0.this.b(a8aVar, xrs0Var, izsVar3, ksrVar, q630Var, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }

    public final void d(final BlockId.CompositeId compositeId, final xrs0 xrs0Var, final izs<? super wqs0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        VideoMetaViewState c2;
        VideoMetaViewState.a b2;
        VideoMetaViewState.c a2;
        PreviewViewState.n a3;
        PreviewViewState.n c3;
        PreviewViewState.n b3;
        PreviewViewState.n b4;
        PreviewViewState.n a4;
        androidx.compose.runtime.a M = aVar.M(-708620307);
        if ((i & 6) == 0) {
            i2 = (M.J(compositeId) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xrs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-708620307, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.HandleComposableValues (VideoLargeListView.kt:367)");
            }
            VideoCardViewState videoCardViewState = xrs0Var.c;
            if (videoCardViewState == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new wzs() { // from class: xsna.rrs0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            srs0.this.d(compositeId, xrs0Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                            return s3q0.a;
                        }
                    };
                    s.l(wzsVar);
                }
                return;
            }
            videoCardViewState.d().c(VideoCardViewState.Size.Sharp, M, 6);
            dai.c b5 = videoCardViewState.a().e().b();
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z = (i3 == 256) | (i4 == 4);
            Object x = M.x();
            int i5 = 28;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ie3(28, izsVar, compositeId);
                M.R(x);
            }
            b5.c((gzs) x, M, 0);
            dai.d<rmw.e> c4 = videoCardViewState.a().e().c();
            boolean z2 = (i3 == 256) | (i4 == 4);
            Object x2 = M.x();
            int i6 = 29;
            if (z2 || x2 == c0012a) {
                x2 = new na7(i6, izsVar, compositeId);
                M.R(x2);
            }
            c4.c((izs) x2, M, 0);
            PreviewViewState.a j = videoCardViewState.a().j();
            dai.c a5 = (j == null || (a4 = j.a()) == null) ? null : a4.a();
            if (a5 == null) {
                M.K(-742546465);
                M.j();
            } else {
                M.K(1915709538);
                boolean z3 = (i3 == 256) | (i4 == 4);
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new com.vk.movika.sdk.base.logic.interactor.c(27, izsVar, compositeId);
                    M.R(x3);
                }
                a5.c((gzs) x3, M, 0);
                M.j();
                s3q0 s3q0Var = s3q0.a;
            }
            PreviewViewState.a j2 = videoCardViewState.a().j();
            dai.c a6 = (j2 == null || (b4 = j2.b()) == null) ? null : b4.a();
            if (a6 == null) {
                M.K(-742354854);
                M.j();
            } else {
                M.K(1915715719);
                boolean z4 = (i3 == 256) | (i4 == 4);
                Object x4 = M.x();
                if (z4 || x4 == c0012a) {
                    x4 = new fk(24, izsVar, compositeId);
                    M.R(x4);
                }
                a6.c((gzs) x4, M, 0);
                M.j();
                s3q0 s3q0Var2 = s3q0.a;
            }
            PreviewViewState.n d = videoCardViewState.a().d();
            dai.c a7 = d != null ? d.a() : null;
            if (a7 == null) {
                M.K(-742170683);
                M.j();
            } else {
                M.K(1915721660);
                boolean z5 = (i3 == 256) | (i4 == 4);
                Object x5 = M.x();
                if (z5 || x5 == c0012a) {
                    x5 = new plq0(3, izsVar, compositeId);
                    M.R(x5);
                }
                a7.c((gzs) x5, M, 0);
                M.j();
                s3q0 s3q0Var3 = s3q0.a;
            }
            PlaceholderViewState a8 = videoCardViewState.a().a();
            dai.c b6 = a8 != null ? a8.b() : null;
            if (b6 == null) {
                M.K(-741991224);
                M.j();
            } else {
                M.K(1915727449);
                boolean z6 = (i3 == 256) | (i4 == 4);
                Object x6 = M.x();
                if (z6 || x6 == c0012a) {
                    x6 = new com.vk.catalog2.common.ui.holders.b(i5, izsVar, compositeId);
                    M.R(x6);
                }
                b6.c((gzs) x6, M, 0);
                M.j();
                s3q0 s3q0Var4 = s3q0.a;
            }
            PreviewViewState.m g = videoCardViewState.a().g();
            dai.c a9 = (g == null || (b3 = g.b()) == null) ? null : b3.a();
            if (a9 == null) {
                M.K(-741812726);
                M.j();
            } else {
                M.K(1915733207);
                boolean z7 = (i3 == 256) | (i4 == 4);
                Object x7 = M.x();
                if (z7 || x7 == c0012a) {
                    x7 = new onv0(1, compositeId, izsVar);
                    M.R(x7);
                }
                a9.c((gzs) x7, M, 0);
                M.j();
                s3q0 s3q0Var5 = s3q0.a;
            }
            PreviewViewState.m g2 = videoCardViewState.a().g();
            dai.c a10 = (g2 == null || (c3 = g2.c()) == null) ? null : c3.a();
            if (a10 == null) {
                M.K(-741637173);
                M.j();
            } else {
                M.K(1915738870);
                boolean z8 = (i3 == 256) | (i4 == 4);
                Object x8 = M.x();
                if (z8 || x8 == c0012a) {
                    x8 = new wx0(24, izsVar, compositeId);
                    M.R(x8);
                }
                a10.c((gzs) x8, M, 0);
                M.j();
                s3q0 s3q0Var6 = s3q0.a;
            }
            PreviewViewState.m g3 = videoCardViewState.a().g();
            dai.c a11 = (g3 == null || (a3 = g3.a()) == null) ? null : a3.a();
            if (a11 == null) {
                M.K(-741464627);
                M.j();
            } else {
                M.K(1915744436);
                boolean z9 = (i3 == 256) | (i4 == 4);
                Object x9 = M.x();
                if (z9 || x9 == c0012a) {
                    x9 = new q2m0(6, izsVar, compositeId);
                    M.R(x9);
                }
                a11.c((gzs) x9, M, 0);
                M.j();
                s3q0 s3q0Var7 = s3q0.a;
            }
            TimelineViewState b7 = videoCardViewState.a().b();
            dai.c b8 = b7 != null ? b7.b() : null;
            int i7 = 22;
            if (b8 == null) {
                M.K(-741283928);
                M.j();
            } else {
                M.K(1915750265);
                boolean z10 = (i3 == 256) | (i4 == 4);
                Object x10 = M.x();
                if (z10 || x10 == c0012a) {
                    x10 = new m84(22, izsVar, compositeId);
                    M.R(x10);
                }
                b8.c((gzs) x10, M, 0);
                M.j();
                s3q0 s3q0Var8 = s3q0.a;
            }
            TimelineViewState b9 = videoCardViewState.a().b();
            dai.d<Long> a12 = b9 != null ? b9.a() : null;
            if (a12 == null) {
                M.K(-741104438);
                M.j();
            } else {
                M.K(1915756055);
                boolean z11 = (i3 == 256) | (i4 == 4);
                Object x11 = M.x();
                if (z11 || x11 == c0012a) {
                    x11 = new z5a(29, izsVar, compositeId);
                    M.R(x11);
                }
                a12.c((izs) x11, M, 0);
                M.j();
                s3q0 s3q0Var9 = s3q0.a;
            }
            PreviewViewState.v k = videoCardViewState.a().k();
            dai.c a13 = k != null ? k.a() : null;
            if (a13 == null) {
                M.K(-740937999);
                M.j();
            } else {
                M.K(1915761424);
                boolean z12 = (i3 == 256) | (i4 == 4);
                Object x12 = M.x();
                if (z12 || x12 == c0012a) {
                    x12 = new p9s0(1, izsVar, compositeId);
                    M.R(x12);
                }
                a13.c((gzs) x12, M, 0);
                M.j();
                s3q0 s3q0Var10 = s3q0.a;
            }
            PreviewViewState.l c5 = videoCardViewState.a().c();
            dai.c a14 = c5 != null ? c5.a() : null;
            if (a14 == null) {
                M.K(-740770289);
                M.j();
            } else {
                M.K(1915766834);
                boolean z13 = (i3 == 256) | (i4 == 4);
                Object x13 = M.x();
                if (z13 || x13 == c0012a) {
                    x13 = new j6(20, izsVar, compositeId);
                    M.R(x13);
                }
                a14.c((gzs) x13, M, 0);
                M.j();
                s3q0 s3q0Var11 = s3q0.a;
            }
            VideoCardViewState.c c6 = videoCardViewState.c();
            dai.c a15 = (c6 == null || (c2 = c6.c()) == null || (b2 = c2.b()) == null || (a2 = b2.a()) == null) ? null : a2.a();
            if (a15 == null) {
                M.K(-740577872);
                M.j();
            } else {
                M.K(1915773041);
                boolean z14 = (i3 == 256) | (i4 == 4);
                Object x14 = M.x();
                if (z14 || x14 == c0012a) {
                    x14 = new ww(24, izsVar, compositeId);
                    M.R(x14);
                }
                a15.c((gzs) x14, M, 0);
                M.j();
                s3q0 s3q0Var12 = s3q0.a;
            }
            VideoCardViewState.c c7 = videoCardViewState.c();
            dai.c d2 = c7 != null ? c7.d() : null;
            if (d2 == null) {
                M.K(-740423244);
                M.j();
            } else {
                M.K(1915778029);
                boolean z15 = (i3 == 256) | (i4 == 4);
                Object x15 = M.x();
                if (z15 || x15 == c0012a) {
                    x15 = new com.vk.movika.sdk.base.ui.p(i7, izsVar, compositeId);
                    M.R(x15);
                }
                d2.c((gzs) x15, M, 0);
                M.j();
                s3q0 s3q0Var13 = s3q0.a;
            }
            VideoCardViewState.c c8 = videoCardViewState.c();
            dai.c b10 = c8 != null ? c8.b() : null;
            if (b10 == null) {
                M.K(-740268368);
                M.j();
            } else {
                M.K(1915783025);
                boolean z16 = (i3 == 256) | (i4 == 4);
                Object x16 = M.x();
                if (z16 || x16 == c0012a) {
                    x16 = new xg2(16, izsVar, compositeId);
                    M.R(x16);
                }
                b10.c((gzs) x16, M, 0);
                M.j();
                s3q0 s3q0Var14 = s3q0.a;
            }
            VideoCardViewState.c c9 = videoCardViewState.c();
            dai.c a16 = c9 != null ? c9.a() : null;
            if (a16 == null) {
                M.K(-740109741);
                M.j();
            } else {
                M.K(1915788142);
                boolean z17 = (i3 == 256) | (i4 == 4);
                Object x17 = M.x();
                if (z17 || x17 == c0012a) {
                    x17 = new com.vk.movika.sdk.base.ui.r(23, izsVar, compositeId);
                    M.R(x17);
                }
                a16.c((gzs) x17, M, 0);
                M.j();
                s3q0 s3q0Var15 = s3q0.a;
            }
            zoi<Boolean> e = videoCardViewState.a().e().e();
            Boolean bool = Boolean.TRUE;
            e.c(bool, M, 6);
            videoCardViewState.a().l().c(bool, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs() { // from class: xsna.nrs0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    srs0.this.d(compositeId, xrs0Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
            s.l(wzsVar);
        }
    }

    public final void e(a8a a8aVar, xrs0 xrs0Var, izs<? super wqs0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        a8a a8aVar2;
        xrs0 xrs0Var2;
        izs<? super wqs0, s3q0> izsVar2;
        androidx.compose.runtime.a M = aVar.M(-1212231586);
        if ((i & 6) == 0) {
            i2 = (M.J(a8aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xrs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1212231586, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.HandleLayoutInfo (VideoLargeListView.kt:461)");
            }
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                a8aVar2 = a8aVar;
                xrs0Var2 = xrs0Var;
                izsVar2 = izsVar;
                b bVar = new b(a8aVar2, xrs0Var2, izsVar2, this, null);
                M.R(bVar);
                x = bVar;
            } else {
                a8aVar2 = a8aVar;
                xrs0Var2 = xrs0Var;
                izsVar2 = izsVar;
            }
            bap.f(xrs0Var2, a8aVar2, (wzs) x, M, ((i2 >> 3) & 14) | ((i2 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            a8aVar2 = a8aVar;
            xrs0Var2 = xrs0Var;
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final izs<? super wqs0, s3q0> izsVar3 = izsVar2;
            final a8a a8aVar3 = a8aVar2;
            final xrs0 xrs0Var3 = xrs0Var2;
            s.l(new wzs() { // from class: xsna.qrs0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    srs0.this.e(a8aVar3, xrs0Var3, izsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }

    public final void f(xrs0 xrs0Var, izs<? super wqs0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1456397484);
        if ((i & 6) == 0) {
            i2 = (M.J(xrs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1456397484, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.HandleLifecycle (VideoLargeListView.kt:430)");
            }
            Lifecycle lifecycle = ((f5z) M.r(bvz.a())).getLifecycle();
            BlockId.CompositeId compositeId = xrs0Var.b;
            boolean y = ((i2 & 112) == 32) | ((i2 & 14) == 4) | M.y(lifecycle);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new ab6(lifecycle, izsVar, xrs0Var, 12);
                M.R(x);
            }
            bap.b(compositeId, lifecycle, (izs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new qbo(i, 2, this, xrs0Var, izsVar));
        }
    }

    public final void g(BlockId.CompositeId compositeId, kjz kjzVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        q630 d;
        androidx.compose.runtime.a M = aVar.M(1380681734);
        int i2 = i | (M.J(compositeId) ? 4 : 2) | (M.J(kjzVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1380681734, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.LiveInlineView (VideoLargeListView.kt:520)");
            }
            dai.e<ViewGroup, yjk0> a2 = kjzVar.a();
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z = (i3 == 256) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new xx9(11, izsVar, compositeId);
                M.R(x);
            }
            a2.c((wzs) x, M, 0);
            dai.c b2 = kjzVar.b();
            boolean z2 = (i3 == 256) | (i4 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new pk(20, izsVar, compositeId);
                M.R(x2);
            }
            b2.c((gzs) x2, M, 0);
            q630.a aVar2 = q630.a.a;
            d = txj0.d(aVar2, 1.0f);
            jjz.a(kjzVar, d, M, (i2 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new d4t(this, compositeId, kjzVar, izsVar, q630Var2, i));
        }
    }

    public final void h(BlockId.CompositeId compositeId, q5b0 q5b0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1753772467);
        int i2 = i | (M.J(compositeId) ? 4 : 2) | (M.J(q5b0Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1753772467, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListView.BlockView.PlayerView (VideoLargeListView.kt:501)");
            }
            dai.d<VideoTextureView> a2 = q5b0Var.b().a();
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z = (i3 == 256) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new vnb0(6, izsVar, compositeId);
                M.R(x);
            }
            a2.c((izs) x, M, 0);
            dai.c b2 = q5b0Var.b().b();
            boolean z2 = (i3 == 256) | (i4 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new sk(27, izsVar, compositeId);
                M.R(x2);
            }
            b2.c((gzs) x2, M, 0);
            q5b0.a a3 = q5b0Var.a();
            dai.d<zhf0> a4 = a3 != null ? a3.a() : null;
            if (a4 == null) {
                M.K(-1640881356);
            } else {
                M.K(1748183661);
                boolean z3 = (i3 == 256) | (i4 == 4);
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new uwi0(4, izsVar, compositeId);
                    M.R(x3);
                }
                a4.c((izs) x3, M, 0);
            }
            M.j();
            int i5 = ((i2 >> 3) & 14) | 48;
            q630Var2 = q630.a.a;
            p5b0.b(q5b0Var, q630Var2, M, i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new ors0(this, compositeId, q5b0Var, izsVar, q630Var2, i, 0));
        }
    }
}
