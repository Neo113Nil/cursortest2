package defpackage;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import kotlin.a;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.UtcOffset;

/* loaded from: classes9.dex */
public abstract class fw21 {
    public static final i3y a = a.a(new gs21(6));
    public static final i3y b = a.a(new gs21(7));
    public static final i3y c = a.a(new gs21(8));

    public static final UtcOffset a(Integer num, Integer num2, Integer num3) {
        try {
            if (num != null) {
                return new UtcOffset(ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0));
            }
            if (num2 != null) {
                return new UtcOffset(ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0));
            }
            return new UtcOffset(ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0));
        } catch (DateTimeException e) {
            yci0.r(e);
            return null;
        }
    }

    public static final UtcOffset b(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new UtcOffset((ZoneOffset) dateTimeFormatter.parse(str, new TemporalQuery() { // from class: ew21
                @Override // java.time.temporal.TemporalQuery
                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                    return ZoneOffset.from(temporalAccessor);
                }
            }));
        } catch (DateTimeException e) {
            throw new DateTimeFormatException(e);
        }
    }
}
