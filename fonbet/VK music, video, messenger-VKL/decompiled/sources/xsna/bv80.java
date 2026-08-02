package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: OrderListContentByState.kt */
/* loaded from: classes18.dex */
public final class bv80 {
    public static final void a(final boolean z, final nw80 nw80Var, final izs<? super OrderListAction, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1280454083);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(nw80Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1280454083, i2, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListContentByState (OrderListContentByState.kt:21)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            mw80.a(nw80Var.b, z, izsVar, txj0.f(ahn.E(aVar2, "toolbar"), 1.0f), M, ((i2 << 3) & 112) | 3072 | (i2 & 896));
            com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a aVar4 = nw80Var.c;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new j5n(17);
                M.R(x);
            }
            njk.a(aVar4, (izs) x, null, null, "OrderListCrossfade", kai.c(336727692, new u9a(izsVar, 3), M), M, 221232);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, nw80Var, izsVar, i) { // from class: xsna.av80
                public final /* synthetic */ boolean b;
                public final /* synthetic */ nw80 c;
                public final /* synthetic */ izs d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    bv80.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
