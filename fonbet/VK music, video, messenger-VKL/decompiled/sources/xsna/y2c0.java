package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* compiled from: PostFooterDateFormatter.kt */
/* loaded from: classes4.dex */
public final class y2c0 {
    public final boolean a;

    public y2c0(boolean z) {
        this.a = z;
    }

    public static String b(int i, int i2) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (i2 < 1) {
            i2 = 1;
        }
        return context.getString(R.string.newsfeed_date_time_ago_format, context.getResources().getQuantityString(i, i2, Integer.valueOf(i2)), context.getResources().getString(R.string.post_date_ago));
    }

    public final String a(int i) {
        long j = i * 1000;
        xuo0.a.getClass();
        long a = xuo0.a();
        long j2 = a - j;
        if (j2 < 0) {
            Context context = e43.a;
            return pvo0.k(i, (context != null ? context : null).getResources(), true);
        }
        if (!this.a) {
            if (j2 < tni.l()) {
                Context context2 = e43.a;
                return (context2 != null ? context2 : null).getResources().getString(R.string.vk_date_ago_now);
            }
            if (j2 < tni.k(1)) {
                return b(R.plurals.time_ago_minute_middle, (int) TimeUnit.MILLISECONDS.toMinutes(j2));
            }
            if (j2 < tni.k(24)) {
                return b(R.plurals.time_ago_hour_middle, (int) TimeUnit.MILLISECONDS.toHours(j2));
            }
            if (j2 < tni.f(8)) {
                return b(R.plurals.time_ago_day_middle, (int) TimeUnit.MILLISECONDS.toDays(j2));
            }
            if (j2 < TimeUnit.DAYS.toMillis(12 * 31)) {
                Calendar d = pvo0.d();
                d.setTimeInMillis(j);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a);
                boolean z = d.get(1) == calendar.get(1);
                d.clear();
                if (z) {
                    return cdi.B(i);
                }
            }
            return cdi.C(i);
        }
        Context context3 = e43.a;
        if (context3 == null) {
            context3 = null;
        }
        if (j2 < tni.l()) {
            return context3.getResources().getQuantityString(R.plurals.time_ago_second_middle, 1, 1);
        }
        if (j2 < tni.k(1)) {
            Resources resources = context3.getResources();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return resources.getQuantityString(R.plurals.time_ago_minute_middle, (int) timeUnit.toMinutes(j2), Integer.valueOf((int) timeUnit.toMinutes(j2)));
        }
        if (j2 < tni.k(24)) {
            Resources resources2 = context3.getResources();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            return resources2.getQuantityString(R.plurals.time_ago_hour_middle, (int) timeUnit2.toHours(j2), Integer.valueOf((int) timeUnit2.toHours(j2)));
        }
        if (j2 < tni.f(8)) {
            Resources resources3 = context3.getResources();
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            return resources3.getQuantityString(R.plurals.time_ago_day_middle, (int) timeUnit3.toDays(j2), Integer.valueOf((int) timeUnit3.toDays(j2)));
        }
        if (j2 < TimeUnit.DAYS.toMillis(12 * 31)) {
            Calendar d2 = pvo0.d();
            d2.setTimeInMillis(j);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(a);
            boolean z2 = d2.get(1) == calendar2.get(1);
            d2.clear();
            if (z2) {
                return cdi.B(i);
            }
        }
        Context context4 = e43.a;
        Resources resources4 = (context4 != null ? context4 : null).getResources();
        Calendar d3 = pvo0.d();
        d3.set(12, 0);
        d3.set(11, 0);
        d3.set(13, 0);
        d3.set(14, 0);
        d3.setTimeInMillis(j);
        String[] stringArray = resources4.getStringArray(R.array.months_short);
        int i2 = d3.get(2);
        String string = resources4.getString(R.string.date_format_month_year, stringArray[i2 <= 11 ? i2 : 11], Integer.valueOf(d3.get(1)));
        d3.clear();
        return string;
    }
}
