package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;

/* compiled from: CalendarStyle.java */
/* loaded from: classes13.dex */
public final class a09 {

    @NonNull
    public final tz8 a;

    @NonNull
    public final tz8 b;

    @NonNull
    public final tz8 c;

    @NonNull
    public final tz8 d;

    @NonNull
    public final tz8 e;

    @NonNull
    public final tz8 f;

    @NonNull
    public final tz8 g;

    @NonNull
    public final Paint h;

    public a09(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(jl10.c(context, R$attr.materialCalendarStyle, com.google.android.material.datepicker.c.class.getCanonicalName()).data, R$styleable.MaterialCalendar);
        this.a = tz8.a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayStyle, 0), context);
        this.g = tz8.a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayInvalidStyle, 0), context);
        this.b = tz8.a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_daySelectedStyle, 0), context);
        this.c = tz8.a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayTodayStyle, 0), context);
        ColorStateList a = qm10.a(context, obtainStyledAttributes, R$styleable.MaterialCalendar_rangeFillColor);
        this.d = tz8.a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearStyle, 0), context);
        this.e = tz8.a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearSelectedStyle, 0), context);
        this.f = tz8.a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearTodayStyle, 0), context);
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
