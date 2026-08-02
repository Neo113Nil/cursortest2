package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vkontakte.android.R;
import xsna.phw;
import xsna.q630;
import xsna.xpv;

/* compiled from: BookingMasterItem.kt */
/* loaded from: classes18.dex */
public final class vq7 {
    public static final void a(BookingMaster bookingMaster, q630 q630Var, com.vk.core.compose.component.cell.content.o oVar, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        androidx.compose.runtime.a aVar2;
        q630 q630Var3;
        String str;
        int i4;
        int i5;
        efj a;
        androidx.compose.runtime.a aVar3;
        int i6;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        com.vk.core.compose.component.cell.content.h1 h1Var2;
        com.vk.core.compose.component.cell.content.h1 a2;
        int i7 = bookingMaster.h;
        String str2 = bookingMaster.i;
        androidx.compose.runtime.a M = aVar.M(1692476322);
        int i8 = i | (M.J(bookingMaster) ? 4 : 2);
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 = i8 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i8 | (M.J(q630Var2) ? 32 : 16);
        }
        int i10 = i3 | (M.J(oVar) ? 256 : 128);
        if (M.t(i10 & 1, (i10 & 147) != 146)) {
            q630 q630Var4 = i9 != 0 ? q630.a.a : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1692476322, i10, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingMasterItem (BookingMasterItem.kt:29)");
            }
            if (str2.length() == 0) {
                M.K(1941296240);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2106424732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-User28> (VkSdkIcons.kt:3542)");
                }
                lg90 b = or.b(M, -1267804465, R.drawable.vk_icon_user_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long c = l5g.c(14, ylu0Var.getIcon().a, 0.4f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rek0 rek0Var = new rek0(ylu0Var2.getBackground().p);
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i4 = -1;
                i5 = 0;
                a = xpv.a.a(b, c, rek0Var, M, 24584, 8);
                aVar3 = M;
                aVar3.j();
            } else {
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                M.K(1941601714);
                lg90 l = fwu0.l(str2, null, null, null, M, 0, 62);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rek0 rek0Var2 = new rek0(ylu0Var3.getBackground().x);
                i4 = -1;
                i5 = 0;
                a = phw.a.a(l, rek0Var2, null, null, null, M, 196616, 28);
                aVar3 = M;
                aVar3.j();
            }
            String str3 = str;
            androidx.compose.runtime.a aVar4 = aVar3;
            com.vk.core.compose.component.cell.content.i0 a3 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.e.a(a, Cell$Left.Main.Size.Medium, null, null, null, null, null, aVar4, 100663344, 252), null, aVar4, 2);
            int i11 = i10 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1424011272, i11, i4, "com.vk.ecomm.onlinebooking.impl.common.ui.getMasterInfo (BookingMasterItem.kt:57)");
            }
            int i12 = i7 > 0 ? 1 : i5;
            com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.d.b.a(bookingMaster.c, null, null, 1, cq.b("master_name", null, 3), null, aVar4, 12585984, 86);
            androidx.compose.runtime.a aVar5 = aVar4;
            if (i12 != 0) {
                aVar5.K(-1619723330);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(574979876, i11, i4, "com.vk.ecomm.onlinebooking.impl.common.ui.getMasterVotes (BookingMasterItem.kt:81)");
                }
                String F = d370.F(R.plurals.booking_votes, i7, new Object[]{bookingMaster.g, Integer.valueOf(i7)}, aVar5, i5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(171813404, i5, i4, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
                }
                lg90 b2 = or.b(aVar5, -1107727797, R.drawable.vk_icon_favorite_16, aVar5, i5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, i4, str3);
                }
                ylu0 ylu0Var4 = (ylu0) aVar5.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i6 = 3;
                com.vk.core.compose.component.cell.content.h1 b3 = Cell$Middle.c.b.b(F, 0, com.vk.core.compose.component.cell.content.h.a(b2, ylu0Var4.q().i, aVar5, 24584, 12), null, cq.b("master_rating", null, 3), aVar5, 12582912, 86);
                aVar5 = aVar5;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                h1Var = b3;
            } else {
                i6 = 3;
                aVar5.K(1328211541);
                aVar5.j();
                h1Var = null;
            }
            if (i12 != 0) {
                aVar5.K(-1619721017);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-94776356, i11, i4, "com.vk.ecomm.onlinebooking.impl.common.ui.getMasterSpecialization (BookingMasterItem.kt:72)");
                }
                String str4 = bookingMaster.e;
                if (str4 == null) {
                    aVar5.K(-1688773800);
                    aVar5.j();
                    a2 = null;
                } else {
                    aVar5.K(-1688773799);
                    a2 = Cell$Middle.b.a.a(str4, 2, com.vk.core.compose.component.semantics.b.a(null, new t62("master_description", 1), i6), aVar5, 24624, 4);
                    aVar5.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                h1Var2 = a2;
            } else {
                aVar5.K(1328291893);
                aVar5.j();
                h1Var2 = null;
            }
            androidx.compose.runtime.a aVar6 = aVar5;
            com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(a4, h1Var, h1Var2, null, aVar6, 196608, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wiu0.b(ahn.E(s200.H(q630Var4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 7), "master_cell"), false, a3, a5, oVar, null, null, aVar6, (i10 << 6) & 57344, 98);
            aVar2 = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new uq7(bookingMaster, q630Var3, oVar, i, i2);
        }
    }
}
