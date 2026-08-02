package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: ScheduledCallDateIntervalFactory.kt */
/* loaded from: classes7.dex */
public final class z5h0 implements sxk {
    public static final SimpleDateFormat d = new SimpleDateFormat("d MMMM", Locale.getDefault());
    public static final SimpleDateFormat e = new SimpleDateFormat("MMMM", Locale.getDefault());
    public static final SimpleDateFormat f = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
    public final Context a;
    public Calendar b;
    public Calendar c;

    public z5h0(Context context) {
        this.a = context;
    }

    @Override // xsna.sxk
    public final String a(Calendar calendar) {
        Calendar calendar2 = this.b;
        if (calendar2 == null) {
            calendar2 = null;
        }
        return c09.d(calendar2, calendar) ? e.format(calendar.getTime()) : f.format(calendar.getTime());
    }

    @Override // xsna.sxk
    public final String b() {
        Calendar calendar = this.b;
        if (calendar == null) {
            calendar = null;
        }
        return this.a.getString(R.string.voip_call_list_scheduled_date_interval_today, d.format(calendar.getTime()));
    }

    @Override // xsna.sxk
    public final String c() {
        Calendar calendar = this.c;
        if (calendar == null) {
            calendar = null;
        }
        return this.a.getString(R.string.voip_call_list_scheduled_date_interval_tomorrow, d.format(calendar.getTime()));
    }

    @Override // xsna.sxk
    public final String d() {
        return this.a.getString(R.string.voip_call_list_scheduled_date_interval_this_month);
    }

    @Override // xsna.sxk
    public final String e(boolean z) {
        Context context = this.a;
        return z ? context.getString(R.string.voip_call_list_scheduled_date_interval_this_week_after_today_and_tomorrow) : context.getString(R.string.voip_call_list_scheduled_date_interval_this_week);
    }

    @Override // xsna.sxk
    public final void prepare() {
        this.b = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        this.c = calendar;
        calendar.add(5, 1);
    }
}
