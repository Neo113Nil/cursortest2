package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.o9c;
import xsna.q630;

/* compiled from: CheckoutComposeView.kt */
/* loaded from: classes18.dex */
public final class k3c extends i6v0<o9c, r2c> {
    public final boolean f;
    public final mzp0 g;
    public final wj50 h;

    public k3c(f5z f5zVar, Context context, mzp0 mzp0Var, wj50<h8c> wj50Var, boolean z) {
        super(context, f5zVar);
        this.f = z;
        this.g = mzp0Var;
        this.h = wj50Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((o9c) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(o9c.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-44394409);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-44394409, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutComposeView.CheckoutError (CheckoutComposeView.kt:121)");
            }
            mw9 mw9Var = (mw9) jk50.a(bVar.a, M, 0, 3).getValue();
            if (mw9Var == null) {
                M.K(296328745);
                M.j();
                q630Var2 = q630Var;
            } else {
                M.K(296328746);
                q630Var2 = q630Var;
                q630 d = txj0.d(q630Var2, 1.0f);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, d);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new yd1(izsVar, 1);
                    M.R(x);
                }
                ow9.a(mw9Var, (gzs) x, null, M, 0, 4);
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j3c(this, bVar, izsVar, q630Var2, i, 0);
        }
    }

    public final void i(o9c o9cVar, izs<? super r2c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1210858224);
        int i2 = i | (M.J(o9cVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1210858224, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutComposeView.ThemedContent (CheckoutComposeView.kt:36)");
            }
            wh50 d = d(o9c.c.a, new n0u0[]{o9cVar.b, o9cVar.c, o9cVar.a, o9cVar.d}, M, (i2 & 896) | 518);
            q630.a aVar2 = q630.a.a;
            q630 a = xp2.a(aVar2, null, 3);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            k9c.a(((i2 >> 3) & 14) | 48, M, izsVar, txj0.f(ahn.E(aVar2, "checkout_top_bar"), 1.0f));
            ijk.a((fm50) d.getValue(), null, null, null, kai.c(951812883, new i3c(i3, this, izsVar), M), M, 24576, 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s0(this, o9cVar, izsVar, i, 3);
        }
    }
}
