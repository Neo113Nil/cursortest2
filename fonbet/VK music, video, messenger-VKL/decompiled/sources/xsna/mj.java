package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkAccentTabRow.kt */
/* loaded from: classes17.dex */
public final class mj extends jj {
    public final anx a;

    public mj(anx anxVar) {
        this.a = anxVar;
    }

    @Override // xsna.jj
    public final void a(q630 q630Var, boolean z, gzs<s3q0> gzsVar, zzs<? super jj, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        final boolean z2;
        final gzs<s3q0> gzsVar2;
        final zzs<? super jj, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar2;
        float f;
        long j;
        float f2;
        androidx.compose.runtime.a M = aVar.M(-1978892261);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(zzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1978892261, i2, -1, "com.vk.core.compose.component.AccentTabScopeImpl.InternalAccentTab (VkAccentTabRow.kt:389)");
            }
            if (z) {
                M.K(955057918);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                }
                squ0 squ0Var = (squ0) M.r(rrv0.b);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                squ0Var.getClass();
                f = tqu0.c;
            } else {
                M.K(955058783);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                }
                squ0 squ0Var2 = (squ0) M.r(rrv0.b);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                squ0Var2.getClass();
                f = tqu0.b;
            }
            M.j();
            pqo pqoVar = yfj.a;
            if (z) {
                M.K(955062570);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().r;
            } else {
                M.K(955063842);
                j = ((l5g) M.r(opv0.b)).a;
            }
            M.j();
            c9e0 b = vcl0.b(j, pqoVar);
            pqo pqoVar2 = hfj.a;
            if (((Boolean) M.r(opv0.a)).booleanValue()) {
                M.K(955066882);
                f2 = ((Number) M.r(pqoVar2)).floatValue();
                M.j();
            } else {
                M.K(601636551);
                M.j();
                f2 = 0.64f;
            }
            c9e0 b2 = pqoVar2.b(Float.valueOf(f2));
            pqo pqoVar3 = hbp.b;
            c9e0[] c9e0VarArr = {b, b2, pqoVar3.b(new pco(((pco) M.r(pqoVar3)).b + f))};
            q630Var2 = q630Var;
            z2 = z;
            gzsVar2 = gzsVar;
            zzsVar2 = zzsVar;
            rvi.b(c9e0VarArr, kai.c(344999131, new wzs() { // from class: xsna.kj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(344999131, intValue, -1, "com.vk.core.compose.component.AccentTabScopeImpl.InternalAccentTab.<anonymous> (VkAccentTabRow.kt:397)");
                        }
                        aVar2.K(831685787);
                        bpn0 bpn0Var = npv0.a;
                        TabMode tabMode = TabMode.Accent;
                        float b3 = npv0.b(tabMode);
                        q630.a aVar3 = q630.a.a;
                        q630 g = q630.this.g(txj0.h(aVar3, b3));
                        aVar2.j();
                        q630 a = o19.a(rte0.d(g, npv0.h(tabMode)), ((Number) aVar2.r(hfj.a)).floatValue());
                        boolean booleanValue = ((Boolean) aVar2.r(opv0.a)).booleanValue();
                        Object x = aVar2.x();
                        if (x == a.C0011a.a) {
                            x = ir.h(aVar2);
                        }
                        plg0 plg0Var = new plg0(4);
                        boolean z3 = z2;
                        q630 C = txj0.C(txj0.x(npv0.e(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.E(lai0.a(a, z3, (sg50) x, null, booleanValue, plg0Var, gzsVar2), npv0.j(), npv0.k())), null, 3);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, aVar2, 54);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, C);
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
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar2, a2, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar2, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar2, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar2, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar2, c, dVar);
                        cp10 d = ja8.d(dt1.a.f, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c2 = qri.c(aVar2, aVar3);
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
                        k9q0.w(aVar2, d, cVar);
                        k9q0.w(aVar2, D2, eVar);
                        ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c2, dVar);
                        zzsVar2.invoke(this, Boolean.valueOf(z3), aVar2, 0);
                        aVar2.G();
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
            q630Var2 = q630Var;
            z2 = z;
            gzsVar2 = gzsVar;
            zzsVar2 = zzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final gzs<s3q0> gzsVar3 = gzsVar2;
            final q630 q630Var3 = q630Var2;
            final zzs<? super jj, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar3 = zzsVar2;
            final boolean z3 = z2;
            s.d = new wzs() { // from class: xsna.lj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    mj.this.a(q630Var3, z3, gzsVar3, zzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    @Override // xsna.jj
    public final anx e() {
        return this.a;
    }
}
