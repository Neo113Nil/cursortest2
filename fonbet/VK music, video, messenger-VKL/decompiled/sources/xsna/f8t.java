package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.UserStackSize;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GameUserStackItem.kt */
/* loaded from: classes17.dex */
public final class f8t {
    public static final long a = l5g.c(14, l5g.b, 0.4f);

    public static final void a(c8t c8tVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        ArrayList arrayList = c8tVar.b;
        androidx.compose.runtime.a M = aVar.M(2007229297);
        int i2 = (M.J(c8tVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2007229297, i2, -1, "com.vk.games.presentation.components.items.GameUserStackItem (GameUserStackItem.kt:26)");
            }
            q630 m = hr80.m(txj0.B(q630Var, null, 3), a, vog0.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            float f = arrayList.isEmpty() ? 6 : 2;
            float f2 = arrayList.isEmpty() ? 3 : 2;
            q630.a aVar4 = q630.a.a;
            q630 G = s200.G(aVar4, f, f2, 6, f2);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, G);
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
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (arrayList.isEmpty()) {
                M.K(610571035);
            } else {
                M.K(612209509);
                q630 H = s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                UserStackSize userStackSize = UserStackSize.Small;
                boolean z = (i2 & 14) == 4;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new k0j(c8tVar, 18);
                    M.R(x);
                }
                hyv0.c(H, userStackSize, null, (izs) x, M, 54, 4);
            }
            M.j();
            String str = c8tVar.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.v0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, null, ylu0Var.getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8186);
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wja(c8tVar, q630Var, i, 5);
        }
    }
}
