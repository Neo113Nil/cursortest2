package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;

/* compiled from: OnlineBookingInternalComponent.kt */
/* loaded from: classes18.dex */
public final class bp80 extends uaj0 {
    public final BookingScreenParams a;

    public bp80(BookingScreenParams bookingScreenParams) {
        this.a = bookingScreenParams;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp80) && epx.f(this.a, ((bp80) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnlineBookingInternalScopeKey(key=" + this.a + ')';
    }
}
