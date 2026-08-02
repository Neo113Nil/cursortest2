package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.chromium.base.TimeUtils;
import xsna.ky6;

/* compiled from: TimeUtils.java */
/* loaded from: classes.dex */
public final class pvo0 {
    public static volatile SimpleTimeZone a;
    public static final a b = new a();
    public static final long[] c = {1000, 60000, 3600000, TimeUtils.MILLISECONDS_PER_DAY, 604800000, 2592000000L, TimeUtils.MILLISECONDS_PER_YEAR};

    /* compiled from: TimeUtils.java */
    public class a extends ThreadLocal<Calendar> {
        @Override // java.lang.ThreadLocal
        public final Calendar initialValue() {
            return Calendar.getInstance();
        }
    }

    public static int a() {
        xuo0.a.getClass();
        return (int) xuo0.c();
    }

    public static String b(long j) {
        long abs = Math.abs(j);
        return abs < TimeUtils.SECONDS_PER_HOUR ? String.format(Locale.ENGLISH, "%02d:%02d", Long.valueOf(abs / 60), Long.valueOf(abs % 60)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Long.valueOf(abs / TimeUtils.SECONDS_PER_HOUR), Long.valueOf((abs / 60) % 60), Long.valueOf(abs % 60));
    }

    public static String c(int i) {
        Calendar d = d();
        d.setTimeInMillis(i * 1000);
        return String.format(Locale.ENGLISH, "%d:%02d", Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12)));
    }

    public static Calendar d() {
        Calendar calendar = b.get();
        if (a != null) {
            calendar.setTimeZone(a);
        }
        calendar.setTimeInMillis(a() * 1000);
        return calendar;
    }

    public static String e(int i) {
        long j = i * 1000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return e43.a.getResources().getStringArray(R.array.when_day_of_week)[(calendar.get(7) + 5) % 7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    @SuppressLint({"SimpleDateFormat"})
    public static boolean f(@NonNull String str) throws NumberFormatException {
        ?? r0;
        if (str.trim().isEmpty()) {
            return false;
        }
        String[] split = str.split("\\.");
        if (split == null || split.length == 0) {
            r0 = Collections.EMPTY_LIST;
        } else {
            r0 = new ArrayList(split.length);
            for (String str2 : split) {
                r0.add(Integer.valueOf(str2));
            }
        }
        if (r0.size() < 2) {
            return false;
        }
        int intValue = ((Integer) r0.get(0)).intValue();
        int intValue2 = ((Integer) r0.get(1)).intValue();
        Calendar calendar = Calendar.getInstance();
        if (intValue == 29 && intValue2 == 2) {
            int i = calendar.get(1);
            if ((i & 3) != 0 || (i % 100 == 0 && i % 400 != 0)) {
                intValue2 = 3;
                intValue = 1;
            }
        }
        return calendar.get(2) + 1 == intValue2 && calendar.get(5) == intValue;
    }

    public static boolean g(int i) {
        Calendar d = d();
        int i2 = d.get(5);
        int i3 = d.get(2);
        int i4 = d.get(1);
        d.setTimeInMillis(i * 1000);
        return i2 == d.get(5) && i3 == d.get(2) && i4 == d.get(1);
    }

    public static String h(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        long j;
        String str2;
        String string;
        String sb;
        Resources resources = e43.a.getResources();
        long j2 = i * 1000;
        Calendar d = d();
        int i2 = d.get(1);
        d.set(12, 0);
        d.set(11, 0);
        d.set(13, 0);
        d.set(14, 0);
        long timeInMillis = d.getTimeInMillis();
        long j3 = timeInMillis + TimeUtils.MILLISECONDS_PER_DAY;
        long j4 = 172800000 + timeInMillis;
        long j5 = timeInMillis + 259200000;
        long j6 = timeInMillis - TimeUtils.MILLISECONDS_PER_DAY;
        d.setTimeInMillis(j2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str == null ? " " : "");
        sb2.append("%s ");
        sb2.append(z4 ? "%02d:%02d" : "%d:%02d");
        String sb3 = sb2.toString();
        String b2 = go9.b("%s", sb3);
        if (str == null) {
            j = j2;
            str2 = resources.getString(d.get(11) == 1 ? R.string.date_at_1am : R.string.date_at);
        } else {
            j = j2;
            str2 = str;
        }
        if (z3 && j >= j4 && j < j5) {
            sb = String.format(Locale.ENGLISH, b2, resources.getString(R.string.day_after_tomorrow), str2, Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12)));
        } else if (z2 && j >= j3 && j < j4) {
            sb = String.format(Locale.ENGLISH, b2, resources.getString(R.string.tomorrow), str2, Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12)));
        } else if (z6 && j >= timeInMillis && j < j3) {
            sb = String.format(Locale.ENGLISH, b2, resources.getString(R.string.today), str2, Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12)));
        } else if (j < j6 || j >= timeInMillis) {
            int i3 = R.array.months_short;
            if ((!z5 || d.get(1) == i2) && !z7) {
                Integer valueOf = Integer.valueOf(d.get(5));
                if (!z) {
                    i3 = R.array.vk_months_full;
                }
                string = resources.getString(R.string.date_format_day_month, valueOf, resources.getStringArray(i3)[Math.min(d.get(2), 11)]);
            } else {
                string = resources.getString(R.string.date_format_day_month_year, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.months_short)[Math.min(d.get(2), 11)], Integer.valueOf(d.get(1)));
            }
            StringBuilder e = fw3.e(string);
            e.append(String.format(Locale.ENGLISH, sb3, str2, Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12))));
            sb = e.toString();
        } else {
            sb = String.format(Locale.ENGLISH, b2, resources.getString(R.string.yesterday), str2, Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12)));
        }
        d.clear();
        return sb;
    }

    public static String i(boolean z, int i, boolean z2, boolean z3) {
        return h(i, null, z, true, z2, z3, true, true, false);
    }

    public static String j(long j, boolean z, boolean z2) {
        String string;
        Resources resources = e43.a.getResources();
        Calendar d = d();
        int i = d.get(1);
        d.set(12, 0);
        d.set(11, 0);
        d.set(13, 0);
        d.set(14, 0);
        long timeInMillis = d.getTimeInMillis();
        long j2 = timeInMillis + TimeUtils.MILLISECONDS_PER_DAY;
        long j3 = 172800000 + timeInMillis;
        long j4 = timeInMillis - TimeUtils.MILLISECONDS_PER_DAY;
        d.setTimeInMillis(j);
        if (j >= j2 && j < j3) {
            string = resources.getString(R.string.tomorrow);
            if (z2) {
                string = uqm0.c(string);
            }
        } else if (j >= timeInMillis && j < j2) {
            string = resources.getString(R.string.today);
            if (z2) {
                string = uqm0.c(string);
            }
        } else if (j < j4 || j >= timeInMillis) {
            int i2 = d.get(1);
            int i3 = R.array.months_short;
            if (i2 != i) {
                string = resources.getString(R.string.date_format_day_month_year, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.months_short)[Math.min(d.get(2), 11)], Integer.valueOf(d.get(1)));
            } else {
                Integer valueOf = Integer.valueOf(d.get(5));
                if (!z) {
                    i3 = R.array.vk_months_full;
                }
                string = resources.getString(R.string.date_format_day_month, valueOf, resources.getStringArray(i3)[Math.min(d.get(2), 11)]);
            }
        } else {
            string = resources.getString(R.string.yesterday);
            if (z2) {
                string = uqm0.c(string);
            }
        }
        d.clear();
        return string;
    }

    public static String k(int i, Resources resources, boolean z) {
        int a2 = a() - i;
        if (a2 >= 14400 || a2 < 0) {
            return i(z, i, false, false);
        }
        if (a2 >= 10800) {
            return resources.getStringArray(R.array.date_ago_hrs)[2];
        }
        if (a2 >= 7200) {
            return resources.getStringArray(R.array.date_ago_hrs)[1];
        }
        if (a2 >= 3600) {
            return resources.getStringArray(R.array.date_ago_hrs)[0];
        }
        if (a2 >= 60) {
            int round = Math.round(a2 / 60.0f);
            return resources.getQuantityString(R.plurals.date_ago_mins, round, Integer.valueOf(round));
        }
        if (a2 <= 10) {
            return resources.getString(R.string.date_ago_now);
        }
        try {
            return resources.getQuantityString(R.plurals.date_ago_secs, a2, Integer.valueOf(a2));
        } catch (Exception unused) {
            return resources.getString(R.string.date_ago_now);
        }
    }

    public static String l(int i) {
        Resources resources = e43.a.getResources();
        long j = i * 1000;
        Calendar d = d();
        int i2 = d.get(1);
        d.set(12, 0);
        d.set(11, 0);
        d.set(13, 0);
        d.set(14, 0);
        long timeInMillis = d.getTimeInMillis();
        long j2 = timeInMillis - TimeUtils.MILLISECONDS_PER_DAY;
        d.setTimeInMillis(j);
        String format = j >= timeInMillis ? String.format(Locale.ENGLISH, "%d:%02d", Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12))) : (j < j2 || j >= timeInMillis) ? d.get(1) == i2 ? resources.getString(R.string.date_format_day_month, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.months_short)[Math.min(d.get(2), 11)]) : resources.getString(R.string.date_format_day_month_year, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.months_short)[Math.min(d.get(2), 11)], Integer.valueOf(d.get(1))) : resources.getString(R.string.yesterday);
        d.clear();
        return format;
    }

    public static String m(int i) {
        Resources resources = e43.a.getResources();
        long j = i * 1000;
        Calendar d = d();
        int i2 = d.get(1);
        d.set(12, 0);
        d.set(11, 0);
        d.set(13, 0);
        d.set(14, 0);
        d.getTimeInMillis();
        d.setTimeInMillis(j);
        StringBuilder e = fw3.e(d.get(1) != i2 ? resources.getString(R.string.date_format_day_month_year, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.months_short)[Math.min(d.get(2), 11)], Integer.valueOf(d.get(1))) : resources.getString(R.string.date_format_day_month, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.vk_months_full)[Math.min(d.get(2), 11)]));
        e.append(String.format(Locale.ENGLISH, " %s %d:%02d", resources.getString(d.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12))));
        String sb = e.toString();
        d.clear();
        return sb;
    }

    public static String n(int i, int i2, Context context) {
        if (DateFormat.is24HourFormat(context)) {
            Locale locale = Locale.US;
            return pzl.b(String.valueOf(i), StringUtils.PROCESS_POSTFIX_DELIMITER, i2 < 10 ? lhg.a(i2, "0") : String.valueOf(i2));
        }
        int i3 = i <= 11 ? i : i - 12;
        if (i3 == 0) {
            i3 = 12;
        }
        String str = i <= 11 ? "am" : "pm";
        Locale locale2 = Locale.US;
        return String.valueOf(i3) + StringUtils.PROCESS_POSTFIX_DELIMITER + (i2 < 10 ? lhg.a(i2, "0") : String.valueOf(i2)) + " " + str;
    }

    public static String o(int i, boolean z, boolean z2) {
        Calendar d = d();
        int i2 = d.get(1);
        long j = i * 1000;
        Resources resources = e43.a.getResources();
        d.setTimeInMillis(j);
        int i3 = d.get(1);
        int i4 = R.array.vk_months_full;
        if (i3 != i2 || z2) {
            if (z || !z2) {
                i4 = R.array.months_short;
            }
            return resources.getString(R.string.date_format_day_month_year, Integer.valueOf(d.get(5)), resources.getStringArray(i4)[Math.min(d.get(2), 11)], Integer.valueOf(d.get(1)));
        }
        Integer valueOf = Integer.valueOf(d.get(5));
        if (z) {
            i4 = R.array.months_short;
        }
        return resources.getString(R.string.date_format_day_month, valueOf, resources.getStringArray(i4)[Math.min(d.get(2), 11)]);
    }

    public static void p(float f) {
        L.p(n23.a(f, "using custom timezone with offset "));
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            a = null;
        } else {
            a = new SimpleTimeZone((int) (3600.0f * f * 1000.0f), String.format(Locale.ENGLISH, "Custom %d:%02d", Integer.valueOf((int) f), Integer.valueOf((int) ((f * 60.0f) % 60.0f))));
        }
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putFloat("custom_timezone", f);
        aVar.apply();
    }

    public static void q(int i) {
        float f;
        if (Math.abs(i - ((int) (System.currentTimeMillis() / 1000))) > 1800) {
            f = ((TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000.0f) / 3600.0f) + Math.round((r0 - i) / 3600.0f);
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        p(f);
    }
}
