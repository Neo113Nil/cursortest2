package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;

/* compiled from: BookingNavigationEffect.kt */
/* loaded from: classes18.dex */
public interface as7 {

    /* compiled from: BookingNavigationEffect.kt */
    public static final class a implements as7 {
        public final BookingServiceType a;

        public a(BookingServiceType bookingServiceType) {
            this.a = bookingServiceType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            BookingServiceType bookingServiceType = this.a;
            if (bookingServiceType == null) {
                return 0;
            }
            return bookingServiceType.hashCode();
        }

        public final String toString() {
            return "Close(type=" + this.a + ')';
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class b implements as7 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 492685646;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class c implements as7 {
        public final b.j a;

        public c(b.j jVar) {
            this.a = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateBackTo(screen=" + this.a + ')';
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class d implements as7 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NavigateCalendar(params=null)";
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class e implements as7 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NavigateLegal(url="), this.a, ')');
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class f implements as7 {
        public final BookingScreenParams a;

        public f(BookingScreenParams bookingScreenParams) {
            this.a = bookingScreenParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateMasters(params=" + this.a + ')';
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class g implements as7 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NavigateMastersCheckRecord(params=null)";
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class h implements as7 {
        public final BookingScreenParams a;

        public h(BookingScreenParams bookingScreenParams) {
            this.a = bookingScreenParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateMastersRecords(params=" + this.a + ')';
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class i implements as7 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            ((i) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NavigateMenu(params=null)";
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class j implements as7 {
        public final BookingScreenParams a;

        public j(BookingScreenParams bookingScreenParams) {
            this.a = bookingScreenParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            BookingScreenParams bookingScreenParams = this.a;
            if (bookingScreenParams == null) {
                return 0;
            }
            return bookingScreenParams.hashCode();
        }

        public final String toString() {
            return "NavigateNext(params=" + this.a + ')';
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class k implements as7 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            ((k) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NavigateRecordCompleted(params=null)";
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class l implements as7 {
        public final BookingScreenParams a;

        public l(BookingScreenParams bookingScreenParams) {
            this.a = bookingScreenParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateServices(params=" + this.a + ')';
        }
    }

    /* compiled from: BookingNavigationEffect.kt */
    public static final class m implements as7 {
        public final BookingScreenParams a;
        public final boolean b;

        public m(BookingScreenParams bookingScreenParams, boolean z) {
            this.a = bookingScreenParams;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && this.b == mVar.b;
        }

        public final int hashCode() {
            BookingScreenParams bookingScreenParams = this.a;
            return Boolean.hashCode(this.b) + ((bookingScreenParams == null ? 0 : bookingScreenParams.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NavigateStart(params=");
            sb.append(this.a);
            sb.append(", clearBackStack=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
