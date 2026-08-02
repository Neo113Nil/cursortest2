package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: BookingServiceResponse.kt */
/* loaded from: classes18.dex */
public final class vw7 {
    public final ArrayList a;
    public final ArrayList b;
    public final List<Integer> c;

    public vw7(ArrayList arrayList, ArrayList arrayList2, List list) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw7)) {
            return false;
        }
        vw7 vw7Var = (vw7) obj;
        return epx.f(this.a, vw7Var.a) && epx.f(this.b, vw7Var.b) && epx.f(this.c, vw7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingServiceResponse(services=");
        sb.append(this.a);
        sb.append(", categories=");
        sb.append(this.b);
        sb.append(", selectedServicesIds=");
        return ms9.a(')', sb, this.c);
    }

    public vw7(ArrayList arrayList, ArrayList arrayList2) {
        this(arrayList, arrayList2, EmptyList.b);
    }
}
