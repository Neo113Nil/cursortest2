package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gg40 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public gg40(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg40)) {
            return false;
        }
        gg40 gg40Var = (gg40) obj;
        return this.a.equals(gg40Var.a) && this.b.equals(gg40Var.b) && this.c.equals(gg40Var.c) && jl40.l(this.d, gg40Var.d) && jl40.l(this.e, gg40Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        List list = this.d;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ScheduleAnalyticsParams(selectedDate=", this.a, ", startStopId=", this.b, ", finalStopId=");
        tse0.x(this.c, ", selectedFiltersId=", ", scheduleRequestId=", v, this.d);
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
