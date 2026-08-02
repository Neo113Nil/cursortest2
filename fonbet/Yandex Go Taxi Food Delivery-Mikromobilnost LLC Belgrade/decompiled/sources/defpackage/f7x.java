package defpackage;

import com.google.gson.stream.JsonToken;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* loaded from: classes11.dex */
public final class f7x extends nl11 {
    public final List a;
    public final /* synthetic */ int b;

    public f7x(String[] strArr, int i) {
        this.b = i;
        this.a = Arrays.asList(strArr);
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        wdxVar.c();
        List list = this.a;
        long[] jArr = new long[list.size()];
        while (wdxVar.R() != JsonToken.END_OBJECT) {
            int indexOf = list.indexOf(wdxVar.nextName());
            if (indexOf >= 0) {
                jArr[indexOf] = wdxVar.nextLong();
            } else {
                wdxVar.skipValue();
            }
        }
        wdxVar.n();
        switch (this.b) {
            case 0:
                return Year.of(Math.toIntExact(jArr[0]));
            case 1:
                return YearMonth.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
            case 2:
                return Duration.ofSeconds(jArr[0], jArr[1]);
            case 3:
                return Instant.ofEpochSecond(jArr[0], jArr[1]);
            case 4:
                return LocalDate.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
            case 5:
                return LocalTime.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]), Math.toIntExact(jArr[3]));
            case 6:
                return MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
            case 7:
                return Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
            default:
                return new GregorianCalendar(um11.b(jArr[0]), um11.b(jArr[1]), um11.b(jArr[2]), um11.b(jArr[3]), um11.b(jArr[4]), um11.b(jArr[5]));
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        int i;
        long[] jArr;
        long[] jArr2;
        if (obj == null) {
            afxVar.w();
            return;
        }
        afxVar.d();
        switch (this.b) {
            case 0:
                i = 0;
                jArr = new long[]{((Year) obj).getValue()};
                jArr2 = jArr;
                break;
            case 1:
                i = 0;
                YearMonth yearMonth = (YearMonth) obj;
                jArr2 = new long[]{yearMonth.getYear(), yearMonth.getMonthValue()};
                break;
            case 2:
                i = 0;
                jArr2 = new long[]{((Duration) obj).getSeconds(), r2.getNano()};
                break;
            case 3:
                i = 0;
                jArr2 = new long[]{((Instant) obj).getEpochSecond(), r2.getNano()};
                break;
            case 4:
                i = 0;
                LocalDate localDate = (LocalDate) obj;
                jArr = new long[]{localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()};
                jArr2 = jArr;
                break;
            case 5:
                i = 0;
                LocalTime localTime = (LocalTime) obj;
                jArr2 = new long[]{localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNano()};
                break;
            case 6:
                i = 0;
                MonthDay monthDay = (MonthDay) obj;
                jArr2 = new long[]{monthDay.getMonthValue(), monthDay.getDayOfMonth()};
                break;
            case 7:
                i = 0;
                Period period = (Period) obj;
                jArr = new long[]{period.getYears(), period.getMonths(), period.getDays()};
                jArr2 = jArr;
                break;
            default:
                Calendar calendar = (Calendar) obj;
                i = 0;
                jArr2 = new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
                break;
        }
        int i2 = i;
        while (true) {
            List list = this.a;
            if (i2 >= list.size()) {
                afxVar.n();
                return;
            } else {
                afxVar.o((String) list.get(i2));
                afxVar.R(jArr2[i2]);
                i2++;
            }
        }
    }
}
