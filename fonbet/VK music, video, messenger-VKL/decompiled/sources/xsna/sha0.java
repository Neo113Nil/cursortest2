package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PickerBookingServicesInteractor.kt */
/* loaded from: classes18.dex */
public final class sha0 implements dmv {
    public final isi0 a;

    public sha0(isi0 isi0Var) {
        this.a = isi0Var;
    }

    @Override // xsna.dmv
    public final Object a(vhn0 vhn0Var, UserId userId, BookingMaster bookingMaster, spj spjVar) {
        return zvj.d(new rha0(this, userId, null), spjVar);
    }

    @Override // xsna.dmv
    public final Object b(UserId userId, BookingMaster bookingMaster, List<BookingServiceModel> list, spj<? super List<BookingServiceModel>> spjVar) {
        return EmptyList.b;
    }

    @Override // xsna.dmv
    public final Object c(UserId userId, BookingMaster bookingMaster, List list, spj spjVar) {
        return EmptyList.b;
    }
}
