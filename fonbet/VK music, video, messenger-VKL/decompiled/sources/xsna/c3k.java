package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;

/* compiled from: Cover.kt */
/* loaded from: classes7.dex */
public final class c3k {
    public static final void a(m3k m3kVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(464506634);
        int i2 = i | (M.J(m3kVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(464506634, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.cover.Cover (Cover.kt:49)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                HashSet hashSet = iah0.a;
                x = Boolean.valueOf(fnj.d(context));
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            q630 F = s200.F(booleanValue ? 12 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new u77(izsVar, 2);
                M.R(x2);
            }
            q630 d = sua.d(1.7777778f, txj0.f(ojc.c(F, false, null, null, (gzs) x2, 15), 1.0f), false);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ty6 ty6Var2 = dt1.a.f;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 c2 = txj0.c(ra8Var.b(aVar3, ty6Var2), 1.0f);
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, c2);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            u2k u2kVar = m3kVar.a;
            r5j0 b = booleanValue ? vog0.b(12) : androidx.compose.ui.graphics.e.a;
            boolean z2 = i3 == 32;
            Object x3 = M.x();
            if (z2 || x3 == obj) {
                x3 = new w77(izsVar, 3);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            q630 b2 = ra8Var.b(aVar3, ty6Var2);
            boolean y = M.y(context) | ((i2 & 14) == 4);
            Object x4 = M.x();
            if (y || x4 == obj) {
                x4 = new na7(12, m3kVar, context);
                M.R(x4);
            }
            t2k.b(u2kVar, b, gzsVar, ahn.E(txj0.d(com.vk.core.compose.component.semantics.b.b(b2, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3)), 1.0f), "CoverTags.IMAGE"), M, 0);
            int i4 = i2 << 3;
            b(m3kVar, izsVar, M, (i4 & 896) | (i4 & 112) | 6);
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
            s.d = new w2k(i, 0, m3kVar, izsVar, q630Var);
        }
    }

    public static final void b(m3k m3kVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1372128181);
        int i3 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i3 == 0) {
            i2 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(m3kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1372128181, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.cover.OverlayItems (Cover.kt:99)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            float f = 36;
            String N = d370.N(R.string.setting_cover_icon_change_talkback, 0, M);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            q630.a aVar3 = q630.a.a;
            q630 b = ra8Var.b(aVar3, ty6Var);
            float f2 = 8;
            q630 E = ahn.E(hr80.m(s200.H(b, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), wlb0.h(M).j().a, vog0.a), "CoverTags.ICON_CHANGE");
            qzu0.a.getClass();
            lg90 Z0 = qzu0.Z0(M);
            long j = wlb0.h(M).getIcon().c;
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new k74(izsVar, 3);
                M.R(x);
            }
            nzu0.c((gzs) x, Z0, N, E, f, j, false, null, false, null, null, M, 24640, 1984);
            String obj = tlo0.b.a(m3kVar.b, context).toString();
            q630 b2 = ra8Var.b(aVar3, dt1.a.j);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new x90(12);
                M.R(x2);
            }
            yqv0.c(obj, ahn.E(s200.E(hr80.m(s200.H(com.vk.core.compose.component.semantics.b.b(b2, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3), wlb0.h(M).j().a, vog0.b(4)), 6, 3), "CoverTags.DURATION"), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).v0, M, 0, 0, 8184);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new dx7(m3kVar, izsVar, i, 1);
        }
    }
}
