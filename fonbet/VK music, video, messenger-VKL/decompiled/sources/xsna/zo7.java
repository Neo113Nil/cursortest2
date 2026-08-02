package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingAppointmentDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCreateRecordsResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCreatedRecordDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.cmv;

/* compiled from: BookingEditInteractor.kt */
/* loaded from: classes18.dex */
public final class zo7 extends g76 {
    @Override // xsna.cmv
    public final BookingEditModel a(cmv.b bVar, BookingEditModel.c cVar, BookingSettings bookingSettings) {
        BookingEditModel.EditMode editMode = bVar.b;
        BookingScreenParams bookingScreenParams = bVar.a;
        return new BookingEditModel(editMode, bookingScreenParams.f, g76.g(bookingScreenParams.h), bookingScreenParams.e, d(cVar, bookingScreenParams.i, bookingScreenParams.k, bookingScreenParams.j, bVar.c), bookingSettings.f, bookingSettings.g, bookingSettings.h, bookingScreenParams.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // xsna.cmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cmv.b bVar, BookingEditModel bookingEditModel, String str, Boolean bool, ContinuationImpl continuationImpl) {
        yo7 yo7Var;
        int i;
        if (continuationImpl instanceof yo7) {
            yo7Var = (yo7) continuationImpl;
            int i2 = yo7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yo7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = yo7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yo7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    BookingScreenParams bookingScreenParams = bVar.a;
                    UserId userId = bookingScreenParams.b;
                    BookingEditModel.b bVar2 = bookingEditModel.e;
                    boolean z = bVar2.f;
                    String str2 = bVar2.a;
                    if (z) {
                        str2 = null;
                    }
                    String str3 = !z ? bVar2.c : null;
                    BookingMaster bookingMaster = bookingScreenParams.f;
                    Integer num = bookingMaster != null ? new Integer(bookingMaster.b) : null;
                    BookingScreenParams.DateTime dateTime = bVar.a.h;
                    String str4 = dateTime != null ? dateTime.b : null;
                    if (str4 == null) {
                        throw new IllegalStateException("dateTime cannot be null when confirming");
                    }
                    List<BookingServiceModel> list = bookingEditModel.d;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((BookingServiceModel) it.next()).b));
                    }
                    iz2 A = yfb.A(this.a.i(userId, Collections.singletonList(new ServiceBookingAppointmentDto(0, str4, arrayList, num)), str2, str3, Boolean.valueOf(z), new Integer(bookingEditModel.i), str, bool));
                    yo7Var.L$0 = null;
                    yo7Var.L$1 = null;
                    yo7Var.L$2 = null;
                    yo7Var.L$3 = null;
                    yo7Var.label = 1;
                    obj = evj.p(A, yo7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ServiceBookingCreatedRecordDto serviceBookingCreatedRecordDto = ((ServiceBookingCreateRecordsResponseDto) obj).d().get(0);
                return new cmv.a(serviceBookingCreatedRecordDto.e(), serviceBookingCreatedRecordDto.d());
            }
        }
        yo7Var = new yo7(this, continuationImpl);
        Object obj2 = yo7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yo7Var.label;
        if (i != 0) {
        }
        ServiceBookingCreatedRecordDto serviceBookingCreatedRecordDto2 = ((ServiceBookingCreateRecordsResponseDto) obj2).d().get(0);
        return new cmv.a(serviceBookingCreatedRecordDto2.e(), serviceBookingCreatedRecordDto2.d());
    }
}
