package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: ErrorStateView.kt */
/* loaded from: classes18.dex */
public final class wwp {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-702338802);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-702338802, i2, -1, "com.vk.ecomm.products_selection.impl.presentation.view.ErrorStateView (ErrorStateView.kt:20)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            gzsVar2 = gzsVar;
            ldv0.d(ra8.a.b(txj0.f(aVar3, 1.0f), dt1.a.f), null, zra0.a.a(d370.N(R.string.product_selection_error_stub_title, 0, M), null, d370.N(R.string.product_selection_error_stub_subtitle, 0, M), null, M, 196608, 26), wra0.b.a(wra0.a.C3954a.a(d370.N(R.string.product_selection_error_stub_retry_btn, 0, M), gzsVar, ButtonSize.Small, ButtonStyle.Primary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, aVar2, ((i2 << 3) & 112) | 28032, 12582912, 131040), null, null, aVar2, 14), null, null, false, aVar2, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            gzsVar2 = gzsVar;
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xs8(gzsVar2, q630Var2, i, 3);
        }
    }
}
