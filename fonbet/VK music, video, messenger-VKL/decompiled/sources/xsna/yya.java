package xsna;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ChannelFooterDateUtil.kt */
/* loaded from: classes16.dex */
public final class yya {
    public static final Object a;
    public static final Object b;

    static {
        g13 g13Var = new g13(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = msy.a(lazyThreadSafetyMode, g13Var);
        b = msy.a(lazyThreadSafetyMode, new h13(4));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    public static String a(int i) {
        long j = i * 1000;
        Calendar calendar = Calendar.getInstance();
        xuo0.a.getClass();
        calendar.setTimeInMillis(xuo0.a());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return (c09.d(calendar, calendar2) ? (SimpleDateFormat) a.getValue() : (SimpleDateFormat) b.getValue()).format(Long.valueOf(j));
    }
}
