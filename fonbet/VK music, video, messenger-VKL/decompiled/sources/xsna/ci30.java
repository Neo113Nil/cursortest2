package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MsgDateFormatter.kt */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes2.dex */
public final class ci30 {
    public final Object a;
    public final Object b;
    public final Date c;
    public final FieldPosition d;
    public final StringBuffer e;
    public final DateFormatSymbols f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public ci30(Context context) {
        h13 h13Var = new h13(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, h13Var);
        this.b = msy.a(lazyThreadSafetyMode, new i13(19));
        this.c = new Date(0L);
        this.d = new FieldPosition(0);
        this.e = new StringBuffer();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_full_dep));
        this.f = dateFormatSymbols;
        this.g = msy.a(lazyThreadSafetyMode, new fc(22));
        this.h = msy.a(lazyThreadSafetyMode, new bi30(context, 0));
        int i = 1;
        this.i = msy.a(lazyThreadSafetyMode, new i3r(context, i));
        this.j = msy.a(lazyThreadSafetyMode, new j3r(context, i));
        this.k = msy.a(lazyThreadSafetyMode, new defpackage.u(20, context, this));
        this.l = msy.a(lazyThreadSafetyMode, new ig1(18, context, this));
    }

    public final String a(long j) {
        StringBuffer stringBuffer = this.e;
        stringBuffer.setLength(0);
        b(j, stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(long j, StringBuffer stringBuffer) {
        ?? r0 = this.a;
        Calendar calendar = (Calendar) r0.getValue();
        xuo0.a.getClass();
        calendar.setTimeInMillis(xuo0.a());
        c().setTimeInMillis(j);
        Date date = this.c;
        date.setTime(j);
        if (c09.c((Calendar) r0.getValue(), c())) {
            stringBuffer.append((String) this.h.getValue());
            return;
        }
        if (c09.e((Calendar) r0.getValue(), c())) {
            stringBuffer.append((String) this.i.getValue());
            return;
        }
        if (c09.f((Calendar) r0.getValue(), c())) {
            stringBuffer.append((String) this.j.getValue());
            return;
        }
        boolean d = c09.d((Calendar) r0.getValue(), c());
        FieldPosition fieldPosition = this.d;
        if (d) {
            ((SimpleDateFormat) this.k.getValue()).format(date, stringBuffer, fieldPosition);
        } else {
            ((SimpleDateFormat) this.l.getValue()).format(date, stringBuffer, fieldPosition);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Calendar c() {
        return (Calendar) this.b.getValue();
    }
}
