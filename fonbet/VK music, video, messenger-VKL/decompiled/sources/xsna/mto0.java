package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: TimeAgoFormatter.kt */
/* loaded from: classes17.dex */
public final class mto0 {
    public static final mto0 a = new mto0();

    /* compiled from: TimeAgoFormatter.kt */
    public static abstract class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        /* compiled from: TimeAgoFormatter.kt */
        /* renamed from: xsna.mto0$a$a, reason: collision with other inner class name */
        public static final class C3369a extends a {
            public static final C3369a g = new C3369a(R.plurals.time_ago_minute_full, R.plurals.time_ago_hour_full, R.plurals.time_ago_day_full, R.plurals.time_ago_week_full, R.plurals.time_ago_month_full, R.plurals.time_ago_year_full);
        }

        /* compiled from: TimeAgoFormatter.kt */
        public static final class b extends a {
            public static final b g = new b(R.plurals.time_ago_minute_middle, R.plurals.time_ago_hour_middle, R.plurals.time_ago_day_middle, R.plurals.time_ago_week_middle, R.plurals.time_ago_month_middle, R.plurals.time_ago_year_middle);
        }

        /* compiled from: TimeAgoFormatter.kt */
        public static final class c extends a {
            public static final c g = new c(R.plurals.time_ago_minute, R.plurals.time_ago_hour, R.plurals.time_ago_day, R.plurals.time_ago_week, R.plurals.time_ago_month, R.plurals.time_ago_year);
        }

        public a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    public static void a(long j, StringBuffer stringBuffer, a aVar) {
        xuo0.a.getClass();
        long a2 = xuo0.a() - j;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        stringBuffer.append(a2 < tni.l() ? "" : a2 < tni.k(1) ? enj.f(aVar.a, (int) TimeUnit.MILLISECONDS.toMinutes(a2), context) : a2 < tni.k(24) ? enj.f(aVar.b, (int) TimeUnit.MILLISECONDS.toHours(a2), context) : a2 < tni.f(7) ? enj.f(aVar.c, (int) TimeUnit.MILLISECONDS.toDays(a2), context) : a2 < tni.f(31) ? enj.f(aVar.d, (int) (TimeUnit.MILLISECONDS.toDays(a2) / 7), context) : a2 < TimeUnit.DAYS.toMillis(((long) 12) * 31) ? enj.f(aVar.e, (int) (TimeUnit.MILLISECONDS.toDays(a2) / 31), context) : enj.f(aVar.f, (int) (TimeUnit.MILLISECONDS.toDays(a2) / 365), context));
    }
}
