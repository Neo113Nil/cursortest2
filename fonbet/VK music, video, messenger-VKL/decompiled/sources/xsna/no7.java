package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: BookingEditDateCell.kt */
/* loaded from: classes18.dex */
public final class no7 {
    public final mtk0 a;
    public final wh50 b;
    public final long c;

    public no7(izs izsVar, mtk0 mtk0Var) {
        this.a = mtk0Var;
        this.b = androidx.compose.runtime.k.b(izsVar);
        float f = 28;
        this.c = byc0.b(f, f);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        com.vk.core.compose.component.cell.content.y0 y0Var;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1996566777);
        int i3 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1996566777, i3, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditDateCellImpl.Content (BookingEditDateCell.kt:75)");
            }
            int i4 = (i3 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(259331316, i4, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditDateCellImpl.duration (BookingEditDateCell.kt:68)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            mtk0 mtk0Var = this.a;
            int i5 = ((BookingEditScreenState.c) mtk0Var.getValue()).c;
            boolean J = M.J(context) | M.o(i5);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = mri0.b(i5, context);
                M.R(x);
            }
            String str = (String) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = str.length() == 0 ? 4 : 5;
            float f2 = str.length() == 0 ? 0 : 2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-655553972, i4, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditDateCellImpl.datetimeString (BookingEditDateCell.kt:52)");
            }
            int i6 = ((BookingEditScreenState.c) mtk0Var.getValue()).b;
            boolean o = M.o(i6);
            Object x2 = M.x();
            if (o || x2 == c0012a) {
                x2 = pvo0.g(i6) ? cqm0.b(pvo0.i(false, i6, false, false)) : pvo0.m(i6);
                M.R(x2);
            }
            String str2 = (String) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(str2, null, null, 0, cq.b("record_date_time", null, 3), null, M, 12582912, 94), str.length() > 0 ? Cell$Middle.c.b.b(str, 0, null, null, cq.b("record_duration", null, 3), M, 12582912, 94) : null, null, null, M, 196608, 28);
            androidx.compose.runtime.a aVar2 = M;
            if (((BookingEditScreenState.c) mtk0Var.getValue()).a) {
                aVar2.K(-1149683022);
                if (androidx.compose.runtime.b.d()) {
                    i2 = -1;
                    androidx.compose.runtime.b.f(-672921252, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-EditOutline28> (VkSdkIcons.kt:772)");
                } else {
                    i2 = -1;
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_edit_outline_28, 0, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i2, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().n;
                String N = d370.N(R.string.booking_edit_accessibility_change_date, 0, aVar2);
                com.vk.core.compose.component.semantics.a b = cq.b("edit_date", null, 3);
                boolean z = (i3 & 112) == 32;
                Object x3 = aVar2.x();
                if (z || x3 == c0012a) {
                    x3 = new j70(this, 6);
                    aVar2.R(x3);
                }
                com.vk.core.compose.component.cell.content.x a3 = com.vk.core.compose.component.cell.content.p.a(a2, j, this.c, N, (gzs) x3, b, aVar2, 1572872, 0);
                aVar2 = aVar2;
                com.vk.core.compose.component.cell.content.y0 a4 = o.c.a(null, a3, null, null, null, aVar2, 61);
                aVar2.j();
                y0Var = a4;
            } else {
                aVar2.K(-1279882428);
                aVar2.j();
                y0Var = null;
            }
            q630.a aVar3 = q630.a.a;
            androidx.compose.runtime.a aVar4 = aVar2;
            wiu0.b(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5), false, null, a, y0Var, null, null, aVar4, 0, 102);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xd0(this, q630Var2, i, 1);
        }
    }
}
