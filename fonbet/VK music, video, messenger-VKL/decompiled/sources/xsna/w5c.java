package xsna;

import androidx.compose.runtime.a;

/* compiled from: CheckoutListItem.kt */
/* loaded from: classes18.dex */
public final class w5c {
    public static final void a(l5c l5cVar, k7r k7rVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1804430561);
        int i2 = i | (M.J(l5cVar) ? 4 : 2) | (M.J(k7rVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1804430561, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutListItem (CheckoutListItem.kt:33)");
            }
            if (k7rVar instanceof u1x) {
                M.K(20042431);
                r5c.a(l5cVar, (u1x) k7rVar, izsVar, q630Var, M, i2 & 8078);
                M.j();
            } else if (k7rVar instanceof x1x) {
                M.K(20144731);
                u5c.a(l5cVar, (x1x) k7rVar, izsVar, q630Var, M, i2 & 8078);
                M.j();
            } else if (k7rVar instanceof q8c) {
                M.K(20250627);
                r8c.a((q8c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof p4c) {
                M.K(20362134);
                q4c.a((p4c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof s2c) {
                M.K(20472835);
                u2c.a((s2c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof f3c) {
                M.K(20579475);
                v5c.a((f3c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof c3c) {
                M.K(20695105);
                b3c.a((c3c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof m5c) {
                M.K(20794925);
                o5c.a((m5c) k7rVar, q630Var, M, (i2 >> 6) & 112);
                M.j();
            } else if (k7rVar instanceof s7c) {
                M.K(20888638);
                t7c.a((s7c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof x2c) {
                M.K(20991651);
                z2c.a((x2c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof n7c) {
                M.K(21092587);
                p7c.b((n7c) k7rVar, q630Var, M, (i2 >> 6) & 112);
                M.j();
            } else if (k7rVar instanceof q7c) {
                M.K(21183107);
                r7c.a((q7c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof c9c) {
                M.K(21283361);
                e9c.a((c9c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof r6c) {
                M.K(21386560);
                v6c.a((r6c) k7rVar, izsVar, q630Var, M, (i2 >> 3) & 1008);
                M.j();
            } else if (k7rVar instanceof w6c) {
                M.K(21497137);
                z6c.a(q630Var, M, (i2 >> 9) & 14);
                M.j();
            } else if (k7rVar instanceof o6c) {
                M.K(21590726);
                boolean z = (i2 & 896) == 256;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new tw(izsVar, 3);
                    M.R(x);
                }
                q6c.a((i2 >> 9) & 14, M, (gzs) x, q630Var);
                M.j();
            } else if (k7rVar instanceof s8c) {
                M.K(21719314);
                s4c.a(q630Var, M, (i2 >> 9) & 14);
                M.j();
            } else if (k7rVar instanceof f9c) {
                M.K(21812004);
                j9c.a((f9c) k7rVar, q630Var, M, (i2 >> 6) & 112);
                M.j();
            } else {
                M.K(21890465);
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
            s.d = new d48(i, 1, l5cVar, k7rVar, izsVar, q630Var);
        }
    }
}
