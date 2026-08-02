package xsna;

import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.dt1;
import xsna.kyl;
import xsna.ty6;

/* compiled from: DeliveryPointsBottomFixedContent.kt */
/* loaded from: classes18.dex */
public final class pwl {
    public static final float a = 68;

    public static final void a(izs izsVar, kyl.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-295310940);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-295310940, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsBottomFixedContent (DeliveryPointsBottomFixedContent.kt:32)");
            }
            if ((eVar instanceof kyl.e.d) && ((kyl.e.d) eVar).c) {
                z = true;
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.m;
            mm2.f(z, q630Var, anp.d(null, bVar, null, 13).b(anp.e(null, 3)), anp.k(null, bVar, 13).b(anp.f(null, 3)), null, kai.c(-785351220, new nwl(0, eVar, izsVar), M), M, ((i2 >> 3) & 112) | 200064, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new owl(i, 0, izsVar, eVar, q630Var);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2087812503);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2087812503, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.SelectButton (DeliveryPointsBottomFixedContent.kt:63)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, d370.N(R.string.ecomm_delivery_points_select_point, 0, M), null, null, null, null, false, null, null, null, aVar2, (i2 & 14) | X2.b.f | ((i2 << 9) & 57344), 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fza(gzsVar, q630Var, i, 3);
        }
    }
}
