package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class gqe0 {
    public final Calendar a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Calendar e;
    public final Integer f;

    public gqe0(Calendar calendar, String str, String str2, boolean z, Calendar calendar2, Integer num) {
        this.a = calendar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = calendar2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqe0)) {
            return false;
        }
        gqe0 gqe0Var = (gqe0) obj;
        return jl40.l(this.a, gqe0Var.a) && jl40.l(this.b, gqe0Var.b) && jl40.l(this.c, gqe0Var.c) && this.d == gqe0Var.d && jl40.l(this.e, gqe0Var.e) && jl40.l(this.f, gqe0Var.f);
    }

    public final int hashCode() {
        Calendar calendar = this.a;
        int hashCode = (calendar == null ? 0 : calendar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int e = unr0.e((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        Calendar calendar2 = this.e;
        int hashCode3 = (e + (calendar2 == null ? 0 : calendar2.hashCode())) * 31;
        Integer num = this.f;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreorderInfo(due=");
        sb.append(this.a);
        sb.append(", scheduledOrderId=");
        sb.append(this.b);
        sb.append(", calculationId=");
        tse0.y(this.c, ", forceSoonOrders=", ", intercityHack=", sb, this.d);
        sb.append(this.e);
        sb.append(", duePrecisionMinutes=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
