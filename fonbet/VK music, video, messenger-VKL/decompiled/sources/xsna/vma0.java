package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionAction;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.gna0;
import xsna.phw;
import xsna.q630;

/* compiled from: PinReviewManageServiceContent.kt */
/* loaded from: classes18.dex */
public final class vma0 {
    public static final void a(izs<? super rma0, s3q0> izsVar, SubscriptionAction subscriptionAction, androidx.compose.runtime.a aVar, int i) {
        boolean z;
        androidx.compose.runtime.a M = aVar.M(793703639);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.o(subscriptionAction.ordinal()) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(793703639, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.ActionButton (PinReviewManageServiceContent.kt:264)");
            }
            SubscriptionAction subscriptionAction2 = SubscriptionAction.Suspend;
            q630.a aVar2 = q630.a.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (subscriptionAction == subscriptionAction2) {
                M.K(1430343278);
                q630 D = s200.D(txj0.f(ahn.E(aVar2, "suspend_button"), 1.0f), 12);
                String N = d370.N(R.string.pin_review_suspend_subscription_action, 0, M);
                ButtonSize buttonSize = ButtonSize.Large;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Negative;
                z = (i2 & 14) == 4;
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new h97(izsVar, 7);
                    M.R(x);
                }
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, D, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                M = M;
                M.j();
            } else {
                if (subscriptionAction == SubscriptionAction.Resume) {
                    M.K(1430900565);
                    q630 D2 = s200.D(txj0.f(ahn.E(aVar2, "resume_button"), 1.0f), 12);
                    String N2 = d370.N(R.string.pin_review_resume_subscription_action, 0, M);
                    ButtonSize buttonSize2 = ButtonSize.Large;
                    ButtonStyle buttonStyle2 = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                    z = (i2 & 14) == 4;
                    Object x2 = M.x();
                    if (z || x2 == c0012a) {
                        x2 = new fr0(izsVar, 6);
                        M.R(x2);
                    }
                    bhu0.e((gzs) x2, buttonSize2, buttonStyle2, buttonAppearance2, D2, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                    M = M;
                } else {
                    M.K(1420460075);
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new do7(izsVar, subscriptionAction, i, 6);
        }
    }

    public static final void b(n80 n80Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(106476985);
        int i2 = (M.J(n80Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(106476985, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.ActiveSubscriptionInfo (PinReviewManageServiceContent.kt:128)");
            }
            e(d370.N(R.string.pin_review_service_price_title, 0, M), n80Var.a, "suscription_next_payment_title", "suscription_next_payment_value", M, 3456);
            e(d370.N(R.string.pin_review_service_next_payment_date_title, 0, M), n80Var.b, "suscription_next_payment_date_title", "suscription_next_payment_date_value", M, 3456);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dr0(n80Var, i, 8);
        }
    }

    public static final void c(String str, us2 us2Var, androidx.compose.runtime.a aVar, int i) {
        String str2;
        us2 us2Var2;
        androidx.compose.runtime.a M = aVar.M(624445198);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(us2Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(624445198, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.AdditionalInfoAboutSubscription (PinReviewManageServiceContent.kt:235)");
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(905875124, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-InfoCircleOutline28> (VkSdkIcons.kt:1278)");
            }
            lg90 b = or.b(M, 1646480040, R.drawable.vk_icon_info_circle_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a = com.vk.core.compose.component.cell.content.f.a(b, size, ylu0Var.getIcon().a, null, null, M, 196664, 24);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ow60(5);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(str, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, M, (i2 & 14) | 12582912, 94);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new juz(8);
                M.R(x2);
            }
            us2Var2 = us2Var;
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.c.b.a(us2Var2, null, 0, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, M, ((i2 >> 3) & 14) | 805306368, 446);
            M = M;
            str2 = str;
            wiu0.b(null, false, a, Cell$Middle.a.a(a2, a3, null, null, M, 196608, 28), null, null, null, M, 0, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            us2Var2 = us2Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yku(str2, us2Var2, i, 5);
        }
    }

    public static final void d(String str, String str2, String str3, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1750596880);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1750596880, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.CommunityHeader (PinReviewManageServiceContent.kt:148)");
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
            phw a = phw.a.a(fwu0.l(null, str, null, null, M, (i2 << 3) & 112, 61), null, null, null, null, M, 196616, 30);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new x620(11);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(a, size, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 100663344, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new kl60(6);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(str2, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, M, ((i2 >> 3) & 14) | 12582912, 94);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new sux(11);
                M.R(x3);
            }
            wiu0.b(null, false, a2, Cell$Middle.a.a(a3, Cell$Middle.c.b.b(str3, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, ((i2 >> 6) & 14) | 12582912, 94), null, null, M, 196608, 28), null, null, null, M, 0, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fjh(i, 3, str, str2, str3);
        }
    }

    public static final void e(final String str, final String str2, String str3, final String str4, androidx.compose.runtime.a aVar, final int i) {
        String str5;
        androidx.compose.runtime.a M = aVar.M(519252692);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(519252692, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.InfoBlock (PinReviewManageServiceContent.kt:180)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                str5 = str3;
                x = new com.vk.movika.sdk.base.observable.a0(str5, 2);
                M.R(x);
            } else {
                str5 = str3;
            }
            com.vk.core.compose.component.cell.content.y0 a = o.c.a(com.vk.core.compose.component.cell.content.m.a(str2, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, ((i2 >> 3) & 14) | 384, 0), null, null, null, null, M, 62);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new cws(str4, 29);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(str, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, M, 12582912 | (i2 & 14), 94);
            M = M;
            wiu0.b(null, false, null, Cell$Middle.a.a(a2, null, null, null, M, 196608, 30), a, null, null, M, 0, 103);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str5 = str3;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final String str6 = str5;
            s.d = new wzs(str, str2, str6, str4, i) { // from class: xsna.uma0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3457);
                    vma0.e(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(g770 g770Var, izs<? super rma0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-557762042);
        int i2 = (M.J(g770Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-557762042, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.NotSubscriptionBuyerInfo (PinReviewManageServiceContent.kt:90)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            jqu0.a(s200.E(q630.a.a, 16, 4), ylu0Var.p().a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 12);
            String str = g770Var.a;
            CharSequence charSequence = g770Var.b;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new od00(izsVar, 1);
                M.R(x);
            }
            c(str, ws2.d(charSequence, (izs) x), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zjm(g770Var, izsVar, i, 6);
        }
    }

    public static final void g(gna0.a aVar, izs<? super rma0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(278782149);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(278782149, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.PinReviewManageServiceContent (PinReviewManageServiceContent.kt:56)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            d(aVar.e, aVar.d, aVar.f, M, 0);
            f9t.e(txj0.h(aVar3, 2), M, 6);
            e(d370.N(R.string.pin_review_service_name_title, 0, M), aVar.c, "suscription_name_title", "suscription_name_value", M, 3456);
            e(d370.N(R.string.pin_review_service_status_title, 0, M), aVar.b.a((Context) M.r(AndroidCompositionLocals_androidKt.b)).toString(), "suscription_status_title", "suscription_status_value", M, 3456);
            n80 n80Var = aVar.i;
            if (n80Var == null) {
                M.K(-321714172);
            } else {
                M.K(-321714171);
                b(n80Var, M, 0);
            }
            M.j();
            rkn0 rkn0Var = aVar.j;
            if (rkn0Var == null) {
                M.K(-321638687);
            } else {
                M.K(-321638686);
                i(rkn0Var, M, 0);
            }
            M.j();
            rxm0 rxm0Var = aVar.g;
            if (rxm0Var == null) {
                M.K(-321563109);
            } else {
                M.K(-321563108);
                h(rxm0Var, izsVar, M, i2 & 112);
            }
            M.j();
            g770 g770Var = aVar.h;
            if (g770Var == null) {
                M.K(-321479688);
            } else {
                M.K(-321479687);
                f(g770Var, izsVar, M, i2 & 112);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mq1(aVar, izsVar, i, 7);
        }
    }

    public static final void h(rxm0 rxm0Var, izs<? super rma0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1896339102);
        int i2 = (M.J(rxm0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1896339102, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.SubscriptionBuyerInfo (PinReviewManageServiceContent.kt:110)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new pl9(izsVar, 2);
                M.R(x);
            }
            a((izs) x, rxm0Var.c, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fdc(rxm0Var, izsVar, i, 7);
        }
    }

    public static final void i(rkn0 rkn0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1474387691);
        int i2 = (M.J(rkn0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1474387691, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.SuspendedSubscriptionInfo (PinReviewManageServiceContent.kt:118)");
            }
            e(d370.N(R.string.pin_review_service_price_when_resume_title, 0, M), rkn0Var.a, "suscription_resume_payment_title", "suscription_resume_payment_value", M, 3456);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gd4(rkn0Var, i, 6);
        }
    }
}
