package defpackage;

import com.ybsdk.widgets.common.rangedatepicker.MonthHeaderState;
import java.util.Calendar;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class pf7 {
    public final kb61 a;
    public final MonthHeaderState b;
    public final List c;
    public final Calendar d;
    public final Calendar e;

    public pf7(kb61 kb61Var, MonthHeaderState monthHeaderState, List list, Calendar calendar, Calendar calendar2) {
        this.a = kb61Var;
        this.b = monthHeaderState;
        this.c = list;
        this.d = calendar;
        this.e = calendar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf7)) {
            return false;
        }
        pf7 pf7Var = (pf7) obj;
        return this.a.equals(pf7Var.a) && this.b == pf7Var.b && this.c.equals(pf7Var.c) && jl40.l(this.d, pf7Var.d) && jl40.l(this.e, pf7Var.e);
    }

    public final int hashCode() {
        int c = unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        Calendar calendar = this.d;
        int hashCode = (c + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.e;
        return hashCode + (calendar2 != null ? calendar2.hashCode() : 0);
    }

    public final String toString() {
        return "CalendarMonth(month=" + this.a + ", state=" + this.b + ", cells=" + this.c + ", firstAvailableDay=" + this.d + ", lastAvailableDay=" + this.e + Extension.C_BRAKE;
    }
}
