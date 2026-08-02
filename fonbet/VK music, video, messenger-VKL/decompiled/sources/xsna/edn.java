package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import xsna.cri;
import xsna.dt1;
import xsna.ken;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class edn implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ edn(int i, int i2, Object obj, Object obj2, xzs xzsVar, xzs xzsVar2) {
        this.b = i2;
        this.c = obj;
        this.d = xzsVar;
        this.e = xzsVar2;
        this.f = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                fdn.a((ken.a.C3177a) this.c, (izs) this.d, (izs) this.e, (wh50) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                bco.a((cco) this.c, (gzs) this.d, (gzs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ButtonSize buttonSize = (ButtonSize) this.c;
                lgu0 lgu0Var = (lgu0) this.d;
                au00 au00Var = (au00) this.e;
                au00 au00Var2 = (au00) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(481720660, intValue, -1, "com.vk.ecomm.design.compose.marketbutton.MarketButton.<anonymous> (MarketButton.kt:73)");
                    }
                    q630 E = s200.E(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hr80.z().w(buttonSize, aVar, 6), 1, q630.a.a), kqu0.w, kqu0.r);
                    a.c cVar = androidx.compose.foundation.layout.a.e;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar, dt1.a.l, aVar, 54);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, E);
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
                    zt00.b(buttonSize, lgu0Var, au00Var, au00Var2, aVar, 6);
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

    public /* synthetic */ edn(ButtonSize buttonSize, lgu0 lgu0Var, au00 au00Var, au00 au00Var2) {
        this.b = 2;
        this.c = buttonSize;
        this.d = lgu0Var;
        this.e = au00Var;
        this.f = au00Var2;
    }
}
