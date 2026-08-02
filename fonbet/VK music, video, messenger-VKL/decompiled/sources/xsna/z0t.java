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

/* compiled from: FwdTimeFormatter.kt */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes17.dex */
public class z0t {
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

    public z0t(final Context context, final int i, final int i2, final int i3, int i4) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.g(17));
        this.b = msy.a(lazyThreadSafetyMode, new qe3(23));
        this.c = new Date(0L);
        this.d = new FieldPosition(0);
        this.e = new StringBuffer();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setShortMonths(context.getResources().getStringArray(R.array.months_short));
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.vk_months_full));
        this.f = dateFormatSymbols;
        this.g = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.v0t
            @Override // xsna.gzs
            public final Object invoke() {
                return new SimpleDateFormat(context.getString(i), this.f);
            }
        });
        this.h = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.w0t
            @Override // xsna.gzs
            public final Object invoke() {
                return new SimpleDateFormat(context.getString(i2), this.f);
            }
        });
        this.i = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.x0t
            @Override // xsna.gzs
            public final Object invoke() {
                return new SimpleDateFormat(context.getString(i3), this.f);
            }
        });
        this.j = msy.a(lazyThreadSafetyMode, new y0t(context, i4, this));
    }

    public final String a(long j) {
        StringBuffer stringBuffer = this.e;
        stringBuffer.setLength(0);
        b(j, stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(long j, StringBuffer stringBuffer) {
        ?? r0 = this.a;
        Calendar calendar = (Calendar) r0.getValue();
        xuo0.a.getClass();
        calendar.setTimeInMillis(xuo0.a());
        ?? r1 = this.b;
        ((Calendar) r1.getValue()).setTimeInMillis(j);
        Date date = this.c;
        date.setTime(j);
        boolean c = c09.c((Calendar) r0.getValue(), (Calendar) r1.getValue());
        FieldPosition fieldPosition = this.d;
        if (c) {
            ((SimpleDateFormat) this.g.getValue()).format(date, stringBuffer, fieldPosition);
            return;
        }
        if (c09.f((Calendar) r0.getValue(), (Calendar) r1.getValue())) {
            ((SimpleDateFormat) this.h.getValue()).format(date, stringBuffer, fieldPosition);
        } else if (c09.d((Calendar) r0.getValue(), (Calendar) r1.getValue())) {
            ((SimpleDateFormat) this.i.getValue()).format(date, stringBuffer, fieldPosition);
        } else {
            ((SimpleDateFormat) this.j.getValue()).format(date, stringBuffer, fieldPosition);
        }
    }
}
