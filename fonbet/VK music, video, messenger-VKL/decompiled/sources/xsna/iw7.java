package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.List;
import java.util.Map;

/* compiled from: BookingRecordsScreenState.kt */
/* loaded from: classes18.dex */
public interface iw7 extends km50 {

    /* compiled from: BookingRecordsScreenState.kt */
    public static final class a implements iw7 {
        public final Exception b;
        public final dv7 c;

        public a(Exception exc, dv7 dv7Var) {
            this.b = exc;
            this.c = dv7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(cause=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: BookingRecordsScreenState.kt */
    public static final class b implements iw7 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1061786347;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: BookingRecordsScreenState.kt */
    public static final class c implements iw7 {
        public final BookingScreenParams b;

        public c(BookingScreenParams bookingScreenParams) {
            this.b = bookingScreenParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loading(params=" + this.b + ')';
        }
    }

    /* compiled from: BookingRecordsScreenState.kt */
    public static final class d implements iw7 {
        public final Map<Integer, List<bv7>> b;
        public final int c;
        public final BookingScreenParams d;
        public final BookingRecord e;
        public final BookingActionResult f;
        public final boolean g;
        public final boolean h;

        public d() {
            this(null, null, null, false, 127);
        }

        public static d a(d dVar, Map map, int i, BookingRecord bookingRecord, boolean z, boolean z2, int i2) {
            if ((i2 & 1) != 0) {
                map = dVar.b;
            }
            Map map2 = map;
            if ((i2 & 2) != 0) {
                i = dVar.c;
            }
            int i3 = i;
            BookingScreenParams bookingScreenParams = dVar.d;
            if ((i2 & 8) != 0) {
                bookingRecord = dVar.e;
            }
            BookingRecord bookingRecord2 = bookingRecord;
            BookingActionResult bookingActionResult = dVar.f;
            if ((i2 & 32) != 0) {
                z = dVar.g;
            }
            boolean z3 = z;
            if ((i2 & 64) != 0) {
                z2 = dVar.h;
            }
            dVar.getClass();
            return new d(map2, i3, bookingScreenParams, bookingRecord2, bookingActionResult, z3, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h;
        }

        public final int hashCode() {
            int a = shy.a(this.c, this.b.hashCode() * 31, 31);
            BookingScreenParams bookingScreenParams = this.d;
            int hashCode = (a + (bookingScreenParams == null ? 0 : bookingScreenParams.hashCode())) * 31;
            BookingRecord bookingRecord = this.e;
            int hashCode2 = (hashCode + (bookingRecord == null ? 0 : bookingRecord.hashCode())) * 31;
            BookingActionResult bookingActionResult = this.f;
            return Boolean.hashCode(this.h) + qoy.b((hashCode2 + (bookingActionResult != null ? bookingActionResult.hashCode() : 0)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(records=");
            sb.append(this.b);
            sb.append(", page=");
            sb.append(this.c);
            sb.append(", params=");
            sb.append(this.d);
            sb.append(", cancelableRecord=");
            sb.append(this.e);
            sb.append(", actionResult=");
            sb.append(this.f);
            sb.append(", isLoadingNext=");
            sb.append(this.g);
            sb.append(", isLoadingAvailable=");
            return defpackage.q0.a(sb, this.h, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Map<Integer, ? extends List<? extends bv7>> map, int i, BookingScreenParams bookingScreenParams, BookingRecord bookingRecord, BookingActionResult bookingActionResult, boolean z, boolean z2) {
            this.b = map;
            this.c = i;
            this.d = bookingScreenParams;
            this.e = bookingRecord;
            this.f = bookingActionResult;
            this.g = z;
            this.h = z2;
        }

        public /* synthetic */ d(Map map, BookingScreenParams bookingScreenParams, BookingActionResult bookingActionResult, boolean z, int i) {
            this((i & 1) != 0 ? jgp.b : map, 1, (i & 4) != 0 ? null : bookingScreenParams, null, (i & 16) != 0 ? null : bookingActionResult, false, (i & 64) != 0 ? true : z);
        }
    }
}
