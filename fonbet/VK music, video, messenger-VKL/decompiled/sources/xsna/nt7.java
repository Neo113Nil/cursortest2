package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;

/* compiled from: BookingRecordCompletedScreenAction.kt */
/* loaded from: classes18.dex */
public interface nt7 extends lj50 {

    /* compiled from: BookingRecordCompletedScreenAction.kt */
    public static final class a implements nt7 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -320033056;
        }

        public final String toString() {
            return "CancelRecord";
        }
    }

    /* compiled from: BookingRecordCompletedScreenAction.kt */
    public static final class b implements nt7 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -777438173;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: BookingRecordCompletedScreenAction.kt */
    public static final class c implements nt7 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1521792894;
        }

        public final String toString() {
            return "DoNotCancelRecord";
        }
    }

    /* compiled from: BookingRecordCompletedScreenAction.kt */
    public static final class d implements nt7 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -24808101;
        }

        public final String toString() {
            return "Load";
        }
    }

    /* compiled from: BookingRecordCompletedScreenAction.kt */
    public static final class e implements nt7 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -763807794;
        }

        public final String toString() {
            return "Ready";
        }
    }

    /* compiled from: BookingRecordCompletedScreenAction.kt */
    public static final class f implements nt7 {
        public final BookingButton.Action b;
        public final BookingRecord c;

        public f(BookingButton.Action action, BookingRecord bookingRecord) {
            this.b = action;
            this.c = bookingRecord;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "RecordButtonClick(action=" + this.b + ", record=" + this.c + ')';
        }
    }
}
