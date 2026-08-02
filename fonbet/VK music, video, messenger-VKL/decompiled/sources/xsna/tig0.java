package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ReviewsModalBottomSheetContent.kt */
/* loaded from: classes18.dex */
public final class tig0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1147959960);
        int i3 = i & 6;
        r9g r9gVar = r9g.a;
        if (i3 == 0) {
            i2 = (M.J(r9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1147959960, i2, -1, "com.vk.ecomm.reviews.impl.bottomsheets.FAQButton (ReviewsModalBottomSheetContent.kt:126)");
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 8), M, 6);
            dt1.a.getClass();
            q630 E = ahn.E(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.C(r9gVar.b(aVar3, dt1.a.o), null, 3)), "faqButton");
            String N = d370.N(R.string.create_community_review_success_result_dialog_faqButton, 0, M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dp0(17, izsVar, str);
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
            s.d = new tq8(izsVar, str, i, 6);
        }
    }

    public static final void b(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(217028986);
        int i2 = i | (M.J(str) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(217028986, i2, -1, "com.vk.ecomm.reviews.impl.bottomsheets.Message (ReviewsModalBottomSheetContent.kt:143)");
            }
            f9t.e(txj0.h(q630.a.a, 8), M, 6);
            dt1.a.getClass();
            q630 E = ahn.E(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new gcv(dt1.a.o)), "message");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.e0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, ylu0Var.getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, (i2 >> 3) & 14, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new te1(str, i, 11);
        }
    }

    public static final void c(final int i, final int i2, androidx.compose.runtime.a aVar, final izs izsVar) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1760332640);
        if ((i2 & 48) == 0) {
            i3 = (M.y(izsVar) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1760332640, i3, -1, "com.vk.ecomm.reviews.impl.bottomsheets.PrimaryButton (ReviewsModalBottomSheetContent.kt:108)");
            }
            q630 E = ahn.E(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), "primaryButton");
            String N = d370.N(i, (i3 >> 6) & 14, M);
            int i4 = i3;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = (i4 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new t9d(izsVar, 3);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, 28080, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.sig0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    tig0.c(i, I, (androidx.compose.runtime.a) obj, izsVar);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final lg90 lg90Var, q630 q630Var, final String str, final String str2, final String str3, final Integer num, final Integer num2, final izs izsVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        int i2;
        String str4;
        q630.a aVar2;
        int i3;
        int i4;
        q630 q630Var3;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1017907271);
        int i6 = i | (M.y(lg90Var) ? 4 : 2) | 48 | (M.J(str) ? 256 : 128) | (M.J(str2) ? 2048 : 1024) | (M.J(str3) ? 16384 : 8192) | (M.J(num) ? 131072 : 65536) | (M.J(num2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar) ? 8388608 : 4194304) | (M.l(z) ? 67108864 : 33554432);
        if (M.t(i6 & 1, (38347923 & i6) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1017907271, i6, -1, "com.vk.ecomm.reviews.impl.bottomsheets.ReviewsModalBottomSheetContent (ReviewsModalBottomSheetContent.kt:43)");
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
            if (z) {
                M.K(-30402095);
                q630 E = ahn.E(s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new gcv(dt1.a.p)), "closeButton");
                if (androidx.compose.runtime.b.d()) {
                    q630Var3 = E;
                    i5 = 0;
                    androidx.compose.runtime.b.f(-1589335940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel20> (VkSdkIcons.kt:216)");
                } else {
                    q630Var3 = E;
                    i5 = 0;
                }
                lg90 b = or.b(M, -187349011, R.drawable.vk_icon_cancel_20, M, i5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.reviews_bottom_sheet_close, i5, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i2 = i6;
                long j = ylu0Var.getIcon().l;
                boolean z2 = (i2 & 29360128) == 8388608;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new oe1(izsVar, 5);
                    M.R(x);
                }
                str4 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i4 = 0;
                aVar2 = aVar3;
                i3 = -1;
                nzu0.c((gzs) x, b, N, q630Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, M, 64, 2000);
                M = M;
            } else {
                i2 = i6;
                str4 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                aVar2 = aVar3;
                i3 = -1;
                i4 = 0;
                M.K(-32355405);
            }
            M.j();
            if (a690.d(aVar2, 8, M, 6)) {
                androidx.compose.runtime.b.f(1040687336, i4, i3, str4);
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(lg90Var, null, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ahn.E(new gcv(dt1.a.o), "image")), ylu0Var2.getIcon().b, M, 56 | (i2 & 14), 0);
            if (str == null) {
                M.K(-29463199);
            } else {
                M.K(-29463198);
                f(str, M, 6);
                s3q0 s3q0Var = s3q0.a;
            }
            M.j();
            if (str2 == null) {
                M.K(-29428417);
            } else {
                M.K(-29428416);
                b(str2, M, 6);
                s3q0 s3q0Var2 = s3q0.a;
            }
            M.j();
            f9t.e(txj0.h(aVar2, 4), M, 6);
            if (str3 == null) {
                M.K(-29335789);
            } else {
                M.K(-29335788);
                a(((i2 >> 18) & 112) | 6, M, str3, izsVar);
                s3q0 s3q0Var3 = s3q0.a;
            }
            M.j();
            f9t.e(txj0.h(aVar2, 28), M, 6);
            if (num == null) {
                M.K(-29226545);
            } else {
                M.K(-29226544);
                c(num.intValue(), ((i2 >> 18) & 112) | 6, M, izsVar);
                s3q0 s3q0Var4 = s3q0.a;
            }
            M.j();
            if (num == null || num2 == null) {
                M.K(-32355405);
                M.j();
            } else {
                M.K(-29119470);
                ck70.b(aVar2, 12, M, 6);
            }
            if (num2 == null) {
                M.K(-29026099);
            } else {
                M.K(-29026098);
                e(num2.intValue(), 6 | ((i2 >> 18) & 112), M, izsVar);
                s3q0 s3q0Var5 = s3q0.a;
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var2, str, str2, str3, num, num2, izsVar, z, i) { // from class: xsna.qig0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ Integer g;
                public final /* synthetic */ Integer h;
                public final /* synthetic */ izs i;
                public final /* synthetic */ boolean j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(9);
                    tig0.d(lg90.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final int i, final int i2, androidx.compose.runtime.a aVar, final izs izsVar) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-199049618);
        if ((i2 & 48) == 0) {
            i3 = (M.y(izsVar) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-199049618, i3, -1, "com.vk.ecomm.reviews.impl.bottomsheets.SecondaryButton (ReviewsModalBottomSheetContent.kt:90)");
            }
            q630 E = ahn.E(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), "secondaryButton");
            String N = d370.N(i, (i3 >> 6) & 14, M);
            int i4 = i3;
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = (i4 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ws0(izsVar, 5);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, 28080, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rig0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    tig0.e(i, I, (androidx.compose.runtime.a) obj, izsVar);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(191598731);
        int i2 = i | (M.J(str) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(191598731, i2, -1, "com.vk.ecomm.reviews.impl.bottomsheets.Title (ReviewsModalBottomSheetContent.kt:158)");
            }
            f9t.e(txj0.h(q630.a.a, 8), M, 6);
            dt1.a.getClass();
            q630 E = ahn.E(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new gcv(dt1.a.o)), "title");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.C;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, ylu0Var.getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, (i2 >> 3) & 14, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s77(str, i, 12);
        }
    }
}
