package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.mto0;

/* compiled from: DialogTimeFormatter.kt */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes2.dex */
public final class vlm {
    public static final long n = TimeUnit.DAYS.toMillis(1);
    public final Object a;
    public final Date b;
    public final Object c;
    public final FieldPosition d;
    public final StringBuffer e;
    public final DateFormatSymbols f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public vlm(Context context) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, new ob0(8));
        this.b = new Date();
        this.c = msy.a(lazyThreadSafetyMode, new vg0(8));
        this.d = new FieldPosition(0);
        this.e = new StringBuffer();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_short));
        this.f = dateFormatSymbols;
        this.g = msy.a(lazyThreadSafetyMode, new dy0(10, context, this));
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.tools.controls.seekbar.f(8, context, this));
        this.i = msy.a(lazyThreadSafetyMode, new com.vk.movika.tools.controls.seekbar.g(5, context, this));
        this.j = msy.a(lazyThreadSafetyMode, new fqd(3, context, this));
        this.k = msy.a(lazyThreadSafetyMode, new vf1(6, context, this));
        this.l = msy.a(lazyThreadSafetyMode, new hc1(8, context, this));
        this.m = msy.a(lazyThreadSafetyMode, new fy0(6, context, this));
    }

    public static void b(long j, StringBuffer stringBuffer) {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "time must be >= 0. Given: "));
        }
        stringBuffer.setLength(0);
        mto0.a(j, stringBuffer, mto0.a.c.g);
        if (stringBuffer.length() > 0) {
            stringBuffer.insert(0, " · ");
        }
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(long j, StringBuffer stringBuffer) {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "serverTime must be >= 0. Given: "));
        }
        xuo0.a.getClass();
        long d = xuo0.d(j);
        long a = xuo0.a();
        FieldPosition fieldPosition = this.d;
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        ?? r4 = this.a;
        ((Calendar) r4.getValue()).setTimeInMillis(d);
        Date date = this.b;
        date.setTime(d);
        c().setTimeInMillis(a);
        c().set(11, 0);
        c().set(12, 0);
        c().set(13, 0);
        c().set(14, 0);
        long timeInMillis = c().getTimeInMillis();
        boolean z = d > timeInMillis;
        boolean z2 = d > timeInMillis - n;
        boolean z3 = ((Calendar) r4.getValue()).get(1) == c().get(1);
        if (z) {
            ((SimpleDateFormat) this.g.getValue()).format(date, stringBuffer, fieldPosition);
            return;
        }
        if (z2) {
            ((SimpleDateFormat) this.i.getValue()).format(date, stringBuffer, fieldPosition);
        } else if (z3) {
            ((SimpleDateFormat) this.j.getValue()).format(date, stringBuffer, fieldPosition);
        } else {
            ((SimpleDateFormat) this.k.getValue()).format(date, stringBuffer, fieldPosition);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Calendar c() {
        return (Calendar) this.c.getValue();
    }
}
