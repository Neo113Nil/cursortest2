package xsna;

import android.text.Layout;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CtaButton.kt */
/* loaded from: classes18.dex */
public final class ekk {
    public static final void a(String str, lg90 lg90Var, boolean z, boolean z2, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1083838472);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1083838472, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.CtaButton (CtaButton.kt:115)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.T;
            wjo0 a = xjo0.a(0, 1, M);
            boolean z3 = (i2 & 112) == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z3 || x == obj) {
                m540 m540Var = wjo0.a(a, str == null ? "" : str, frv0Var.a, 1, 0L, 1004).b;
                m540Var.n(0);
                ArrayList arrayList = m540Var.h;
                Layout layout = ((ah90) arrayList.get(c4g0.o(0, arrayList))).a.d.f;
                ThreadLocal<qbo0> threadLocal = njo0.a;
                x = Boolean.valueOf(layout.getEllipsisCount(0) > 0);
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            q630 g = !booleanValue ? q630Var.g(tpg0Var.b(1.0f, q630.a.a, true)) : q630Var;
            ButtonSize buttonSize = booleanValue ? ButtonSize.Small : ButtonSize.Medium;
            ButtonStyle buttonStyle = z ? ButtonStyle.Primary : ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z4 = ((i2 & 3670016) == 1048576) | ((57344 & i2) == 16384);
            Object x2 = M.x();
            if (z4 || x2 == obj) {
                x2 = new ff4(1, izsVar, z2);
                M.R(x2);
            }
            aVar2 = M;
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, g, null, false, false, lg90Var, null, null, str, null, null, null, null, false, null, null, null, aVar2, 1073744896 | ((i2 << 21) & 1879048192), (i2 << 3) & 896, 0, 4189664);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new dkk(str, lg90Var, z, z2, q630Var, izsVar, i);
        }
    }

    public static final void b(sll0 sll0Var, q630 q630Var, q630 q630Var2, q630 q630Var3, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var4;
        int i3;
        int i4;
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(-405974966);
        if ((i & 6) == 0) {
            i2 = (M.J(sll0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            q630Var4 = q630Var3;
            i2 |= M.J(q630Var4) ? 2048 : 1024;
        } else {
            q630Var4 = q630Var3;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-405974966, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.CtaButtons (CtaButton.kt:72)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(8), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            lg90 lg90Var = null;
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(198629569);
            if (sll0Var.a) {
                M.K(198630188);
                String N = d370.N(R.string.message, 0, M);
                qzu0.a.getClass();
                i3 = -1;
                a(N, qzu0.M0(M), true, true, q630Var2, izsVar, M, 28166 | ((i2 << 9) & 458752) | ((i2 << 6) & 3670016));
            } else {
                i3 = -1;
                M.K(195437343);
            }
            M.j();
            ja9 ja9Var = sll0Var.b;
            if (ja9Var == null || (i4 = ja9Var.a) == i3 || !sll0Var.c) {
                M.j();
            } else {
                String str = ja9Var.b;
                boolean z = sll0Var.d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-466780525, 0, i3, "com.vk.ecomm.storefront.impl.community.presentation.ui.getCtaIcon (CtaButton.kt:153)");
                }
                switch (i4) {
                    case 0:
                        M.K(-1899478496);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2014533032, 0, i3, "com.vk.core.compose.icons.generated.VkIcons.<get-MailOutline20> (VkIcons.kt:7184)");
                        }
                        lg90Var = pg90.a(R.drawable.vk_icon_mail_outline_20, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 1:
                    case 2:
                        M.K(-1899480351);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-216341918, 0, i3, "com.vk.core.compose.icons.generated.VkIcons.<get-PhoneOutline20> (VkIcons.kt:8524)");
                        }
                        lg90Var = or.b(M, 1704004675, R.drawable.vk_icon_phone_outline_20, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        M.K(-1899474458);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-281381966, 0, i3, "com.vk.core.compose.icons.generated.VkIcons.<get-LinkCircleOutline20> (VkIcons.kt:6490)");
                        }
                        lg90Var = pg90.a(R.drawable.vk_icon_link_circle_outline_20, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 6:
                        M.K(1245967372);
                        if (z) {
                            M.K(1245997814);
                            qzu0.a.getClass();
                            a = qzu0.l(M);
                            M.j();
                        } else {
                            M.K(1246060279);
                            qzu0.a.getClass();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(2101453442, 0, i3, "com.vk.core.compose.icons.generated.VkIcons.<get-Square4Outline20> (VkIcons.kt:10222)");
                            }
                            a = pg90.a(R.drawable.vk_icon_square_4_outline_20, 0, M);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                        }
                        lg90Var = a;
                        M.j();
                        break;
                    case 7:
                        M.K(-1899472220);
                        qzu0.a.getClass();
                        lg90Var = qzu0.l(M);
                        M.j();
                        break;
                    default:
                        M.K(1246141994);
                        M.j();
                        break;
                }
                lg90 lg90Var2 = lg90Var;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i5 = i2 << 6;
                a(str, lg90Var2, false, false, q630Var4, izsVar, M, 28166 | (i5 & 458752) | (i5 & 3670016));
                M.j();
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
            s.d = new ckk(sll0Var, q630Var, q630Var2, q630Var3, izsVar, i);
        }
    }

    public static final void c(qa8 qa8Var, sll0 sll0Var, rg50 rg50Var, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        sll0 sll0Var2;
        androidx.compose.runtime.a M = aVar.M(1713119864);
        if ((i & 6) == 0) {
            i2 = (M.J(qa8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(sll0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(rg50Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1713119864, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.FloatingCtaButtons (CtaButton.kt:39)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            q630 b = qa8Var.b(f, dt1.a.i);
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new jm0(rg50Var, 25);
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
            float f2 = 8;
            float f3 = 16;
            q630 G = s200.G(m, f3, f2, f3, f2);
            q630 E = ahn.E(aVar2, "storefront_cta_button_message_floating");
            q630 E2 = ahn.E(aVar2, "storefront_cta_button_floating");
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ypd(izsVar, 2);
                M.R(x2);
            }
            sll0Var2 = sll0Var;
            b(sll0Var2, G, E, E2, (izs) x2, M, ((i2 >> 3) & 14) | 28032);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            sll0Var2 = sll0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bkk(qa8Var, sll0Var2, rg50Var, izsVar, i);
        }
    }
}
