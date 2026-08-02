package xsna;

import android.content.Context;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vkontakte.android.R;
import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipScheduledCallRecurrenceTitleFactory.kt */
/* loaded from: classes7.dex */
public final class vxw0 {
    public final Context a;

    /* compiled from: VoipScheduledCallRecurrenceTitleFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScheduledCallRecurrence.values().length];
            try {
                iArr[ScheduledCallRecurrence.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScheduledCallRecurrence.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScheduledCallRecurrence.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScheduledCallRecurrence.WEEKDAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScheduledCallRecurrence.WEEKEND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScheduledCallRecurrence.MONTHLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ScheduledCallRecurrence.YEARLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vxw0(Context context) {
        this.a = context;
    }

    public final String a(ScheduledCallRecurrence scheduledCallRecurrence, Calendar calendar) {
        int i = a.$EnumSwitchMapping$0[scheduledCallRecurrence.ordinal()];
        Context context = this.a;
        switch (i) {
            case 1:
                return context.getString(R.string.voip_schedule_call_repeat_never);
            case 2:
                return context.getString(R.string.voip_schedule_call_repeat_day);
            case 3:
                switch (calendar.get(7)) {
                    case 2:
                        return context.getString(R.string.voip_call_list_scheduled_recurrence_chooser_every_monday);
                    case 3:
                        return context.getString(R.string.voip_call_list_scheduled_recurrence_chooser_every_tuesday);
                    case 4:
                        return context.getString(R.string.voip_call_list_scheduled_recurrence_chooser_every_wednesday);
                    case 5:
                        return context.getString(R.string.voip_call_list_scheduled_recurrence_chooser_every_thursday);
                    case 6:
                        return context.getString(R.string.voip_call_list_scheduled_recurrence_chooser_every_friday);
                    case 7:
                        return context.getString(R.string.voip_call_list_scheduled_recurrence_chooser_every_saturday);
                    default:
                        return context.getString(R.string.voip_call_list_scheduled_recurrence_chooser_every_sunday);
                }
            case 4:
                return context.getString(R.string.voip_schedule_call_repeat_weekdays);
            case 5:
                return context.getString(R.string.voip_schedule_call_repeat_weekend);
            case 6:
                return context.getString(R.string.voip_call_list_scheduled_recurrence_chooser_every_month_on_day, Integer.valueOf(calendar.get(5)));
            case 7:
                return context.getString(R.string.voip_schedule_call_repeat_year);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
