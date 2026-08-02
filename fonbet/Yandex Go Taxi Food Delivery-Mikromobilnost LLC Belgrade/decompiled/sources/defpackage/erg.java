package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes11.dex */
public final class erg {
    public static final SimpleTimeZone c = new SimpleTimeZone(10800000, "DEFAULT");
    public static final SimpleTimeZone d = new SimpleTimeZone(0, "GMT");
    public final rgz a;
    public final Pattern b = Pattern.compile("^([+-]?\\d{4}(?!\\d{2}\\b))((-?)((0[1-9]|1[0-2])(\\3([12]\\d|0[1-9]|3[01]))?|W([0-4]\\d|5[0-2])-?([1-7])?|(00[1-9]|0[1-9]\\d|[12]\\d{2}|3([0-5]\\d|6[1-6])))([T\\s]((([01]\\d|2[0-3])((:?)[0-5]\\d)?|24:?00)([.,]\\d+(?!:))?)?(\\17[0-5]\\d([.,]\\d+)?)?([zZ]|([+-])([01]\\d|2[0-3]):?([0-5]\\d)?)?)?)?$");

    public erg(rgz rgzVar) {
        this.a = rgzVar;
        Pattern.compile("^([zZ]|([+-])([01]\\d|2[0-3]):?([0-5]\\d)?)$");
    }

    public static boolean b(Calendar calendar, Matcher matcher, int i, int i2, int i3) {
        String group = matcher.group(i);
        if (group == null || evu0.J(group)) {
            return false;
        }
        calendar.set(i2, d(group) + i3);
        return true;
    }

    public static float c(String str) {
        char charAt;
        if (str.length() > 1 && ((charAt = str.charAt(0)) == ',' || charAt == '.')) {
            str = str.substring(1);
        }
        return (float) (Integer.parseInt(str) / Math.pow(10.0d, str.length()));
    }

    public static int d(String str) {
        if (str.length() > 1 && str.charAt(0) == ':') {
            str = str.substring(1);
        }
        return Integer.parseInt(str);
    }

    public static void f(Calendar calendar, Matcher matcher) {
        String group = matcher.group(18);
        if (group == null || evu0.J(group)) {
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            float c2 = c(group) * 60.0f;
            int i = (int) c2;
            calendar.set(13, i);
            calendar.set(14, (int) ((c2 - i) * 1000.0f));
        }
    }

    public final Calendar a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Calendar e = e(str);
            if (e != null) {
                e.getTimeInMillis();
                return e;
            }
            Date a = zuu.a(str);
            if (a == null) {
                throw new IllegalArgumentException("Unknown date format");
            }
            Calendar calendar = Calendar.getInstance(d);
            calendar.setTime(a);
            calendar.getTimeInMillis();
            return calendar;
        } catch (Exception e2) {
            this.a.f(e2, "String %s has not a valid date format", str);
            return null;
        }
    }

    public final Calendar e(String str) {
        SimpleTimeZone simpleTimeZone;
        Matcher matcher = this.b.matcher(str);
        SimpleTimeZone simpleTimeZone2 = null;
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(21);
        if (group == null || evu0.J(group)) {
            simpleTimeZone = c;
        } else if ("Z".equalsIgnoreCase(matcher.group(21))) {
            simpleTimeZone = new SimpleTimeZone(0, "GMT");
        } else {
            try {
                String group2 = matcher.group(22);
                String group3 = matcher.group(23);
                String group4 = matcher.group(24);
                simpleTimeZone2 = new SimpleTimeZone(((group3 == null ? 0 : (int) TimeUnit.HOURS.toMillis(Long.parseLong(group3))) + (group4 == null ? 0 : (int) TimeUnit.MINUTES.toMillis(Long.parseLong(group4)))) * ("+".equals(group2) ? 1 : -1), group);
            } catch (Exception e) {
                this.a.f(e, "Exception while creating TimeZone", new Object[0]);
            }
            simpleTimeZone = simpleTimeZone2;
        }
        Calendar calendar = Calendar.getInstance(simpleTimeZone);
        calendar.setTimeInMillis(0L);
        b(calendar, matcher, 1, 1, 0);
        if (b(calendar, matcher, 5, 2, -1)) {
            b(calendar, matcher, 7, 5, 0);
        } else if (b(calendar, matcher, 8, 3, 0)) {
            String group5 = matcher.group(9);
            if (group5 == null || evu0.J(group5)) {
                calendar.set(7, 2);
            } else {
                int d2 = d(group5);
                if (d2 == 7) {
                    calendar.set(7, 1);
                } else {
                    calendar.set(7, d2 + 1);
                }
            }
        } else {
            b(calendar, matcher, 10, 6, 0);
        }
        String group6 = matcher.group(14);
        if ("24:00".equals(group6) || "2400".equals(group6)) {
            calendar.add(6, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            f(calendar, matcher);
        } else if (b(calendar, matcher, 15, 10, 0)) {
            if (b(calendar, matcher, 16, 12, 0)) {
                String group7 = matcher.group(19);
                if (group7 == null || evu0.J(group7)) {
                    f(calendar, matcher);
                } else {
                    String[] strArr = (String[]) new Regex("[.,]").l(0, group7).toArray(new String[0]);
                    if (strArr.length == 0) {
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                    } else {
                        calendar.set(13, d(strArr[0]));
                        if (strArr.length > 1) {
                            calendar.set(14, (int) (c(strArr[1]) * 1000.0f));
                        } else {
                            calendar.set(14, 0);
                        }
                    }
                }
            } else {
                String group8 = matcher.group(18);
                if (group8 == null || evu0.J(group8)) {
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                } else {
                    float c2 = c(group8) * 60.0f;
                    int i = (int) c2;
                    float f = (c2 - i) * 60.0f;
                    int i2 = (int) f;
                    calendar.set(12, i);
                    calendar.set(13, i2);
                    calendar.set(14, (int) ((f - i2) * 1000.0f));
                }
            }
        }
        return calendar;
    }
}
