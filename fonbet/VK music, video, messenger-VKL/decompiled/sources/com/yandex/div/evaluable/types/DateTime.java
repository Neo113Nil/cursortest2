package com.yandex.div.evaluable.types;

import com.vk.dto.common.ImageSizeKey;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.drm0;
import xsna.epx;
import xsna.gzs;
import xsna.msy;
import xsna.zcl;

/* compiled from: DateTime.kt */
/* loaded from: classes7.dex */
public final class DateTime implements Comparable<DateTime> {
    public static final Companion Companion = new Companion(null);
    private static final SimpleTimeZone utcTimezone = new SimpleTimeZone(0, "UTC");
    private final Lazy calendar$delegate = msy.a(LazyThreadSafetyMode.NONE, new gzs<Calendar>() { // from class: com.yandex.div.evaluable.types.DateTime$calendar$2
        {
            super(0);
        }

        @Override // xsna.gzs
        public final Calendar invoke() {
            SimpleTimeZone simpleTimeZone;
            simpleTimeZone = DateTime.utcTimezone;
            Calendar calendar = Calendar.getInstance(simpleTimeZone);
            calendar.setTimeInMillis(DateTime.this.getTimestampMillis$div_evaluable());
            return calendar;
        }
    });
    private final long timestampMillis;
    private final long timestampUtc;
    private final TimeZone timezone;
    private final int timezoneMinutes;

    /* compiled from: DateTime.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String formatDate$div_evaluable(Calendar calendar) {
            return String.valueOf(calendar.get(1)) + '-' + drm0.R(String.valueOf(calendar.get(2) + 1), 2, ImageSizeKey.SIZE_KEY_UNDEFINED) + '-' + drm0.R(String.valueOf(calendar.get(5)), 2, ImageSizeKey.SIZE_KEY_UNDEFINED) + ' ' + drm0.R(String.valueOf(calendar.get(11)), 2, ImageSizeKey.SIZE_KEY_UNDEFINED) + ':' + drm0.R(String.valueOf(calendar.get(12)), 2, ImageSizeKey.SIZE_KEY_UNDEFINED) + ':' + drm0.R(String.valueOf(calendar.get(13)), 2, ImageSizeKey.SIZE_KEY_UNDEFINED);
        }

        private Companion() {
        }
    }

    public DateTime(long j, TimeZone timeZone) {
        this.timestampMillis = j;
        this.timezone = timeZone;
        this.timezoneMinutes = timeZone.getRawOffset() / 60;
        this.timestampUtc = j - (r5 * 60000);
    }

    private final Calendar getCalendar() {
        return (Calendar) this.calendar$delegate.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateTime) && this.timestampUtc == ((DateTime) obj).timestampUtc;
    }

    public final long getTimestampMillis$div_evaluable() {
        return this.timestampMillis;
    }

    public final TimeZone getTimezone$div_evaluable() {
        return this.timezone;
    }

    public int hashCode() {
        return Long.hashCode(this.timestampUtc);
    }

    public String toString() {
        return Companion.formatDate$div_evaluable(getCalendar());
    }

    @Override // java.lang.Comparable
    public int compareTo(DateTime dateTime) {
        return epx.h(this.timestampUtc, dateTime.timestampUtc);
    }
}
