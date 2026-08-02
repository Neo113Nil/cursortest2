package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;

/* compiled from: BasicTextContextMenuProvider.kt */
/* loaded from: classes11.dex */
public final class tt6 {
    public static final void a(final q630 q630Var, androidx.compose.runtime.e eVar, final jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        jai jaiVar2 = d370.i;
        androidx.compose.runtime.a M = aVar.M(-714464401);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-714464401, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:80)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.k.a(null, w65.e);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            final mt6 b = b((i2 >> 6) & 14, M, jaiVar2);
            rvi.a(eVar.b(b), kai.c(274270255, new wzs() { // from class: xsna.ot6
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(274270255, intValue, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu.<anonymous> (BasicTextContextMenuProvider.kt:87)");
                        }
                        Object x2 = aVar2.x();
                        wh50 wh50Var2 = wh50Var;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x2 == c0012a) {
                            x2 = new qt6(0, wh50Var2);
                            aVar2.R(x2);
                        }
                        q630 o = egi.o(q630.this, (izs) x2);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, true);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, o);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        jaiVar.invoke(aVar2, 0);
                        Object x3 = aVar2.x();
                        if (x3 == c0012a) {
                            x3 = new rt6(0, wh50Var2);
                            aVar2.R(x3);
                        }
                        b.b((gzs) x3, aVar2, 6);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pt6(i, 0, q630Var, eVar, jaiVar);
        }
    }

    public static final mt6 b(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(100861460, i, -1, "androidx.compose.foundation.text.contextmenu.provider.basicTextContextMenuProvider (BasicTextContextMenuProvider.kt:106)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && aVar.J(jaiVar)) || (i & 6) == 4;
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (z || x == obj) {
            x = new mt6(jaiVar);
            aVar.R(x);
        }
        mt6 mt6Var = (mt6) x;
        boolean J = aVar.J(mt6Var);
        Object x2 = aVar.x();
        if (J || x2 == obj) {
            x2 = new kf1(mt6Var, 3);
            aVar.R(x2);
        }
        bap.c(mt6Var, (izs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return mt6Var;
    }
}
