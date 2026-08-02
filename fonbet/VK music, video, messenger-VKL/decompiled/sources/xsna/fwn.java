package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import xsna.cri;
import xsna.dt1;
import xsna.pox0;
import xsna.q630;
import xsna.us2;

/* compiled from: DonationWidgetContent.kt */
/* loaded from: classes17.dex */
public final class fwn {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        a = decimalFormat;
    }

    public static final void a(pox0.a aVar, izs izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs izsVar2;
        q630.a aVar3;
        int i2;
        String str;
        int i3;
        int i4;
        String a2;
        long j;
        char c;
        int i5 = aVar.h;
        int i6 = aVar.g;
        String str2 = aVar.j;
        androidx.compose.runtime.a M = aVar2.M(-1200527540);
        int i7 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i7 & 1, (i7 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1200527540, i7, -1, "com.vk.community.design.compose.widget.donation.DonationWidgetContent (DonationWidgetContent.kt:39)");
            }
            q630.a aVar4 = q630.a.a;
            float f = 16;
            float f2 = 4;
            q630 H = s200.H(txj0.f(aVar4, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            String str3 = aVar.b;
            if (str3 == null || str3.length() == 0) {
                aVar3 = aVar4;
                i2 = i7;
                str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                i3 = -1;
                M.K(-1254171904);
            } else {
                M.K(-1252463339);
                String str4 = aVar.b;
                q630 H2 = s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 7);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var.getText().m;
                aVar3 = aVar4;
                if (androidx.compose.runtime.b.d()) {
                    c = 1957;
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                } else {
                    c = 1957;
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.P;
                str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                i3 = -1;
                i2 = i7;
                yqv0.c(str4, H2, j2, null, null, 0, 0, null, 0, false, 0, 3, null, frv0Var, M, 0, 48, 6136);
                M = M;
            }
            M.j();
            int i8 = i2 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1666131268, i8, i3, "com.vk.community.design.compose.widget.donation.getProgressText (DonationWidgetContent.kt:83)");
            }
            String b = b(i6, str2);
            String b2 = b(i5, str2);
            String O = d370.O(R.string.money_transfer_collected, new Object[]{b, b2}, M);
            int O2 = drm0.O(0, 6, O, b2);
            us2.b b3 = xga0.b(870665905, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, i3, str);
            }
            iyk0 iyk0Var = rrv0.c;
            wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int m = b3.m(wuv0Var2.l0.a.a);
            try {
                b3.g(O.substring(0, b.length()));
                s3q0 s3q0Var = s3q0.a;
                b3.k(m);
                b3.g(O.substring(b.length(), O2));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, str);
                }
                wuv0 wuv0Var3 = (wuv0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                m = b3.m(wuv0Var3.l0.a.a);
                try {
                    b3.g(O.substring(O2, b2.length() + O2));
                    b3.k(m);
                    b3.g(O.substring(b2.length() + O2, O.length()));
                    b3.g(" • ");
                    int i9 = aVar.i;
                    if (androidx.compose.runtime.b.d()) {
                        i4 = 0;
                        androidx.compose.runtime.b.f(-1462260074, 0, -1, "com.vk.community.design.compose.widget.donation.getBackersText (DonationWidgetContent.kt:109)");
                    } else {
                        i4 = 0;
                    }
                    if (i9 > 0) {
                        M.K(1663499210);
                        a2 = d370.F(R.plurals.money_transfer_backers, i9, new Object[]{a.format(i9)}, M, i4);
                        M.j();
                    } else {
                        a2 = zq.a(M, 1663662952, R.string.money_transfer_zero_backers, M, i4);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b3.g(a2);
                    us2 n = b3.n();
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar6 = M;
                    int i10 = i4;
                    q630.a aVar7 = aVar3;
                    yqv0.d(n, aVar7, wlb0.h(M).getText().m, 0, null, 0, false, 0, null, null, wlb0.l(M).i0, aVar6, 48, 0, 8184);
                    M = aVar6;
                    q630 H3 = s200.H(aVar7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5);
                    float f3 = aVar.f;
                    if (i6 >= i5) {
                        M.K(236717200);
                        j = wlb0.h(M).m().f;
                    } else {
                        M.K(236718542);
                        j = wlb0.h(M).m().a;
                    }
                    M.j();
                    bev0.a(f3, 48, 0, j, M, H3);
                    String str5 = aVar.c;
                    if (str5 == null) {
                        M.K(-1251601354);
                        M.j();
                        izsVar2 = izsVar;
                    } else {
                        M.K(-1251601353);
                        q630 H4 = s200.H(aVar7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7);
                        ButtonSize buttonSize = ButtonSize.Small;
                        ButtonStyle buttonStyle = ButtonStyle.Secondary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        int i11 = (i8 == 4 ? 1 : i10) | ((i2 & 896) != 256 ? i10 : 1);
                        Object x = M.x();
                        if (i11 != 0 || x == a.C0011a.a) {
                            izsVar2 = izsVar;
                            x = new ks2(11, aVar, izsVar2);
                            M.R(x);
                        } else {
                            izsVar2 = izsVar;
                        }
                        bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, H4, null, false, false, null, null, null, str5, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                        M = M;
                        M.j();
                    }
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } finally {
                }
            } finally {
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wn7(aVar, izsVar2, i, 5);
        }
    }

    public static final String b(int i, String str) {
        String format = a.format(Integer.valueOf(i));
        return epx.f(ply.a(), "en") ? fo8.a(str, format) : v1v.a(' ', format, str);
    }
}
