package xsna;

import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;

/* compiled from: BookingRecordCompletedScreenState.kt */
/* loaded from: classes18.dex */
public final class lu7 implements lm50 {
    public final boolean b;
    public final a c;
    public final BookingRecord d;
    public final boolean e;

    /* compiled from: BookingRecordCompletedScreenState.kt */
    public static final class a {
        public final com.vk.ecomm.onlinebooking.impl.common.a a;
        public final nt7 b;

        public a(com.vk.ecomm.onlinebooking.impl.common.a aVar, nt7 nt7Var) {
            this.a = aVar;
            this.b = nt7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            nt7 nt7Var = this.b;
            return hashCode + (nt7Var == null ? 0 : nt7Var.hashCode());
        }

        public final String toString() {
            return "Error(cause=" + this.a + ", action=" + this.b + ')';
        }
    }

    public lu7(boolean z, a aVar, BookingRecord bookingRecord, boolean z2) {
        this.b = z;
        this.c = aVar;
        this.d = bookingRecord;
        this.e = z2;
    }

    public static lu7 a(lu7 lu7Var, boolean z, a aVar, BookingRecord bookingRecord, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = lu7Var.b;
        }
        if ((i & 2) != 0) {
            aVar = lu7Var.c;
        }
        if ((i & 4) != 0) {
            bookingRecord = lu7Var.d;
        }
        if ((i & 8) != 0) {
            z2 = lu7Var.e;
        }
        lu7Var.getClass();
        return new lu7(z, aVar, bookingRecord, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu7)) {
            return false;
        }
        lu7 lu7Var = (lu7) obj;
        return this.b == lu7Var.b && epx.f(this.c, lu7Var.c) && epx.f(this.d, lu7Var.d) && this.e == lu7Var.e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        a aVar = this.c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        BookingRecord bookingRecord = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (bookingRecord != null ? bookingRecord.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingRecordCompletedScreenState(isFullScreenLoading=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", record=");
        sb.append(this.d);
        sb.append(", needConfirmCancelRecord=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
