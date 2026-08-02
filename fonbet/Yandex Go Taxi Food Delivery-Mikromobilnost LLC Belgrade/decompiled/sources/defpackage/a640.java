package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.TimeUnitsVisibility;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class a640 {
    public final Context a;
    public final zuj0 b;

    public /* synthetic */ a640(zuj0 zuj0Var, Context context) {
        this.a = context;
        this.b = zuj0Var;
    }

    public String a(double d) {
        zuj0 zuj0Var = this.b;
        if (d < 995.0d) {
            return ((avj0) zuj0Var).i(kyh0.scooters_remaining_distance_in_metres, Integer.valueOf(m810.a(m810.a(d) / 10.0d) * 10));
        }
        if (d > 5000.0d) {
            return ((avj0) zuj0Var).i(kyh0.scooters_remaining_distance_in_km, Integer.valueOf((int) Math.rint(d / 1000.0d)));
        }
        double pow = Math.pow(10.0d, 1);
        float rint = (float) (Math.rint((((float) d) / 1000.0f) * pow) / pow);
        int i = (int) rint;
        return ((avj0) zuj0Var).i(kyh0.scooters_remaining_distance_in_km, ((double) Math.abs(rint - ((float) i))) < 0.1d ? Integer.valueOf(i) : Float.valueOf(rint));
    }

    public String b(String str) {
        return g8e.p(((avj0) this.b).h(kyh0.walking_navigation_finish), " ", str);
    }

    public String c(double d, long j) {
        long millis = TimeUnit.SECONDS.toMillis(j);
        TimeUnitsVisibility timeUnitsVisibility = TimeUnitsVisibility.TWO_TIME_UNITS;
        zuj0 zuj0Var = this.b;
        String c = qpb1.c(zuj0Var, millis, timeUnitsVisibility);
        String a = a(d);
        if (c.length() > 0 && a.length() > 0) {
            c = g8e.p(c, "  •  ", a);
        } else if (c.length() <= 0) {
            if (a.length() <= 0) {
                return "";
            }
            c = a;
        }
        return ((avj0) zuj0Var).i(kyh0.walking_navigation_remaining_time, c);
    }

    public String d(String str) {
        if (str.length() == 0) {
            return "";
        }
        return g8e.p(evu0.k0(((avj0) this.b).i(kyh0.mt_pedestrian_section_description, "")).toString(), " ", str);
    }

    public z540 e(y540 y540Var) {
        int i = kyh0.mt_schedules_title_error;
        avj0 avj0Var = (avj0) this.b;
        return new z540(f(avj0Var.h(i), y540Var.a), EmptyList.a, new kne0(avj0Var.h(kyh0.mt_try_refresh), false));
    }

    public tdu f(String str, hj40 hj40Var) {
        String str2 = hj40Var != null ? hj40Var.a : null;
        if (str2 == null || str2.length() == 0) {
            return new tdu(str, null, null, null, 14);
        }
        int i = kyh0.mt_short_stop;
        Object[] objArr = {hj40Var.a};
        avj0 avj0Var = (avj0) this.b;
        return new tdu(str, avj0Var.i(i, objArr), null, avj0Var.i(kyh0.mt_stop, hj40Var.a), 4);
    }

    public lyy0 g(y540 y540Var, String str) {
        w1u w1uVar = y540Var.b;
        MtTransportType mtTransportType = w1uVar.d.b;
        String str2 = w1uVar.a;
        String str3 = w1uVar.c;
        kdc kdcVar = w1uVar.h;
        return new lyy0(mtTransportType, str2, str3, str, "", false, kdcVar, new up2(rzo.d(s8o.m(kdcVar, this.a))), null, null, null);
    }
}
