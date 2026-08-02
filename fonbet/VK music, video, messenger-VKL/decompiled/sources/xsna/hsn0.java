package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterSize;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TabsSheet.kt */
/* loaded from: classes3.dex */
public final class hsn0 implements msn0 {
    public final rg50 a;

    public hsn0(int i) {
        this.a = androidx.compose.runtime.i.a(i);
    }

    @Override // xsna.msn0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2078037045);
        int i3 = i & 6;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2078037045, i2, -1, "com.vk.music.stickyplayer.presentation.components.TabCounter.Content (TabsSheet.kt:283)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new x1e0(this, 15));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            float f = com.vk.core.compose.component.defaults.f.a;
            CounterSize counterSize = CounterSize.Small;
            int i4 = com.vk.core.compose.component.defaults.f.h;
            int i5 = i4 << 3;
            int i6 = i5 | 6;
            q630 b = txj0.b(com.vk.core.compose.component.defaults.f.c(counterSize, M, i6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(aVar3, com.vk.core.compose.component.defaults.f.c(counterSize, M, i6)));
            Object x2 = M.x();
            int i7 = 6;
            if (x2 == c0012a) {
                x2 = new l4k0(i7);
                M.R(x2);
            }
            q630 E = s200.E(hr80.m(rdu.a(b, (izs) x2), wlb0.h(M).getBackground().z, androidx.compose.ui.graphics.e.a), com.vk.core.compose.component.defaults.f.d(counterSize, null, M, (i4 << 6) | 6, 2), com.vk.core.compose.component.defaults.f.e(null, i5, 1));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            aVar2 = M;
            yqv0.c((String) mtk0Var.getValue(), null, wlb0.h(M).getText().d, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).w0, aVar2, 0, 0, 8122);
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
            s.d = new qma(this, i);
        }
    }
}
