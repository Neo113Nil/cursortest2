package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.Date;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes7.dex */
public final class DateTimeFunctionsKt {
    public static final Calendar toCalendar(DateTime dateTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(dateTime.getTimezone$div_evaluable());
        calendar.setTimeInMillis(dateTime.getTimestampMillis$div_evaluable());
        return calendar;
    }

    public static final Date toDate(DateTime dateTime) {
        return new Date(dateTime.getTimestampMillis$div_evaluable() - dateTime.getTimezone$div_evaluable().getRawOffset());
    }
}
