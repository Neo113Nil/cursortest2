package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;

/* compiled from: ProductCardCommunityInfoHolder.kt */
/* loaded from: classes18.dex */
public final class ckd0 implements Cell$Middle.c {
    public final wh50 a = androidx.compose.runtime.k.b(new xig0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-870684929);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-870684929, i, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.getSubtitle.<anonymous>.<no name provided>.Content (ProductCardCommunityInfoHolder.kt:240)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new c4r(25);
            aVar.R(x);
        }
        nzh.a((xig0) ((zak0) this.a).getValue(), egi0.b(q630Var, true, (izs) x), aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
