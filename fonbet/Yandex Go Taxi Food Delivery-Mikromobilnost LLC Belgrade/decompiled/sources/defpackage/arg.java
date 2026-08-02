package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class arg {
    public final DateFormat a;
    public final SimpleDateFormat b = new SimpleDateFormat("d MMMM", Locale.getDefault());
    public final SimpleDateFormat c = new SimpleDateFormat("EE, dd MMM", Locale.getDefault());
    public final SimpleDateFormat d = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
    public final SimpleDateFormat e = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault());
    public final SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy HHmmss", Locale.getDefault());
    public final SimpleDateFormat g;
    public final String h;
    public final String i;

    public arg(Context context) {
        Resources resources = context.getResources();
        this.a = android.text.format.DateFormat.getTimeFormat(context);
        this.h = resources.getString(oyh0.dialog_time_today);
        this.i = resources.getString(oyh0.dialog_time_yesterday);
        this.g = new SimpleDateFormat(android.text.format.DateFormat.is24HourFormat(context) ? "dd MMMM yyyy, HH:mm" : "dd MMMM yyyy, hh:mm", Locale.getDefault());
    }

    public final String a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return this.a.format(date);
        }
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(5, -1);
        if (calendar.get(1) == calendar3.get(1) && calendar.get(6) == calendar3.get(6)) {
            return this.i.toLowerCase(Locale.getDefault());
        }
        Calendar calendar4 = Calendar.getInstance();
        calendar4.add(6, -7);
        calendar4.set(11, 0);
        calendar4.set(12, 0);
        calendar4.set(13, 0);
        return calendar4.compareTo(calendar) < 0 ? this.c.format(date) : this.d.format(date);
    }

    public final String b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (calendar.get(1) != Calendar.getInstance().get(1)) {
            return this.e.format(date);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        Calendar calendar3 = Calendar.getInstance();
        if (calendar2.get(1) == calendar3.get(1) && calendar2.get(6) == calendar3.get(6)) {
            return this.h;
        }
        Calendar calendar4 = Calendar.getInstance();
        calendar4.add(5, -1);
        return (calendar2.get(1) == calendar4.get(1) && calendar2.get(6) == calendar4.get(6)) ? this.i : this.b.format(date);
    }
}
