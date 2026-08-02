package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import java.util.List;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class oy7 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ BookingServiceType c;
    public final /* synthetic */ a.InterfaceC0987a.C0988a d;
    public final /* synthetic */ izs e;

    public oy7(List list, BookingServiceType bookingServiceType, a.InterfaceC0987a.C0988a c0988a, izs izsVar) {
        this.b = list;
        this.c = bookingServiceType;
        this.d = c0988a;
        this.e = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            BookingServicesScreenState.ServiceWrapper serviceWrapper = (BookingServicesScreenState.ServiceWrapper) this.b.get(intValue);
            aVar2.K(1406967678);
            int i2 = BookingServicesScreenKt.h.$EnumSwitchMapping$0[this.c.ordinal()];
            Object obj = a.C0011a.a;
            a.InterfaceC0987a.C0988a c0988a = this.d;
            izs izsVar = this.e;
            if (i2 == 1) {
                aVar2.K(1407042356);
                q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 1, q630.a.a);
                BookingServiceModel bookingServiceModel = serviceWrapper.b;
                boolean z = serviceWrapper.c;
                boolean z2 = serviceWrapper.d;
                String str = c0988a.g;
                boolean z3 = c0988a.i.a;
                boolean J = aVar2.J(izsVar) | aVar2.J(serviceWrapper);
                Object x = aVar2.x();
                if (J || x == obj) {
                    x = new ky7(izsVar, serviceWrapper);
                    aVar2.R(x);
                }
                uw7.c(bookingServiceModel, str, z, z2, F, false, z3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (gzs) x, aVar2, 0);
                aVar2.j();
            } else {
                if (i2 != 2) {
                    throw alb0.c(-1062992603, aVar2);
                }
                aVar2.K(1407672493);
                BookingServiceModel bookingServiceModel2 = serviceWrapper.b;
                boolean z4 = serviceWrapper.d;
                String str2 = c0988a.g;
                boolean J2 = aVar2.J(izsVar) | aVar2.J(serviceWrapper);
                Object x2 = aVar2.x();
                if (J2 || x2 == obj) {
                    x2 = new ly7(izsVar, serviceWrapper);
                    aVar2.R(x2);
                }
                uw7.a(bookingServiceModel2, str2, z4, null, false, (gzs) x2, aVar2, 0);
                aVar2.j();
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
