package xsna;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* compiled from: MaterialCalendarUtils.kt */
/* loaded from: classes17.dex */
public final class yl10 {
    public static final boolean a(long j, long j2) {
        long Hn = com.google.android.material.datepicker.g.Hn();
        long b = b();
        CalendarConstraints.b bVar = new CalendarConstraints.b();
        bVar.a = Hn;
        bVar.b = b;
        bVar.e = new CompositeDateValidator(e43.l(new DateValidatorPointForward(Hn), new DateValidatorPointBackward(b)), CompositeDateValidator.e);
        CalendarConstraints.DateValidator dateValidator = bVar.a().d;
        SimpleTimeZone simpleTimeZone = pvo0.a;
        TimeZone timeZone = TimeZone.getDefault();
        Date date = new Date();
        int rawOffset = TimeZone.getDefault().getRawOffset();
        if (timeZone.inDaylightTime(date)) {
            rawOffset += timeZone.getDSTSavings();
        }
        return dateValidator.Z6(((long) rawOffset) + j2) && j2 > j;
    }

    public static final long b() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(com.google.android.material.datepicker.g.Hn());
        calendar.set(10, 23);
        calendar.set(12, 59);
        calendar.set(1, calendar.get(1) + 1);
        calendar.add(6, -1);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTimeInMillis();
    }
}
