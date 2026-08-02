package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.pmb0;
import xsna.q630;

/* compiled from: DeliveryPointsSheetError.kt */
/* loaded from: classes18.dex */
public final class pyl {
    public static final void a(izs izsVar, pmb0 pmb0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1274803057);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(pmb0Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1274803057, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsSheetError (DeliveryPointsSheetError.kt:30)");
            }
            q630 F = s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(q630Var, 1.0f), 190));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(16, dt1.a.l), dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String g = kq01.g(pmb0Var.a, M);
            q630 f = txj0.f(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(g, f, j, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.N, M, 48, 0, 8120);
            tlo0 tlo0Var = pmb0Var.b;
            if (tlo0Var == null) {
                M.K(-1591576560);
                M.j();
                aVar2 = M;
            } else {
                M.K(-1591576559);
                ButtonAppearance buttonAppearance = pmb0Var instanceof pmb0.a ? ButtonAppearance.Negative : ButtonAppearance.Accent;
                gcv gcvVar = new gcv(dt1.a.o);
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                String d = kq01.d(tlo0Var, M);
                boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new d5(8, pmb0Var, izsVar);
                    M.R(x);
                }
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, gcvVar, null, false, false, null, null, null, d, null, null, null, null, false, null, null, null, M, Tensorflow.FRAME_WIDTH, 0, 0, 4190176);
                aVar2 = M;
                aVar2.j();
            }
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
            s.d = new oyl(izsVar, pmb0Var, q630Var, i);
        }
    }
}
