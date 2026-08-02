package xsna;

import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;

/* compiled from: BookingServicesScreen.kt */
/* loaded from: classes18.dex */
public final class ky7 implements gzs<s3q0> {
    public final /* synthetic */ izs<com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> b;
    public final /* synthetic */ BookingServicesScreenState.ServiceWrapper c;

    /* JADX WARN: Multi-variable type inference failed */
    public ky7(izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.a, s3q0> izsVar, BookingServicesScreenState.ServiceWrapper serviceWrapper) {
        this.b = izsVar;
        this.c = serviceWrapper;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.b.invoke(new a.h(this.c));
        return s3q0.a;
    }
}
