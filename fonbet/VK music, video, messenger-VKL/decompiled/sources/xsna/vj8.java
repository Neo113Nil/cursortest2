package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BroadcastStartTimeFormatter.kt */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes3.dex */
public final class vj8 {
    public final Calendar a = Calendar.getInstance();
    public final Calendar b = Calendar.getInstance();
    public final Date c = new Date();
    public final DateFormatSymbols d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public vj8(Context context) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setShortMonths(context.getResources().getStringArray(R.array.months_short));
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.vk_months_full));
        this.d = dateFormatSymbols;
        a94 a94Var = new a94(2, context, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, a94Var);
        this.f = msy.a(lazyThreadSafetyMode, new y4(4, context, this));
        this.g = msy.a(lazyThreadSafetyMode, new cm(4, context, this));
        this.h = msy.a(lazyThreadSafetyMode, new gd0(4, context, this));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    public final String a(long j) {
        xuo0.a.getClass();
        long a = xuo0.a();
        Calendar calendar = this.a;
        calendar.setTimeInMillis(a);
        Calendar calendar2 = this.b;
        calendar2.setTimeInMillis(j);
        Date date = this.c;
        date.setTime(j);
        return c09.c(calendar, calendar2) ? ((SimpleDateFormat) this.e.getValue()).format(date) : c09.e(calendar, calendar2) ? ((SimpleDateFormat) this.f.getValue()).format(date) : c09.d(calendar, calendar2) ? ((SimpleDateFormat) this.g.getValue()).format(date) : ((SimpleDateFormat) this.h.getValue()).format(date);
    }
}
