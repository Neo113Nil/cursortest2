package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.ecomm.cart.impl.cart.ui.items.IslandPart;
import kotlin.collections.builders.ListBuilder;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CartLoading.kt */
/* loaded from: classes18.dex */
public final class gx9 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(3406638);
        int i2 = i | 6;
        boolean z2 = false;
        boolean z3 = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(3406638, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.CartLoading (CartLoading.kt:17)");
            }
            xvy a = zvy.a(0, 3, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                ListBuilder e = e43.e();
                int i3 = 0;
                while (i3 < 30) {
                    int i4 = i3 % 2;
                    e.add(new CartItem.d(new a.C0919a(i3, new UserId(1L), new UserId(1L)), true, "", i4 == 0 ? -40 : null, new CartItem.d.b(oq.d(tlo0.Companion, "10 000 ₽"), lhg.a(i3, "Product name "), l6g.a(i3, " 000 ₽"), e43.l(new CartItem.d.b.a(lhg.a(i3, "Property 1 "), lhg.a(i3, "Value 1 ")), new CartItem.d.b.a(lhg.a(i3, "Property 2 "), lhg.a(i3, "Value 2 ")))), new CartItem.d.a(i4 == 0 ? z3 : z2, new CartItem.d.a.InterfaceC0923a.C0924a(i3, z3, z3)), IslandPart.Middle));
                    i3++;
                    z3 = true;
                    z2 = false;
                }
                z = false;
                egz egzVar = new egz(e.g(), false, false, false);
                M.R(egzVar);
                x = egzVar;
            } else {
                z = false;
            }
            egz egzVar2 = (egz) x;
            q630Var2 = q630.a.a;
            q630 d = txj0.d(q630Var2, 1.0f);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var, z);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new z13(3);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new re0(3);
                M.R(x3);
            }
            jw9.c(izsVar, (gzs) x3, egzVar2, false, txj0.d(q630Var2, 1.0f), a, M, 28086, 0);
            q630 d3 = txj0.d(q630Var2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d3, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new se0(4);
                M.R(x5);
            }
            q630 b = ojc.b(m, sg50Var, null, false, null, (gzs) x5, 28);
            cp10 d4 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b);
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
            k9q0.w(M, d4, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            ny9.a(null, M, 0);
            M.G();
            M.G();
            s3q0 s3q0Var = s3q0.a;
            boolean J = M.J(a);
            Object x6 = M.x();
            if (J || x6 == c0012a) {
                x6 = new fx9(a, egzVar2, null);
                M.R(x6);
            }
            bap.g(s3q0Var, (wzs) x6, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m00(q630Var2, i, 2);
        }
    }
}
