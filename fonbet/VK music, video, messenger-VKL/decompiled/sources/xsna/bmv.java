package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.ym7;

/* compiled from: IBookingCalendarInteractor.kt */
/* loaded from: classes18.dex */
public interface bmv {

    /* compiled from: IBookingCalendarInteractor.kt */
    public static final class a {
        public final BookingScreenParams a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a(BookingScreenParams bookingScreenParams, boolean z, boolean z2, boolean z3) {
            this.a = bookingScreenParams;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }
    }

    Object a(a aVar, ym7.b bVar, boolean z, ContinuationImpl continuationImpl);
}
