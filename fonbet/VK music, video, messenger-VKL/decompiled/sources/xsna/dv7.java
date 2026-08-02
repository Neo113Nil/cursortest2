package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;

/* compiled from: BookingRecordsScreenAction.kt */
/* loaded from: classes18.dex */
public interface dv7 extends kj50 {

    /* compiled from: BookingRecordsScreenAction.kt */
    public static final class a implements dv7 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 671704965;
        }

        public final String toString() {
            return "CancelRecord";
        }
    }

    /* compiled from: BookingRecordsScreenAction.kt */
    public static final class b implements dv7 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -998626;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: BookingRecordsScreenAction.kt */
    public static final class c implements dv7 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -967139847;
        }

        public final String toString() {
            return "DoNotCancelRecord";
        }
    }

    /* compiled from: BookingRecordsScreenAction.kt */
    public static final class d implements dv7 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 15509679;
        }

        public final String toString() {
            return "LoadNextRecords";
        }
    }

    /* compiled from: BookingRecordsScreenAction.kt */
    public static final class e implements dv7 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1550123538;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BookingRecordsScreenAction.kt */
    public static final class f implements dv7 {
        public final BookingScreenParams b;

        public f(BookingScreenParams bookingScreenParams) {
            this.b = bookingScreenParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenScreen(params=" + this.b + ')';
        }
    }

    /* compiled from: BookingRecordsScreenAction.kt */
    public static final class g implements dv7 {
        public final BookingButton.Action b;
        public final BookingRecord c;

        public g(BookingButton.Action action, BookingRecord bookingRecord) {
            this.b = action;
            this.c = bookingRecord;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "RecordButtonClick(action=" + this.b + ", record=" + this.c + ')';
        }
    }

    /* compiled from: BookingRecordsScreenAction.kt */
    public static final class h implements dv7 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1048057294;
        }

        public final String toString() {
            return "RetryLoadRecords";
        }
    }
}
