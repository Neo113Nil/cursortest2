package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.pox0;
import xsna.q630;

/* compiled from: WidgetText.kt */
/* loaded from: classes17.dex */
public final class wox0 {
    public static final void a(pox0.g gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        String str;
        String str2;
        float f;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1832755191);
        int i4 = i | (M.J(gVar) ? 4 : 2) | 48;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1832755191, i4, -1, "com.vk.community.design.compose.widget.text.WidgetText (WidgetText.kt:28)");
            }
            float f2 = kqu0.y;
            q630.a aVar3 = q630.a.a;
            q630 D = s200.D(aVar3, f2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (gVar.b == null) {
                M.K(196457582);
                M.j();
                q630Var2 = aVar3;
                f = 1.0f;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                str2 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
            } else {
                M.K(196457583);
                q630 E = ahn.E(txj0.f(aVar3, 1.0f), "CommunityProfileWidgetTextContent");
                String str3 = gVar.b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.c0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = aVar3;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                str2 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                f = 1.0f;
                yqv0.c(str3, E, ylu0Var.getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8120);
                M = M;
                M.j();
            }
            if (gVar.c == null) {
                M.K(196872610);
                M.j();
                aVar2 = M;
            } else {
                M.K(196872611);
                q630 E2 = ahn.E(txj0.f(q630Var2, f), "CommunityProfileWidgetTextDescription");
                String str4 = gVar.c;
                if (androidx.compose.runtime.b.d()) {
                    i2 = -1;
                    i3 = 0;
                    androidx.compose.runtime.b.f(-473561179, 0, -1, str2);
                } else {
                    i2 = -1;
                    i3 = 0;
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.m0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i3, i2, str);
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(str4, E2, ylu0Var2.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var2, aVar2, 48, 0, 8120);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new p70(gVar, q630Var2, i, 7);
        }
    }
}
