package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CollapsibleSheet.kt */
/* loaded from: classes5.dex */
public final class c4g {
    public static final void a(a4g a4gVar, r5j0 r5j0Var, q630 q630Var, q630 q630Var2, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        jai jaiVar2;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-2075651207);
        int i2 = i | (M.J(a4gVar) ? 4 : 2) | (M.J(r5j0Var) ? 32 : 16) | 384 | (M.J(q630Var2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2075651207, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.CollapsibleSheet (CollapsibleSheet.kt:31)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new p4f(a4gVar, 1);
                M.R(x);
            }
            gho b = fho.b((izs) x, M, 0);
            q630.a aVar2 = q630.a.a;
            float f = 4;
            q630 H = s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new dsc(a4gVar, 8);
                M.R(x2);
            }
            q630 a = rdu.a(H, (izs) x2);
            Orientation orientation = Orientation.Vertical;
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new b4g(a4gVar, null);
                M.R(x3);
            }
            q630 b2 = a5j0.b(fho.a(a, b, orientation, false, null, false, (yzs) x3, false, 188), f, r5j0Var, false, 0L, 0L, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 g = hr80.m(b2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a).g(q630Var2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar2 = jaiVar;
            jaiVar2.invoke(ra8.a, M, 54);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = aVar2;
        } else {
            jaiVar2 = jaiVar;
            M.h();
            q630Var3 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yx7(a4gVar, r5j0Var, q630Var3, q630Var2, jaiVar2, i);
        }
    }
}
