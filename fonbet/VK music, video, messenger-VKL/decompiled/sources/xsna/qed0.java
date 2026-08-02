package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: PrivacySettingsAcceptableButton.kt */
/* loaded from: classes4.dex */
public final class qed0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(gzs<s3q0> gzsVar, String str, String str2, String str3, androidx.compose.runtime.a aVar, int i, int i2) {
        String str4;
        String str5;
        androidx.compose.runtime.f s;
        int i3;
        SemanticsConfiguration.Mode mode;
        androidx.compose.runtime.a aVar2;
        int i4;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        androidx.compose.runtime.a M = aVar.M(309779119);
        int i5 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(str) ? 32 : 16) | (M.J(str2) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            str4 = str3;
            i5 |= M.J(str4) ? 2048 : 1024;
            if (M.t(i5 & 1, (i5 & 1171) == 1170)) {
                M.h();
                str5 = str4;
            } else {
                if (i6 != 0) {
                    str4 = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(309779119, i5, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsCell (PrivacySettingsAcceptableButton.kt:99)");
                }
                q630 f = txj0.f(q630.a.a, 1.0f);
                boolean z = (i5 & 14) == 4;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new yik(2, gzsVar);
                    M.R(x);
                }
                q630 c = ojc.c(f, false, null, null, (gzs) x, 15);
                int i7 = i5 >> 3;
                int i8 = i7 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                if (androidx.compose.runtime.b.d()) {
                    i3 = 3;
                    androidx.compose.runtime.b.f(1910650509, i8, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.buildMiddlePrivacySettingsCell (PrivacySettingsAcceptableButton.kt:114)");
                } else {
                    i3 = 3;
                }
                String str6 = str4;
                com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str, null, null, 1, null, null, M, (i7 & 14) | 12610560, 102);
                if (str2 != null) {
                    M.K(-2110851960);
                    mode = null;
                    i4 = i3;
                    com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str2, 1, null, null, null, M, ((i8 >> 3) & 14) | 12583344, 120);
                    aVar2 = M;
                    aVar2.j();
                    h1Var = b;
                } else {
                    mode = null;
                    aVar2 = M;
                    i4 = i3;
                    aVar2.K(-1011777040);
                    aVar2.j();
                    h1Var = null;
                }
                Cell$Middle.Size size = Cell$Middle.Size.Medium;
                boolean z2 = (((i7 & 896) ^ 384) > 256 && aVar2.J(str6)) || (i7 & 384) == 256;
                Object x2 = aVar2.x();
                if (z2 || x2 == c0012a) {
                    x2 = new oed0(str6, 0);
                    aVar2.R(x2);
                }
                com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, i4);
                androidx.compose.runtime.a aVar3 = aVar2;
                com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a, h1Var, null, a2, aVar3, 199680, 4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                wiu0.b(c, false, null, a3, o.c.a(null, null, null, d(aVar3), null, aVar3, 55), null, null, aVar3, 0, 102);
                M = aVar3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str5 = str6;
            }
            s = M.s();
            if (s == null) {
                s.d = new tx9(gzsVar, str, str2, str5, i, i2, 1);
                return;
            }
            return;
        }
        str4 = str3;
        if (M.t(i5 & 1, (i5 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void b(final gzs gzsVar, final us2 us2Var, final String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        androidx.compose.runtime.a M = aVar.M(-1054122991);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.J(us2Var) ? 32 : 16) | (M.J(str) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1054122991, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsCell (PrivacySettingsAcceptableButton.kt:137)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new d0h(1, gzsVar);
                M.R(x);
            }
            q630 c = ojc.c(f, false, null, null, (gzs) x, 15);
            int i3 = i2 >> 3;
            int i4 = i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1580920587, i4, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.buildMiddlePrivacySettingsCell (PrivacySettingsAcceptableButton.kt:152)");
            }
            aVar2 = M;
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(us2Var, null, null, null, 1, 2, null, null, null, aVar2, (i3 & 14) | 221184, 6, 974);
            if (str != null) {
                aVar2.K(1153750544);
                h1Var = Cell$Middle.c.b.b(str, 1, null, null, null, aVar2, ((i4 >> 3) & 14) | 12583344, 120);
                aVar2.j();
            } else {
                aVar2.K(1406652776);
                aVar2.j();
                h1Var = null;
            }
            Cell$Middle.Size size = Cell$Middle.Size.Medium;
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = new wl2(str2, 2);
                aVar2.R(x2);
            }
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(b, h1Var, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar2, 199680, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wiu0.b(c, false, null, a, o.c.a(null, null, null, d(aVar2), null, aVar2, 55), null, null, aVar2, 0, 102);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(us2Var, str, str2, i) { // from class: xsna.ped0
                public final /* synthetic */ us2 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    qed0.b(gzs.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, String str, String str2, String str3, gzs gzsVar, boolean z) {
        int i2;
        String str4;
        String str5;
        int i3;
        boolean z2;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        int i4;
        androidx.compose.runtime.a M = aVar.M(898880621);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(str3) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(898880621, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsDonutLevelCell (PrivacySettingsAcceptableButton.kt:31)");
            }
            com.vk.core.compose.component.cell.content.y0 y0Var = null;
            if (z) {
                M.K(-568215600);
                M.j();
                str4 = null;
            } else {
                str4 = zq.a(M, 535857489, R.string.privacy_settings_select_content_description, M, 0);
            }
            int i5 = i2 >> 6;
            int i6 = i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1586504691, i6, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.buildDonutLevelMiddle (PrivacySettingsAcceptableButton.kt:54)");
            }
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str, null, null, 1, null, null, M, (i5 & 14) | 12610560, 102);
            if (str2 != null) {
                M.K(-82371794);
                int i7 = ((i6 >> 3) & 14) | 12583344;
                z2 = false;
                str5 = str4;
                i3 = i2;
                h1Var = Cell$Middle.c.b.b(str2, 1, null, null, null, M, i7, 120);
                M.j();
            } else {
                str5 = str4;
                i3 = i2;
                z2 = false;
                M.K(1741565962);
                M.j();
                h1Var = null;
            }
            Cell$Middle.Size size = Cell$Middle.Size.Medium;
            boolean z3 = z2;
            String str6 = str5;
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, h1Var, null, null, M, 199680, 20);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i8 = (i3 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                i4 = -1;
                androidx.compose.runtime.b.f(1994560541, i8, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.buildDonutLevelRight (PrivacySettingsAcceptableButton.kt:71)");
            } else {
                i4 = -1;
            }
            if (z) {
                M.K(-919345706);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(521903826, z3 ? 1 : 0, i4, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_check_circle_on_24, z3 ? 1 : 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, z3 ? 1 : 0, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().a;
                float f = 24;
                y0Var = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(a3, j, byc0.b(f, f), null, null, null, M, 1576328, 48), null, d(M), null, M, 53);
                M.j();
            } else {
                M.K(-919017696);
                M.j();
            }
            com.vk.core.compose.component.cell.content.y0 y0Var2 = y0Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 q630Var = q630.a.a;
            if (str3 != null) {
                q630Var = ahn.E(q630Var, str3);
            }
            q630 f2 = txj0.f(q630Var, 1.0f);
            boolean J = M.J(str6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (J || x == c0012a) {
                ux9 ux9Var = new ux9(str6, 6);
                M.R(ux9Var);
                obj = ux9Var;
            }
            q630 b = egi0.b(f2, z3, (izs) obj);
            plg0 plg0Var = new plg0(3);
            boolean z4 = (i3 & 14) == 4 ? true : z3 ? 1 : 0;
            Object x2 = M.x();
            Object obj2 = x2;
            if (z4 || x2 == c0012a) {
                x850 x850Var = new x850(gzsVar, 17);
                M.R(x850Var);
                obj2 = x850Var;
            }
            wiu0.b(lai0.b(b, z, true, plg0Var, (gzs) obj2), false, null, a2, y0Var2, null, null, M, 0, 102);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fx7(i, str, str2, str3, gzsVar, z);
        }
    }

    public static final com.vk.core.compose.component.cell.content.u0 d(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1754113515, 0, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.buildRightChevron (PrivacySettingsAcceptableButton.kt:86)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        com.vk.core.compose.component.cell.content.u0 a = o.b.a.a(null, null, ylu0Var.getIcon().l, false, aVar, 196656, 21);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
