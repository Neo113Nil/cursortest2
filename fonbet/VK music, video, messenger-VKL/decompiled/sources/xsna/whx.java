package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class whx implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ whx(TopBar$Middle.Text.d dVar, mtk0 mtk0Var, com.vk.core.compose.component.topbar.k kVar, q630 q630Var, int i) {
        this.d = dVar;
        this.e = mtk0Var;
        this.f = kVar;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        q630 g;
        switch (this.b) {
            case 0:
                fw20 fw20Var = (fw20) this.d;
                wzs wzsVar = (wzs) this.e;
                jai jaiVar = (jai) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(391725546, intValue, -1, "com.vk.core.compose.component.internal.SheetSurfaceContent.<anonymous> (InternalModalBottomSheet.kt:299)");
                    }
                    aVar.K(-1508868151);
                    q630.a aVar2 = q630.a.a;
                    q630 g2 = txj0.f(aVar2, 1.0f).g(this.c);
                    wzs<androidx.compose.runtime.a, Integer, zpx0> wzsVar2 = fw20Var.g.k;
                    if (wzsVar2 != null && (g = g2.g(tci.y(aVar2, wzsVar2.invoke(aVar, 0)))) != null) {
                        g2 = g;
                    }
                    aVar.j();
                    boolean J = aVar.J(fw20Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new sop(fw20Var, 18);
                        aVar.R(x);
                    }
                    q630 a = rdu.a(g2, (izs) x);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, a);
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
                    k9q0.w(aVar, a2, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    if (wzsVar != null) {
                        aVar.K(1529200621);
                        nix.a(fw20Var, wzsVar, aVar, 6);
                    } else {
                        aVar.K(1516064898);
                    }
                    aVar.j();
                    jaiVar.invoke(r9g.a, aVar, 6);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Text.d) this.d).a((mtk0) this.e, (com.vk.core.compose.component.topbar.k) this.f, this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ whx(q630 q630Var, fw20 fw20Var, wzs wzsVar, jai jaiVar) {
        this.c = q630Var;
        this.d = fw20Var;
        this.e = wzsVar;
        this.f = jaiVar;
    }
}
