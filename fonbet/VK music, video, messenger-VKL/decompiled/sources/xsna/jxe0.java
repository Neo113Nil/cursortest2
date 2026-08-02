package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.uxe0;

/* compiled from: RatingBarContent.kt */
/* loaded from: classes18.dex */
public final class jxe0 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-805667829);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-805667829, i2, -1, "com.vk.design.demo.presentation.screens.RatingBarContent.Content (RatingBarContent.kt:55)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("RatingBar", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new p1d0(gzsVar, 6);
                M.R(x);
            }
            muv0.h(a2, null, null, null, e.a.a((gzs) x, "Назад", null, null, null, M, 196656, 28), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8174);
            djn0.a(true, true, M, 438, 0);
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = qq.h(0, M);
            }
            wh50 wh50Var = (wh50) x2;
            vpu0.c(((Number) wh50Var.getValue()).intValue(), kai.c(900605012, new if80(wh50Var, 1), M), txj0.f(aVar2, 1.0f), 0L, false, null, M, Tensorflow.FRAME_WIDTH, 120);
            M = M;
            int intValue = ((Number) wh50Var.getValue()).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    M.K(598502209);
                } else {
                    M.K(602771839);
                    c(txj0.d(aVar2, 1.0f), M, ((i2 >> 12) & 112) | 6);
                }
                M.j();
            } else {
                M.K(602585436);
                b(txj0.d(aVar2, 1.0f), M, ((i2 >> 12) & 112) | 6);
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
            s.d = new wzs() { // from class: xsna.hxe0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    jxe0.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1217413700);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1217413700, i2, -1, "com.vk.design.demo.presentation.screens.RatingBarContent.ComposeContent (RatingBarContent.kt:116)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            float f = 16;
            q630 D = s200.D(q630Var, f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, f), M, 6);
            rxe0.c(4.0f, m200.o(M), null, ((Boolean) wh50Var.getValue()).booleanValue(), uxe0.a(uxe0.a.a(M), l5g.c(14, uxe0.a.a(M).d, 0.2f), l5g.c(14, uxe0.a.a(M).e, 0.8f), 7), null, M, 70, 36);
            f9t.e(txj0.h(aVar3, f), M, 6);
            int intValue = rg50Var.getIntValue();
            lg90 o = m200.o(M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new rxz(rg50Var, 19);
                M.R(x3);
            }
            rxe0.a(intValue, o, (izs) x3, null, ((Boolean) wh50Var.getValue()).booleanValue(), null, M, 448, 40);
            f9t.e(txj0.h(aVar3, f), M, 6);
            rxe0.b(null, M, 0);
            f9t.e(txj0.h(aVar3, f), M, 6);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new dm3(3, wh50Var);
                M.R(x4);
            }
            zov0.b(booleanValue, "Is enabled", (izs) x4, null, null, false, false, M, Tensorflow.FRAME_WIDTH, 120);
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
            s.d = new b220(this, q630Var, i, 2);
        }
    }

    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1319062261);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1319062261, i2, -1, "com.vk.design.demo.presentation.screens.RatingBarContent.ViewContent (RatingBarContent.kt:157)");
            }
            q630 D = p490.D(q630Var, p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            kxe0.b(6, M);
            kxe0.a(6, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xw5(this, q630Var, i, 4);
        }
    }
}
