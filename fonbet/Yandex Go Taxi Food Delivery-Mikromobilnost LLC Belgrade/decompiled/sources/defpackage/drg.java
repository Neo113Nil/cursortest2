package defpackage;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.text.Regex;

/* loaded from: classes10.dex */
public class drg {
    public static final SimpleTimeZone c = new SimpleTimeZone(10800000, "DEFAULT");
    public static final SimpleTimeZone d = new SimpleTimeZone(0, "GMT");
    public final i3y a;
    public final i3y b;

    public drg() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = a.b(lazyThreadSafetyMode, new cue(20));
        this.b = a.b(lazyThreadSafetyMode, new cue(21));
    }

    public static SimpleTimeZone a(String str, Matcher matcher, int i) {
        if ("Z".equalsIgnoreCase(matcher.group(i + 1))) {
            return new SimpleTimeZone(0, "GMT");
        }
        try {
            String group = matcher.group(i + 2);
            String group2 = matcher.group(i + 3);
            String group3 = matcher.group(i + 4);
            return new SimpleTimeZone(((group2 != null ? (int) TimeUnit.HOURS.toMillis(Long.parseLong(group2)) : 0) + (group3 != null ? (int) TimeUnit.MINUTES.toMillis(Long.parseLong(group3)) : 0)) * ("+".equals(group) ? 1 : -1), str);
        } catch (Exception e) {
            xby.d.k(e, "Exception while creating TimeZone");
            return null;
        }
    }

    public static boolean d(Calendar calendar, Matcher matcher, int i, int i2, int i3) {
        String group = matcher.group(i);
        if (group == null || evu0.J(group)) {
            return false;
        }
        calendar.set(i2, f(group) + i3);
        return true;
    }

    public static float e(String str) {
        char charAt;
        if (str.length() > 1 && ((charAt = str.charAt(0)) == ',' || charAt == '.')) {
            str = str.substring(1);
        }
        return (float) (Integer.parseInt(str) / Math.pow(10.0d, str.length()));
    }

    public static int f(String str) {
        if (str.length() > 1 && str.charAt(0) == ':') {
            str = str.substring(1);
        }
        return Integer.parseInt(str);
    }

    public static void h(Calendar calendar, Matcher matcher) {
        String group = matcher.group(18);
        if (group == null || evu0.J(group)) {
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            float e = e(group) * 60.0f;
            int i = (int) e;
            calendar.set(13, i);
            calendar.set(14, (int) ((e - i) * 1000.0f));
        }
    }

    public final Calendar b(String str) {
        if (str == null) {
            return null;
        }
        try {
            Calendar g = g(str);
            if (g != null) {
                g.getTimeInMillis();
                return g;
            }
            Date b = yuu.b(str);
            if (b == null) {
                throw new IllegalArgumentException("Unknown date format");
            }
            Calendar calendar = Calendar.getInstance(d);
            calendar.setTime(b);
            calendar.getTimeInMillis();
            return calendar;
        } catch (Exception e) {
            xby.d.k(e, String.format("String %s has not a valid date format", Arrays.copyOf(new Object[]{str}, 1)));
            return null;
        }
    }

    public final Date c(String str) {
        Date date = null;
        if (str != null && !evu0.J(str)) {
            try {
                Calendar g = g(str);
                date = g == null ? yuu.b(str) : g.getTime();
                if (date != null) {
                    return date;
                }
                throw new IllegalArgumentException("Unknown date format");
            } catch (Exception e) {
                xby.d.k(e, String.format("String %s has not a valid date format", Arrays.copyOf(new Object[]{str}, 1)));
            }
        }
        return date;
    }

    public final Calendar g(String str) {
        Matcher matcher = ((Pattern) this.a.getValue()).matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(21);
        Calendar calendar = Calendar.getInstance((group == null || evu0.J(group)) ? c : a(group, matcher, 20));
        calendar.setTimeInMillis(0L);
        d(calendar, matcher, 1, 1, 0);
        if (d(calendar, matcher, 5, 2, -1)) {
            d(calendar, matcher, 7, 5, 0);
        } else if (d(calendar, matcher, 8, 3, 0)) {
            String group2 = matcher.group(9);
            if (group2 == null || evu0.J(group2)) {
                calendar.set(7, 2);
            } else {
                int f = f(group2);
                if (f == 7) {
                    calendar.set(7, 1);
                } else {
                    calendar.set(7, f + 1);
                }
            }
        } else {
            d(calendar, matcher, 10, 6, 0);
        }
        String group3 = matcher.group(14);
        if ("24:00".equals(group3) || "2400".equals(group3)) {
            calendar.add(6, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            h(calendar, matcher);
            return calendar;
        }
        if (d(calendar, matcher, 15, 10, 0)) {
            if (!d(calendar, matcher, 16, 12, 0)) {
                String group4 = matcher.group(18);
                if (group4 == null || evu0.J(group4)) {
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    return calendar;
                }
                float e = e(group4) * 60.0f;
                int i = (int) e;
                float f2 = (e - i) * 60.0f;
                int i2 = (int) f2;
                calendar.set(12, i);
                calendar.set(13, i2);
                calendar.set(14, (int) ((f2 - i2) * 1000.0f));
                return calendar;
            }
            String group5 = matcher.group(19);
            if (group5 != null && !evu0.J(group5)) {
                List l = new Regex("[.,]").l(0, group5);
                if (l.isEmpty()) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    return calendar;
                }
                calendar.set(13, f((String) l.get(0)));
                if (l.size() > 1) {
                    calendar.set(14, (int) (e((String) l.get(1)) * 1000.0f));
                    return calendar;
                }
                calendar.set(14, 0);
                return calendar;
            }
            h(calendar, matcher);
        }
        return calendar;
    }
}
