package xsna;

import com.vkontakte.android.R;

/* compiled from: FormatStyle.kt */
/* loaded from: classes7.dex */
public abstract class x8s {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    /* compiled from: FormatStyle.kt */
    public static final class a extends x8s {
        public static final a g = new a(R.plurals.time_ago_minute_full, R.plurals.time_ago_hour_full, R.plurals.time_ago_day_full, R.plurals.time_ago_week_full, R.plurals.time_ago_month_full, R.plurals.time_ago_year_full);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2094143847;
        }

        public final String toString() {
            return "Full";
        }
    }

    /* compiled from: FormatStyle.kt */
    public static final class b extends x8s {
        public static final b g = new b(R.plurals.time_ago_minute_middle, R.plurals.time_ago_hour_middle, R.plurals.time_ago_day_middle, R.plurals.time_ago_week_middle, R.plurals.time_ago_month_middle, R.plurals.time_ago_year_middle);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1678345619;
        }

        public final String toString() {
            return "Middle";
        }
    }

    public x8s(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }
}
