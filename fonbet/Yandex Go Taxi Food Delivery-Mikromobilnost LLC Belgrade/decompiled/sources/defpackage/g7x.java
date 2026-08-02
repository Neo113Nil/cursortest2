package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/* loaded from: classes11.dex */
public final class g7x implements tm11 {
    public static final f7x a = new f7x(new String[]{"seconds", "nanos"}, 2);
    public static final f7x b = new f7x(new String[]{"seconds", "nanos"}, 3);
    public static final f7x c = new f7x(new String[]{"year", "month", "day"}, 4);
    public static final f7x d = new f7x(new String[]{"hour", "minute", "second", "nano"}, 5);
    public static final f7x e = new f7x(new String[]{"month", "day"}, 6);
    public static final f7x f = new f7x(new String[]{"years", "months", "days"}, 7);
    public static final f7x g = new f7x(new String[]{"year"}, 0);
    public static final f7x h = new f7x(new String[]{"year", "month"}, 1);
    public static final nl11 i = new a().nullSafe();
    public static final b j = new b();

    public class a extends nl11 {
        @Override // defpackage.nl11
        public final Object read(wdx wdxVar) {
            wdxVar.c();
            String str = null;
            Integer num = null;
            while (wdxVar.R() != JsonToken.END_OBJECT) {
                String nextName = wdxVar.nextName();
                nextName.getClass();
                if (nextName.equals("totalSeconds")) {
                    num = Integer.valueOf(wdxVar.nextInt());
                } else if (nextName.equals("id")) {
                    str = wdxVar.nextString();
                } else {
                    wdxVar.skipValue();
                }
            }
            wdxVar.n();
            if (str != null) {
                return ZoneId.of(str);
            }
            if (num != null) {
                return ZoneOffset.ofTotalSeconds(num.intValue());
            }
            throw new JsonSyntaxException("Missing id or totalSeconds field; at path ".concat(wdxVar.w()));
        }

        @Override // defpackage.nl11
        public final void write(afx afxVar, Object obj) {
            ZoneId zoneId = (ZoneId) obj;
            if (zoneId instanceof ZoneOffset) {
                afxVar.d();
                afxVar.o("totalSeconds");
                afxVar.R(((ZoneOffset) zoneId).getTotalSeconds());
                afxVar.n();
                return;
            }
            afxVar.d();
            afxVar.o("id");
            afxVar.W(zoneId.getId());
            afxVar.n();
        }
    }

    public class b implements ol11 {
        @Override // defpackage.ol11
        public final nl11 create(u3u u3uVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (!rawType.getName().startsWith("java.time.")) {
                return null;
            }
            if (rawType == Duration.class) {
                return g7x.a;
            }
            if (rawType == Instant.class) {
                return g7x.b;
            }
            if (rawType == LocalDate.class) {
                return g7x.c;
            }
            if (rawType == LocalTime.class) {
                return g7x.d;
            }
            if (rawType == LocalDateTime.class) {
                return g7x.b(u3uVar);
            }
            if (rawType == MonthDay.class) {
                return g7x.e;
            }
            if (rawType == OffsetDateTime.class) {
                return new i7x(g7x.b(u3uVar), u3uVar.f(ZoneOffset.class), 1).nullSafe();
            }
            if (rawType == OffsetTime.class) {
                f7x f7xVar = g7x.a;
                return new i7x(u3uVar.f(LocalTime.class), u3uVar.f(ZoneOffset.class), 2).nullSafe();
            }
            if (rawType == Period.class) {
                return g7x.f;
            }
            if (rawType == Year.class) {
                return g7x.g;
            }
            if (rawType == YearMonth.class) {
                return g7x.h;
            }
            if (rawType == ZoneId.class || rawType == ZoneOffset.class) {
                return g7x.i;
            }
            if (rawType == ZonedDateTime.class) {
                return new h7x(g7x.b(u3uVar), u3uVar.f(ZoneOffset.class), u3uVar.f(ZoneId.class)).nullSafe();
            }
            return null;
        }
    }

    public static void a(Serializable serializable, String str, wdx wdxVar) {
        if (serializable != null) {
            return;
        }
        StringBuilder x = unr0.x("Missing ", str, " field; at path ");
        x.append(wdxVar.w());
        throw new JsonSyntaxException(x.toString());
    }

    public static nl11 b(u3u u3uVar) {
        return new i7x(u3uVar.f(LocalDate.class), u3uVar.f(LocalTime.class), 0).nullSafe();
    }
}
