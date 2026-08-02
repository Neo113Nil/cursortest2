package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public final class jom0 {
    public static final Pattern d = Pattern.compile(Pattern.quote("$DUE_DAY$"));
    public static final Pattern e = Pattern.compile(Pattern.quote("$DUE_TIME$"));
    public final iom0 a;
    public final zuj0 b;
    public final nf7 c;

    public jom0(iom0 iom0Var, zuj0 zuj0Var, nf7 nf7Var) {
        this.a = iom0Var;
        this.b = zuj0Var;
        this.c = nf7Var;
    }

    public final String a(Calendar calendar, TimeZone timeZone, CharSequence charSequence, boolean z) {
        String format;
        iom0 iom0Var = this.a;
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(iom0Var.b.a);
        if (timeZone != null) {
            timeFormat.setTimeZone(timeZone);
        }
        String format2 = timeFormat.format(wf7.c(calendar, timeZone).getTime());
        umm0 umm0Var = z ? new umm0(4) : new umm0(5);
        nf7 nf7Var = this.c;
        boolean c = nf7Var.c(calendar);
        zuj0 zuj0Var = this.b;
        if (c) {
            format = ((avj0) zuj0Var).h(kyh0.date_today);
        } else if (nf7Var.d(calendar)) {
            format = ((avj0) zuj0Var).h(kyh0.date_tomorrow);
        } else {
            iom0Var.c.getClass();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE, d MMMM", j5z.e());
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
            format = simpleDateFormat.format(calendar.getTime());
        }
        return e.matcher(d.matcher(charSequence).replaceAll((String) umm0Var.invoke(format))).replaceAll(format2);
    }
}
