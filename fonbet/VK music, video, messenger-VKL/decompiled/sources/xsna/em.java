package xsna;

import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import xsna.dt70;
import xsna.kyl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class em implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ em(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                hm.a((f5z) this.d, this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(513);
                ((hw2) this.d).h((iw2) this.e, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(1);
                hwl.d(this.c, (kyl.e.d) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, I3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(1);
                zbz.a((wbz) this.d, (q630) this.e, this.c, (androidx.compose.runtime.a) obj, I4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int I5 = ne7.I(385);
                zs70.b((dt70.b) this.d, this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, I5);
                break;
            default:
                ((Integer) obj2).getClass();
                int I6 = ne7.I(1);
                com.vk.newsfeed.posting.privacy_picker.presentation.b.b((PrivacyViewState.a) this.d, this.c, (q630) this.e, (androidx.compose.runtime.a) obj, I6);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ em(Object obj, izs izsVar, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = obj2;
    }

    public /* synthetic */ em(izs izsVar, kyl.e.d dVar, q630 q630Var, int i) {
        this.b = 2;
        this.c = izsVar;
        this.d = dVar;
        this.e = q630Var;
    }
}
