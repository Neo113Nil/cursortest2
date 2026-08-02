package xsna;

import android.graphics.DashPathEffect;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TabbarSuggestBottomPanel.kt */
/* loaded from: classes6.dex */
public final class uwn0 {
    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final boolean z) {
        long j;
        androidx.compose.runtime.a M = aVar.M(-1802402231);
        int i3 = (M.o(i) ? 32 : 16) | i2 | (M.l(z) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1802402231, i3, -1, "com.vk.tabbar.settings.impl.suggests.TabbarBottomPanelIcon (TabbarSuggestBottomPanel.kt:76)");
            }
            q630 q = txj0.q(q630.a.a, 28);
            dt1.a.getClass();
            q630 b = ra8.a.b(q, dt1.a.f);
            lg90 a = pg90.a(i, (i3 >> 3) & 14, M);
            if (z) {
                M.K(316538403);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().a;
                M.j();
            } else {
                M.K(316598016);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().l;
                M.j();
            }
            vqv.a(a, null, b, j, M, 56, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, z, i2) { // from class: xsna.rwn0
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    uwn0.a(this.b, I, (androidx.compose.runtime.a) obj, this.c);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, final boolean z) {
        long j;
        androidx.compose.runtime.a M = aVar.M(-1483853623);
        int i3 = (M.o(i) ? 32 : 16) | i2 | (M.l(z) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1483853623, i3, -1, "com.vk.tabbar.settings.impl.suggests.TabbarBottomSuggestIcon (TabbarSuggestBottomPanel.kt:94)");
            }
            final long j2 = wlb0.h(M).getIcon().a;
            final db2 db2Var = new db2(new DashPathEffect(new float[]{iah0.b(10.17f), cn70.c(2)}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(aVar2, 28);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            ra8 ra8Var = ra8.a;
            q630 b = ra8Var.b(q, ty6Var);
            lg90 a = pg90.a(i, (i3 >> 3) & 14, M);
            if (z) {
                j = vcl0.a(M, -1679451069, M).a;
                M.j();
            } else {
                j = vcl0.a(M, -1679391456, M).l;
                M.j();
            }
            vqv.a(a, null, b, j, M, 56, 0);
            float f = (float) 46.5d;
            q630 b2 = ra8Var.b(txj0.h(txj0.v(aVar2, f), f), ty6Var);
            boolean p = M.p(j2) | M.y(db2Var);
            Object x = M.x();
            if (p || x == a.C0011a.a) {
                x = new izs() { // from class: xsna.swn0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        frm0 frm0Var = new frm0(oioVar.I0((float) 1.51d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, db2Var, 14);
                        oioVar.G(j2, oio.G0(oioVar.d(), 0L), frm0Var);
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            xa4.i(0, M, (izs) x, b2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, z, i2) { // from class: xsna.twn0
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    uwn0.b(this.b, I, (androidx.compose.runtime.a) obj, this.c);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final float f, final gzs gzsVar, final int i, final int i2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.a M = aVar.M(-1554649717);
        int i4 = i3 | (M.n(f) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.o(i2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1554649717, i4, -1, "com.vk.tabbar.settings.impl.suggests.TabbarSuggestBottomPanel (TabbarSuggestBottomPanel.kt:35)");
            }
            q630 h = txj0.h(s200.H(s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.v(q630Var, f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(h, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 p = txj0.p(q630.a.a, f);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, p);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            List list = (List) gzsVar.invoke();
            M.K(197330886);
            Iterator it = list.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                int i6 = i5 + 1;
                int intValue = ((Number) it.next()).intValue();
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 d2 = txj0.d(new xpy(1.0f, true), 1.0f);
                dt1.a.getClass();
                cp10 d3 = ja8.d(dt1.a.b, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c3 = qri.c(M, d2);
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
                k9q0.w(M, d3, cri.a.f);
                k9q0.w(M, D3, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c3, cri.a.d);
                if (i5 == i) {
                    M.K(1125966556);
                    b(intValue, 6, M, i5 == i2);
                    M.j();
                } else {
                    M.K(1126173822);
                    a(intValue, 6, M, i5 == i2);
                    M.j();
                }
                M.G();
                i5 = i6;
            }
            M.j();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, gzsVar, i, i2, q630Var, i3) { // from class: xsna.qwn0
                public final /* synthetic */ float b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    uwn0.c(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
