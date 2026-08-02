package xsna;

import android.content.res.Resources;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.chromium.base.TimeUtils;

/* compiled from: TimeUtils.kt */
/* loaded from: classes6.dex */
public final class qvo0 {
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(qvo0.class, "defaultDateFormat", "getDefaultDateFormat()Ljava/text/SimpleDateFormat;", 0), b09.a(0, qvo0.class, "defaultDateTimeFormat", "getDefaultDateTimeFormat()Ljava/text/SimpleDateFormat;", fpf0.a), new PropertyReference1Impl(qvo0.class, "calendar", "getCalendar()Ljava/util/Calendar;", 0)};
    public static final qvo0 a = new qvo0();
    public static final wqo0 c = new wqo0(new im80(5));
    public static final wqo0 d = new wqo0(new buc0(8));
    public static final wqo0 e = new wqo0(new ta50(11));

    public static Calendar a() {
        qcy<Object> qcyVar = b[2];
        wqo0 wqo0Var = e;
        wqo0Var.getClass();
        return (Calendar) wqo0Var.get();
    }

    public static long b(long j) {
        return e(j) + 86399999;
    }

    public static long c(long j) {
        return f(j) + 604799999;
    }

    public static long d() {
        a().setTime(new Date());
        l();
        a().add(2, -1);
        return a().getTimeInMillis();
    }

    public static long e(long j) {
        a().setTimeInMillis(j);
        l();
        return a().getTimeInMillis();
    }

    public static long f(long j) {
        a().setTimeInMillis(j);
        l();
        a().set(7, a().getFirstDayOfWeek());
        return a().getTimeInMillis();
    }

    public static long g() {
        a().setTime(new Date());
        l();
        a().add(5, -1);
        return a().getTimeInMillis();
    }

    public static String h(int i, Resources resources, boolean z) {
        int currentTimeMillis = ((int) (System.currentTimeMillis() / 1000)) - i;
        if (currentTimeMillis < 14400 && currentTimeMillis >= 0) {
            if (currentTimeMillis >= 10800) {
                return resources.getStringArray(R.array.vk_date_ago_hrs)[2];
            }
            if (currentTimeMillis >= 7200) {
                return resources.getStringArray(R.array.vk_date_ago_hrs)[1];
            }
            if (currentTimeMillis >= 3600) {
                return resources.getStringArray(R.array.vk_date_ago_hrs)[0];
            }
            if (currentTimeMillis >= 60) {
                int b2 = an10.b(currentTimeMillis / 60.0f);
                return resources.getQuantityString(R.plurals.vk_date_ago_mins, b2, Integer.valueOf(b2));
            }
            if (currentTimeMillis <= 10) {
                return resources.getString(R.string.vk_date_ago_now);
            }
            try {
                return resources.getQuantityString(R.plurals.vk_date_ago_secs, currentTimeMillis, Integer.valueOf(currentTimeMillis));
            } catch (Exception unused) {
                return resources.getString(R.string.vk_date_ago_now);
            }
        }
        long j = i * 1000;
        l();
        a().setTimeInMillis(System.currentTimeMillis());
        int i2 = a().get(1);
        long timeInMillis = a().getTimeInMillis();
        long j2 = timeInMillis + TimeUtils.MILLISECONDS_PER_DAY;
        long j3 = 172800000 + timeInMillis;
        long j4 = timeInMillis - TimeUtils.MILLISECONDS_PER_DAY;
        a().setTimeInMillis(j);
        String string = (j2 > j || j >= j3) ? (timeInMillis > j || j >= j2) ? (j4 > j || j >= timeInMillis) ? a().get(1) != i2 ? resources.getString(R.string.vk_date_format_day_month_year, Integer.valueOf(a().get(5)), resources.getStringArray(R.array.vk_months_short)[Math.min(a().get(2), 11)], Integer.valueOf(a().get(1))) : resources.getString(R.string.vk_date_format_day_month, Integer.valueOf(a().get(5)), resources.getStringArray(R.array.vk_months_full)[Math.min(a().get(2), 11)]) : resources.getString(R.string.vk_yesterday) : resources.getString(R.string.vk_today) : resources.getString(R.string.vk_tomorrow);
        if (!z) {
            return string;
        }
        Calendar a2 = a();
        StringBuilder b3 = ho8.b(string, " ");
        b3.append(String.format(Locale.ENGLISH, "%s %d:%02d", Arrays.copyOf(new Object[]{resources.getString(R.string.vk_date_at), Integer.valueOf(a2.get(11)), Integer.valueOf(a2.get(12))}, 3)));
        return b3.toString();
    }

    public static Long i(qvo0 qvo0Var, String str) {
        qvo0Var.getClass();
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) wqo0Var.get();
        qvo0Var.getClass();
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                return Long.valueOf(parse.getTime());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String j(qvo0 qvo0Var, long j) {
        qvo0Var.getClass();
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) wqo0Var.get();
        qvo0Var.getClass();
        try {
            return simpleDateFormat.format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String k(qvo0 qvo0Var, long j) {
        qvo0Var.getClass();
        qcy<Object> qcyVar = b[1];
        wqo0 wqo0Var = d;
        wqo0Var.getClass();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) wqo0Var.get();
        qvo0Var.getClass();
        try {
            return simpleDateFormat.format(new Date(j));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void l() {
        a().set(11, 0);
        a().set(12, 0);
        a().set(13, 0);
        a().set(14, 0);
    }
}
