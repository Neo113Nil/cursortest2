package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public final class iom0 {
    public final zuj0 a;
    public final ole0 b;
    public final j5z c;

    public iom0(zuj0 zuj0Var, ole0 ole0Var, j5z j5zVar) {
        this.a = zuj0Var;
        this.b = ole0Var;
        this.c = j5zVar;
    }

    public final String a(Calendar calendar, TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        int i = kyh0.scheduled_order_datetime;
        this.c.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM", j5z.e());
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        String format = simpleDateFormat.format(calendar.getTime());
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this.b.a);
        if (timeZone != null) {
            timeFormat.setTimeZone(timeZone);
        }
        return ((avj0) this.a).i(i, format, timeFormat.format(wf7.c(calendar, timeZone).getTime()));
    }
}
