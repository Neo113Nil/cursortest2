package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.xpv;

/* compiled from: BookingAnyMasterItem.kt */
/* loaded from: classes18.dex */
public final class pm7 {
    public static final void a(q630 q630Var, com.vk.core.compose.component.cell.content.o oVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        com.vk.core.compose.component.cell.content.o oVar2;
        int i3;
        gzs<s3q0> gzsVar2;
        int i4;
        q630 q630Var3;
        gzs<s3q0> gzsVar3;
        androidx.compose.runtime.a M = aVar.M(591378673);
        int i5 = i2 & 1;
        if (i5 != 0) {
            oVar2 = oVar;
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = i | (M.J(q630Var2) ? 4 : 2);
            oVar2 = oVar;
        } else {
            q630Var2 = q630Var;
            oVar2 = oVar;
            i3 = i;
        }
        int i6 = i3 | (M.J(oVar2) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            gzsVar2 = gzsVar;
        } else {
            gzsVar2 = gzsVar;
            i4 = i6 | (M.y(gzsVar2) ? 256 : 128);
        }
        int i8 = i4;
        if (M.t(i8 & 1, (i8 & 147) != 146)) {
            q630.a aVar2 = q630.a.a;
            q630 q630Var4 = i5 != 0 ? aVar2 : q630Var2;
            if (i7 != 0) {
                gzsVar2 = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(591378673, i8, -1, "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingAnyMasterItem (BookingAnyMasterItem.kt:23)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(615920770, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Users328> (VkIcons.kt:11364)");
            }
            lg90 b = or.b(M, 795536937, R.drawable.vk_icon_users_3_28, M, 0);
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
            long c2 = l5g.c(14, ylu0Var.getIcon().a, 0.4f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gzs<s3q0> gzsVar4 = gzsVar2;
            com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.e.a(xpv.a.a(b, c2, new rek0(ylu0Var2.getBackground().p), M, 24584, 8), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252), null, M, 2);
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.booking_master_any_name, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            M.K(-992472829);
            q630 H = s200.H(q630Var4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 7);
            q630 q630Var5 = q630Var4;
            if (gzsVar4 != null) {
                boolean z = (i8 & 896) == 256;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new nm7(0, gzsVar4);
                    M.R(x);
                }
                H = H.g(ojc.c(aVar2, false, null, null, (gzs) x, 15));
            }
            M.j();
            wiu0.b(H, false, a2, a3, oVar2, null, null, M, (i8 << 9) & 57344, 98);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gzsVar3 = gzsVar4;
            q630Var3 = q630Var5;
        } else {
            M.h();
            q630Var3 = q630Var2;
            gzsVar3 = gzsVar2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new om7(q630Var3, oVar, gzsVar3, i, i2);
        }
    }
}
