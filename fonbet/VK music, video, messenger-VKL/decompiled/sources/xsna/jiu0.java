package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.fma;
import xsna.ima;
import xsna.q630;
import xsna.ty6;

/* compiled from: VkCellButtonGroupItem.kt */
/* loaded from: classes17.dex */
public final class jiu0 {
    public static final void a(ima.a aVar, gzs gzsVar, hma hmaVar, kma kmaVar, fma.a aVar2, androidx.compose.runtime.a aVar3, int i) {
        int i2;
        kma kmaVar2 = kmaVar;
        androidx.compose.runtime.a M = aVar3.M(1609744858);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar4 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(hmaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(kmaVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(true) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1609744858, i2, -1, "com.vk.core.compose.component.cell.button.group.VkCellButtonGroupItem (VkCellButtonGroupItem.kt:55)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(654261423, 6, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.minHeight (VkCellButtonDefaults.kt:20)");
            }
            float f = 44;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar4);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = ir.h(M);
            }
            q630 b2 = ojc.b(b, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), true, new plg0(0), gzsVar, 8);
            boolean z = (3670016 & i2) == 1048576;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new iiu0(0);
                M.R(x2);
            }
            q630 a = rdu.a(b2, (izs) x2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f2 = kqu0.s;
            dt1.a.getClass();
            ty6.a aVar5 = dt1.a.o;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f2, aVar5), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (hmaVar == null) {
                M.K(-52178414);
                M.j();
            } else {
                M.K(1799432143);
                hmaVar.a(((i2 >> 6) & 112) | 6, M);
                M.j();
                s3q0 s3q0Var = s3q0.a;
            }
            tpg0 tpg0Var = tpg0.a;
            int i4 = i2;
            q630 b3 = tpg0Var.b(1.0f, aVar4, false);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f2, aVar5), dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            aVar.a(tpg0Var.c(tpg0Var.b(1.0f, aVar4, false)), M, (i4 << 3) & 112);
            if (aVar2 == null) {
                M.K(1045148188);
                M.j();
            } else {
                M.K(-659022203);
                aVar2.a(tpg0Var.c(aVar4), M, (i4 >> 12) & 112);
                M.j();
                s3q0 s3q0Var2 = s3q0.a;
            }
            M.G();
            if (kmaVar == null) {
                M.K(-51745902);
                M.j();
                kmaVar2 = kmaVar;
            } else {
                M.K(1799446095);
                kmaVar2 = kmaVar;
                kmaVar2.a(((i4 >> 9) & 112) | 6, M);
                M.j();
                s3q0 s3q0Var3 = s3q0.a;
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vma(aVar, gzsVar, hmaVar, kmaVar2, aVar2, i);
        }
    }
}
