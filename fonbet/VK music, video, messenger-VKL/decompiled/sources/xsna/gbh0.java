package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.k;
import com.vk.dto.common.ClipVideoFile;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ScreenContent.kt */
/* loaded from: classes17.dex */
public final class gbh0 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a aVar2;
        float f;
        int i3;
        a.C0011a.C0012a c0012a;
        int i4;
        androidx.compose.runtime.a M = aVar.M(1178972271);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1178972271, i2, -1, "com.vk.clips.upload.vk.impl.preview.compose.Buttons (ScreenContent.kt:299)");
            }
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.m, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(-99134787);
                String N = d370.N(R.string.clip_preview_draft_button, 0, M);
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                int i5 = i2;
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 E = ahn.E(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "DraftBtn");
                boolean z2 = (i5 & 14) == 4;
                f = Float.MAX_VALUE;
                Object x = M.x();
                if (z2 || x == c0012a2) {
                    x = new us0(izsVar, 4);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                i3 = i5;
                c0012a = c0012a2;
                i4 = 0;
                bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
                M = M;
                mq.d(q630.a.a, 8, M, 6);
            } else {
                f = Float.MAX_VALUE;
                i3 = i2;
                c0012a = c0012a2;
                i4 = 0;
                M.K(-109831089);
                M.j();
            }
            String N2 = d370.N(R.string.clip_preview_publish_button, i4, M);
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Neutral;
            ButtonSize buttonSize2 = ButtonSize.Medium;
            ButtonStyle buttonStyle2 = ButtonStyle.Primary;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E2 = ahn.E(new xpy(1.0f > f ? f : 1.0f, true), "PublishBtn");
            int i6 = (i3 & 14) == 4 ? 1 : i4;
            Object x2 = M.x();
            if (i6 != 0 || x2 == c0012a) {
                x2 = new tw(izsVar, 6);
                M.R(x2);
            }
            aVar2 = M;
            bhu0.e((gzs) x2, buttonSize2, buttonStyle2, buttonAppearance2, E2, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bbh0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gbh0.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(Object obj, mtk0 mtk0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        mtk0 mtk0Var2;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(-497254829);
        int i2 = i | (M.J(obj) ? 4 : 2) | (M.J(mtk0Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-497254829, i2, -1, "com.vk.clips.upload.vk.impl.preview.compose.ClipControls (ScreenContent.kt:159)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 a2 = o19.a(s200.H(ra8.a.b(txj0.B(aVar3, null, 3), dt1.a.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), 0.64f);
            if (androidx.compose.runtime.b.d()) {
                z = false;
                androidx.compose.runtime.b.f(263638328, 0, -1, "com.vk.clips.upload.vk.impl.preview.compose.ClipTopControls (ScreenContent.kt:187)");
            } else {
                z = false;
            }
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.b, dt1.a.k, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, a2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            lg90 k = m200.k(M);
            long j = l5g.d;
            float f2 = 10;
            float f3 = 28;
            boolean z2 = z;
            pzu0.b(k, null, txj0.q(s200.D(aVar3, f2), f3), j, M, 3512, 0);
            pzu0.b(m200.p(M), null, txj0.q(s200.D(aVar3, f2), f3), j, M, 3512, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2 & 896;
            boolean z3 = i3 == 256 ? true : z2;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new u77(izsVar, 5);
                M.R(x);
            }
            h(obj, (gzs) x, txj0.f(aVar3, 1.0f), M, (i2 & 14) | 384);
            M.G();
            if (i3 == 256) {
                z2 = true;
            }
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new v77(izsVar, 5);
                M.R(x2);
            }
            mtk0Var2 = mtk0Var;
            g(mtk0Var2, (izs) x2, txj0.f(aVar3, 1.0f), M, ((i2 >> 3) & 14) | 384);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            mtk0Var2 = mtk0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b7d(obj, mtk0Var2, izsVar, q630Var, i);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-389421281);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-389421281, i, -1, "com.vk.clips.upload.vk.impl.preview.compose.PlayButton (ScreenContent.kt:277)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(771487746, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Play36> (VkIcons.kt:8894)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_play_36, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 q = txj0.q(q630Var, 64);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new amp(26);
                M.R(x);
            }
            pzu0.b(a, null, ahn.E(s200.D(bu00.e(q, (izs) x), 10), "PlayBtn"), l5g.d, M, 3128, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z5(q630Var, i, 9);
        }
    }

    public static final void d(final mtk0 mtk0Var, final boolean z, final Object obj, final e3b0 e3b0Var, final izs izsVar, final q630 q630Var, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        mtk0 mtk0Var2;
        int i2;
        boolean z3;
        e3b0 e3b0Var2;
        androidx.compose.runtime.a M = aVar.M(-1471656518);
        if ((i & 6) == 0) {
            mtk0Var2 = mtk0Var;
            i2 = (M.J(mtk0Var2) ? 4 : 2) | i;
        } else {
            mtk0Var2 = mtk0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= M.l(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            e3b0Var2 = e3b0Var;
            i2 |= M.J(e3b0Var2) ? 2048 : 1024;
        } else {
            e3b0Var2 = e3b0Var;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1471656518, i3, -1, "com.vk.clips.upload.vk.impl.preview.compose.ScreenContent (ScreenContent.kt:88)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            int i4 = i3 << 3;
            f(e3b0Var2, mtk0Var2, obj, z3, new xpy(1.0f, true), izsVar, M, ((i3 >> 9) & 14) | (i4 & 112) | (i3 & 896) | ((i3 << 6) & 7168) | (i4 & 458752));
            float f = 16;
            a((i3 >> 12) & 910, M, izsVar, s200.G(txj0.j(52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), f, 0, f, 4), z2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.abh0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    gbh0.d(mtk0.this, z, obj, e3b0Var, izsVar, q630Var, z2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1473486941);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1473486941, i2, -1, "com.vk.clips.upload.vk.impl.preview.compose.TopBar (ScreenContent.kt:335)");
            }
            q630.a aVar2 = q630.a.a;
            q630 h = txj0.h(s200.C(txj0.f(aVar2, 1.0f), znk0.z().g(k.b.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).g(q630Var), m7p0.a);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, b, d370.N(R.string.clip_preview_close_accessibility, 0, M), ahn.E(txj0.q(s200.F(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 28), "CloseBtn"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wlb0.h(M).getIcon().b, false, null, false, null, null, M, (i2 & 14) | 3136, 2000);
            q630 g = txj0.c(aVar2, 1.0f).g(new esx0(ht1.a));
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 g2 = g.g(new xpy(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, g2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            yqv0.c(d370.N(R.string.clip_preview_header, 0, M), ahn.E(aVar2, "Title"), wlb0.h(M).getText().d, null, null, 0, 0, null, 2, true, 0, 1, null, wlb0.l(M).g, M, 905969712, 48, 5368);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nv1(gzsVar, q630Var, i, 7);
        }
    }

    public static final void f(final e3b0 e3b0Var, final mtk0 mtk0Var, final Object obj, final boolean z, final q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-212013270);
        if ((i & 6) == 0) {
            i2 = (M.J(e3b0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(mtk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-212013270, i2, -1, "com.vk.clips.upload.vk.impl.preview.compose.Video (ScreenContent.kt:115)");
            }
            ua8.a(txj0.d(q630Var, 1.0f), null, false, kai.c(-988705152, new yzs() { // from class: xsna.cbh0
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    va8 va8Var = (va8) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-988705152, intValue, -1, "com.vk.clips.upload.vk.impl.preview.compose.Video.<anonymous> (ScreenContent.kt:120)");
                        }
                        q630.a aVar3 = q630.a.a;
                        q630 d = sua.d(0.5625f, txj0.c(aVar3, 1.0f), (va8Var.j() / va8Var.g()) - 0.5625f <= 0.2f);
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.f;
                        q630 b = va8Var.b(d, ty6Var);
                        e3b0 e3b0Var2 = e3b0.this;
                        mtk0 mtk0Var2 = mtk0Var;
                        boolean z2 = z;
                        izs izsVar2 = izsVar;
                        i9d.b(e3b0Var2, mtk0Var2, z2, izsVar2, b, aVar2, 0);
                        mm2.f(!z2, va8Var.b(aVar3, ty6Var), anp.e(null, 3).b(anp.c(ty6Var, 9)), anp.f(null, 3).b(anp.j(ty6Var, 9)), null, pki.a, aVar2, 200064, 16);
                        gbh0.b(obj, mtk0Var2, izsVar2, va8Var.b(aVar3, dt1.a.i), aVar2, 0);
                        boolean J = aVar2.J(izsVar2);
                        Object x = aVar2.x();
                        if (J || x == a.C0011a.a) {
                            x = new t9d(izsVar2, 4);
                            aVar2.R(x);
                        }
                        gbh0.e(0, aVar2, (gzs) x, va8Var.b(aVar3, dt1.a.c));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dbh0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    gbh0.f(e3b0.this, mtk0Var, obj, z, q630Var, izsVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(mtk0 mtk0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1180323765);
        if ((i & 6) == 0) {
            i2 = (M.J(mtk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1180323765, i2, -1, "com.vk.clips.upload.vk.impl.preview.compose.VideoSlider (ScreenContent.kt:216)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ClipsSeekBar(context, null, 6);
                M.R(x);
            }
            ClipsSeekBar clipsSeekBar = (ClipsSeekBar) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            q630 k = txj0.k(eqn0.a(q630Var), 24);
            boolean y = M.y(clipsSeekBar);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new ape0(clipsSeekBar, 3);
                M.R(x3);
            }
            q630 R = x19.R(k, (izs) x3);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new r9d(mtk0Var, 1);
                M.R(x4);
            }
            q630 E = ahn.E(egi0.b(R, false, (izs) x4), "ProgressSlider");
            boolean y2 = ((i2 & 112) == 32) | M.y(clipsSeekBar);
            Object x5 = M.x();
            if (y2 || x5 == c0012a) {
                x5 = new yd6(clipsSeekBar, izsVar, wh50Var, 4);
                M.R(x5);
            }
            izs izsVar2 = (izs) x5;
            boolean y3 = M.y(clipsSeekBar);
            Object x6 = M.x();
            if (y3 || x6 == c0012a) {
                x6 = new af50(clipsSeekBar, 23);
                M.R(x6);
            }
            izs izsVar3 = (izs) x6;
            boolean z2 = i3 == 4;
            Object x7 = M.x();
            if (z2 || x7 == c0012a) {
                x7 = new u6(27, mtk0Var, wh50Var);
                M.R(x7);
            }
            ae2.b(izsVar2, E, null, izsVar3, (izs) x7, M, 0, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bku(i, 2, mtk0Var, izsVar, q630Var);
        }
    }

    public static final void h(Object obj, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-242331543);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-242331543, i2, -1, "com.vk.clips.upload.vk.impl.preview.compose.ViewerOverlay (ScreenContent.kt:380)");
            }
            String N = d370.N(R.string.clip_preview_preview_area_accessibility, 0, M);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = ((ClipsViewerComponent) ((k7m) m7m.f(new fbh0())).a(fpf0.a(ClipsViewerComponent.class))).k9().a(context, (ClipVideoFile) obj);
                M.R(x);
            }
            View view = (View) x;
            Object x2 = M.x();
            if (x2 == obj2) {
                x2 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x2;
            boolean y = M.y(view);
            Object x3 = M.x();
            if (y || x3 == obj2) {
                x3 = new ra50(view, 1);
                M.R(x3);
            }
            izs izsVar = (izs) x3;
            q630 a = o19.a(txj0.d(q630Var, 1.0f), 0.64f);
            Object x4 = M.x();
            if (x4 == obj2) {
                x4 = new om60(9);
                M.R(x4);
            }
            ae2.a(0, 4, M, izsVar, null, ahn.E(ojc.c(a, false, null, null, (gzs) x4, 14), "Overlay"));
            q630 E = ahn.E(ojc.b(txj0.d(q630.a.a, 1.0f), sg50Var, null, false, null, gzsVar, 28), "OverlayClickListener");
            boolean J = M.J(N);
            Object x5 = M.x();
            if (J || x5 == obj2) {
                x5 = new wgc(N);
                M.R(x5);
            }
            ja8.a(egi0.b(E, false, (izs) x5), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pha(obj, gzsVar, q630Var, i, 6);
        }
    }
}
