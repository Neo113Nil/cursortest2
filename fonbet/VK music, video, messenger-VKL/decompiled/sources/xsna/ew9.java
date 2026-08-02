package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.ecomm.cart.impl.cart.a;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CartComposeView.kt */
/* loaded from: classes18.dex */
public final class ew9 extends i6v0<com.vk.ecomm.cart.impl.cart.a, rv9> {
    public final dy9<fm50<oy9>> f;
    public final ComposeView g;
    public final mzp0 h;
    public final yw90 i;

    static {
        int i = ComposeView.n;
    }

    public ew9(CartFragment cartFragment, Context context, mzp0 mzp0Var, yw90 yw90Var, dy9 dy9Var, ComposeView composeView) {
        super(context, cartFragment);
        this.f = dy9Var;
        this.g = composeView;
        this.h = mzp0Var;
        this.i = yw90Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((com.vk.ecomm.cart.impl.cart.a) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.kk50, xsna.jj50
    public final ComposeView c() {
        return this.g;
    }

    @Override // xsna.kk50
    /* renamed from: e */
    public final ComposeView c() {
        return this.g;
    }

    public final void h(com.vk.ecomm.cart.impl.cart.a aVar, izs<? super rv9, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-393715984);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-393715984, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.CartComposeView.ThemedContent (CartComposeView.kt:36)");
            }
            fm50 fm50Var = (fm50) ((zak0) this.f.e).getValue();
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            int i3 = (i2 >> 3) & 14;
            ty9.a(i3 | 48, M, izsVar, txj0.f(ahn.E(aVar3, "cart_top_bar"), 1.0f));
            if (fm50Var instanceof a.d) {
                M.K(-2005907257);
                gx9.a(null, M, 0);
                M.j();
            } else if (fm50Var instanceof a.c) {
                M.K(-2005807778);
                lw9.a(izsVar, (a.c) fm50Var, null, M, i3);
                M.j();
            } else if (fm50Var instanceof a.C0918a) {
                M.K(-2005599055);
                if ((i2 & 896) != 256 && !M.y(this)) {
                    z = false;
                }
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new ka0(this, 14);
                    M.R(x);
                }
                jw9.b(izsVar, (gzs) x, (a.C0918a) fm50Var, null, M, i3);
                M.j();
            } else {
                M.K(766599338);
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
            s.d = new k71(i, 1, this, aVar, izsVar);
        }
    }
}
