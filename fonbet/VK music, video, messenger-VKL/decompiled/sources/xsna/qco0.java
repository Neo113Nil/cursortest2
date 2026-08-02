package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TextContent.kt */
@ozl
/* loaded from: classes17.dex */
public final class qco0 implements ana {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);
    public final wh50 d = androidx.compose.runtime.k.b(null);
    public final wh50 e = androidx.compose.runtime.k.b(null);
    public final wh50 f = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final wh50 g = androidx.compose.runtime.k.b(Integer.MAX_VALUE);
    public final wh50 h = androidx.compose.runtime.k.b(Integer.MAX_VALUE);

    /* compiled from: TextContent.kt */
    public static final class a {
        public static qco0 a(int i, int i2, androidx.compose.runtime.a aVar, String str, String str2) {
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1377200830, i, -1, "com.vk.core.compose.component.cell.content.TextContent.Companion.invoke (TextContent.kt:126)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new qco0(str, str2);
                aVar.R(x);
            }
            qco0 qco0Var = (qco0) x;
            ((zak0) qco0Var.a).setValue(str);
            ((zak0) qco0Var.g).setValue(Integer.MAX_VALUE);
            ((zak0) qco0Var.b).setValue(str2);
            ((zak0) qco0Var.c).setValue(null);
            ((zak0) qco0Var.d).setValue(null);
            ((zak0) qco0Var.e).setValue(null);
            ((zak0) qco0Var.f).setValue(true);
            ((zak0) qco0Var.h).setValue(Integer.MAX_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return qco0Var;
        }
    }

    public qco0(String str, String str2) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(str2);
    }

    @Override // xsna.ana
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        qco0 qco0Var;
        float f;
        q630.a aVar2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(614941735);
        if ((i & 6) == 0) {
            i2 = i | (M.J(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(614941735, i2, -1, "com.vk.core.compose.component.cell.content.TextContent.invoke (TextContent.kt:48)");
            }
            float f2 = 10;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, f2), M, 6);
            String str = (String) ((zak0) this.d).getValue();
            if (str != null) {
                M.K(1693876231);
                q630 f3 = txj0.f(aVar3, 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.e0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f = f2;
                aVar2 = aVar3;
                i3 = 2;
                yqv0.c(str, f3, zjq.g(ylu0Var.getText().r, !b()), null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
                M = M;
                ck70.b(aVar2, 2, M, 6);
            } else {
                f = f2;
                aVar2 = aVar3;
                i3 = 2;
                M.K(1691831099);
                M.j();
            }
            androidx.compose.runtime.a aVar4 = M;
            qco0Var = this;
            yqv0.c((String) ((zak0) this.a).getValue(), txj0.f(aVar2, 1.0f), zjq.g(wlb0.h(M).getText().m, !b()), null, null, 0, 0, null, 2, false, 0, ((Number) ((zak0) this.g).getValue()).intValue(), null, wlb0.l(M).X, aVar4, 100663344, 0, 5880);
            M = aVar4;
            String str2 = (String) ((zak0) qco0Var.b).getValue();
            if (str2 == null || str2.length() == 0) {
                M.K(1691831099);
            } else {
                M.K(1694626090);
                f9t.e(txj0.h(aVar2, i3), M, 6);
                q630 f4 = txj0.f(aVar2, 1.0f);
                a.c cVar = androidx.compose.foundation.layout.a.e;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(cVar, dt1.a.l, M, 54);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f4);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                lg90 lg90Var = (lg90) ((zak0) qco0Var.e).getValue();
                if (lg90Var != null) {
                    M.K(319854957);
                    vqv.a(lg90Var, str2, txj0.q(aVar2, 12), zjq.g(wlb0.h(M).getIcon().n, !qco0Var.b()), M, 392, 0);
                    str2 = str2;
                    mq.d(aVar2, 4, M, 6);
                } else {
                    M.K(316704613);
                    M.j();
                }
                yqv0.c(str2, txj0.f(aVar2, 1.0f), zjq.g(wlb0.h(M).getText().p, !qco0Var.b()), null, null, 0, 0, null, 2, false, 0, ((Number) ((zak0) qco0Var.h).getValue()).intValue(), null, wlb0.l(M).m0, M, 100663344, 0, 5880);
                M = M;
                M.G();
            }
            M.j();
            String str3 = (String) ((zak0) qco0Var.c).getValue();
            if (str3 != null) {
                M.K(1695876723);
                f9t.e(txj0.h(aVar2, i3), M, 6);
                androidx.compose.runtime.a aVar6 = M;
                yqv0.c(str3, txj0.f(aVar2, 1.0f), zjq.g(wlb0.h(M).getText().p, !qco0Var.b()), null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).m0, aVar6, 48, 0, 8184);
                M = aVar6;
            } else {
                M.K(1691831099);
            }
            M.j();
            if (a690.d(aVar2, f, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            qco0Var = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps1(qco0Var, i, 2);
        }
    }

    public final boolean b() {
        return ((Boolean) ((zak0) this.f).getValue()).booleanValue();
    }
}
