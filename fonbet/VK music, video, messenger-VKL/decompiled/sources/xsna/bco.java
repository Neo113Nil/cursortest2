package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DownloadedVideoView.kt */
/* loaded from: classes16.dex */
public final class bco {
    public static final void a(cco ccoVar, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        gzs gzsVar4 = gzsVar;
        pdt0 pdt0Var = ccoVar.l;
        l8s0 l8s0Var = ccoVar.b;
        float f = l8s0Var.d;
        float f2 = l8s0Var.c;
        androidx.compose.runtime.a M = aVar.M(954535611);
        int i2 = i | (M.J(ccoVar) ? 4 : 2) | (M.y(gzsVar4) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(954535611, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.DownloadedVideoView (DownloadedVideoView.kt:39)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            float f3 = fnj.d(context) ? 12 : 8;
            uog0 b = vog0.b(f3);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            q630 b2 = ojc.b(q630Var, (sg50) x, qer0.a(f3, 4, 0L, false), false, null, gzsVar2, 28);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b2);
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
            if (pdt0Var != null) {
                M.K(1627210533);
                boolean z = (i2 & 14) == 4;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new rdt0(pdt0Var, ccoVar.f, l8s0Var);
                    M.R(x2);
                }
                rdt0 rdt0Var = (rdt0) x2;
                q630 d2 = rte0.d(txj0.h(txj0.v(aVar3, f2), f), b);
                float f4 = (float) 0.5d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                gzsVar3 = gzsVar2;
                ndt0.h(rdt0Var, gzsVar3, r18.a(f4, ylu0Var.getImage().a, d2, b), M, (i2 >> 3) & 112);
                M.j();
            } else {
                gzsVar3 = gzsVar2;
                M.K(1628154700);
                q630 d3 = rte0.d(txj0.h(txj0.v(aVar3, f2), f), b);
                float f5 = (float) 0.5d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aco.a(ccoVar, r18.a(f5, ylu0Var2.getImage().a, d3, b), M, i2 & 14);
                M.j();
            }
            M.G();
            f9t.e(txj0.h(aVar3, 8), M, 6);
            gzsVar4 = gzsVar;
            ybo.b(ccoVar, gzsVar4, null, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar3 = gzsVar2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new edn(i, 1, ccoVar, q630Var, gzsVar4, gzsVar3);
        }
    }
}
