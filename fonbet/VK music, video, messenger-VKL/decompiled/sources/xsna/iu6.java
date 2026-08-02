package xsna;

import com.vk.ecomm.market.good.ui.j;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import xsna.bbt;
import xsna.mmh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class iu6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ iu6(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ru6.c((h6p0) this.d, (wh50) this.e, (jai) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                BookingServicesScreenKt.g((String) this.d, this.c, (BookingServiceType) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                ((Integer) obj2).intValue();
                dbt.b((bbt.a) this.d, (rha) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.market.good.ui.j) this.d).h((hid0) this.e, (j.a) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                pmh0.c((mmh0.e) this.d, (q630) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ((o5p0) this.d).a((spg0) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                muv0.d((spg0) this.d, (String) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ iu6(String str, int i, BookingServiceType bookingServiceType, q630 q630Var, int i2) {
        this.b = 1;
        this.d = str;
        this.c = i;
        this.e = bookingServiceType;
        this.f = q630Var;
    }

    public /* synthetic */ iu6(h6p0 h6p0Var, wh50 wh50Var, jai jaiVar, int i) {
        this.b = 0;
        this.d = h6p0Var;
        this.e = wh50Var;
        this.f = jaiVar;
        this.c = i;
    }
}
