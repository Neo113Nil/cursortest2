package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import xsna.loh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tx7 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tx7(a.InterfaceC0987a.C0988a c0988a, BookingServiceType bookingServiceType, izs izsVar, q630 q630Var, int i) {
        this.d = c0988a;
        this.e = bookingServiceType;
        this.c = izsVar;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                BookingServicesScreenKt.k((a.InterfaceC0987a.C0988a) this.d, (BookingServiceType) this.e, this.c, (q630) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                ((koh0) this.d).m((loh0.e.a) this.e, (c1h) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ tx7(koh0 koh0Var, loh0.e.a aVar, c1h c1hVar, izs izsVar, int i) {
        this.d = koh0Var;
        this.e = aVar;
        this.f = c1hVar;
        this.c = izsVar;
    }
}
