package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.phw;
import xsna.q630;

/* compiled from: ConfigureListItemView.kt */
/* loaded from: classes18.dex */
public final class h0j {
    public static final void a(final long j, final String str, final String str2, final String str3, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(2013666030);
        int i2 = i | (M.p(j) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.J(str3) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192) | 196608;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2013666030, i2, -1, "com.vk.ecomm.configureitemlist.presentation.list.ConfigureItemListItemView (ConfigureListItemView.kt:25)");
            }
            float f = kqu0.s;
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar3);
            boolean z = true;
            lg90 l = fwu0.l(null, str, null, null, M, i2 & 112, 61);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.g.a(phw.a.a(l, new rek0(ylu0Var.getBackground().x), null, null, null, M, 196616, 28), Cell$Left.Main.Size.Medium, null, null, null, M, 12582960, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), null, M, 2);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(str2, null, null, 1, null, null, M, ((i2 >> 6) & 14) | 12610560, 102), Cell$Middle.c.b.b(str3, 0, null, null, null, M, ((i2 >> 9) & 14) | 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            }
            lg90 b = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.configure_item_list_accessibility_remove_button, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getIcon().l;
            boolean z2 = (57344 & i2) == 16384;
            if ((i2 & 14) != 4) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new f0j(0, j, izsVar);
                M.R(x);
            }
            wiu0.b(F, false, a, a2, com.vk.core.compose.component.cell.content.p.a(b, j2, 0L, N, (gzs) x, null, M, 1572872, 36), null, null, M, 0, 98);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(j, str, str2, str3, izsVar, q630Var2, i) { // from class: xsna.g0j
                public final /* synthetic */ long b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    h0j.a(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
