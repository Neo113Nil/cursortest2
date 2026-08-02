package xsna;

import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fx7 implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ fx7(int i, String str, String str2, String str3, gzs gzsVar, boolean z) {
        this.c = gzsVar;
        this.e = z;
        this.d = str;
        this.h = str2;
        this.f = str3;
        this.g = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                gx7.a((BookingServicesScreenState.e) this.h, (q630) this.f, this.d, this.c, this.e, this.g, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                lg90 lg90Var = (lg90) this.h;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                ay9.k(ne7.I(this.g | 1), (androidx.compose.runtime.a) obj, this.d, this.c, q630Var, lg90Var, this.e);
                break;
            default:
                String str = (String) this.h;
                String str2 = (String) this.f;
                ((Integer) obj2).getClass();
                qed0.c(ne7.I(this.g | 1), (androidx.compose.runtime.a) obj, this.d, str, str2, this.c, this.e);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fx7(int i, String str, gzs gzsVar, q630 q630Var, lg90 lg90Var, boolean z) {
        this.c = gzsVar;
        this.h = lg90Var;
        this.d = str;
        this.e = z;
        this.f = q630Var;
        this.g = i;
    }

    public /* synthetic */ fx7(BookingServicesScreenState.e eVar, q630 q630Var, String str, gzs gzsVar, boolean z, int i, int i2) {
        this.h = eVar;
        this.f = q630Var;
        this.d = str;
        this.c = gzsVar;
        this.e = z;
        this.g = i;
    }
}
