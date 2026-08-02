package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkDefaultTabRow.kt */
/* loaded from: classes17.dex */
public final class znl extends vnl {
    public final khx a;

    public znl(khx khxVar) {
        this.a = khxVar;
    }

    @Override // xsna.vnl
    public final void a(float f, float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final float f3;
        final float f4;
        androidx.compose.runtime.a M = aVar.M(-1527821612);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1527821612, i2, -1, "com.vk.core.compose.component.DefaultTabIndicatorScopeImpl.AnimatedDefaultTabIndicator (VkDefaultTabRow.kt:524)");
            }
            nkk nkkVar = luo.a;
            f4 = f2;
            f3 = f;
            b(((pco) hg2.a(f3, jq2.d(250, 0, nkkVar, 2), "Default Tab Row indicator offset", M, (i2 & 14) | 384, 8).getValue()).b, ((pco) hg2.a(f2, jq2.d(250, 0, nkkVar, 2), "Default Tab Row indicator width", M, ((i2 >> 3) & 14) | 384, 8).getValue()).b, M, i2 & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            f3 = f;
            f4 = f2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wnl
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    znl.this.a(f3, f4, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(float f, final float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final float f3;
        final float f4;
        androidx.compose.runtime.a M = aVar.M(-967554953);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-967554953, i2, -1, "com.vk.core.compose.component.DefaultTabIndicatorScopeImpl.DefaultTabIndicator (VkDefaultTabRow.kt:483)");
            }
            if (((Boolean) M.r(opv0.a)).booleanValue()) {
                M.K(-2107368610);
                f4 = ((Number) M.r(hfj.a)).floatValue();
                M.j();
            } else {
                M.K(155416811);
                M.j();
                f4 = 0.64f;
            }
            f3 = f;
            this.a.a(f3, (i2 & 14) | 384, M, kai.c(-933723684, new wzs() { // from class: xsna.xnl
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-933723684, intValue, -1, "com.vk.core.compose.component.DefaultTabIndicatorScopeImpl.DefaultTabIndicator.<anonymous> (VkDefaultTabRow.kt:488)");
                        }
                        bpn0 bpn0Var = npv0.a;
                        TabMode tabMode = TabMode.Default;
                        float b = npv0.b(tabMode);
                        q630.a aVar3 = q630.a.a;
                        q630 E = s200.E(txj0.s(aVar3, f2, b), npv0.c(tabMode), npv0.d(tabMode));
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.i, false);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, E);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        float f5 = 2;
                        q630 h = txj0.h(txj0.f(aVar3, 1.0f), f5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long c2 = l5g.c(14, ylu0Var.m().a, f4);
                        Object x = aVar2.x();
                        if (x == a.C0011a.a) {
                            x = vog0.b(f5);
                            aVar2.R(x);
                        }
                        f9t.e(hr80.m(h, c2, (uog0) x), aVar2, 0);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            f3 = f;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ynl
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    znl.this.b(f3, f2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
