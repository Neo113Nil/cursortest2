package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.List;

/* compiled from: BookingMastersScreenState.kt */
/* loaded from: classes18.dex */
public final class nr7 implements lm50 {
    public final BookingScreenParams b;
    public final List<BookingMaster> c;
    public final boolean d;
    public final a e;

    /* compiled from: BookingMastersScreenState.kt */
    public static final class a {
        public final com.vk.ecomm.onlinebooking.impl.common.a a;
        public final a.c b;

        public a(com.vk.ecomm.onlinebooking.impl.common.a aVar, a.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(cause=" + this.a + ", action=" + this.b + ')';
        }
    }

    public nr7() {
        this(null, 15);
    }

    public static nr7 a(nr7 nr7Var, List list, boolean z, a aVar) {
        BookingScreenParams bookingScreenParams = nr7Var.b;
        nr7Var.getClass();
        return new nr7(bookingScreenParams, list, z, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr7)) {
            return false;
        }
        nr7 nr7Var = (nr7) obj;
        return epx.f(this.b, nr7Var.b) && epx.f(this.c, nr7Var.c) && this.d == nr7Var.d && epx.f(this.e, nr7Var.e);
    }

    public final int hashCode() {
        BookingScreenParams bookingScreenParams = this.b;
        int hashCode = (bookingScreenParams == null ? 0 : bookingScreenParams.hashCode()) * 31;
        List<BookingMaster> list = this.c;
        int b = qoy.b((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.d);
        a aVar = this.e;
        return b + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "BookingMastersScreenState(params=" + this.b + ", masters=" + this.c + ", isLoading=" + this.d + ", error=" + this.e + ')';
    }

    public /* synthetic */ nr7(BookingScreenParams bookingScreenParams, int i) {
        this((i & 1) != 0 ? null : bookingScreenParams, null, true, null);
    }

    public nr7(BookingScreenParams bookingScreenParams, List<BookingMaster> list, boolean z, a aVar) {
        this.b = bookingScreenParams;
        this.c = list;
        this.d = z;
        this.e = aVar;
    }
}
