package ru.ok.tracer.base.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateTimeUtils.kt */
/* loaded from: classes9.dex */
public final class DateTimeUtils {
    public static final String formatISO8601(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(date);
    }
}
