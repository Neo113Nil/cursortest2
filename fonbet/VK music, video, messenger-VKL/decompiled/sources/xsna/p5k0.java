package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: SmartCropSwitch.kt */
/* loaded from: classes7.dex */
public final class p5k0 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-1709597779);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1709597779, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.smartcropswitch.SmartCropSwitch (SmartCropSwitch.kt:25)");
            }
            q630 E = ahn.E(txj0.f(q630Var, 1.0f), "SmartCropTestTags.SMART_CROP_SWITCH");
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(713641218, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-StarsOutline28> (VkIcons.kt:10340)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_stars_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(a, size, ylu0Var.getIcon().b, null, null, M, 196664, 24), null, M, 2);
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.smart_crop_switch_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(d370.N(R.string.smart_crop_switch_subtitle, 0, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new tvi0(z);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.t0 a4 = com.vk.core.compose.component.cell.content.n.a(z, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, i3 | 24576, 6);
            boolean z3 = ((i2 & 112) == 32) | (i3 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new ff4(2, izsVar, z);
                M.R(x2);
            }
            wiu0.b(E, false, a2, a3, a4, (gzs) x2, null, M, 0, 66);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, izsVar, q630Var, z) { // from class: xsna.o5k0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ q630 d;

                {
                    this.b = z;
                    this.c = izsVar;
                    this.d = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p5k0.a(ne7.I(385), (androidx.compose.runtime.a) obj, this.c, this.d, this.b);
                    return s3q0.a;
                }
            };
        }
    }
}
