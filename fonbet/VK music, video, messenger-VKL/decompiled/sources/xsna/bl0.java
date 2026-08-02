package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bl0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bl0(int i, String str, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        this.b = 1;
        this.c = str;
        this.d = gzsVar;
        this.f = gzsVar2;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                String str2 = (String) this.f;
                gzs gzsVar = (gzs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                cl0.a(ne7.I(3073), (androidx.compose.runtime.a) obj, str, str2, gzsVar, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                kx9.a((String) this.c, (gzs) this.d, (gzs) this.f, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                t2k.b((u2k) this.c, (r5j0) this.f, (gzs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                v6p0 v6p0Var = (v6p0) this.c;
                izs izsVar = (izs) this.f;
                mc90 mc90Var = (mc90) this.d;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(357080676, intValue, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContent.<anonymous> (GamesCatalogMainTabScreen.kt:99)");
                    }
                    xlu0.a(v6p0Var, null, kai.c(829036413, new xwl(izsVar, mc90Var, mtk0Var, 1), aVar), dgi.a, aVar, 3456);
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

    public /* synthetic */ bl0(Object obj, Object obj2, gzs gzsVar, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.f = obj2;
        this.d = gzsVar;
        this.e = q630Var;
    }

    public /* synthetic */ bl0(v6p0 v6p0Var, izs izsVar, mc90 mc90Var, wh50 wh50Var) {
        this.b = 3;
        this.c = v6p0Var;
        this.f = izsVar;
        this.d = mc90Var;
        this.e = wh50Var;
    }
}
