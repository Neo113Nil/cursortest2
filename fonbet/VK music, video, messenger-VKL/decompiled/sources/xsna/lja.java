package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: CategoriesEntry.kt */
/* loaded from: classes18.dex */
public final class lja {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, String str2, gzs gzsVar, q630 q630Var) {
        com.vk.core.compose.component.cell.content.i0 i0Var;
        SemanticsConfiguration.Mode mode;
        androidx.compose.runtime.a M = aVar.M(-1293014900);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1293014900, i2, -1, "com.vk.ecomm.categories.impl.presentation.ui.CategoriesEntry (CategoriesEntry.kt:22)");
            }
            if (str == null || drm0.N(str)) {
                M.K(1354981521);
                M.j();
                i0Var = null;
                mode = null;
            } else {
                M.K(1354999502);
                lg90 l = fwu0.l(null, str, null, null, M, (i2 << 3) & 112, 61);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i0Var = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(l, Cell$Left.Main.Size.Medium, ylu0Var.getIcon().a, null, null, M, 196664, 24), null, M, 2);
                M.j();
                mode = null;
            }
            q630 c = ojc.c(q630Var, false, null, null, gzsVar, 15);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.logic.interactor.f(6);
                M.R(x);
            }
            wiu0.b(c, false, i0Var, Cell$Middle.a.a(Cell$Middle.d.b.a(str2, null, null, 1, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 3), null, M, ((i2 >> 3) & 14) | 12610560, 70), null, null, null, M, 196608, 30), null, null, null, M, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kja(i, str, str2, gzsVar, q630Var);
        }
    }
}
