package xsna;

import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class d48 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d48(int i, int i2, Object obj, Object obj2, xzs xzsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = xzsVar;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                f48.b((b48) this.d, (ButtonStyle) this.e, (gzs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                w5c.a((l5c) this.d, (k7r) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                jpl0 jpl0Var = (jpl0) this.d;
                izs izsVar = (izs) this.e;
                a7k0 a7k0Var = (a7k0) this.f;
                dlv0 dlv0Var = (dlv0) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1570748262, intValue, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontScreen.<anonymous> (StorefrontScreen.kt:68)");
                    }
                    phv0.b(null, kai.c(-766907219, new pmg(4, jpl0Var, izsVar), aVar), null, kai.c(1597558251, new a6(14, a7k0Var, dlv0Var), aVar), null, 0, 0L, 0L, kai.c(463156930, new a2x(1, jpl0Var, izsVar), aVar), aVar, 805309488, 501);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ d48(jpl0 jpl0Var, izs izsVar, a7k0 a7k0Var, dlv0 dlv0Var) {
        this.b = 2;
        this.d = jpl0Var;
        this.e = izsVar;
        this.f = a7k0Var;
        this.c = dlv0Var;
    }
}
