package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import java.util.List;
import xsna.q630;

/* compiled from: ProductCardGallery.kt */
/* loaded from: classes18.dex */
public final class bld0 {
    public static final void a(eld0 eld0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1958072374);
        int i2 = (M.J(eld0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1958072374, i2, -1, "com.vk.ecomm.market.good.good2.presentation.gallery.ProductCardGallery (ProductCardGallery.kt:15)");
            }
            List<ProductGalleryItem> list = eld0Var.a;
            int i3 = eld0Var.b;
            q630 g = ahn.E(q630.a.a, "product_card_gallery").g(q630Var);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new uy7(izsVar, 6);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new db00(izsVar);
                M.R(x2);
            }
            com.vk.ecomm.design.compose.gallery.a.a(list, i3, izsVar2, (wzs) x2, g, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cqg(i, 8, eld0Var, izsVar, q630Var);
        }
    }
}
