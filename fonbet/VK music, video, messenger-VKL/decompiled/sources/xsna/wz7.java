package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import java.util.ArrayList;

/* compiled from: BookingStartScreenPatch.kt */
/* loaded from: classes18.dex */
public final class wz7 implements com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.i {
    public final BookingSettings a;
    public final ArrayList b;
    public final BookingRecord c;
    public final boolean d;
    public final BookingActionResult e;

    public wz7(BookingSettings bookingSettings, ArrayList arrayList, BookingRecord bookingRecord, boolean z, BookingActionResult bookingActionResult) {
        this.a = bookingSettings;
        this.b = arrayList;
        this.c = bookingRecord;
        this.d = z;
        this.e = bookingActionResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz7)) {
            return false;
        }
        wz7 wz7Var = (wz7) obj;
        return epx.f(this.a, wz7Var.a) && this.b.equals(wz7Var.b) && epx.f(this.c, wz7Var.c) && this.d == wz7Var.d && this.e == wz7Var.e;
    }

    public final int hashCode() {
        BookingSettings bookingSettings = this.a;
        int a = qr.a(this.b, (bookingSettings == null ? 0 : bookingSettings.hashCode()) * 31, 31);
        BookingRecord bookingRecord = this.c;
        int b = qoy.b((a + (bookingRecord == null ? 0 : bookingRecord.hashCode())) * 31, 31, this.d);
        BookingActionResult bookingActionResult = this.e;
        return b + (bookingActionResult != null ? bookingActionResult.hashCode() : 0);
    }

    public final String toString() {
        return "DataLoaded(settings=" + this.a + ", masters=" + this.b + ", record=" + this.c + ", showAllRecords=" + this.d + ", actionResult=" + this.e + ')';
    }
}
