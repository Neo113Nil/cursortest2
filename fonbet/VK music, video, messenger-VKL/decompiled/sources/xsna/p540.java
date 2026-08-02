package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MultiPickerAttachItemsButtonView.kt */
/* loaded from: classes18.dex */
public final class p540 {
    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(463616742);
        int i3 = i2 | 6 | (M.o(i) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(463616742, i3, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.button.MultiPickerAttachItemsButtonView (MultiPickerAttachItemsButtonView.kt:20)");
            }
            q630.a aVar3 = q630.a.a;
            q630 E = s200.E(txj0.d(aVar3, 1.0f), 16, 12);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.d(aVar3, 1.0f), null, false, false, null, null, null, d370.N(R.string.attach_multipicker_attach_goods_button, 0, M), Integer.valueOf(i), null, null, null, false, null, null, null, aVar2, ((i3 >> 6) & 14) | 28080, (i3 << 6) & 7168, 0, 4181984);
            aVar2.G();
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
            s.d = new knc(i, i2, gzsVar, q630Var2);
        }
    }
}
