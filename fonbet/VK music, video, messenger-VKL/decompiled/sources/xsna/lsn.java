package xsna;

import com.vk.core.preference.Preference;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: DndHelper.kt */
/* loaded from: classes5.dex */
public final class lsn {
    public static final List<Long> a;
    public static final long b;
    public static final List<Integer> c;

    /* compiled from: DndHelper.kt */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = e43.l(Long.valueOf(timeUnit.toMillis(1L)), Long.valueOf(timeUnit.toMillis(8L)), Long.valueOf(timeUnit.toMillis(24L)));
        b = timeUnit.toSeconds(4L);
        c = e43.l(Integer.valueOf((int) timeUnit.toSeconds(1L)), Integer.valueOf((int) timeUnit.toSeconds(24L)), Integer.valueOf((int) TimeUnit.DAYS.toSeconds(7L)), Integer.MAX_VALUE);
    }

    public static boolean a(long j) {
        return Preference.f("notify").getInt(String.format("dnd%d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)), 0) > pvo0.a();
    }

    public static final boolean b() {
        long m = Preference.m(0L, "notifications_prefs", "dnd_end");
        xuo0.a.getClass();
        return m > xuo0.a();
    }
}
