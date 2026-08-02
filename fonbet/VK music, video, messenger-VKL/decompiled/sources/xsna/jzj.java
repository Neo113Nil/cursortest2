package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.ozj;
import xsna.q630;

/* compiled from: CourierMapMviView.kt */
/* loaded from: classes18.dex */
public final class jzj extends i6v0<vzj, xyj> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((vzj) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(vzj vzjVar, izs<? super xyj, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1029517379);
        int i2 = i | (M.J(vzjVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1029517379, i2, -1, "com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapMviView.ThemedContent (CourierMapMviView.kt:30)");
            }
            wh50 d = d(ozj.a.a, new n0u0[]{vzjVar.a, vzjVar.b}, M, (i2 & 896) | 518);
            q630.a aVar2 = q630.a.a;
            q630 d2 = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d2);
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
            uzj.a(((i2 >> 3) & 14) | 48, M, izsVar, txj0.f(aVar2, 1.0f));
            ozj ozjVar = (ozj) d.getValue();
            if (ozjVar instanceof ozj.b) {
                M.K(-1809093633);
                mw9 mw9Var = (mw9) jk50.a(((ozj.b) ozjVar).a, M, 0, 3).getValue();
                if (mw9Var == null) {
                    M.K(-1808995209);
                    M.j();
                } else {
                    M.K(-1808995208);
                    boolean z = (i2 & 112) == 32;
                    Object x = M.x();
                    if (z || x == a.C0011a.a) {
                        x = new nac(izsVar, 1);
                        M.R(x);
                    }
                    ow9.a(mw9Var, (gzs) x, txj0.d(aVar2, 1.0f), M, 384, 0);
                    M.j();
                    s3q0 s3q0Var = s3q0.a;
                }
                M.j();
            } else if (ozjVar instanceof ozj.c) {
                M.K(-1808652286);
                szj.b(this.c, (ozj.c) ozjVar, ahn.E(txj0.d(aVar2, 1.0f), "courier_map_screen"), izsVar, M, ((i2 << 6) & 7168) | 384);
                M.j();
            } else {
                M.K(-1808280131);
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
            s.d = new k77(i, 2, this, vzjVar, izsVar);
        }
    }
}
