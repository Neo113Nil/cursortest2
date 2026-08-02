package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MsgMediaViewerDateFormatter.kt */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes2.dex */
public final class dn30 {
    public final Object a;
    public final Object b;
    public final Date c;
    public final StringBuilder d;
    public final DateFormatSymbols e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public dn30(Context context) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, new dv2(24));
        this.b = msy.a(lazyThreadSafetyMode, new jg0(29));
        this.c = new Date(0L);
        this.d = new StringBuilder();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setShortMonths(context.getResources().getStringArray(R.array.months_short));
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_full_dep));
        this.e = dateFormatSymbols;
        int i = 14;
        this.f = msy.a(lazyThreadSafetyMode, new u14(i, context, this));
        this.g = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.e(i, context, this));
        this.h = msy.a(lazyThreadSafetyMode, new j3(19, context, this));
        this.i = msy.a(lazyThreadSafetyMode, new xk(20, context, this));
    }
}
