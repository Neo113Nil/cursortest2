package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.zra0;

/* compiled from: PickerEmptyStateView.kt */
/* loaded from: classes18.dex */
public final class uha0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1486439311);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1486439311, i2, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.placeholders.PickerEmptyStateView (PickerEmptyStateView.kt:20)");
            }
            q630Var = q630.a.a;
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 b = ra8.a.b(txj0.f(q630Var, 1.0f), dt1.a.f);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-467375776, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookmarkOutline56> (VkIcons.kt:800)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_bookmark_outline_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 56;
            long b2 = byc0.b(f, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ldv0.d(b, csa0.a(a, ylu0Var.getIcon().l, b2, null, null, M, 200072, 16), zra0.a.a(d370.N(R.string.attach_multipicker_fave_empty_stub_title, 0, M), null, d370.N(R.string.attach_multipicker_fave_empty_stub_subtitle, 0, M), null, M, 196608, 26), null, null, null, false, M, 0, 120);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new eyn(q630Var, i, 3);
        }
    }
}
