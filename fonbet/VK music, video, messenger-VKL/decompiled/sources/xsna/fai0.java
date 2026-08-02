package xsna;

import java.util.Calendar;
import java.util.Date;

/* compiled from: SelectableDatetimes.kt */
/* loaded from: classes17.dex */
public final class fai0 implements com.vk.core.compose.component.datetime.l {
    public final Date b;
    public final Date c;
    public final Date d;

    public fai0(Date date, Date date2) {
        date = date == null ? new Date(0L) : date;
        this.b = date;
        this.c = date2 == null ? new Date(Long.MAX_VALUE) : date2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.d = calendar.getTime();
    }

    @Override // com.vk.core.compose.component.datetime.l
    public final boolean a(Date date) {
        return date.compareTo(this.c) <= 0 && date.compareTo(this.d) >= 0;
    }

    @Override // com.vk.core.compose.component.datetime.l
    public final boolean b(Date date) {
        return date.compareTo(this.c) <= 0 && date.compareTo(this.b) >= 0;
    }
}
