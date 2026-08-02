package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import xsna.lu7;
import xsna.vu7;

/* compiled from: BookingRecordCompletedScreenMapper.kt */
/* loaded from: classes18.dex */
public final class gu7 {
    public static final vu7 a(lu7 lu7Var, BookingScreenParams bookingScreenParams) {
        String str;
        BookingRecord bookingRecord;
        BookingMaster bookingMaster;
        String str2;
        BookingRecord bookingRecord2 = lu7Var.d;
        av7 b = bookingRecord2 != null ? wu7.b(bookingRecord2) : null;
        boolean z = lu7Var.e;
        boolean z2 = lu7Var.b;
        lu7.a aVar = lu7Var.c;
        BookingSettings bookingSettings = bookingScreenParams.d;
        String str3 = bookingSettings.c;
        vu7.a aVar2 = new vu7.a(bookingSettings.d, bookingSettings.e);
        if (b == null || (bookingRecord = b.e) == null || (bookingMaster = bookingRecord.f) == null || (str2 = bookingMaster.j) == null) {
            BookingMaster bookingMaster2 = bookingScreenParams.f;
            str = bookingMaster2 != null ? bookingMaster2.j : null;
        } else {
            str = str2;
        }
        return new vu7(b, z, aVar, z2, str3, aVar2, str);
    }
}
