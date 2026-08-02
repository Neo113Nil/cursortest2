package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import java.util.ArrayList;

/* compiled from: ReBookingModel.kt */
/* loaded from: classes18.dex */
public final class xye0 {
    public final BookingMaster a;
    public final ArrayList b;

    public xye0(BookingMaster bookingMaster, ArrayList arrayList) {
        this.a = bookingMaster;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xye0)) {
            return false;
        }
        xye0 xye0Var = (xye0) obj;
        return epx.f(this.a, xye0Var.a) && this.b.equals(xye0Var.b);
    }

    public final int hashCode() {
        BookingMaster bookingMaster = this.a;
        return this.b.hashCode() + ((bookingMaster == null ? 0 : bookingMaster.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReBookingModel(master=");
        sb.append(this.a);
        sb.append(", services=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
