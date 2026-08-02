package xsna;

import java.util.Calendar;
import java.util.Date;
import org.shredzone.commons.suncalc.param.TimeResultParameter$Unit;

/* compiled from: JulianDate.java */
/* loaded from: classes8.dex */
public final class sby {
    public final Calendar a;
    public final double b;

    public sby(Calendar calendar) {
        this.a = calendar;
        this.b = (calendar.getTimeInMillis() / 8.64E7d) + 40587.0d;
    }

    public final sby a(double d) {
        Calendar calendar = (Calendar) this.a.clone();
        calendar.add(13, (int) Math.round(d * 60.0d * 60.0d));
        return new sby(calendar);
    }

    public final Date b(TimeResultParameter$Unit timeResultParameter$Unit) {
        timeResultParameter$Unit.getClass();
        Calendar calendar = (Calendar) this.a.clone();
        calendar.set(14, 0);
        if (timeResultParameter$Unit == TimeResultParameter$Unit.MINUTES || timeResultParameter$Unit == TimeResultParameter$Unit.HOURS || timeResultParameter$Unit == TimeResultParameter$Unit.DAYS) {
            calendar.add(13, 30);
            calendar.set(13, 0);
        }
        if (timeResultParameter$Unit == TimeResultParameter$Unit.HOURS || timeResultParameter$Unit == TimeResultParameter$Unit.DAYS) {
            calendar.add(12, 30);
            calendar.set(12, 0);
        }
        if (timeResultParameter$Unit == TimeResultParameter$Unit.DAYS) {
            calendar.set(11, 0);
        }
        return calendar.getTime();
    }

    public final String toString() {
        double d = this.b;
        return String.format("%dd %02dh %02dm %02ds", Long.valueOf((long) d), Long.valueOf((long) ((d * 24.0d) % 24.0d)), Long.valueOf((long) (((d * 24.0d) * 60.0d) % 60.0d)), Long.valueOf((long) ((((d * 24.0d) * 60.0d) * 60.0d) % 60.0d)));
    }
}
