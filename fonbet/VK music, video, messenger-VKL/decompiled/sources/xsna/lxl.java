package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.xxl;

/* compiled from: DeliveryPointsMapMviView.kt */
/* loaded from: classes18.dex */
public final class lxl extends i6v0<kyl, cxl> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((kyl) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(kyl kylVar, izs<? super cxl, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(813607357);
        int i2 = i | (M.J(kylVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(813607357, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapMviView.ThemedContent (DeliveryPointsMapMviView.kt:32)");
            }
            xxl.a aVar2 = xxl.a.a;
            int i3 = (i2 & 896) | 518;
            wh50 d = d(aVar2, new n0u0[]{kylVar.c}, M, i3);
            wh50 d2 = d(aVar2, new n0u0[]{kylVar.b, kylVar.a}, M, i3);
            q630.a aVar3 = q630.a.a;
            q630 d3 = txj0.d(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d3);
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
            if (((xxl) d.getValue()) instanceof xxl.d) {
                M.K(-1617384485);
                jyl.a((xxl.d) ((xxl) d.getValue()), izsVar, txj0.f(aVar3, 1.0f), M, (i2 & 112) | 384);
            } else {
                M.K(-1619274865);
            }
            M.j();
            xxl xxlVar = (xxl) d2.getValue();
            if (xxlVar instanceof xxl.c) {
                M.K(-1617007060);
                eyl.b(this.c, (xxl.c) xxlVar, izsVar, ahn.E(txj0.d(aVar3, 1.0f), "delivery_points_map_screen_content"), M, ((i2 << 3) & 896) | 3072);
                M = M;
                M.j();
            } else if (xxlVar instanceof xxl.b) {
                M.K(-1616567914);
                mw9 mw9Var = (mw9) jk50.a(((xxl.b) xxlVar).a, M, 0, 3).getValue();
                if (mw9Var == null) {
                    M.K(-1616462763);
                    M.j();
                } else {
                    M.K(-1616462762);
                    boolean z = (i2 & 112) == 32;
                    Object x = M.x();
                    if (z || x == a.C0011a.a) {
                        x = new dn7(izsVar, 2);
                        M.R(x);
                    }
                    ow9.a(mw9Var, (gzs) x, txj0.d(aVar3, 1.0f), M, 384, 0);
                    M.j();
                    s3q0 s3q0Var = s3q0.a;
                }
                M.j();
            } else {
                M.K(-1616118259);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sa5(i, 2, this, kylVar, izsVar);
        }
    }
}
