package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetSettingsMenuItemDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetSettingsResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingSettingsInteractor.kt */
/* loaded from: classes18.dex */
public final class yy7 {
    public final loi0 a;

    public yy7(loi0 loi0Var) {
        this.a = loi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserId userId, ContinuationImpl continuationImpl) {
        xy7 xy7Var;
        int i;
        Iterator<T> it;
        BookingServiceType bookingServiceType;
        if (continuationImpl instanceof xy7) {
            xy7Var = (xy7) continuationImpl;
            int i2 = xy7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xy7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = xy7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xy7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.l(userId));
                    xy7Var.L$0 = null;
                    xy7Var.label = 1;
                    obj = evj.p(A, xy7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ServiceBookingGetSettingsResponseDto serviceBookingGetSettingsResponseDto = (ServiceBookingGetSettingsResponseDto) obj;
                int f = serviceBookingGetSettingsResponseDto.f();
                String d = serviceBookingGetSettingsResponseDto.d();
                String e = serviceBookingGetSettingsResponseDto.e().e();
                String d2 = serviceBookingGetSettingsResponseDto.e().d();
                String j = serviceBookingGetSettingsResponseDto.j();
                String k = serviceBookingGetSettingsResponseDto.k();
                String l = serviceBookingGetSettingsResponseDto.l();
                List<ServiceBookingGetSettingsMenuItemDto> g = serviceBookingGetSettingsResponseDto.g();
                ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                it = g.iterator();
                while (it.hasNext()) {
                    int i3 = zy7.$EnumSwitchMapping$0[((ServiceBookingGetSettingsMenuItemDto) it.next()).ordinal()];
                    if (i3 == 1) {
                        bookingServiceType = BookingServiceType.INDIVIDUAL;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bookingServiceType = BookingServiceType.GROUP;
                    }
                    arrayList.add(bookingServiceType);
                }
                return new BookingSettings(f, d, e, d2, j, k, l, arrayList, serviceBookingGetSettingsResponseDto.i());
            }
        }
        xy7Var = new xy7(this, continuationImpl);
        Object obj2 = xy7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xy7Var.label;
        if (i != 0) {
        }
        ServiceBookingGetSettingsResponseDto serviceBookingGetSettingsResponseDto2 = (ServiceBookingGetSettingsResponseDto) obj2;
        int f2 = serviceBookingGetSettingsResponseDto2.f();
        String d3 = serviceBookingGetSettingsResponseDto2.d();
        String e2 = serviceBookingGetSettingsResponseDto2.e().e();
        String d22 = serviceBookingGetSettingsResponseDto2.e().d();
        String j2 = serviceBookingGetSettingsResponseDto2.j();
        String k2 = serviceBookingGetSettingsResponseDto2.k();
        String l2 = serviceBookingGetSettingsResponseDto2.l();
        List<ServiceBookingGetSettingsMenuItemDto> g2 = serviceBookingGetSettingsResponseDto2.g();
        ArrayList arrayList2 = new ArrayList(c5g.u(g2, 10));
        it = g2.iterator();
        while (it.hasNext()) {
        }
        return new BookingSettings(f2, d3, e2, d22, j2, k2, l2, arrayList2, serviceBookingGetSettingsResponseDto2.i());
    }
}
