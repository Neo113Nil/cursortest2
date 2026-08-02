package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.cri;
import xsna.dt1;
import xsna.mmh0;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: SearchAddressCourierErrorPlaceholder.kt */
/* loaded from: classes18.dex */
public final class amh0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mmh0.b bVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        q630.a aVar2;
        boolean z;
        int i3;
        t8p0 t8p0Var;
        androidx.compose.runtime.a M = aVar.M(-1031347665);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= M.y(izsVar) ? 256 : 128;
        }
        int i5 = i4;
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1031347665, i5, -1, "com.vk.ecomm.cart.impl.search_address.ui.compose.SearchAddressCourierErrorPlaceholder (SearchAddressCourierErrorPlaceholder.kt:30)");
            }
            cmh0 cmh0Var = (cmh0) jk50.a(bVar.a, M, 0, 3).getValue();
            q630.a aVar3 = q630.a.a;
            if (cmh0Var == null) {
                M.K(1318086214);
                M.j();
                aVar2 = aVar3;
            } else {
                M.K(1318086215);
                q630 c = txj0.c(aVar3, 1.0f);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, c);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                y48 y48Var = null;
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                float f = 32;
                q630 H = s200.H(aVar3, f, 20, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                aVar2 = aVar3;
                sqh0 sqh0Var = cmh0Var.a;
                if (sqh0Var == null) {
                    M.K(-1866564720);
                    M.j();
                    i3 = 3;
                    z = false;
                    t8p0Var = null;
                } else {
                    M.K(-1866564719);
                    lg90 a = pg90.a(sqh0Var.a, 0, M);
                    float f2 = sqh0Var.b;
                    z = false;
                    i3 = 3;
                    t8p0 a2 = csa0.a(a, 0L, byc0.b(f2, f2), null, null, M, 196616, 26);
                    M.j();
                    t8p0Var = a2;
                }
                String d2 = kq01.d(cmh0Var.b, M);
                if (d2 == null) {
                    d2 = "";
                }
                String d3 = kq01.d(cmh0Var.c, M);
                vl20 a3 = zra0.a.a(d2, null, d3 == null ? "" : d3, null, M, 196608, 26);
                rqh0 rqh0Var = cmh0Var.d;
                if (rqh0Var == null) {
                    M.K(-1866094202);
                } else {
                    M.K(-1866094201);
                    String d4 = kq01.d(rqh0Var.a, M);
                    if (d4 == null) {
                        d4 = "";
                    }
                    ButtonSize buttonSize = ButtonSize.Medium;
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new z7w(20);
                        M.R(x);
                    }
                    com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, i3);
                    boolean J = M.J(rqh0Var) | ((i5 & 896) != 256 ? z : true);
                    Object x2 = M.x();
                    if (J || x2 == c0012a) {
                        x2 = new fk(17, rqh0Var, izsVar);
                        M.R(x2);
                    }
                    r48 a5 = wra0.a.C3954a.a(d4, (gzs) x2, buttonSize, buttonStyle, null, false, null, null, null, null, null, null, false, false, null, a4, M, 3456, 12582912, 65520);
                    M = M;
                    y48Var = wra0.b.a(a5, null, null, M, 14);
                }
                M.j();
                ldv0.d(H, t8p0Var, a3, y48Var, null, null, false, M, 1572864, 48);
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j8k(bVar, q630Var2, izsVar, i);
        }
    }
}
