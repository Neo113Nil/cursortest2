package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class orv implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ orv(int i, jai jaiVar, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, wzs wzsVar4) {
        this.d = i;
        this.e = wzsVar;
        this.f = jaiVar;
        this.g = wzsVar2;
        this.h = wzsVar3;
        this.c = wzsVar4;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((qrv) this.e).a((gzs) this.f, (gzs) this.g, (x5) this.h, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                mc90 mc90Var = (mc90) this.e;
                mc90 mc90Var2 = (mc90) this.f;
                mc90 mc90Var3 = (mc90) this.g;
                hh80 hh80Var = (hh80) this.h;
                izs izsVar = (izs) this.c;
                ((Integer) obj2).intValue();
                pf80.f(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, hh80Var, mc90Var, mc90Var2, mc90Var3);
                break;
            default:
                wzs wzsVar = (wzs) this.e;
                jai jaiVar = (jai) this.f;
                wzs wzsVar2 = (wzs) this.g;
                wzs wzsVar3 = (wzs) this.h;
                wzs wzsVar4 = (wzs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2113521498, intValue, -1, "com.vk.core.compose.component.VkScaffold.<anonymous> (VkScaffold.kt:34)");
                    }
                    phv0.a(this.d, wzsVar, jaiVar, wzsVar2, wzsVar3, wzsVar4, aVar, 0);
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

    public /* synthetic */ orv(int i, izs izsVar, hh80 hh80Var, mc90 mc90Var, mc90 mc90Var2, mc90 mc90Var3) {
        this.e = mc90Var;
        this.f = mc90Var2;
        this.g = mc90Var3;
        this.h = hh80Var;
        this.c = izsVar;
        this.d = i;
    }

    public /* synthetic */ orv(qrv qrvVar, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.e = qrvVar;
        this.f = gzsVar;
        this.g = gzsVar2;
        this.h = x5Var;
        this.c = izsVar;
        this.d = i;
    }
}
