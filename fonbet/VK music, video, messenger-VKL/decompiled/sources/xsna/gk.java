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

/* compiled from: AccessibilityDateFormatter.kt */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes17.dex */
public final class gk {
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

    public gk(Context context) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        int i = 1;
        this.a = msy.a(lazyThreadSafetyMode, new d2(i));
        this.b = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.v(i));
        this.c = new Date(0L);
        this.d = new FieldPosition(0);
        this.e = new StringBuffer();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_full_dep));
        this.f = dateFormatSymbols;
        this.g = msy.a(lazyThreadSafetyMode, new ek(0));
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.c(1, context, this));
        this.i = msy.a(lazyThreadSafetyMode, new fk(0, context, this));
        int i2 = 1;
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.catalog2.common.ui.holders.a(i2, context, this));
        this.k = msy.a(lazyThreadSafetyMode, new com.vk.catalog2.common.ui.holders.b(i2, context, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    public final String a(long j) {
        StringBuffer stringBuffer = this.e;
        stringBuffer.setLength(0);
        ?? r0 = this.a;
        Calendar calendar = (Calendar) r0.getValue();
        xuo0.a.getClass();
        calendar.setTimeInMillis(xuo0.a());
        ?? r2 = this.b;
        ((Calendar) r2.getValue()).setTimeInMillis(j);
        Date date = this.c;
        date.setTime(j);
        boolean c = c09.c((Calendar) r0.getValue(), (Calendar) r2.getValue());
        FieldPosition fieldPosition = this.d;
        if (c) {
            ((SimpleDateFormat) this.h.getValue()).format(date, stringBuffer, fieldPosition);
        } else if (c09.f((Calendar) r0.getValue(), (Calendar) r2.getValue())) {
            ((SimpleDateFormat) this.i.getValue()).format(date, stringBuffer, fieldPosition);
        } else if (c09.d((Calendar) r0.getValue(), (Calendar) r2.getValue())) {
            ((SimpleDateFormat) this.j.getValue()).format(date, stringBuffer, fieldPosition);
        } else {
            ((SimpleDateFormat) this.k.getValue()).format(date, stringBuffer, fieldPosition);
        }
        return stringBuffer.toString();
    }
}
