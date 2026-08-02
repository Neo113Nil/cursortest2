package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SegmentSize;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkSegmentedControl.kt */
/* loaded from: classes17.dex */
public final class b5i0 extends y4i0 {
    public static final b5i0 a = new b5i0();

    @Override // xsna.y4i0
    public final void a(final q630 q630Var, final boolean z, final gzs<s3q0> gzsVar, final zzs<? super qa8, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        long j;
        float f;
        androidx.compose.runtime.a M = aVar.M(-241561377);
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
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-241561377, i2, -1, "com.vk.core.compose.component.SegmentControlScopeInstance.InternalSegment (VkSegmentedControl.kt:227)");
            }
            final xn20 a2 = bjv0.a();
            pqo pqoVar = hfj.a;
            bjv0.a().getClass();
            c9e0 b = pqoVar.b(Float.valueOf(m5i0.a(M)));
            pqo pqoVar2 = yfj.a;
            if (z) {
                M.K(-212233681);
                j = a2.c(M);
            } else {
                M.K(-212232142);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().x;
            }
            M.j();
            c9e0 b2 = vcl0.b(j, pqoVar2);
            pqo pqoVar3 = hbp.b;
            if (z) {
                M.K(-212229571);
                float f2 = ((pco) M.r(pqoVar3)).b;
                a2.d(M);
                f = tqu0.c + f2;
            } else {
                M.K(-212226714);
                f = ((pco) M.r(pqoVar3)).b;
            }
            M.j();
            rvi.b(new c9e0[]{b, b2, pqoVar3.b(new pco(f))}, kai.c(-1894788065, new wzs() { // from class: xsna.z4i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1894788065, intValue, -1, "com.vk.core.compose.component.SegmentControlScopeInstance.InternalSegment.<anonymous> (VkSegmentedControl.kt:235)");
                        }
                        m5i0 m5i0Var = a2;
                        q630 a3 = o19.a(rte0.d(txj0.h(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, m5i0Var.a, 1, q630.this), m5i0Var.e((SegmentSize) aVar2.r(bjv0.b))), m5i0Var.f(aVar2)), ((Number) aVar2.r(hfj.a)).floatValue());
                        boolean booleanValue = ((Boolean) aVar2.r(bjv0.a)).booleanValue();
                        Object x = aVar2.x();
                        if (x == a.C0011a.a) {
                            x = ir.h(aVar2);
                        }
                        plg0 plg0Var = new plg0(0);
                        boolean z2 = z;
                        q630 f3 = txj0.f(lai0.a(a3, z2, (sg50) x, null, booleanValue, plg0Var, gzsVar), 1.0f);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, aVar2, 54);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, f3);
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
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar2, a4, cVar);
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
                        q630 c2 = qri.c(aVar2, q630.a.a);
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
                        k9q0.w(aVar2, d, cVar);
                        k9q0.w(aVar2, D2, eVar);
                        ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c2, dVar);
                        zzsVar.invoke(ra8.a, Boolean.valueOf(z2), aVar2, 6);
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
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.a5i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    b5i0.this.a(q630Var, z, gzsVar, zzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
