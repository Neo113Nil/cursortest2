package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: MaleStrategy.kt */
/* loaded from: classes17.dex */
public final class og00 implements iom0 {
    public final Context a;
    public final Date b;
    public final String c;
    public final String[] d;
    public final SimpleDateFormat e;
    public final SimpleDateFormat f;
    public final SimpleDateFormat g;
    public final SimpleDateFormat h;

    public og00(Context context, hp80 hp80Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Date();
        this.c = context.getString(R.string.last_seen_male_seconds_ago);
        this.d = context.getResources().getStringArray(R.array.last_seen_male_hours_ago);
        Locale locale = Locale.getDefault();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setShortMonths(context.getResources().getStringArray(R.array.months_short));
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_full_dep));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(context.getString(R.string.last_seen_male_today), locale);
        this.e = simpleDateFormat;
        simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(context.getString(R.string.last_seen_male_yesterday), locale);
        this.f = simpleDateFormat2;
        simpleDateFormat2.setDateFormatSymbols(dateFormatSymbols);
        boolean z = hp80Var.a;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(applicationContext.getString(z ? R.string.last_seen_male_this_year_full_month : R.string.last_seen_male_this_year), locale);
        this.g = simpleDateFormat3;
        simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols);
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(applicationContext.getString(z ? R.string.last_seen_male_etc_full_month : R.string.last_seen_male_etc), locale);
        this.h = simpleDateFormat4;
        simpleDateFormat4.setDateFormatSymbols(dateFormatSymbols);
    }

    @Override // xsna.iom0
    public final void a(long j, StringBuilder sb) {
        Date date = this.b;
        date.setTime(j);
        sb.append(this.f.format(date));
    }

    @Override // xsna.iom0
    public final void b(int i, StringBuilder sb) {
        sb.append(this.a.getResources().getQuantityString(R.plurals.last_seen_male_minutes_ago, i, Integer.valueOf(i)));
    }

    @Override // xsna.iom0
    public final void c(long j, StringBuilder sb) {
        Date date = this.b;
        date.setTime(j);
        sb.append(this.e.format(date));
    }

    @Override // xsna.iom0
    public final void d(long j, StringBuilder sb) {
        Date date = this.b;
        date.setTime(j);
        sb.append(this.g.format(date));
    }

    @Override // xsna.iom0
    public final void e(long j, StringBuilder sb) {
        Date date = this.b;
        date.setTime(j);
        sb.append(this.h.format(date));
    }

    @Override // xsna.iom0
    public final void f(StringBuilder sb) {
        sb.append(this.c);
    }

    @Override // xsna.iom0
    public final void g(int i, StringBuilder sb) {
        sb.append(this.d[i - 1]);
    }
}
