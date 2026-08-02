package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class egq0 {
    public final Calendar a;
    public final Calendar b;

    public egq0(Calendar calendar, Calendar calendar2) {
        this.a = calendar;
        this.b = calendar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egq0)) {
            return false;
        }
        egq0 egq0Var = (egq0) obj;
        return jl40.l(this.a, egq0Var.a) && jl40.l(this.b, egq0Var.b);
    }

    public final int hashCode() {
        Calendar calendar = this.a;
        int hashCode = (calendar == null ? 0 : calendar.hashCode()) * 31;
        Calendar calendar2 = this.b;
        return hashCode + (calendar2 != null ? calendar2.hashCode() : 0);
    }

    public final String toString() {
        return "SelectedDateRange(startDate=" + this.a + ", endDate=" + this.b + Extension.C_BRAKE;
    }
}
