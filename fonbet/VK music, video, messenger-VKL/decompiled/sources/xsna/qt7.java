package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;

/* compiled from: BookingRecordCompletedScreenEvent.kt */
/* loaded from: classes18.dex */
public interface qt7 extends pk50 {

    /* compiled from: BookingRecordCompletedScreenEvent.kt */
    public interface a extends qt7 {

        /* compiled from: BookingRecordCompletedScreenEvent.kt */
        /* renamed from: xsna.qt7$a$a, reason: collision with other inner class name */
        public static final class C3570a implements a {
            public final Integer a;
            public final BookingServiceType b;

            public C3570a(Integer num, BookingServiceType bookingServiceType) {
                this.a = num;
                this.b = bookingServiceType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3570a)) {
                    return false;
                }
                C3570a c3570a = (C3570a) obj;
                return epx.f(this.a, c3570a.a) && this.b == c3570a.b;
            }

            public final int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                BookingServiceType bookingServiceType = this.b;
                return hashCode + (bookingServiceType != null ? bookingServiceType.hashCode() : 0);
            }

            public final String toString() {
                return "CancelSuccess(bookingId=" + this.a + ", type=" + this.b + ')';
            }
        }
    }

    /* compiled from: BookingRecordCompletedScreenEvent.kt */
    public static final class b implements qt7 {
        public final BookingError.RecordCancellationException a;

        public b(BookingError.RecordCancellationException recordCancellationException) {
            this.a = recordCancellationException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return -1926925854;
        }

        public final String toString() {
            return "Error(exception=" + this.a + ')';
        }
    }

    /* compiled from: BookingRecordCompletedScreenEvent.kt */
    public interface c extends qt7 {

        /* compiled from: BookingRecordCompletedScreenEvent.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2016565386;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* compiled from: BookingRecordCompletedScreenEvent.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1909719371;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: BookingRecordCompletedScreenEvent.kt */
        /* renamed from: xsna.qt7$c$c, reason: collision with other inner class name */
        public static final class C3571c implements c {
            public final UserId a;
            public final BookingSettings b;
            public final BookingRecord c;

            public C3571c(UserId userId, BookingSettings bookingSettings, BookingRecord bookingRecord) {
                this.a = userId;
                this.b = bookingSettings;
                this.c = bookingRecord;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3571c)) {
                    return false;
                }
                C3571c c3571c = (C3571c) obj;
                return epx.f(this.a, c3571c.a) && epx.f(this.b, c3571c.b) && epx.f(this.c, c3571c.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
            }

            public final String toString() {
                return "MoveRecord(groupId=" + this.a + ", settings=" + this.b + ", record=" + this.c + ')';
            }
        }

        /* compiled from: BookingRecordCompletedScreenEvent.kt */
        public static final class d implements c {
            public final UserId a;
            public final BookingSettings b;
            public final BookingRecord c;

            public d(UserId userId, BookingSettings bookingSettings, BookingRecord bookingRecord) {
                this.a = userId;
                this.b = bookingSettings;
                this.c = bookingRecord;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
            }

            public final String toString() {
                return "RetryRecord(groupId=" + this.a + ", settings=" + this.b + ", record=" + this.c + ')';
            }
        }

        /* compiled from: BookingRecordCompletedScreenEvent.kt */
        public static final class e implements c {
            public final BookingScreenParams a;

            public e(BookingScreenParams bookingScreenParams) {
                this.a = bookingScreenParams;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a.equals(((e) obj).a);
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "StartFlow(params=" + this.a + ", needClearBackStack=true)";
            }
        }
    }
}
