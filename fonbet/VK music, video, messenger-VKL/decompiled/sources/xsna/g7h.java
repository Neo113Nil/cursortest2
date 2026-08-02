package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.group.AdminLeaveAction;
import xsna.cri;
import xsna.dt1;
import xsna.e4h;
import xsna.jpl0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g7h implements zzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g7h(j7h j7hVar, oap oapVar, String str, AdminLeaveAction adminLeaveAction, String str2) {
        this.c = j7hVar;
        this.d = oapVar;
        this.e = str;
        this.g = adminLeaveAction;
        this.f = str2;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                j7h j7hVar = (j7h) this.c;
                j7hVar.c.h0().e(j7hVar.a, new e4h.c(((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()), new f7h(j7hVar, (oap) this.d, (String) this.e, (AdminLeaveAction) this.g, (String) this.f), null);
                return s3q0.a;
            default:
                rg50 rg50Var = (rg50) this.c;
                rg50 rg50Var2 = (rg50) this.d;
                jpl0.a.d dVar = (jpl0.a.d) this.e;
                t1 t1Var = (t1) this.f;
                izs izsVar = (izs) this.g;
                ((Integer) obj2).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (aVar.t(intValue & 1, (intValue & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(545959976, intValue, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.filters.<anonymous> (GoodsWithFiltersList.kt:154)");
                    }
                    boolean J = aVar.J(rg50Var);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new eph(rg50Var, 23);
                        aVar.R(x);
                    }
                    q630 z = sv1.z(q630.a.a, (izs) x);
                    boolean J2 = aVar.J(rg50Var2);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new v8u(0, rg50Var2);
                        aVar.R(x2);
                    }
                    q630 k = kci.k(z, (izs) x2);
                    boolean J3 = aVar.J(dVar) | aVar.J(t1Var);
                    Object x3 = aVar.x();
                    if (J3 || x3 == c0012a) {
                        x3 = new defpackage.o(19, dVar, t1Var);
                        aVar.R(x3);
                    }
                    q630 o = egi.o(k, (izs) x3);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, o);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    z8u.a(izsVar, aVar, 6);
                    kml0.a(dVar.a.g, izsVar, aVar, 0);
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

    public /* synthetic */ g7h(rg50 rg50Var, rg50 rg50Var2, jpl0.a.d dVar, t1 t1Var, izs izsVar) {
        this.c = rg50Var;
        this.d = rg50Var2;
        this.e = dVar;
        this.f = t1Var;
        this.g = izsVar;
    }
}
