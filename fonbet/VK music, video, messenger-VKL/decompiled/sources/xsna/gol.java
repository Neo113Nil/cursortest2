package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkDefaultTabRow.kt */
/* loaded from: classes17.dex */
public final class gol extends col {
    @Override // xsna.col
    public final void a(final int i, androidx.compose.runtime.a aVar, final jai jaiVar, final gzs gzsVar, final q630 q630Var, final boolean z) {
        q630 q630Var2;
        int i2;
        float f;
        androidx.compose.runtime.a M = aVar.M(-436412234);
        if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i2 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-436412234, i2, -1, "com.vk.core.compose.component.DefaultTabScopeImpl.InternalDefaultTab (VkDefaultTabRow.kt:410)");
            }
            if (((Boolean) M.r(opv0.a)).booleanValue()) {
                M.K(1514647773);
                f = ((Number) M.r(hfj.a)).floatValue();
                M.j();
            } else {
                M.K(768774988);
                M.j();
                f = 0.64f;
            }
            final float f2 = f;
            final mlg0 a = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new l5g(l5g.c(14, l5g.k, 1.0f));
                M.R(x);
            }
            final q630 q630Var3 = q630Var2;
            rvi.a(vcl0.b(((l5g) x).a, yfj.a), kai.c(34202614, new wzs() { // from class: xsna.dol
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(34202614, intValue, -1, "com.vk.core.compose.component.DefaultTabScopeImpl.InternalDefaultTab.<anonymous> (VkDefaultTabRow.kt:420)");
                        }
                        aVar2.K(-1491023657);
                        bpn0 bpn0Var = npv0.a;
                        TabMode tabMode = TabMode.Default;
                        q630 g = q630.this.g(txj0.h(q630.a.a, npv0.b(tabMode)));
                        aVar2.j();
                        float f3 = f2;
                        q630 d = rte0.d(o19.a(g, f3), npv0.h(tabMode));
                        boolean booleanValue = ((Boolean) aVar2.r(opv0.a)).booleanValue();
                        Object x2 = aVar2.x();
                        if (x2 == a.C0011a.a) {
                            x2 = ir.h(aVar2);
                        }
                        plg0 plg0Var = new plg0(4);
                        final boolean z2 = z;
                        q630 C = txj0.C(txj0.x(npv0.e(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.E(lai0.a(d, z2, (sg50) x2, a, booleanValue, plg0Var, gzsVar), npv0.j(), npv0.k())), null, 3);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, aVar2, 54);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, C);
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
                        k9q0.w(aVar2, a2, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        c9e0[] c9e0VarArr = {hfj.a.b(Float.valueOf(f3)), yfj.a.b(aVar2.r(opv0.b))};
                        final jai jaiVar2 = jaiVar;
                        final gol golVar = this;
                        rvi.b(c9e0VarArr, kai.c(1945306880, new wzs() { // from class: xsna.fol
                            @Override // xsna.wzs
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1945306880, intValue2, -1, "com.vk.core.compose.component.DefaultTabScopeImpl.InternalDefaultTab.<anonymous>.<anonymous>.<anonymous> (VkDefaultTabRow.kt:449)");
                                    }
                                    dt1.a.getClass();
                                    cp10 d2 = ja8.d(dt1.a.f, false);
                                    int hashCode2 = Long.hashCode(n34.n(aVar4));
                                    sy90 D2 = aVar4.D();
                                    q630 c2 = qri.c(aVar4, q630.a.a);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar5 = cri.a.b;
                                    if (aVar4.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar4.H();
                                    if (aVar4.L()) {
                                        aVar4.I(aVar5);
                                    } else {
                                        aVar4.f();
                                    }
                                    k9q0.w(aVar4, d2, cri.a.f);
                                    k9q0.w(aVar4, D2, cri.a.e);
                                    k9q0.w(aVar4, Integer.valueOf(hashCode2), cri.a.g);
                                    k9q0.t(aVar4, cri.a.h);
                                    k9q0.w(aVar4, c2, cri.a.d);
                                    jai.this.invoke(golVar, Boolean.valueOf(z2), aVar4, 0);
                                    aVar4.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 56);
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
            s.d = new wzs() { // from class: xsna.eol
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    gol.this.a(I, (androidx.compose.runtime.a) obj, jaiVar, gzsVar, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }
}
