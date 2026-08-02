package defpackage;

import com.yandex.go.due.data.api.dto.RideTimeInfo;
import com.yandex.go.due.data.api.dto.TimetableInfo;
import java.util.Calendar;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.TimeUnitsVisibility;

/* loaded from: classes12.dex */
public final class q0n {
    public final zuj0 a;
    public final j4n b;
    public final i47 c;

    public q0n(zuj0 zuj0Var, j4n j4nVar, i47 i47Var) {
        this.a = zuj0Var;
        this.b = j4nVar;
        this.c = i47Var;
    }

    public static a2n a(e8z0 e8z0Var) {
        e2n c;
        u190 u190Var = e8z0Var instanceof u190 ? (u190) e8z0Var : null;
        if (u190Var == null || (c = u190Var.c()) == null) {
            return null;
        }
        return c.d;
    }

    public static m0f0 e(TimetableInfo timetableInfo, bus0 bus0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        if (bus0Var instanceof aus0) {
            if (timetableInfo == null || (str4 = timetableInfo.c) == null) {
                str4 = "";
            }
            if (timetableInfo != null && (str5 = timetableInfo.a) != null) {
                str6 = str5;
            }
            return new m0f0(str6, str4);
        }
        if (bus0Var instanceof zts0) {
            if (timetableInfo != null && (str3 = timetableInfo.c) != null) {
                str6 = str3;
            }
            return new m0f0(((zts0) bus0Var).c, str6);
        }
        if (!(bus0Var instanceof yts0)) {
            w511.b();
            return null;
        }
        if (timetableInfo == null || (str = timetableInfo.c) == null) {
            str = "";
        }
        if (timetableInfo != null && (str2 = timetableInfo.b) != null) {
            str6 = str2;
        }
        return new m0f0(str6, str);
    }

    public final n73 b(bus0 bus0Var, RideTimeInfo rideTimeInfo) {
        String v;
        String str;
        String str2 = null;
        if (!(bus0Var instanceof zts0)) {
            if (bus0Var instanceof aus0) {
                return m73.a;
            }
            if (bus0Var instanceof yts0) {
                return l73.a;
            }
            w511.b();
            return null;
        }
        Calendar calendar = ((zts0) bus0Var).f;
        if (calendar == null) {
            return new k73(null, null);
        }
        j4n j4nVar = this.b;
        if (rideTimeInfo == null) {
            v = cvu0.v(((avj0) ((zuj0) j4nVar.a)).h(kyh0.due_chart_arrival_time), "$TIME$", j4nVar.A().format(calendar.getTime()), false);
        } else {
            String str3 = rideTimeInfo.a;
            v = str3 != null ? cvu0.v(str3, "$ARRIVAL_TIME$", j4nVar.A().format(calendar.getTime()), false) : null;
        }
        if (rideTimeInfo == null) {
            str2 = ((avj0) this.a).h(kyh0.due_chart_arrival_label);
        } else if (rideTimeInfo.a != null && (str = rideTimeInfo.b) != null) {
            str2 = str;
        }
        return new k73(v, str2);
    }

    public final n73 c(e8z0 e8z0Var, RideTimeInfo rideTimeInfo) {
        if (e8z0Var instanceof c8z0) {
            return b(((c8z0) e8z0Var).a, rideTimeInfo);
        }
        if (e8z0Var instanceof b8z0) {
            return b(((b8z0) e8z0Var).a, rideTimeInfo);
        }
        if ((e8z0Var instanceof d8z0) || e8z0Var == null) {
            return l73.a;
        }
        w511.b();
        return null;
    }

    public final owi d(Calendar calendar, Integer num, boolean z, RideTimeInfo rideTimeInfo) {
        String str;
        String str2;
        int intValue = num != null ? num.intValue() : 5;
        String str3 = null;
        j4n j4nVar = this.b;
        if (rideTimeInfo == null) {
            str = j4nVar.s(calendar, intValue);
        } else {
            String str4 = rideTimeInfo.a;
            if (str4 == null) {
                str = null;
            } else if (calendar == null) {
                str = ((avj0) ((zuj0) j4nVar.a)).h(kyh0.due_chart_ondemand_slot);
            } else {
                j4nVar.getClass();
                if (!evu0.y(str4, "$DEPARTURE_END$", false) || intValue > 0) {
                    str = j4nVar.t(intValue, str4, "$DEPARTURE_START$", "$DEPARTURE_END$", calendar);
                } else {
                    jst.e.c("Displaying interval departure time without precisionMinutes");
                    str = j4nVar.s(calendar, intValue);
                }
            }
        }
        zuj0 zuj0Var = this.a;
        if (rideTimeInfo == null) {
            str2 = ((avj0) zuj0Var).h(kyh0.due_chart_departure_label);
        } else if (rideTimeInfo.a == null || (str2 = rideTimeInfo.b) == null) {
            str2 = null;
        }
        if (z && str2 != null) {
            o430 o430Var = e3n.b;
            str3 = ((avj0) zuj0Var).i(kyh0.due_chart_departure_label_interval, qpb1.c(zuj0Var, e3n.e(kp50.U(intValue, DurationUnit.MINUTES)), TimeUnitsVisibility.ALL_TIME_UNITS));
        }
        return new owi(str, str2, str3);
    }

    public final float f(Double d, double d2) {
        if (d != null && d.doubleValue() > 0.0d) {
            return y6i0.c((float) (d2 / d.doubleValue()), 0.0f, 1.0f);
        }
        return ((avj0) this.a).e(usg0.default_bar_height_fraction);
    }
}
