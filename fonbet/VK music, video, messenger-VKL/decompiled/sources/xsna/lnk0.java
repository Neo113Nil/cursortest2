package xsna;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SsaStyle.java */
/* loaded from: classes12.dex */
public final class lnk0 {
    public final String a;
    public final int b;

    @Nullable
    public final Integer c;

    @Nullable
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    /* compiled from: SsaStyle.java */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            this.k = i11;
        }
    }

    /* compiled from: SsaStyle.java */
    public static final class b {
        public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
        public static final Pattern b;
        public static final Pattern c;
        public static final Pattern d;

        static {
            String str = y2r0.a;
            Locale locale = Locale.US;
            b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            d = Pattern.compile("\\\\an(\\d+)");
        }

        @Nullable
        public static PointF a(String str) {
            String group;
            String group2;
            Matcher matcher = b.matcher(str);
            Matcher matcher2 = c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    ahn.u("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    public lnk0(String str, int i, @Nullable Integer num, @Nullable Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                xr.a("Ignoring unknown alignment: ", str);
                return -1;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            ahn.G("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    @Nullable
    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            fxc0.p(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(ipx.s(((parseLong >> 24) & 255) ^ 255), ipx.s(parseLong & 255), ipx.s((parseLong >> 8) & 255), ipx.s((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            ahn.G("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
