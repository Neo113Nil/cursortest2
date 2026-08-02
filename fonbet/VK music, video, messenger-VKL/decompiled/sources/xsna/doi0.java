package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.dt1;
import xsna.q630;

/* compiled from: ServiceAddButton.kt */
/* loaded from: classes18.dex */
public final class doi0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-740114813);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-740114813, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.AddServiceButton (ServiceAddButton.kt:50)");
            }
            String N = d370.N(R.string.storefront_services_add_service_button_title, 0, M);
            int i3 = i2;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            q630 E = ahn.E(q630Var, "storefront_add_icon");
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ln7(izsVar, 10);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new z7d(q630Var, izsVar, i);
        }
    }

    public static final void b(qa8 qa8Var, rg50 rg50Var, rg50 rg50Var2, izs<? super wml0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1964250382);
        if ((i & 6) == 0) {
            i2 = (M.J(qa8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rg50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(rg50Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1964250382, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.AddServiceButtonContainer (ServiceAddButton.kt:29)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            q630 b = qa8Var.b(f, dt1.a.i);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new w110(rg50Var, 25);
                M.R(x);
            }
            q630 k = kci.k(b, (izs) x);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(k, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            boolean z2 = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new njj(2, rg50Var2);
                M.R(x2);
            }
            q630 o = egi.o(m, (izs) x2);
            float f2 = 8;
            float f3 = 16;
            a((i2 >> 6) & 112, M, izsVar, s200.G(o, f3, f2, f3, f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kqz(qa8Var, rg50Var, rg50Var2, izsVar, i);
        }
    }
}
