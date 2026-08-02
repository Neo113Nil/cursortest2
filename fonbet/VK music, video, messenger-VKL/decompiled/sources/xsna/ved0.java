package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import java.util.List;
import xsna.q630;
import xsna.xcc;

/* compiled from: PrivacySettingsAcceptableUserStackCell.kt */
/* loaded from: classes4.dex */
public final class ved0 {
    public static final void a(final gzs gzsVar, final gzs gzsVar2, final boolean z, final String str, final lcd0 lcd0Var, final String str2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str3;
        String str4;
        com.vk.core.compose.component.cell.content.p0 p0Var;
        com.vk.core.compose.component.cell.content.x xVar;
        int i3;
        int i4;
        int i5 = lcd0Var.a;
        List<String> list = lcd0Var.c;
        androidx.compose.runtime.a M = aVar.M(-1050845268);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(lcd0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(str2) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1050845268, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsAcceptableUserStackCell (PrivacySettingsAcceptableUserStackCell.kt:35)");
            }
            if (z) {
                M.K(285623601);
                M.j();
                str3 = null;
            } else {
                str3 = zq.a(M, -544977968, R.string.privacy_settings_select_content_description, M, 0);
            }
            boolean o = M.o(i5);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = Integer.valueOf(i5);
                M.R(x);
            }
            int intValue = ((Number) x).intValue();
            boolean o2 = M.o(list.size());
            Object x2 = M.x();
            if (o2 || x2 == c0012a) {
                x2 = Integer.valueOf(list.size());
                M.R(x2);
            }
            int intValue2 = ((Number) x2).intValue();
            if (intValue2 == 1) {
                M.K(-544966261);
                M.j();
                str4 = list.get(0);
            } else if (intValue2 != 2) {
                M.K(-544958660);
                str4 = d370.F(R.plurals.privacy_settings_friends_quantity, i5, new Object[]{Integer.valueOf(i5)}, M, 0);
                M.j();
            } else {
                M.K(-544964682);
                str4 = d370.O(R.string.privacy_settings_two_friends, new Object[]{list.get(0), list.get(1)}, M);
                M.j();
            }
            q630 q630Var = q630.a.a;
            if (str2 != null) {
                q630Var = ahn.E(q630Var, str2);
            }
            q630 f = txj0.f(q630Var, 1.0f);
            boolean J = M.J(str3);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new h720(str3, 2);
                M.R(x3);
            }
            q630 b = lai0.b(egi0.b(f, false, (izs) x3), z, true, new plg0(3), gzsVar);
            RichCell$Middle.Size size = RichCell$Middle.Size.Medium;
            String str5 = str4;
            int i6 = i2;
            com.vk.core.compose.component.cell.content.f1 a = RichCell$Middle.g.b.a(str, false, null, null, null, M, 196656 | ((i2 >> 9) & 14), 28);
            if (intValue > 0) {
                M.K(-544929171);
                boolean z2 = (i6 & 57344) == 16384;
                Object x4 = M.x();
                if (z2 || x4 == c0012a) {
                    x4 = new xc50(lcd0Var, 10);
                    M.R(x4);
                }
                izs izsVar = (izs) x4;
                UserStackSize userStackSize = UserStackSize.Small;
                xcc.a.g gVar = xcc.a.g.a;
                SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = new oqu(27);
                    M.R(x5);
                }
                com.vk.core.compose.component.cell.content.p0 a2 = com.vk.core.compose.component.cell.content.m0.a(izsVar, str5, userStackSize, gVar, gzsVar2, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, 2), M, 1573248 | ((i6 << 9) & 57344), 0);
                M = M;
                M.j();
                p0Var = a2;
            } else {
                M.K(287779217);
                M.j();
                p0Var = null;
            }
            androidx.compose.runtime.a aVar2 = M;
            com.vk.core.compose.component.cell.content.b1 a3 = RichCell$Middle.b.a(null, null, a, null, p0Var, null, null, null, null, aVar2, 6, 2006);
            M = aVar2;
            if (z) {
                M.K(-544903900);
                if (androidx.compose.runtime.b.d()) {
                    i3 = -1;
                    i4 = 0;
                    androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                } else {
                    i3 = -1;
                    i4 = 0;
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_check_circle_on_24, i4, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i4, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                com.vk.core.compose.component.cell.content.x a5 = com.vk.core.compose.component.cell.content.p.a(a4, ylu0Var.getIcon().a, 0L, null, null, null, M, 1575944, 52);
                M = M;
                M.j();
                xVar = a5;
            } else {
                M.K(288000433);
                M.j();
                xVar = null;
            }
            ygv0.a(b, null, a3, xVar, null, M, 0, 50);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ted0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ved0.a(gzs.this, gzsVar2, z, str, lcd0Var, str2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
