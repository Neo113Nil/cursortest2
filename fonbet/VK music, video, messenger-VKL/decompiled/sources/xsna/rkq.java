package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.mkq;
import xsna.nkq;
import xsna.q630;
import xsna.ty6;

/* compiled from: FaqView.kt */
/* loaded from: classes14.dex */
public final class rkq extends i6v0<skq, hkq> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((skq) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(mkq.b bVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1216839724);
        int i2 = (i & 6) == 0 ? (M.J(bVar) ? 4 : 2) | i : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1216839724, i2, -1, "com.vk.ads.easypromote.impl.presentation.FaqView.CollapsibleLazyColumns (FaqView.kt:108)");
            }
            wh50 c = jk50.c(bVar.a, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                int size = ((nkq.a) c.getValue()).b.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(Boolean.FALSE);
                }
                M.R(arrayList);
                x = arrayList;
            }
            SnapshotStateList d = androidx.compose.runtime.k.d((List) x);
            q630 f = txj0.f(n34.t(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), dz5.I(0, 1, M, false), null), 1.0f);
            boolean J = M.J(c) | M.J(d);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new m9(15, c, d);
                M.R(x2);
            }
            lqy.a(f, null, null, null, null, null, false, null, (izs) x2, M, 0, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h9g(this, bVar, i, 2);
        }
    }

    public final void i(mkq.b bVar, boolean z, izs<? super hkq, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1477753231);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(this) : M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1477753231, i2, -1, "com.vk.ads.easypromote.impl.presentation.FaqView.FaqContent (FaqView.kt:62)");
            }
            long j = wlb0.h(M).getBackground().r;
            float f = 14;
            uog0 b = vog0.b(f);
            q630.a aVar2 = q630.a.a;
            q630 m = hr80.m(aVar2, j, b);
            q630 d = z ? txj0.d(m, 1.0f) : txj0.f(m, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ty6.b bVar3 = dt1.a.l;
            float f2 = 16;
            q630 E = s200.E(aVar2, f2, f);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar3, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            } else {
                i3 = 0;
            }
            lg90 b2 = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.close, i3, M);
            long j2 = wlb0.h(M).getIcon().b;
            int i4 = (i2 & 896) == 256 ? 1 : i3;
            Object x = M.x();
            if (i4 != 0 || x == a.C0011a.a) {
                x = new me0(izsVar, 5);
                M.R(x);
            }
            int i5 = i2;
            nzu0.c((gzs) x, b2, N, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, M, 64, 2008);
            float f3 = 8;
            yqv0.c(d370.N(R.string.faq_top_bar_text, i3, M), s200.D(aVar2, f3), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).B, M, 48, 0, 8184);
            M.G();
            M = M;
            jqu0.a(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            f9t.e(txj0.h(aVar2, f3), M, 6);
            h(bVar, M, (i5 & 14) | 64 | ((i5 >> 6) & 112));
            if (xga0.c(aVar2, f2, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new okq(this, bVar, z, izsVar, i, 0);
        }
    }

    public final void j(skq skqVar, izs<? super hkq, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-156195053);
        int i2 = (M.J(skqVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-156195053, i2, -1, "com.vk.ads.easypromote.impl.presentation.FaqView.ThemedContent (FaqView.kt:47)");
            }
            mkq mkqVar = (mkq) d(mkq.a.a, new n0u0[]{skqVar.a}, M, (i2 & 896) | 518).getValue();
            mkq.b bVar = mkqVar instanceof mkq.b ? (mkq.b) mkqVar : null;
            if (bVar == null) {
                M.K(-1756993641);
            } else {
                M.K(-1756993640);
                Boolean a = bVar.b.a();
                int i3 = i2 << 3;
                i(bVar, a != null ? a.booleanValue() : false, izsVar, M, (i3 & 896) | 4096 | (i3 & 7168));
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ez7(this, skqVar, izsVar, i, 5);
        }
    }
}
