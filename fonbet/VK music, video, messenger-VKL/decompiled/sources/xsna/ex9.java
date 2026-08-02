package xsna;

import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;

/* compiled from: CartListItem.kt */
/* loaded from: classes18.dex */
public final class ex9 {
    public static final void a(izs izsVar, CartItem cartItem, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1594453132);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(cartItem) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1594453132, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartListItem (CartListItem.kt:12)");
            }
            if (cartItem instanceof CartItem.b) {
                M.K(-1984852873);
                cw9.a((CartItem.b) cartItem, izsVar, q630Var, M, (i2 & 896) | ((i2 << 3) & 112));
                M.j();
            } else if (cartItem instanceof CartItem.d) {
                M.K(-1984757703);
                ay9.h((CartItem.d) cartItem, izsVar, q630Var, M, (i2 & 896) | ((i2 << 3) & 112));
                M.j();
            } else if (cartItem instanceof CartItem.Summary) {
                M.K(-1984664455);
                ry9.a((CartItem.Summary) cartItem, izsVar, q630Var, M, (i2 & 896) | ((i2 << 3) & 112));
                M.j();
            } else if (cartItem instanceof CartItem.a) {
                M.K(-1984572230);
                yv9.a((CartItem.a) cartItem, izsVar, q630Var, M, (i2 & 896) | ((i2 << 3) & 112));
                M.j();
            } else {
                if (!(cartItem instanceof CartItem.c)) {
                    throw alb0.c(-1033859904, M);
                }
                M.K(-1984476750);
                ox9.b((CartItem.c) cartItem, izsVar, q630Var, M, (i2 & 896) | ((i2 << 3) & 112));
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
            s.d = new w70(izsVar, cartItem, q630Var, i);
        }
    }
}
