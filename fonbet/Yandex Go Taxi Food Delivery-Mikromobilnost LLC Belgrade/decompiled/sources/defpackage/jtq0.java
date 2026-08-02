package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public final class jtq0 {
    public final b6z0 a;

    public jtq0(b6z0 b6z0Var) {
        this.a = b6z0Var;
    }

    public final Calendar a(TimeZone timeZone) {
        return wf7.c(b(null), timeZone);
    }

    public final Calendar b(Long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.a.Hg() + (l != null ? l.longValue() : calendar.getTimeInMillis()));
        return calendar;
    }

    public final Date c() {
        return b(null).getTime();
    }

    public final long d() {
        return this.a.Hg() + System.currentTimeMillis();
    }
}
