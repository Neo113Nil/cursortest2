package xsna;

import android.content.Context;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: ScheduledCallFormattedTimeFactory.kt */
/* loaded from: classes7.dex */
public final class d6h0 {
    public final Context a;
    public final SimpleDateFormat f;
    public final SimpleDateFormat g;
    public Calendar i;
    public final SimpleDateFormat b = new SimpleDateFormat("H:mm", Locale.getDefault());
    public final SimpleDateFormat c = new SimpleDateFormat("H:mm, d MMMM", Locale.getDefault());
    public final SimpleDateFormat d = new SimpleDateFormat("d MMMM", Locale.getDefault());
    public final SimpleDateFormat e = new SimpleDateFormat("d MMMM, yyyy", Locale.getDefault());
    public Calendar h = Calendar.getInstance();

    /* compiled from: ScheduledCallFormattedTimeFactory.kt */
    public static final class a {
        public final ScheduledCallRecurrence a;
        public final mvo0 b;
        public final long c;
        public final long d;

        public a(ScheduledCallRecurrence scheduledCallRecurrence, mvo0 mvo0Var, long j, long j2) {
            this.a = scheduledCallRecurrence;
            this.b = mvo0Var;
            this.c = j;
            this.d = j2;
        }
    }

    /* compiled from: ScheduledCallFormattedTimeFactory.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScheduledCallRecurrence.values().length];
            try {
                iArr[ScheduledCallRecurrence.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScheduledCallRecurrence.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScheduledCallRecurrence.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScheduledCallRecurrence.YEARLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScheduledCallRecurrence.WEEKDAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScheduledCallRecurrence.WEEKEND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d6h0(Context context) {
        this.a = context;
        this.f = new SimpleDateFormat(context.getString(R.string.voip_call_list_scheduled_recurrence_until_date_without_year), Locale.getDefault());
        this.g = new SimpleDateFormat(context.getString(R.string.voip_call_list_scheduled_recurrence_until_date_with_year), Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        this.i = calendar;
        calendar.add(5, 1);
    }

    public static Calendar a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar;
    }

    public final String b(a aVar, boolean z) {
        boolean z2;
        String str;
        ScheduledCallRecurrence scheduledCallRecurrence = aVar.a;
        long j = aVar.c;
        mvo0 mvo0Var = aVar.b;
        Calendar a2 = a(j);
        Calendar calendar = this.h;
        if (calendar == null) {
            calendar = null;
        }
        boolean c = c09.c(calendar, a2);
        Calendar calendar2 = this.i;
        if (calendar2 == null) {
            calendar2 = null;
        }
        boolean c2 = c09.c(calendar2, a2);
        if (c || c2) {
            Calendar a3 = a(j);
            Calendar calendar3 = this.h;
            if (calendar3 == null) {
                calendar3 = null;
            }
            boolean c3 = c09.c(calendar3, a3);
            z2 = scheduledCallRecurrence != ScheduledCallRecurrence.NEVER;
            String d = d(aVar);
            if (!z2 || c3) {
                str = d;
            } else {
                StringBuilder e = fw3.e(d);
                e.append(c(aVar, z));
                str = e.toString();
            }
        } else {
            str = d(aVar);
            boolean z3 = aVar.d > TimeUnit.DAYS.toMillis(1L);
            z2 = scheduledCallRecurrence == ScheduledCallRecurrence.DAILY;
            if (!z3 && !z2) {
                StringBuilder b2 = ho8.b(str, ", ");
                Calendar a4 = a(j);
                Calendar calendar4 = this.h;
                if (calendar4 == null) {
                    calendar4 = null;
                }
                b2.append((c09.d(a4, calendar4) || z) ? this.d.format(a4.getTime()) : this.e.format(a4.getTime()));
                str = b2.toString();
            }
            if (scheduledCallRecurrence != ScheduledCallRecurrence.NEVER) {
                StringBuilder e2 = fw3.e(str);
                e2.append(c(aVar, z));
                str = e2.toString();
            }
        }
        if (z || mvo0Var == null) {
            return str;
        }
        StringBuilder b3 = ho8.b(str, ", ");
        Calendar a5 = a(mvo0Var.a);
        Calendar calendar5 = this.h;
        b3.append((c09.d(a5, calendar5 != null ? calendar5 : null) ? this.f : this.g).format(a5.getTime()));
        return b3.toString();
    }

    public final String c(a aVar, boolean z) {
        String string;
        ScheduledCallRecurrence scheduledCallRecurrence = aVar.a;
        long j = aVar.c;
        int i = b.$EnumSwitchMapping$0[scheduledCallRecurrence.ordinal()];
        Context context = this.a;
        switch (i) {
            case 1:
                string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_day);
                break;
            case 2:
                string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_month);
                break;
            case 3:
                if (!z) {
                    switch (a(j).get(7)) {
                        case 2:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_monday);
                            break;
                        case 3:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_tuesday);
                            break;
                        case 4:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_wednesday);
                            break;
                        case 5:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_thursday);
                            break;
                        case 6:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_friday);
                            break;
                        case 7:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_saturday);
                            break;
                        default:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_sunday);
                            break;
                    }
                } else {
                    switch (a(j).get(7)) {
                        case 2:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_monday_short);
                            break;
                        case 3:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_tuesday_short);
                            break;
                        case 4:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_wednesday_short);
                            break;
                        case 5:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_thursday_short);
                            break;
                        case 6:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_friday_short);
                            break;
                        case 7:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_saturday_short);
                            break;
                        default:
                            string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_sunday_short);
                            break;
                    }
                }
            case 4:
                string = context.getString(R.string.voip_call_list_scheduled_recurrence_every_year);
                break;
            case 5:
                string = context.getString(R.string.voip_call_list_scheduled_recurrence_weekdays);
                break;
            case 6:
                string = context.getString(R.string.voip_call_list_scheduled_recurrence_weekend);
                break;
            default:
                string = "";
                break;
        }
        return go9.b(" · ", string);
    }

    public final String d(a aVar) {
        Calendar a2 = a(aVar.c);
        long timeInMillis = a2.getTimeInMillis();
        long j = aVar.d;
        Calendar a3 = a(timeInMillis + j);
        if (j > TimeUnit.DAYS.toMillis(1L)) {
            StringBuilder sb = new StringBuilder();
            Date time = a2.getTime();
            SimpleDateFormat simpleDateFormat = this.c;
            sb.append(simpleDateFormat.format(time));
            sb.append((char) 8211);
            sb.append(simpleDateFormat.format(a3.getTime()));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        Date time2 = a2.getTime();
        SimpleDateFormat simpleDateFormat2 = this.b;
        sb2.append(simpleDateFormat2.format(time2));
        sb2.append((char) 8211);
        sb2.append(simpleDateFormat2.format(a3.getTime()));
        return sb2.toString();
    }
}
