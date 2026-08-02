package xsna;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BookingCalendarScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class qn7 extends FunctionReferenceImpl implements izs<BookingCalendarScreenState, sn7> {
    public static final qn7 b = new qn7(1, com.vk.ecomm.onlinebooking.impl.calendar.i.class, "composeMasterFilter", "composeMasterFilter(Lcom/vk/ecomm/onlinebooking/impl/calendar/BookingCalendarScreenState;)Lcom/vk/ecomm/onlinebooking/impl/calendar/BookingCalendarScreenRenderer$MasterFilter;", 1);

    @Override // xsna.izs
    public final sn7 invoke(BookingCalendarScreenState bookingCalendarScreenState) {
        ym7 ym7Var = bookingCalendarScreenState.f;
        BookingMaster bookingMaster = ym7Var.c;
        if (bookingMaster == null || !ym7Var.d) {
            return null;
        }
        return new sn7(bookingMaster.c, ym7Var.b);
    }
}
