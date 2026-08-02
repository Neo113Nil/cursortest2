package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hx41 {
    public static final hx41 f = new hx41("", "", "", null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public hx41(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx41)) {
            return false;
        }
        hx41 hx41Var = (hx41) obj;
        return this.a.equals(hx41Var.a) && this.b.equals(hx41Var.b) && this.c.equals(hx41Var.c) && jl40.l(this.d, hx41Var.d) && jl40.l(this.e, hx41Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("WheelDatePickerAnalyticModel(dateTab=, price=, selectedDate=", this.a, ", startStopId=", this.b, ", finalStopId=");
        g8e.D(v, this.c, ", scheduleRequestId=", this.d, ", selectedFiltersId=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }
}
