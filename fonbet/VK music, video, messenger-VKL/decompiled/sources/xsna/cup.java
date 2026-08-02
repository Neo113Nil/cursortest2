package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: EqualizerPresetRow.kt */
/* loaded from: classes3.dex */
public final class cup {
    public static final void a(int i, boolean z, gzs gzsVar, q630 q630Var, Integer num, androidx.compose.runtime.a aVar, int i2) {
        q630 q630Var2;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-455819052);
        int i4 = i2 | (M.o(i) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072 | (M.J(num) ? 16384 : 8192);
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-455819052, i4, -1, "com.vk.music.design.compose.equalizer.EqualizerPresetRow (EqualizerPresetRow.kt:22)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(d370.N(i, i4 & 14, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            com.vk.core.compose.component.cell.content.x xVar = null;
            if (num == null) {
                M.K(1381702954);
                M.j();
                h1Var = null;
            } else {
                M.K(1381702955);
                com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(d370.N(num.intValue(), 0, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
                h1Var = b;
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, h1Var, null, null, M, 196608, 28);
            androidx.compose.runtime.a aVar3 = M;
            if (z) {
                aVar3.K(1381907865);
                if (androidx.compose.runtime.b.d()) {
                    i3 = -1;
                    androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                } else {
                    i3 = -1;
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_done_24, 0, aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                xVar = com.vk.core.compose.component.cell.content.p.a(a3, ylu0Var.getIcon().a, 0L, null, null, null, aVar3, 1572872, 60);
                aVar3 = aVar3;
                aVar3.j();
            } else {
                aVar3.K(1382088874);
                aVar3.j();
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            wiu0.b(f, false, null, a2, o.c.a(null, xVar, null, null, null, aVar3, 61), gzsVar, null, aVar4, (i4 << 9) & 458752, 70);
            M = aVar4;
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
            s.d = new t7p(i, z, gzsVar, q630Var2, num, i2);
        }
    }
}
