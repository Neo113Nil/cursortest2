package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.ma5;
import xsna.p1t0;
import xsna.phw;
import xsna.q630;
import xsna.r95;

/* compiled from: VideoPage.kt */
/* loaded from: classes5.dex */
public final class o1t0 {

    /* compiled from: VideoPage.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((q1t0) this.receiver).f(true);
            return s3q0.a;
        }
    }

    /* compiled from: VideoPage.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((q1t0) this.receiver).f(false);
            return s3q0.a;
        }
    }

    /* compiled from: VideoPage.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            q1t0 q1t0Var = (q1t0) this.receiver;
            q1t0Var.e(true);
            q1t0Var.f(false);
            if (!((Boolean) ((zak0) q1t0Var.d).getValue()).booleanValue()) {
                q1t0Var.c(false);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VideoPage.kt */
    @b6l(c = "com.vk.profile.design.compose.header.header.picture.paging.page.VideoPageKt$VideoPageEffects$1$1", f = "VideoPage.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<Boolean, s3q0> $onManualVideoPlaybackActiveChanged;
        final /* synthetic */ nb5 $params;
        final /* synthetic */ q1t0 $playbackController;
        final /* synthetic */ r1t0 $uiState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(izs<? super Boolean, s3q0> izsVar, q1t0 q1t0Var, r1t0 r1t0Var, nb5 nb5Var, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$onManualVideoPlaybackActiveChanged = izsVar;
            this.$playbackController = q1t0Var;
            this.$uiState = r1t0Var;
            this.$params = nb5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$onManualVideoPlaybackActiveChanged, this.$playbackController, this.$uiState, this.$params, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            izs<Boolean, s3q0> izsVar = this.$onManualVideoPlaybackActiveChanged;
            q1t0 q1t0Var = this.$playbackController;
            boolean z2 = this.$uiState.a;
            nb5 nb5Var = this.$params;
            boolean z3 = nb5Var.e;
            boolean z4 = nb5Var.f;
            if (z2) {
                q1t0Var.getClass();
            } else if (q1t0Var.a() && z3 && !z4) {
                z = true;
                izsVar.invoke(Boolean.valueOf(z));
                return s3q0.a;
            }
            z = false;
            izsVar.invoke(Boolean.valueOf(z));
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class e implements kgn {
        public final /* synthetic */ q1t0 a;
        public final /* synthetic */ izs b;

        public e(q1t0 q1t0Var, izs izsVar) {
            this.a = q1t0Var;
            this.b = izsVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            q1t0 q1t0Var = this.a;
            q1t0Var.d(false);
            q1t0Var.b(false);
            this.b.invoke(Boolean.FALSE);
        }
    }

    public static final void a(u95 u95Var, t95 t95Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        Object aVar3;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(1757118066);
        int i3 = (M.J(u95Var) ? 4 : 2) | i | (M.J(t95Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1757118066, i3, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.LiveCoverVideoPlayer (VideoPage.kt:258)");
            }
            q1t0 q1t0Var = u95Var.b;
            r1t0 r1t0Var = u95Var.c;
            r95.b bVar = u95Var.a.a;
            q630 d2 = txj0.d(q630.a.a, 1.0f);
            boolean J = M.J(r1t0Var);
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (J || x == obj2) {
                x = new mvl0(r1t0Var, 13);
                M.R(x);
            }
            q630 a2 = rdu.a(d2, (izs) x);
            boolean z = r1t0Var.c;
            boolean z2 = false;
            boolean z3 = u95Var.d;
            int intValue = ((wak0) q1t0Var.g).getIntValue();
            int i4 = i3 & 112;
            boolean J2 = (i4 == 32) | ((i3 & 14) == 4) | M.J(q1t0Var) | M.J(r1t0Var);
            Object x2 = M.x();
            if (J2 || x2 == obj2) {
                Object m17Var = new m17(q1t0Var, r1t0Var, u95Var, t95Var, 1);
                M.R(m17Var);
                x2 = m17Var;
            }
            gzs gzsVar = (gzs) x2;
            boolean J3 = M.J(q1t0Var) | (i4 == 32);
            Object x3 = M.x();
            if (J3 || x3 == obj2) {
                x3 = new ge0(21, q1t0Var, t95Var);
                M.R(x3);
            }
            gzs gzsVar2 = (gzs) x3;
            boolean J4 = M.J(q1t0Var);
            Object x4 = M.x();
            if (J4 || x4 == obj2) {
                i2 = i4;
                obj = obj2;
                aVar3 = new a(0, q1t0Var, q1t0.class, "onVideoLoading", "onVideoLoading()V", 0);
                M.R(aVar3);
            } else {
                i2 = i4;
                aVar3 = x4;
                obj = obj2;
            }
            gzs gzsVar3 = (gzs) ((fcy) aVar3);
            boolean J5 = M.J(q1t0Var);
            Object x5 = M.x();
            if (J5 || x5 == obj) {
                Object bVar2 = new b(0, q1t0Var, q1t0.class, "onVideoPlay", "onVideoPlay()V", 0);
                M.R(bVar2);
                x5 = bVar2;
            }
            gzs gzsVar4 = (gzs) ((fcy) x5);
            boolean J6 = M.J(q1t0Var);
            Object x6 = M.x();
            if (J6 || x6 == obj) {
                Object cVar = new c(0, q1t0Var, q1t0.class, "onFirstFrameRendered", "onFirstFrameRendered()V", 0);
                M.R(cVar);
                x6 = cVar;
            }
            gzs gzsVar5 = (gzs) ((fcy) x6);
            if (i2 == 32) {
                z2 = true;
            }
            Object x7 = M.x();
            if (z2 || x7 == obj) {
                x7 = new bo3(t95Var, 14);
                M.R(x7);
            }
            aVar2 = M;
            ha5.a(bVar, a2, z, z3, intValue, gzsVar, gzsVar2, gzsVar3, gzsVar4, gzsVar5, (wzs) x7, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vue(u95Var, t95Var, i, 6);
        }
    }

    public static final void b(lg90 lg90Var, fb5 fb5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 lg90Var2;
        androidx.compose.runtime.a M = aVar.M(-117484996);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(fb5Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-117484996, i2, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.VideoFirstFrame (VideoPage.kt:311)");
            }
            q630 d2 = txj0.d(q630.a.a, 1.0f);
            phw a2 = phw.a.a(lg90Var, null, fb5Var.b, null, null, M, 196616 | (i2 & 14), 26);
            lg90Var2 = lg90Var;
            gdv0.f(a2, d2, null, false, null, null, M, 3120);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            lg90Var2 = lg90Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kjc(lg90Var2, fb5Var, i, 2);
        }
    }

    public static final void c(nb5 nb5Var, lg90 lg90Var, izs izsVar, com.vk.repository.internal.repos.stickers.suggests.a aVar, gzs gzsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        boolean z;
        int i2;
        int i3;
        int i4;
        wh50 wh50Var;
        Pair m;
        boolean z2;
        boolean z3;
        lg90 lg90Var2;
        ma5.b bVar = nb5Var.a;
        androidx.compose.runtime.a M = aVar2.M(786640929);
        int i5 = i | (M.J(nb5Var) ? 4 : 2) | (M.y(lg90Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(aVar) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(786640929, i5, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.VideoPage (VideoPage.kt:47)");
            }
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-534976522, 0, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.rememberVideoPagePlaybackController (VideoPage.kt:87)");
            }
            r95.b bVar2 = bVar.a;
            r95.b bVar3 = bVar.a;
            boolean J = M.J(bVar2.a.a.r1());
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new q1t0();
                M.R(x);
            }
            q1t0 q1t0Var = (q1t0) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rg50 rg50Var = q1t0Var.b;
            wh50 wh50Var2 = q1t0Var.f;
            int intValue = ((wak0) rg50Var).getIntValue();
            int i6 = i5 << 6;
            int i7 = (i6 & 7168) | 4096;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-50709502, i7, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.rememberVideoPreviewFrameState (VideoPage.kt:106)");
            }
            if (booleanValue) {
                M.K(1141961926);
                M.j();
                if (lg90Var == null) {
                    z = booleanValue;
                    i2 = i5;
                    lg90Var2 = new y6g(l5g.j);
                } else {
                    z = booleanValue;
                    i2 = i5;
                    lg90Var2 = lg90Var;
                }
                Pair pair = new Pair(chs.d.a, lg90Var2);
                aVar3 = M;
                i3 = -1;
                wh50Var = wh50Var2;
                i4 = i6;
                m = pair;
            } else {
                z = booleanValue;
                i2 = i5;
                M.K(1142058460);
                M.W(-1487179754, M.O(bVar3, Integer.valueOf(intValue)));
                i3 = -1;
                i4 = i6;
                wh50Var = wh50Var2;
                m = fwu0.m(null, bVar3.b, null, null, null, null, M, 0, 125);
                aVar3 = M;
                aVar3.a0();
                aVar3.j();
            }
            chs chsVar = (chs) m.d();
            lg90 lg90Var3 = (lg90) m.g();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i8 = i2 & 14;
            boolean z4 = nb5Var.f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2126751404, i8, i3, "com.vk.profile.design.compose.header.header.picture.paging.page.getVideoPageUiState (VideoPageUiState.kt:39)");
            }
            boolean booleanValue2 = ((Boolean) aVar3.r(auz.a)).booleanValue();
            boolean booleanValue3 = ((Boolean) aVar3.r(auz.b)).booleanValue();
            String str = bVar3.b;
            boolean z5 = chsVar instanceof chs.c;
            boolean z6 = chsVar instanceof chs.b;
            boolean z7 = (chsVar instanceof chs.e) || str == null || drm0.N(str);
            boolean z8 = bVar3.c;
            String str2 = bVar3.b;
            boolean z9 = z8 || q1t0Var.a();
            boolean z10 = z9 && nb5Var.b && booleanValue2;
            boolean booleanValue4 = ((Boolean) ((zak0) q1t0Var.c).getValue()).booleanValue();
            boolean booleanValue5 = ((Boolean) ((zak0) q1t0Var.d).getValue()).booleanValue();
            q1t0Var.a();
            boolean z11 = booleanValue4 || booleanValue5 || (!z8 && z6);
            boolean z12 = (!z9 || z || z11) ? false : true;
            boolean z13 = str2 == null || drm0.N(str2);
            boolean booleanValue6 = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
            boolean z14 = z12 && booleanValue6 && booleanValue3 && (z10 || z4);
            if (!z12) {
                z3 = s1t0.a(false, booleanValue6, booleanValue3, z9, z11, booleanValue4, booleanValue5);
                z2 = booleanValue4;
            } else if (z13 && (z14 || !s1t0.a(true, booleanValue6, booleanValue3, z9, z11, booleanValue4, booleanValue5))) {
                z2 = booleanValue4;
                z3 = false;
            } else {
                z2 = booleanValue4;
                z3 = true;
            }
            boolean booleanValue7 = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
            r1t0 r1t0Var = new r1t0(z8, z9, z10, booleanValue3, z3, z14, z12, z11 ? p1t0.a.a : qka0.d((z9 && str2 != null && !drm0.N(str2) && z5) || (z12 && !booleanValue7 && !z2) || (((Boolean) ((zak0) q1t0Var.e).getValue()).booleanValue() && z12 && !booleanValue7), aVar3) ? p1t0.b.a : (z8 || q1t0Var.a() || !z7 || !nb5Var.e || z4) ? p1t0.c.a : p1t0.d.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            e(nb5Var, q1t0Var, r1t0Var, izsVar, aVar3, ((i2 << 3) & 7168) | i8);
            d(nb5Var, q1t0Var, r1t0Var, lg90Var3, izsVar, aVar, gzsVar, aVar3, i8 | 4096 | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new cdb0(i, 1, nb5Var, lg90Var, aVar, gzsVar, izsVar);
        }
    }

