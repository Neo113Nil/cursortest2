package xsna;

import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;

/* compiled from: BookingRecordCompletedScreenPatch.kt */
/* loaded from: classes18.dex */
public interface hu7 extends yl50 {

    /* compiled from: BookingRecordCompletedScreenPatch.kt */
    public static final class a implements hu7 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -899376828;
        }

        public final String toString() {
            return "AbortConfirmCancelRecord";
        }
    }

    /* compiled from: BookingRecordCompletedScreenPatch.kt */
    public static final class b implements hu7 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1642147742;
        }

        public final String toString() {
            return "ConfirmCancelRecord";
        }
    }

    /* compiled from: BookingRecordCompletedScreenPatch.kt */
    public static final class c implements hu7 {
        public final Exception a;
        public final nt7 b;

        public c(Exception exc, nt7 nt7Var) {
            this.a = exc;
            this.b = nt7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(error=" + this.a + ", action=" + this.b + ')';
        }
    }

    /* compiled from: BookingRecordCompletedScreenPatch.kt */
    public static final class d implements hu7 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -380814726;
        }

        public final String toString() {
            return "HideConfirmationCancel";
        }
    }

    /* compiled from: BookingRecordCompletedScreenPatch.kt */
    public static final class e implements hu7 {
        public final BookingRecord a;

        public e(BookingRecord bookingRecord) {
            this.a = bookingRecord;
        }
    }
}
