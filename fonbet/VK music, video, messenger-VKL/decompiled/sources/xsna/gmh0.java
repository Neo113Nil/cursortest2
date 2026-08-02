package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.mmh0;
import xsna.q630;

/* compiled from: SearchAddressMviView.kt */
/* loaded from: classes18.dex */
public final class gmh0 extends i6v0<rmh0, zlh0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((rmh0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(mmh0 mmh0Var, izs<? super zlh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1837741098);
        int i2 = (M.J(mmh0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1837741098, i2, -1, "com.vk.ecomm.cart.impl.search_address.ui.fragment.SearchAddressMviView.Content (SearchAddressMviView.kt:60)");
            }
            if (mmh0Var instanceof mmh0.e) {
                M.K(197120329);
                pmh0.c((mmh0.e) mmh0Var, ahn.E(q630.a.a, "search_address_suggestions_list"), izsVar, M, ((i2 << 3) & 896) | 48);
                M.j();
            } else if (mmh0Var instanceof mmh0.b) {
                M.K(197442357);
                amh0.a((mmh0.b) mmh0Var, null, izsVar, M, (i2 << 3) & 896);
                M.j();
            } else if (mmh0Var instanceof mmh0.c) {
                M.K(197648414);
                fmh0.a((mmh0.c) mmh0Var, null, M, 0);
                M.j();
            } else {
                M.K(837662254);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k3o(i, 8, this, mmh0Var, izsVar);
        }
    }

    public final void i(rmh0 rmh0Var, izs<? super zlh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-451922795);
        int i2 = (M.J(rmh0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-451922795, i2, -1, "com.vk.ecomm.cart.impl.search_address.ui.fragment.SearchAddressMviView.ThemedContent (SearchAddressMviView.kt:25)");
            }
            n0u0[] n0u0VarArr = {rmh0Var.a, rmh0Var.c, rmh0Var.d};
            int i3 = i2 & 896;
            int i4 = 518 | i3;
            mmh0.a aVar2 = mmh0.a.a;
            wh50 d = d(aVar2, n0u0VarArr, M, i4);
            wh50 d2 = d(aVar2, new n0u0[]{rmh0Var.b}, M, i4);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i5 = i3 | (i2 & 112) | 512;
            j((mmh0) d2.getValue(), izsVar, M, i5);
            h((mmh0) d.getValue(), izsVar, M, i5);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h06(i, 7, this, rmh0Var, izsVar);
        }
    }

    public final void j(mmh0 mmh0Var, izs<? super zlh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1502621103);
        int i2 = (M.J(mmh0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1502621103, i2, -1, "com.vk.ecomm.cart.impl.search_address.ui.fragment.SearchAddressMviView.TopBar (SearchAddressMviView.kt:48)");
            }
            if (mmh0Var instanceof mmh0.d) {
                M.K(1859014292);
                qmh0.a((mmh0.d) mmh0Var, null, izsVar, M, (i2 << 3) & 896);
            } else {
                M.K(1856967889);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fn7(i, 7, this, mmh0Var, izsVar);
        }
    }
}
