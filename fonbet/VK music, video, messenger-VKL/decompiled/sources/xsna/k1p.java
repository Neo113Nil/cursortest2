package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class k1p implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k1p(com.vk.ecomm.design.compose.productattaches.a aVar, String str, q630 q630Var, boolean z, int i) {
        this.f = aVar;
        this.g = str;
        this.c = q630Var;
        this.d = z;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                l1p.a(this.d, (gzs) this.f, (gzs) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                com.vk.ecomm.design.compose.productattaches.a aVar = (com.vk.ecomm.design.compose.productattaches.a) this.f;
                String str = (String) this.g;
                ((Integer) obj2).getClass();
                aVar.c(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, str, this.c, this.d);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k1p(boolean z, gzs gzsVar, gzs gzsVar2, q630 q630Var, int i) {
        this.d = z;
        this.f = gzsVar;
        this.g = gzsVar2;
        this.c = q630Var;
        this.e = i;
    }
}
