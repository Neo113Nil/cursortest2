package xsna;

import androidx.compose.runtime.a;
import com.google.zxing.pdf417.PDF417Common;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.d16;

/* compiled from: OrderSellerComment.kt */
/* loaded from: classes18.dex */
public final class ex80 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Object obj, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-668001169);
        int i2 = i | (M.J(obj) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-668001169, i2, -1, "com.vk.ecomm.orders.impl.common.ui.compose.OrderSellerCommentBanner (OrderSellerComment.kt:25)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            String N = d370.N(R.string.ecomm_orders_seller_comment, 0, M);
            CharSequence charSequence = (CharSequence) obj;
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new qc70(izsVar, 1);
                M.R(x2);
            }
            us2 d = ws2.d(charSequence, (izs) x2);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new qd00(1, wh50Var);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            String N2 = d370.N(R.string.ecomm_order_comment_show_more, 0, M);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new kl60(3);
                M.R(x4);
            }
            beu0.a(d16.b.a(N, null, d16.c.a.C2698a.a(d, booleanValue, gzsVar, N2, 3, null, 0L, 0L, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 1597824, PDF417Common.MAX_CODEWORDS_IN_BARCODE), null, null, null, null, null, M, 100663296, 250), F, null, null, null, null, null, null, null, null, null, null, M, 0, 0, 4092);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ud0(i, 2, obj, izsVar, q630Var);
        }
    }
}
