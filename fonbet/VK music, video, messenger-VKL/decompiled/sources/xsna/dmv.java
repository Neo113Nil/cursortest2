package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.util.List;

/* compiled from: IBookingServicesInteractor.kt */
/* loaded from: classes18.dex */
public interface dmv {
    Object a(vhn0 vhn0Var, UserId userId, BookingMaster bookingMaster, spj spjVar);

    Object b(UserId userId, BookingMaster bookingMaster, List<BookingServiceModel> list, spj<? super List<BookingServiceModel>> spjVar);

    Object c(UserId userId, BookingMaster bookingMaster, List list, spj spjVar);
}
