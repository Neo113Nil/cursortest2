package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;

/* compiled from: BookingRecordsScreenPatch.kt */
/* loaded from: classes18.dex */
public interface xv7 extends xl50 {

    /* compiled from: BookingRecordsScreenPatch.kt */
    public static final class a implements xv7 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1780774783;
        }

        public final String toString() {
            return "AbortConfirmCancelRecord";
        }
    }

    /* compiled from: BookingRecordsScreenPatch.kt */
    public static final class b implements xv7 {
        public final BookingRecord b;

        public b(BookingRecord bookingRecord) {
            this.b = bookingRecord;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ConfirmCancelRecord(record=" + this.b + ')';
        }
    }

    /* compiled from: BookingRecordsScreenPatch.kt */
    public static final class c implements xv7 {
        public final Exception b;
        public final dv7 c;

        public c(Exception exc, dv7 dv7Var) {
            this.b = exc;
            this.c = dv7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(error=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: BookingRecordsScreenPatch.kt */
    public static final class d implements xv7 {
        public final cv7 b;
        public final BookingScreenParams c;
        public final BookingActionResult d;

        public d(cv7 cv7Var, BookingScreenParams bookingScreenParams, BookingActionResult bookingActionResult) {
            this.b = cv7Var;
            this.c = bookingScreenParams;
            this.d = bookingActionResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            BookingActionResult bookingActionResult = this.d;
            return hashCode + (bookingActionResult == null ? 0 : bookingActionResult.hashCode());
        }

        public final String toString() {
            return "Init(data=" + this.b + ", params=" + this.c + ", actionResult=" + this.d + ')';
        }
    }

    /* compiled from: BookingRecordsScreenPatch.kt */
    public static final class e implements xv7 {
        public final BookingScreenParams b;

        public e(BookingScreenParams bookingScreenParams) {
            this.b = bookingScreenParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loading(params=" + this.b + ')';
        }
    }
}
