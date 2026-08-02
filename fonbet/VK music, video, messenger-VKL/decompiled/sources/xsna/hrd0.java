package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProductPriceContent.kt */
/* loaded from: classes18.dex */
public final class hrd0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public hrd0(String str, long j, String str2) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(str2);
        this.c = zy60.d(j);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-160488855);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-160488855, i2, -1, "com.vk.ecomm.design.compose.tile.impl.description.ProductPriceContent.Content (ProductPriceContent.kt:33)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630Var2 = aVar3;
            yqv0.c((String) ((zak0) this.a).getValue(), ahn.E(aVar3, "product_price"), ((l5g) ((zak0) this.c).getValue()).a, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).h0, M, 100663344, 48, 5880);
            String str = (String) ((zak0) this.b).getValue();
            if (str == null) {
                M.K(1081524903);
                M.j();
                aVar2 = M;
            } else {
                M.K(1081524904);
                aVar2 = M;
                yqv0.c(str, ahn.E(s200.H(new gor0(dt1.a.l), kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "product_old_price"), wlb0.h(M).getText().p, pdo0.d, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).m0, aVar2, 100666368, 48, 5872);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bc1(this, q630Var2, i, 7);
        }
    }
}
