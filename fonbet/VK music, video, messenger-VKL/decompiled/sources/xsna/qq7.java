package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingCreatedRecordDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.cmv;

/* compiled from: BookingGroupsEditInteractor.kt */
/* loaded from: classes18.dex */
public final class qq7 extends g76 {
    @Override // xsna.cmv
    public final BookingEditModel a(cmv.b bVar, BookingEditModel.c cVar, BookingSettings bookingSettings) {
        BookingEditModel.EditMode editMode = bVar.b;
        BookingScreenParams bookingScreenParams = bVar.a;
        return new BookingEditModel(editMode, bookingScreenParams.f, g76.g(bookingScreenParams.h), bookingScreenParams.e, d(cVar, bookingScreenParams.i, bookingScreenParams.k, bookingScreenParams.j, bVar.c), bookingSettings.f, bookingSettings.g, bookingSettings.h, bookingScreenParams.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // xsna.cmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cmv.b bVar, BookingEditModel bookingEditModel, String str, Boolean bool, ContinuationImpl continuationImpl) {
        pq7 pq7Var;
        int i;
        if (continuationImpl instanceof pq7) {
            pq7Var = (pq7) continuationImpl;
            int i2 = pq7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pq7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = pq7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pq7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    UserId userId = bVar.a.b;
                    int i3 = bookingEditModel.c.e;
                    BookingEditModel.b bVar2 = bookingEditModel.e;
                    boolean z = bVar2.f;
                    String str2 = bVar2.a;
                    if (z) {
                        str2 = null;
                    }
                    iz2 A = yfb.A(this.a.m(userId, i3, str2, !z ? bVar2.c : null, Boolean.valueOf(z), new Integer(bookingEditModel.i), str, bool));
                    pq7Var.L$0 = null;
                    pq7Var.L$1 = null;
                    pq7Var.L$2 = null;
                    pq7Var.L$3 = null;
                    pq7Var.label = 1;
                    obj = evj.p(A, pq7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ServiceBookingCreatedRecordDto serviceBookingCreatedRecordDto = (ServiceBookingCreatedRecordDto) obj;
                return new cmv.a(serviceBookingCreatedRecordDto.e(), serviceBookingCreatedRecordDto.d());
            }
        }
        pq7Var = new pq7(this, continuationImpl);
        Object obj2 = pq7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pq7Var.label;
        if (i != 0) {
        }
        ServiceBookingCreatedRecordDto serviceBookingCreatedRecordDto2 = (ServiceBookingCreatedRecordDto) obj2;
        return new cmv.a(serviceBookingCreatedRecordDto2.e(), serviceBookingCreatedRecordDto2.d());
    }
}
