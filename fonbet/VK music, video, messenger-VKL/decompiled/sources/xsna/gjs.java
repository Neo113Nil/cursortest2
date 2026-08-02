package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import xsna.kb70;
import xsna.q630;

/* compiled from: FriendRequestNotification.kt */
/* loaded from: classes4.dex */
public final class gjs {
    public static final void a(kb70.c cVar, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs<? super snv, s3q0> izsVar2;
        com.vk.core.compose.component.cell.content.y0 y0Var;
        androidx.compose.runtime.a M = aVar.M(-428417614);
        if ((i & 6) == 0) {
            i2 = i | (M.J(cVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-428417614, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.FriendRequestNotification (FriendRequestNotification.kt:28)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            int i3 = i2;
            x770 x770Var = new x770(cVar, izsVar);
            int i4 = cVar.d;
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.e.a(x770Var, Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252), null, M, 2);
            String obj = cVar.a.a(context).toString();
            VkTypographyToken vkTypographyToken = VkTypographyToken.SubheadMedium;
            VkColorToken vkColorToken = VkColorToken.TextPrimary;
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(zs2.a(obj, bkt0.c(new klv0(vkTypographyToken, vkColorToken), M)), null, null, null, 1, 0, null, null, null, M, 24576, 6, 1006);
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.c.b.a(zs2.a(cVar.b.a(context).toString(), bkt0.c(new klv0(VkTypographyToken.SubheadNormal, vkColorToken), M)), null, 1, 2, null, null, null, null, M, 805309824, 498);
            M = M;
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(b, a2, null, null, M, 196608, 28);
            if (i4 > 0) {
                M.K(607575289);
                com.vk.core.compose.component.cell.content.y0 a4 = o.c.a(com.vk.core.compose.component.cell.content.l.a(i4, CounterAppearance.Design.Accent, M, 24624), null, null, null, null, M, 62);
                M.j();
                y0Var = a4;
            } else {
                M.K(1655131339);
                M.j();
                y0Var = null;
            }
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                izsVar2 = izsVar;
                x = new lv7(izsVar2, 4);
                M.R(x);
            } else {
                izsVar2 = izsVar;
            }
            wiu0.b(q630.a.a, false, a, a3, y0Var, (gzs) x, null, M, 6, 66);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z0(cVar, izsVar2, i, 2);
        }
    }
}
