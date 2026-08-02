package xsna;

import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ButtonReady.kt */
/* loaded from: classes7.dex */
public final class sq8 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, q630 q630Var, final boolean z) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-919221900);
        int i2 = i | (M.y(gzsVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        int i3 = i2 | (M.J(str) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-919221900, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.buttonready.ButtonReady (ButtonReady.kt:22)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630.a aVar4 = q630.a.a;
            q630 E = s200.E(hr80.m(aVar4, j, aVar3), 16, 12);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, ahn.E(txj0.f(aVar4, 1.0f), "ButtonReadyTags.BUTTON"), null, false, false, null, null, null, str, null, null, null, null, z, null, null, null, aVar2, (i3 & 14) | 28080, (i3 & 896) | ((i3 << 18) & 29360128), 0, 4059104);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rq8
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sq8.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var2, z);
                    return s3q0.a;
                }
            };
        }
    }
}
