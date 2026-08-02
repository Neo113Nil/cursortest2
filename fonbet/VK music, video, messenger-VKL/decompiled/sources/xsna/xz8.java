package xsna;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* compiled from: CalendarModelImpl.android.kt */
/* loaded from: classes11.dex */
public final class xz8 extends wz8 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final int c;
    public final ArrayList d;

    /* compiled from: CalendarModelImpl.android.kt */
    public static final class a {
        public static DateTimeFormatter a(String str, Locale locale, LinkedHashMap linkedHashMap) {
            StringBuilder c = r11.c("P:", str);
            c.append(locale.toLanguageTag());
            String sb = c.toString();
            Object obj = linkedHashMap.get(sb);
            if (obj == null) {
                obj = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                linkedHashMap.put(sb, obj);
            }
            return (DateTimeFormatter) obj;
        }
    }

    /* compiled from: CalendarModelImpl.android.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ asp a = new asp(DayOfWeek.values());
    }

    public xz8(Locale locale) {
        super(locale);
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        asp aspVar = b.a;
        ArrayList arrayList = new ArrayList(aspVar.size());
        int size = aspVar.size();
        for (int i = 0; i < size; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) aspVar.get(i);
            arrayList.add(new Pair(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    @Override // xsna.wz8
    public final String a(long j, String str, Locale locale) {
        return Instant.ofEpochMilli(j).atZone(e).toLocalDate().format(a.a(str, locale, this.b));
    }

    @Override // xsna.wz8
    public final rz8 b(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(e).toLocalDate();
        return new rz8(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // xsna.wz8
    public final bxk c(Locale locale) {
        return rdi.q(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // xsna.wz8
    public final int d() {
        return this.c;
    }

    @Override // xsna.wz8
    public final zz8 e(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    @Override // xsna.wz8
    public final zz8 f(long j) {
        return l(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    @Override // xsna.wz8
    public final zz8 g(rz8 rz8Var) {
        return l(LocalDate.of(rz8Var.b, rz8Var.c, 1));
    }

    @Override // xsna.wz8
    public final rz8 h() {
        LocalDate now = LocalDate.now();
        return new rz8(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    @Override // xsna.wz8
    public final List<Pair<String, String>> i() {
        return this.d;
    }

    @Override // xsna.wz8
    public final rz8 j(String str, String str2, Locale locale) {
        try {
            LocalDate parse = LocalDate.parse(str, a.a(str2, locale, this.b));
            return new rz8(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // xsna.wz8
    public final zz8 k(zz8 zz8Var, int i) {
        return i <= 0 ? zz8Var : l(Instant.ofEpochMilli(zz8Var.e).atZone(e).toLocalDate().plusMonths(i));
    }

    public final zz8 l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new zz8(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
