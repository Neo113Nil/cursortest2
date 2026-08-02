package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: LinkSlotImpl.kt */
/* loaded from: classes5.dex */
public final class paz implements l95 {
    public final wh50 a;

    public paz(AuthorHeaderConfig.Info.InfoSlotData.h hVar) {
        this.a = androidx.compose.runtime.k.b(hVar);
    }

    @Override // xsna.l95
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(835442470);
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(835442470, i2, -1, "com.vk.profile.design.compose.header.info.LinkSlotImpl.Content (LinkSlotImpl.kt:30)");
            }
            izs izsVar = (izs) M.r(h85.a);
            String str = ((AuthorHeaderConfig.Info.InfoSlotData.h) ((zak0) this.a).getValue()).a;
            q630 E = ahn.E(aVar2, "author_header_link");
            boolean J = M.J(str);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new lf5(str, 1);
                M.R(x);
            }
            q630 b = egi0.b(E, false, (izs) x);
            SexyCell$Size sexyCell$Size = SexyCell$Size.Small;
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(300003874, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoChainOutline20> (VkIcons.kt:4474)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_lego_chain_outline_20, 0, M);
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
            com.vk.core.compose.component.cell.content.x a2 = f4j0.a(a, 20, ylu0Var.getIcon().j, M, 196664, 24);
            com.vk.core.compose.component.cell.content.b1 a3 = a1.b.a(a1.g.b.a(str, null, null, 0, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, null, null, null, null, null, M, 2046);
            boolean J2 = M.J(izsVar) | M.J(str);
            Object x2 = M.x();
            if (J2 || x2 == obj) {
                x2 = new fqd(4, izsVar, str);
                M.R(x2);
            }
            mjv0.a(b, a3, a2, null, sexyCell$Size, null, false, (gzs) x2, null, M, 24576, 360);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oaz(this, i);
        }
    }
}
