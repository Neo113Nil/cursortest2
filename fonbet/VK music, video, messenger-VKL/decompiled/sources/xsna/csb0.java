package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollContentColor;
import com.vk.log.L;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PollUtils.kt */
/* loaded from: classes18.dex */
public final class csb0 {
    public static final bpn0 a = new bpn0(new bv0(29));
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    public static final long c = TimeUnit.HOURS.toMillis(1);
    public static final long d = TimeUnit.DAYS.toMillis(1);

    public static String a(int i, UserId userId, boolean z) {
        StringBuilder sb;
        String str;
        String str2;
        if (z) {
            sb = new StringBuilder("https://");
            str = a0a.d;
            str2 = "/board_poll%d_%d";
        } else {
            sb = new StringBuilder("https://");
            str = a0a.d;
            str2 = "/poll%d_%d";
        }
        return String.format(Locale.ENGLISH, i5s.a(sb, str, str2), Arrays.copyOf(new Object[]{Long.valueOf(userId.b), Integer.valueOf(i)}, 2));
    }

    public static Calendar b() {
        return (Calendar) a.getValue();
    }

    public static String c(int i, boolean z, boolean z2) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Resources resources = context.getResources();
        Calendar b2 = b();
        xuo0.a.getClass();
        b2.setTimeInMillis(xuo0.a());
        long j = i * 1000;
        int i2 = b().get(1);
        long timeInMillis = b().getTimeInMillis();
        b().set(12, 0);
        b().set(11, 0);
        b().set(13, 0);
        b().set(14, 0);
        long timeInMillis2 = b().getTimeInMillis();
        long j2 = d;
        long j3 = timeInMillis2 + j2;
        long j4 = j - timeInMillis;
        if (j4 <= 0) {
            L.l("Can't formatting past time");
            return resources.getString(R.string.poll_expired);
        }
        b().setTimeInMillis(j);
        long j5 = b;
        if (j4 < j5) {
            return resources.getString(z ? R.string.poll_less_then_a_minute_short : R.string.poll_less_then_a_minute);
        }
        long j6 = c;
        if (j4 < j6) {
            int i3 = (int) ((j4 % j6) / j5);
            return resources.getQuantityString(z ? R.plurals.minutes_end_date_short : R.plurals.minutes_end_date, i3, Integer.valueOf(i3));
        }
        if (j4 < 5 * j6) {
            int i4 = (int) ((j4 % j2) / j6);
            return resources.getQuantityString(z ? R.plurals.hours_end_date_short : R.plurals.hours_end_date, i4, Integer.valueOf(i4));
        }
        long j7 = timeInMillis2 + 1;
        if (j <= j3 - 1 && j7 <= j) {
            return resources.getString(z ? R.string.today_end_date_short : R.string.today_end_date, Integer.valueOf(b().get(11)), Integer.valueOf(b().get(12)));
        }
        if (b().get(1) == i2) {
            return resources.getString(R.string.current_year_end_date, Integer.valueOf(b().get(5)), z2 ? resources.getStringArray(R.array.poll_months_short)[Math.min(b().get(2), 11)].toLowerCase(Locale.ROOT) : resources.getStringArray(R.array.poll_months_lower)[Math.min(b().get(2), 11)], Integer.valueOf(b().get(11)), Integer.valueOf(b().get(12)));
        }
        if (b().get(1) > i2) {
            return resources.getString(R.string.year_end_date, Integer.valueOf(b().get(5)), z2 ? resources.getStringArray(R.array.poll_months_short)[Math.min(b().get(2), 11)].toLowerCase(Locale.ROOT) : resources.getStringArray(R.array.poll_months_lower)[Math.min(b().get(2), 11)], Integer.valueOf(b().get(1)), Integer.valueOf(b().get(11)), Integer.valueOf(b().get(12)));
        }
        return "";
    }

    public static void d(VkImage vkImage, PollContentColor pollContentColor, v2l0 v2l0Var, int i) {
        int i2;
        if (v2l0Var != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            i2 = v2l0Var.b(context, pollContentColor.d, StickerColorToken.POLL_BACKGROUND);
        } else {
            i2 = -1;
        }
        gnb0 gnb0Var = new gnb0();
        gnb0Var.setColor(ColorStateList.valueOf(i2));
        gnb0Var.setCornerRadius(i);
        vkImage.setImageDrawable(gnb0Var);
    }
}
