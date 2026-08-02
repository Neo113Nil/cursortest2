package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PinnedMsgTimeFormatter.kt */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes2.dex */
public final class roa0 {
    public final Object a;
    public final Object b;
    public final Date c;
    public final FieldPosition d;
    public final StringBuffer e;
    public final DateFormatSymbols f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;

    public roa0(Context context) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, new zq3(28));
        this.b = msy.a(lazyThreadSafetyMode, new f84(17));
        this.c = new Date(0L);
        this.d = new FieldPosition(0);
        this.e = new StringBuffer();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setShortMonths(context.getResources().getStringArray(R.array.months_short));
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_full_dep));
        this.f = dateFormatSymbols;
        this.g = new bpn0(new qk(15, context, this));
        this.h = new bpn0(new oe5(15, context, this));
        this.i = new bpn0(new sk(21, context, this));
        this.j = new bpn0(new tx(19, context, this));
    }
}
