package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;

/* compiled from: BookingPreloaderState.kt */
/* loaded from: classes18.dex */
public final class ss7 implements lm50 {
    public final BookingScreenParams b;
    public final boolean c;
    public final Exception d;

    public ss7(BookingScreenParams bookingScreenParams, boolean z, Exception exc) {
        this.b = bookingScreenParams;
        this.c = z;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss7)) {
            return false;
        }
        ss7 ss7Var = (ss7) obj;
        return epx.f(this.b, ss7Var.b) && this.c == ss7Var.c && epx.f(this.d, ss7Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        Exception exc = this.d;
        return b + (exc == null ? 0 : exc.hashCode());
    }

    public final String toString() {
        return "BookingPreloaderState(params=" + this.b + ", loading=" + this.c + ", error=" + this.d + ')';
    }
}
