package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: BookingRecordCompletedScreen.kt */
/* loaded from: classes18.dex */
public final class fu7 {
    public static final void a(mu7 mu7Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1953081582);
        int i2 = (M.J(mu7Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1953081582, i2, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreen (BookingRecordCompletedScreen.kt:75)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new qu(mu7Var, 8);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new eu7(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(-877923546, new du7(), M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new br0(i, 2, (Object) mu7Var, izsVar, q630Var2);
        }
    }

    public static final void b(vu7 vu7Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1244266103);
        int i2 = (M.J(vu7Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1244266103, i2, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.Content (BookingRecordCompletedScreen.kt:101)");
            }
            if (vu7Var.c) {
                M.K(-1931022414);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new yt7(izsVar, 0);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                boolean z2 = i3 == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new zn1(izsVar, 3);
                    M.R(x2);
                }
                gzs gzsVar2 = (gzs) x2;
                boolean z3 = i3 == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new y87(izsVar, 1);
                    M.R(x3);
                }
                izs izsVar2 = (izs) x3;
                av7 av7Var = vu7Var.b;
                alk.a(gzsVar, gzsVar2, izsVar2, sni.s(av7Var != null ? av7Var.e : null), cq.b("cancel_record_confirmation_dialog", null, 3), M, 0);
            } else {
                M.K(-1936045685);
            }
            M.j();
            jai c = kai.c(683451966, new com.vk.movika.tools.controls.seekbar.l(izsVar, 2), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(null, c, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-389765165, new zt7(0, vu7Var, izsVar), M), M, 805306416, 381);
            if (vu7Var.e) {
                M.K(-1928582125);
                zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, SpinnerSize.Size56, null, M, 12582918, 382);
            } else {
                M.K(-1936045685);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new au7(vu7Var, izsVar, i, 0);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1185476236);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1185476236, i2, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.Footer (BookingRecordCompletedScreen.kt:214)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getImage().a;
            float f = 12;
            uog0 d = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            y18 a = aqw.a(1, j2);
            q630 m = hr80.m(q630Var, j, d);
            r630 r630Var = new r630(a, f);
            q630.a aVar3 = q630.a.a;
            q630 g = m.g(bu00.f(aVar3, r630Var));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 f2 = txj0.f(aVar3, 1.0f);
            float f3 = 16;
            q630 E = ahn.E(s200.G(f2, f3, 17, f3, f3), "cta_button");
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            String N = d370.N(R.string.booking_record_completed_action_text, 0, M);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new wn1(izsVar, 2);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, 28080, 0, 0, 4190176);
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
            s.d = new bu7(izsVar, q630Var, i);
        }
    }

    public static final void d(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2111980550);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2111980550, i2, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.Logo (BookingRecordCompletedScreen.kt:243)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ldu0.b(phw.a.a(fwu0.l(str, null, null, null, M, i2 & 14, 62), null, null, null, null, M, 196616, 30), 72, null, null, null, false, null, null, null, M, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-823805944, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CheckCircleFill28> (VkIcons.kt:1224)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_check_circle_fill_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 4;
            vjw.a(a, null, ra8.a.b(kci.l(txj0.q(q630.a.a, 24), f, f), dt1.a.j), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cu7(str, q630Var, i, 0);
        }
    }

    public static final void e(vu7 vu7Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1748698077);
        int i2 = i | (M.J(vu7Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1748698077, i2, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.RecordTitle (BookingRecordCompletedScreen.kt:172)");
            }
            String str = vu7Var.g.b;
            dt1.a.getClass();
            d(str, new gcv(dt1.a.o), M, 0);
            float f = 16;
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, f), M, 6);
            yqv0.c(d370.O(R.string.booking_record_completed_title_text, new Object[]{vu7Var.g.a}, M), ahn.E(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), "screen_title"), wlb0.h(M).getText().m, null, null, 0, 3, null, 2, false, 0, 6, null, wlb0.l(M).f, M, 100663344, 48, 5816);
            M = M;
            String str2 = vu7Var.h;
            if (str2 != null) {
                M.K(-1805266614);
                f9t.e(txj0.h(aVar2, 6), M, 6);
                yqv0.c(str2, ahn.E(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), "screen_address"), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 48, 0, 8120);
                M = M;
            } else {
                M.K(-1813630817);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.s(vu7Var, i, 2);
        }
    }
}
