package xsna;

import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import xsna.hfr;

/* compiled from: BookingPriceFork.kt */
/* loaded from: classes18.dex */
public final class ft7 {
    public final int a;
    public final int b;

    /* compiled from: BookingPriceFork.kt */
    public static final class a {
        public static ft7 a(uki0 uki0Var) {
            hfr.a aVar = new hfr.a(rli0.j(uki0Var, new oa(7)));
            boolean z = true;
            int i = 0;
            int i2 = 0;
            boolean z2 = true;
            while (aVar.hasNext()) {
                BookingServiceModel bookingServiceModel = (BookingServiceModel) aVar.next();
                int i3 = bookingServiceModel.e;
                if (i3 > 0 || i != 0) {
                    i += i3;
                } else {
                    z = false;
                }
                int i4 = bookingServiceModel.f;
                if (i4 <= 0) {
                    z2 = false;
                } else {
                    i2 += i4;
                }
            }
            if (!z) {
                i = 0;
            }
            return new ft7(i, z2 ? i2 : 0);
        }
    }

    public ft7() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft7)) {
            return false;
        }
        ft7 ft7Var = (ft7) obj;
        return this.a == ft7Var.a && this.b == ft7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingPriceFork(min=");
        sb.append(this.a);
        sb.append(", max=");
        return vu5.b(sb, this.b, ')');
    }

    public ft7(int i, int i2) {
        this.a = i;
        this.b = i2;
        try {
            if (i < 0) {
                throw new IllegalStateException("min expected to be >= 0");
            }
            if (i2 < 0) {
                throw new IllegalStateException("max expected to be >= 0");
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }
}
