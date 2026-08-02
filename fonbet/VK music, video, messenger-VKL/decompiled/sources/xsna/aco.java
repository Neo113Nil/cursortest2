package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.ImageSize;
import xsna.cco;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: DownloadedVideoPlaceholder.kt */
/* loaded from: classes16.dex */
public final class aco {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(cco ccoVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        gzs gzsVar;
        us2 us2Var;
        boolean z;
        gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(-1444202411);
        if ((i & 6) == 0) {
            i2 = (M.J(ccoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1444202411, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.DownloadedVideoPlaceholder (DownloadedVideoPlaceholder.kt:33)");
            }
            cco.a aVar3 = ccoVar.k;
            ImageSize Cb = ccoVar.f.Cb((int) ((azl) M.r(uvi.h)).I0(ccoVar.b.c), true, false);
            String str = Cb != null ? Cb.d.d : null;
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            lg90 l = fwu0.l(str, null, null, null, M, 0, 62);
            q630.a aVar5 = q630.a.a;
            vjw.a(l, null, txj0.d(aVar5, 1.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 25016, 104);
            aVar2 = M;
            float f = ccoVar.g;
            ra8 ra8Var = ra8.a;
            if (f > 0.1f) {
                aVar2.K(-1945576460);
                bev0.a(ccoVar.g, 0, 4, 0L, aVar2, txj0.h(txj0.f(ra8Var.b(aVar5, dt1.a.i), 1.0f), 4));
                aVar2 = aVar2;
            } else {
                aVar2.K(-1947538605);
            }
            aVar2.j();
            if (aVar3 != null) {
                DonutVideoUiModel.PreviewBadge previewBadge = aVar3.a;
                aVar2.K(-1945277713);
                DonutPriceTemplate donutPriceTemplate = previewBadge.c;
                if (donutPriceTemplate == null) {
                    aVar2.K(-1945233353);
                    aVar2.j();
                    gzsVar = null;
                    us2Var = null;
                } else {
                    aVar2.K(1045629194);
                    gzsVar = null;
                    us2 a = z1o.a(donutPriceTemplate, null, aVar2, 1);
                    aVar2.j();
                    us2Var = a;
                }
                if (us2Var == null) {
                    aVar2.K(1045631624);
                    z = 0;
                    us2Var = ws2.a(previewBadge.b, aVar2, 0);
                    aVar2.j();
                } else {
                    z = 0;
                    aVar2.K(1045628059);
                    aVar2.j();
                }
                DonutVideoAction donutVideoAction = previewBadge.e;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (donutVideoAction == null) {
                    aVar2.K(-1945018864);
                    aVar2.j();
                    gzsVar2 = gzsVar;
                } else {
                    aVar2.K(-1945018863);
                    boolean J = aVar2.J(aVar3) | aVar2.y(donutVideoAction);
                    Object x = aVar2.x();
                    if (J || x == c0012a) {
                        x = new cy0(11, aVar3, donutVideoAction);
                        aVar2.R(x);
                    }
                    aVar2.j();
                    gzsVar2 = (gzs) x;
                }
                float f2 = 8;
                q630 H = s200.H(ra8Var.b(aVar5, dt1.a.h), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 6);
                boolean J2 = aVar2.J(aVar3);
                Object x2 = aVar2.x();
                if (J2 || x2 == c0012a) {
                    x2 = new h6g(aVar3, 14);
                    aVar2.R(x2);
                }
                q630 b = egi0.b(H, z, (izs) x2);
                androidx.compose.runtime.a aVar6 = aVar2;
                own.a(us2Var, b, gzsVar2, 0L, aVar6, 0, 8);
                aVar2 = aVar6;
                i3 = z;
            } else {
                i3 = 0;
                aVar2.K(-1947538605);
            }
            aVar2.j();
            float f3 = 8;
            b(ccoVar.i.a((Context) aVar2.r(AndroidCompositionLocals_androidKt.b)).toString(), s200.H(ra8Var.b(aVar5, dt1.a.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f3, 3), aVar2, i3);
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
            s.d = new zbo(ccoVar, q630Var, i, 0);
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(87138358);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(87138358, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.DurationView (DownloadedVideoPlaceholder.kt:85)");
            }
            float f = 4;
            q630 m = hr80.m(rte0.d(q630Var, vog0.b(f)), wlb0.h(M).j().a, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c(str, s200.D(q630.a.a, f), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).v0, M, (i2 & 14) | 48, 0, 8184);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o21(str, q630Var, i, 2);
        }
    }
}
