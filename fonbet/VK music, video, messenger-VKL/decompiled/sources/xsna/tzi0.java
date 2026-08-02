package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: SettingCell.kt */
/* loaded from: classes7.dex */
public final class tzi0 {
    public static final void a(uzi0 uzi0Var, gzs<s3q0> gzsVar, q630 q630Var, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i, int i2) {
        gzs<s3q0> gzsVar3;
        int i3;
        androidx.compose.runtime.a aVar2;
        gzs<s3q0> gzsVar4;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        gzs<s3q0> gzsVar5;
        com.vk.core.compose.component.cell.content.o a;
        androidx.compose.runtime.a aVar3;
        tlo0 tlo0Var = uzi0Var.b;
        androidx.compose.runtime.a M = aVar.M(2134309835);
        int i4 = i | (M.J(uzi0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            gzsVar3 = gzsVar2;
        } else {
            gzsVar3 = gzsVar2;
            i3 = i4 | (M.y(gzsVar3) ? 2048 : 1024);
        }
        int i6 = i3;
        if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
            gzs<s3q0> gzsVar6 = i5 != 0 ? null : gzsVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2134309835, i6, -1, "com.vk.video.ui.upload.impl.publish.presentation.common.compose.settingcell.SettingCell (SettingCell.kt:22)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630 f = txj0.f(q630Var, 1.0f);
            tlo0.f fVar = uzi0Var.a;
            fVar.getClass();
            androidx.compose.runtime.a aVar4 = M;
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(tlo0.b.a(fVar, context).toString(), null, null, 1, null, null, aVar4, 12610560, 102);
            if (tlo0Var != null) {
                aVar4.K(528998287);
                com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(tlo0Var.a(context).toString(), 1, null, null, null, aVar4, 12583344, 120);
                aVar4 = aVar4;
                aVar4.j();
                h1Var = b;
            } else {
                aVar4.K(529228307);
                aVar4.j();
                h1Var = null;
            }
            androidx.compose.runtime.a aVar5 = aVar4;
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a2, h1Var, null, null, aVar5, 196608, 28);
            if (uzi0Var.c) {
                aVar5.K(529321679);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-78024716, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline24> (VkSdkIcons.kt:270)");
                }
                lg90 b2 = or.b(aVar5, -856830611, R.drawable.vk_icon_cancel_outline_24, aVar5, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                gzs<s3q0> gzsVar7 = gzsVar6;
                a = com.vk.core.compose.component.cell.content.p.a(b2, ylu0Var.getIcon().l, 0L, d370.N(R.string.setting_cell_reset_talkback, 0, aVar5), gzsVar7, null, aVar5, 1572872 | ((i6 << 3) & 57344), 36);
                gzsVar5 = gzsVar7;
                aVar3 = aVar5;
                aVar3.j();
            } else {
                gzsVar5 = gzsVar6;
                aVar5.K(529617853);
                Object x = aVar5.x();
                if (x == a.C0011a.a) {
                    x = new d4r(28);
                    aVar5.R(x);
                }
                a = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), 0L, false, aVar5, 196608, 27);
                aVar3 = aVar5;
                aVar3.j();
            }
            androidx.compose.runtime.a aVar6 = aVar3;
            wiu0.b(f, false, null, a3, a, gzsVar, null, aVar6, (i6 << 12) & 458752, 70);
            aVar2 = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gzsVar4 = gzsVar5;
        } else {
            aVar2 = M;
            aVar2.h();
            gzsVar4 = gzsVar3;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new yq8(uzi0Var, gzsVar, q630Var, gzsVar4, i, i2);
        }
    }
}
