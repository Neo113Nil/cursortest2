package xsna;

import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.util.List;
import java.util.Set;

/* compiled from: BookingServicesScreenPatch.kt */
/* loaded from: classes18.dex */
public final class py7 implements com.vk.ecomm.onlinebooking.impl.services.presentation.e {
    public final List<BookingServiceModel> a;
    public final List<ow7> b;
    public final Set<Integer> c;

    public py7(List list, Set set, List list2) {
        this.a = list;
        this.b = list2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py7)) {
            return false;
        }
        py7 py7Var = (py7) obj;
        return epx.f(this.a, py7Var.a) && epx.f(this.b, py7Var.b) && epx.f(this.c, py7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataLoaded(services=");
        sb.append(this.a);
        sb.append(", categories=");
        sb.append(this.b);
        sb.append(", selectedServicesIds=");
        return ur.c(sb, this.c, ')');
    }
}
