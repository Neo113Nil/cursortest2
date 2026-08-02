package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingAddressDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingBookedServiceDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingBookedStaffDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCompanyDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingRecordDto;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: BookingRecordExtensions.kt */
/* loaded from: classes18.dex */
public final class wu7 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final BookingRecord a(ServiceBookingRecordDto serviceBookingRecordDto, int i, String str, String str2) {
        String str3;
        int i2;
        ServiceBookingBookedStaffDto B = serviceBookingRecordDto.B();
        ServiceBookingAddressDto e = serviceBookingRecordDto.e();
        BookingMaster bookingMaster = new BookingMaster(B.getId(), B.e(), false, B.i(), B.g() == 1, B.f().d(), B.j(), B.d(), e != null ? e.d() : null);
        try {
            str3 = str;
            try {
                i2 = (int) OffsetDateTime.parse(str3, DateTimeFormatter.ISO_OFFSET_DATE_TIME).withOffsetSameLocal(ZonedDateTime.now().getOffset()).toEpochSecond();
            } catch (DateTimeParseException e2) {
                e = e2;
                com.vk.metrics.eventtracking.b.a.a(e);
                i2 = 0;
                List<ServiceBookingBookedServiceDto> u = serviceBookingRecordDto.u();
                ArrayList arrayList = new ArrayList(c5g.u(u, 10));
                int i3 = 0;
                while (r0.hasNext()) {
                }
                boolean g = serviceBookingRecordDto.g();
                boolean f = serviceBookingRecordDto.f();
                Boolean i4 = serviceBookingRecordDto.i();
                if (i4 != null) {
                }
                ServiceBookingCompanyDto k = serviceBookingRecordDto.k();
                return new BookingRecord(i, serviceBookingRecordDto.o(), serviceBookingRecordDto.n(), arrayList, bookingMaster, i2, str3, 0, g, f, r13, new BookingRecord.Company(k.e(), k.d()), serviceBookingRecordDto.j(), serviceBookingRecordDto.d(), str2, 128, null);
            }
        } catch (DateTimeParseException e3) {
            e = e3;
            str3 = str;
        }
        List<ServiceBookingBookedServiceDto> u2 = serviceBookingRecordDto.u();
        ArrayList arrayList2 = new ArrayList(c5g.u(u2, 10));
        int i32 = 0;
        for (Object obj : u2) {
            int i5 = i32 + 1;
            if (i32 < 0) {
                e43.t();
                throw null;
            }
            ServiceBookingBookedServiceDto serviceBookingBookedServiceDto = (ServiceBookingBookedServiceDto) obj;
            arrayList2.add(new BookingServiceModel(serviceBookingBookedServiceDto.getId(), serviceBookingBookedServiceDto.getTitle(), null, serviceBookingBookedServiceDto.f(), serviceBookingBookedServiceDto.e(), serviceBookingBookedServiceDto.d(), null, null, true, serviceBookingBookedServiceDto.g(), null, i32));
            i32 = i5;
        }
        boolean g2 = serviceBookingRecordDto.g();
        boolean f2 = serviceBookingRecordDto.f();
        Boolean i42 = serviceBookingRecordDto.i();
        boolean booleanValue = i42 != null ? i42.booleanValue() : false;
        ServiceBookingCompanyDto k2 = serviceBookingRecordDto.k();
        return new BookingRecord(i, serviceBookingRecordDto.o(), serviceBookingRecordDto.n(), arrayList2, bookingMaster, i2, str3, 0, g2, f2, booleanValue, new BookingRecord.Company(k2.e(), k2.d()), serviceBookingRecordDto.j(), serviceBookingRecordDto.d(), str2, 128, null);
    }

    public static final av7 b(BookingRecord bookingRecord) {
        String g0 = j5g.g0(bookingRecord.e, ", ", null, null, 0, new wh1(6), 30);
        ListBuilder e = e43.e();
        if (bookingRecord.k) {
            e.add(new BookingButton(BookingButton.Action.Reschedule));
        }
        if (bookingRecord.j) {
            e.add(new BookingButton(BookingButton.Action.Cancel));
        }
        if (bookingRecord.l) {
            e.add(new BookingButton(BookingButton.Action.Other));
        }
        ListBuilder g = e.g();
        int i = bookingRecord.g;
        BookingMaster bookingMaster = bookingRecord.f;
        return new av7(i, g0, bookingMaster != null ? bookingMaster.i : "", bookingMaster != null ? bookingMaster.c : "", bookingRecord, g);
    }
}
