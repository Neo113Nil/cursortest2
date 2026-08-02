package xsna;

import androidx.compose.runtime.a;

/* compiled from: LinkVKBidScreenContent.kt */
/* loaded from: classes18.dex */
public final class zbz {
    public static final void a(wbz wbzVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1805287204);
        int i2 = i | (M.J(wbzVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1805287204, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidScreenContent (LinkVKBidScreenContent.kt:32)");
            }
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new a5(11, wbzVar, izsVar);
                M.R(x);
            }
            lqy.a(q630Var, null, null, null, null, null, false, null, (izs) x, M, (i2 >> 3) & 14, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new em(wbzVar, q630Var, izsVar, i, 3);
        }
    }
}
