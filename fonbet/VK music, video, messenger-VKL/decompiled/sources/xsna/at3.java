package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class at3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ at3(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                dt3.c((jt3) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                jai jaiVar = (jai) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-608227941, intValue, -1, "com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetLayout.kt:272)");
                    }
                    jaiVar.invoke(Integer.valueOf(this.c), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((kwp) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((szy) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((az20) this.d).c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ((bkg0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ at3(kwp kwpVar, int i) {
        this.b = 2;
        this.d = kwpVar;
        this.c = i;
    }

    public /* synthetic */ at3(bkg0 bkg0Var, int i) {
        this.b = 5;
        this.d = bkg0Var;
        this.c = i;
    }
}