    public static final void d(final nb5 nb5Var, q1t0 q1t0Var, final r1t0 r1t0Var, final lg90 lg90Var, final izs izsVar, final com.vk.repository.internal.repos.stickers.suggests.a aVar, final gzs gzsVar, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        final q1t0 q1t0Var2 = q1t0Var;
        androidx.compose.runtime.a M = aVar2.M(-875163984);
        int i2 = (M.J(nb5Var) ? 4 : 2) | i | (M.J(q1t0Var2) ? 32 : 16) | (M.J(r1t0Var) ? 256 : 128) | (M.y(lg90Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-875163984, i2, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.VideoPageContent (VideoPage.kt:162)");
            }
            ma5.b bVar = nb5Var.a;
            fb5 fb5Var = nb5Var.g;
            q630 h = txj0.h(txj0.d(q630.a.a, 1.0f), fb5Var.a);
            long j = l5g.b;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            q630 d2 = rte0.d(hr80.m(h, j, aVar4), aVar4);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d2);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, d3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean z = r1t0Var.e;
            p1t0 p1t0Var = r1t0Var.h;
            if (z) {
                M.K(-649226645);
                b(lg90Var, fb5Var, M, ((i2 >> 9) & 14) | 8);
            } else {
                M.K(-655253448);
            }
            M.j();
            if (r1t0Var.g) {
                M.K(-649027749);
                q1t0Var2 = q1t0Var;
                a(new u95(bVar, q1t0Var, r1t0Var, nb5Var.h, nb5Var.c, nb5Var.d), new t95(izsVar, aVar, gzsVar), M, 0);
            } else {
                q1t0Var2 = q1t0Var;
                M.K(-655253448);
            }
            M.j();
            aVar3 = M;
            mm2.f(p1t0Var instanceof p1t0.b, null, anp.e(null, 3), anp.f(null, 3), null, omi.a, aVar3, 200064, 18);
            mm2.f(p1t0Var instanceof p1t0.d, null, anp.e(null, 3), anp.f(null, 3), null, kai.c(21649787, new zqz(3, q1t0Var2, aVar), aVar3), aVar3, 200064, 18);
            mm2.f(p1t0Var instanceof p1t0.a, null, anp.e(null, 3), anp.f(null, 3), null, kai.c(2117485338, new l1f0(q1t0Var2, aVar, izsVar, 1), aVar3), aVar3, 200064, 18);
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n1t0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o1t0.d(nb5.this, q1t0Var2, r1t0Var, lg90Var, izsVar, aVar, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(nb5 nb5Var, q1t0 q1t0Var, r1t0 r1t0Var, izs<? super Boolean, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        nb5 nb5Var2 = nb5Var;
        izs<? super Boolean, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(365493457);
        int i2 = (M.J(nb5Var2) ? 4 : 2) | i | (M.J(q1t0Var) ? 32 : 16) | (M.J(r1t0Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(365493457, i2, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.VideoPageEffects (VideoPage.kt:126)");
            }
            Object[] objArr = {Boolean.valueOf(r1t0Var.b), Boolean.valueOf(nb5Var2.e), Boolean.valueOf(nb5Var2.f), Boolean.valueOf(q1t0Var.a())};
            int i3 = i2 & 7168;
            int i4 = i2 & 112;
            boolean z = (i3 == 2048) | (i4 == 32) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                d dVar = new d(izsVar2, q1t0Var, r1t0Var, nb5Var2, null);
                izsVar2 = izsVar2;
                nb5Var2 = nb5Var2;
                M.R(dVar);
                x = dVar;
            }
            bap.h(objArr, (wzs) x, M, 0);
            String r1 = nb5Var2.a.a.a.a.r1();
            boolean z2 = (i4 == 32) | (i3 == 2048);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new il7(26, q1t0Var, izsVar2);
                M.R(x2);
            }
            bap.c(r1, (izs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tym0(nb5Var2, q1t0Var, r1t0Var, izsVar2, i);
        }
    }
}
