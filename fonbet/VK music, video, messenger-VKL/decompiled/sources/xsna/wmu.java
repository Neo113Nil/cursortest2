package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wmu implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gzs e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ wmu(int i, String str, gzs gzsVar, gzs gzsVar2, q630 q630Var, boolean z) {
        this.f = str;
        this.d = z;
        this.e = gzsVar;
        this.g = gzsVar2;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                gzs gzsVar = (gzs) obj3;
                ((Integer) obj2).getClass();
                xmu.a(ne7.I(24577), (androidx.compose.runtime.a) obj, (String) obj4, this.e, gzsVar, this.c, this.d);
                return s3q0.a;
            default:
                zzs zzsVar = (zzs) obj4;
                m1i0 m1i0Var = (m1i0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(554102467, intValue, -1, "com.vk.core.compose.component.SecondaryTabScopeImpl.InternalSecondaryTab.<anonymous> (VkSecondaryTabRow.kt:392)");
                    }
                    aVar.K(-83471258);
                    bpn0 bpn0Var = npv0.a;
                    float b = npv0.b(TabMode.Secondary);
                    q630.a aVar2 = q630.a.a;
                    q630 g = this.c.g(txj0.h(aVar2, b));
                    aVar.j();
                    q630 d = rte0.d(o19.a(g, ((Number) aVar.r(hfj.a)).floatValue()), npv0.h(TabMode.Accent));
                    boolean booleanValue = ((Boolean) aVar.r(opv0.a)).booleanValue();
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = ir.h(aVar);
                    }
                    plg0 plg0Var = new plg0(4);
                    boolean z = this.d;
                    q630 C = txj0.C(txj0.x(npv0.e(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.E(lai0.a(d, z, (sg50) x, null, booleanValue, plg0Var, this.e), npv0.j(), npv0.k())), null, 3);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, aVar, 54);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, C);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar, c, dVar);
                    cp10 d2 = ja8.d(dt1.a.f, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c2 = qri.c(aVar, aVar2);
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d2, cVar);
                    k9q0.w(aVar, D2, eVar);
                    ur.d(hashCode2, aVar, bVar, aVar, c2678a);
                    k9q0.w(aVar, c2, dVar);
                    zzsVar.invoke(m1i0Var, Boolean.valueOf(z), aVar, 0);
                    aVar.G();
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ wmu(q630 q630Var, boolean z, gzs gzsVar, zzs zzsVar, m1i0 m1i0Var) {
        this.c = q630Var;
        this.d = z;
        this.e = gzsVar;
        this.f = zzsVar;
        this.g = m1i0Var;
    }
}
