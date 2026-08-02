package xsna;

import android.content.Context;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.IllegalFormatConversionException;
import java.util.Locale;
import kotlin.Pair;

/* compiled from: StringUtils.kt */
/* loaded from: classes17.dex */
public final class uqm0 {
    public static final DecimalFormat a;
    public static final DecimalFormat b;
    public static final String[] c;
    public static DecimalFormat d;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        a = decimalFormat;
        DecimalFormat decimalFormat2 = new DecimalFormat("0.0");
        decimalFormat2.setRoundingMode(roundingMode);
        b = decimalFormat2;
        c = new String[]{"", "K", "M", "G", "T", "P"};
    }

    public static final Pair<Long, Integer> a(long j) {
        int i = 0;
        while (j >= 1000 && i < c.length - 1) {
            j /= 1000;
            i++;
        }
        return new Pair<>(Long.valueOf(j), Integer.valueOf(i));
    }

    public static final long b(long j) {
        Pair<Long, Integer> a2 = a(j);
        long longValue = a2.d().longValue();
        for (int i = 0; i < a2.g().intValue(); i++) {
            longValue *= 1000;
        }
        return longValue;
    }

    public static final String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? ro.p(charAt, Locale.getDefault()) : String.valueOf(charAt)));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static final String d(int i) {
        long j = i;
        long abs = Math.abs(j);
        DecimalFormat decimalFormat = a;
        if (abs >= 1000000000) {
            return decimalFormat.format(j / 1.0E9d) + 'B';
        }
        if (Math.abs(j) >= 1000000) {
            return decimalFormat.format(j / 1000000.0d) + 'M';
        }
        if (Math.abs(j) >= 1000) {
            return decimalFormat.format(j / 1000.0d) + 'K';
        }
        return j + "";
    }

    public static final String e(int i) {
        return f(i);
    }

    public static final String f(long j) {
        DecimalFormat decimalFormat = a;
        if (j >= 1000000000) {
            return decimalFormat.format(j / 1.0E9d) + 'B';
        }
        if (j >= 1000000) {
            return decimalFormat.format(j / 1000000.0d) + 'M';
        }
        if (j >= 1000) {
            return decimalFormat.format(j / 1000.0d) + 'K';
        }
        return j + "";
    }

    public static final boolean g(int i) {
        return i >= 1000;
    }

    public static String h(long j) {
        Pair p = p(j);
        double doubleValue = ((Number) p.d()).doubleValue();
        String str = (String) p.g();
        if (doubleValue >= 100.0d || (j < 1000000 && doubleValue >= 10.0d)) {
            doubleValue = Math.floor(doubleValue);
        }
        return a.format(doubleValue) + str;
    }

    public static final String i(int i, int i2, int i3, boolean z) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        DecimalFormat decimalFormat = a;
        if (i >= 1000000) {
            return context.getString(i3, decimalFormat.format(i / 1000000.0d) + 'M');
        }
        if (i < 1000) {
            try {
                return context.getResources().getQuantityString(i2, i, z ? String.valueOf(i) : Integer.valueOf(i));
            } catch (IllegalFormatConversionException e) {
                throw new IllegalArgumentException("Put false to numberAsString or just replace %d by %s in strings", e);
            }
        }
        return context.getString(i3, decimalFormat.format(i / 1000.0d) + 'K');
    }

    public static final String k(int i, int i2) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return brm0.y(enj.f(i2, i, context), String.valueOf(i), m(i));
    }

    public static String l(long j) {
        Pair p = p(j);
        double doubleValue = ((Number) p.d()).doubleValue();
        String str = (String) p.g();
        if (doubleValue >= 100.0d) {
            doubleValue = Math.floor(doubleValue);
        }
        return a.format(doubleValue) + str;
    }

    public static final String m(int i) {
        long j = i;
        DecimalFormat decimalFormat = d;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat();
            d = decimalFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setGroupingSeparator(' ');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        }
        return decimalFormat.format(j);
    }

    public static final String n(int i) {
        return o(i);
    }

    public static final String o(long j) {
        Pair<Long, Integer> a2 = a(j);
        return a2.d().longValue() + c[a2.g().intValue()];
    }

    public static Pair p(long j) {
        return j >= 1000000000 ? new Pair(Double.valueOf(j / 1.0E9d), "B") : j >= 1000000 ? new Pair(Double.valueOf(j / 1000000.0d), "M") : j >= 1000 ? new Pair(Double.valueOf(j / 1000.0d), "K") : new Pair(Double.valueOf(j), "");
    }
}
