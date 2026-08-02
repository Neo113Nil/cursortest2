package defpackage;

import android.content.Context;
import java.text.DateFormat;
import java.util.Calendar;

/* loaded from: classes15.dex */
public final class otx {
    public final w3c a;

    public otx(w3c w3cVar) {
        this.a = w3cVar;
    }

    public final String a(Context context, long j) {
        w3c w3cVar = this.a;
        w3cVar.getClass();
        if ((System.currentTimeMillis() - j) / 3600000 < 1) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (currentTimeMillis < 30000) {
                return context.getString(oyh0.messaging_online_right_now);
            }
            if (currentTimeMillis < 60000) {
                return context.getString(oyh0.messaging_online_moment_ago);
            }
            long j2 = currentTimeMillis / 60000;
            return context.getResources().getQuantityString(ewh0.messaging_online_minutes_ago, (int) j2, Long.valueOf(j2));
        }
        Calendar calendar = Calendar.getInstance();
        w3cVar.getClass();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return context.getResources().getString(oyh0.messaging_online_today, DateFormat.getTimeInstance(3).format(Long.valueOf(j)));
        }
        Calendar calendar3 = Calendar.getInstance();
        w3cVar.getClass();
        calendar3.setTimeInMillis(System.currentTimeMillis());
        calendar3.add(6, -1);
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTimeInMillis(j);
        if (calendar3.get(1) == calendar4.get(1) && calendar3.get(6) == calendar4.get(6)) {
            return context.getResources().getString(oyh0.messaging_online_yesterday, DateFormat.getTimeInstance(3).format(Long.valueOf(j)));
        }
        Calendar calendar5 = Calendar.getInstance();
        w3cVar.getClass();
        calendar5.setTimeInMillis(System.currentTimeMillis());
        calendar5.add(10, -144);
        Calendar calendar6 = Calendar.getInstance();
        calendar6.setTimeInMillis(j);
        if (calendar6.after(calendar5)) {
            return context.getString(oyh0.messaging_online_week_ago, android.text.format.DateFormat.format("EE, d MMMM", j).toString());
        }
        if (System.currentTimeMillis() - j > 630720000000L) {
            return context.getString(oyh0.messaging_online_long_time_ago);
        }
        return context.getString(oyh0.messaging_online_ago, DateFormat.getDateInstance(3).format(Long.valueOf(j)), DateFormat.getTimeInstance(3).format(Long.valueOf(j)));
    }
}
