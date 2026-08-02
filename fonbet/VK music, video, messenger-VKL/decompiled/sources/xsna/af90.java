package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.cri;
import xsna.dt1;

/* compiled from: PaginationWithButtonImpl.kt */
/* loaded from: classes17.dex */
public final class af90 implements e7v0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f = androidx.compose.runtime.k.b(null);

    public af90(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(buttonSize);
        this.d = androidx.compose.runtime.k.b(buttonStyle);
        this.e = androidx.compose.runtime.k.b(buttonAppearance);
    }

    @Override // xsna.e7v0
    public final void a(q630 q630Var, gys gysVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1820630243);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(gysVar) : M.y(gysVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1820630243, i2, -1, "com.vk.core.tool.compose.onboarding.fullscreen.PaginationWithButtonImpl.Content (PaginationWithButtonImpl.kt:42)");
            }
            mc90 b = gysVar.b();
            if (b == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new ts0(i, 2, this, q630Var, gysVar);
                    return;
                }
                return;
            }
            q630Var2 = q630Var;
            boolean z = b.k() + 1 == b.o();
            q630 f = txj0.f(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            mm2.f(z, null, anp.e(null, 3), anp.f(null, 3), null, kai.c(2129208773, new t0r(this, 2), M), M, 200064, 18);
            mm2.f(!z, null, anp.e(null, 3), anp.f(null, 3), null, kai.c(104252590, new u0r(b, 2), M), M, 200064, 18);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ju80(i, 1, this, q630Var2, gysVar, false);
        }
    }
}
