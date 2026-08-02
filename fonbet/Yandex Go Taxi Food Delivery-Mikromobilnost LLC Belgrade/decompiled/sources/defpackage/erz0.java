package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class erz0 {
    public final zuj0 a;

    public erz0(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    public final String a(int i, String str) {
        String v;
        String v2;
        String v3;
        if (i <= 0) {
            return "";
        }
        int i2 = i / 60;
        int i3 = i / 3600;
        int i4 = i / 86400;
        zuj0 zuj0Var = this.a;
        if (i4 <= 0 || !evu0.y(str, "DD", false)) {
            v = cvu0.v(str, "DD", "", false);
        } else {
            long j = i4;
            TimeUnit timeUnit = TimeUnit.DAYS;
            i3 -= (int) timeUnit.toHours(j);
            i2 -= (int) timeUnit.toMinutes(j);
            v = cvu0.v(str, "DD", ((avj0) zuj0Var).f(dwh0.date_format_in_days, i4), false);
        }
        if (i3 <= 0 || !evu0.y(str, "HH", false)) {
            v2 = cvu0.v(v, "HH", "", false);
        } else {
            i2 -= (int) TimeUnit.HOURS.toMinutes(i3);
            v2 = cvu0.v(v, "HH", ((avj0) zuj0Var).f(dwh0.date_format_in_hours, i3), false);
        }
        if (i2 <= 0 || !evu0.y(str, "MM", false)) {
            v3 = cvu0.v(v2, "MM", "", false);
        } else {
            v3 = cvu0.v(v2, "MM", ((avj0) zuj0Var).i(kyh0.date_format_minutes_left_shortcut_zero, Integer.valueOf(i2)), false);
        }
        return evu0.k0(cvu0.v(v3, "  ", " ", false)).toString();
    }
}
