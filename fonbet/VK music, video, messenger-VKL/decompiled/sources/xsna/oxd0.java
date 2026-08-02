package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AuthorHeaderScreenContent.kt */
/* loaded from: classes18.dex */
public final class oxd0 implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar3;
        x5 x5Var2;
        androidx.compose.runtime.a M = aVar.M(488049103);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar3 = gzsVar2;
            i2 |= M.y(gzsVar3) ? 32 : 16;
        } else {
            gzsVar3 = gzsVar2;
        }
        if ((i & 384) == 0) {
            x5Var2 = x5Var;
            i2 |= M.y(x5Var2) ? 256 : 128;
        } else {
            x5Var2 = x5Var;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (65683 & i2) != 65682)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(488049103, i2, -1, "com.vk.design.demo.presentation.screens.authorheader.ProfileHeaderScreenContent.Content (AuthorHeaderScreenContent.kt:60)");
            }
            jgh0 x = p490.x(M);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = new s7c0(2);
                M.R(x2);
            }
            yjl b = rc90.b(0, (gzs) x2, M, 384, 3);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x3);
            }
            yvj yvjVar = (yvj) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = bbk0.b(new fm20(x, 20));
                M.R(x4);
            }
            mtk0 mtk0Var = (mtk0) x4;
            q630 f = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            rrv0.a(null, null, kai.c(-1188511187, new f6(this, x, b, yvjVar, mtk0Var), M), M, 24576, 15);
            jjn0.a("Profile Header", gzsVar, x5Var2, gzsVar3, null, null, M, ((i2 << 3) & 112) | 6 | (i2 & 896) | ((i2 << 6) & 7168), 48);
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
            s.d = new tma(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
