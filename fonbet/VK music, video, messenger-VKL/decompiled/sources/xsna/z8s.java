package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.vkontakte.android.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: FormatUtils.kt */
/* loaded from: classes7.dex */
public final class z8s {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        a = decimalFormat;
    }

    public static final String a(int i) {
        if (i < 0) {
            i = 0;
        }
        return i < 3600 ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2)) : String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i / 60) % 60), Integer.valueOf(i % 60)}, 3));
    }

    public static String b(Resources resources, long j, int i, int i2) {
        float f = j;
        if (f < 1000.0f) {
            int i3 = (int) j;
            return resources.getQuantityString(i, i3, Integer.valueOf(i3));
        }
        DecimalFormat decimalFormat = a;
        return resources.getString(i2, f < 100000.0f ? resources.getString(R.string.video_number_thousands_format, decimalFormat.format(Float.valueOf(f / 1000.0f))) : f < 1000000.0f ? resources.getString(R.string.video_number_large_thousands_format, Long.valueOf(j / 1000)) : f < 1.0E9f ? resources.getString(R.string.video_number_millions_format, decimalFormat.format(Float.valueOf(f / 1000000.0f))) : resources.getString(R.string.video_number_billions_format, decimalFormat.format(Float.valueOf(f / 1.0E9f))));
    }

    public static String c(Context context, long j, x8s x8sVar, boolean z) {
        String f;
        StringBuffer stringBuffer = new StringBuffer();
        long a2 = qni0.a() - j;
        long j2 = 1;
        if (a2 < TimeUnit.MINUTES.toMillis(j2)) {
            f = "";
        } else {
            TimeUnit timeUnit = TimeUnit.HOURS;
            if (a2 < timeUnit.toMillis(j2)) {
                f = enj.f(x8sVar.a, (int) TimeUnit.MILLISECONDS.toMinutes(a2), context);
            } else if (a2 < timeUnit.toMillis(24)) {
                f = enj.f(x8sVar.b, (int) TimeUnit.MILLISECONDS.toHours(a2), context);
            } else {
                TimeUnit timeUnit2 = TimeUnit.DAYS;
                long j3 = 7;
                if (a2 < timeUnit2.toMillis(j3)) {
                    f = enj.f(x8sVar.c, (int) TimeUnit.MILLISECONDS.toDays(a2), context);
                } else {
                    long j4 = 31;
                    f = a2 < timeUnit2.toMillis(j4) ? enj.f(x8sVar.d, (int) (TimeUnit.MILLISECONDS.toDays(a2) / j3), context) : a2 < timeUnit2.toMillis(((long) 12) * 31) ? enj.f(x8sVar.e, (int) (TimeUnit.MILLISECONDS.toDays(a2) / j4), context) : enj.f(x8sVar.f, (int) (TimeUnit.MILLISECONDS.toDays(a2) / 365), context);
                }
            }
        }
        stringBuffer.append(f);
        if (drm0.N(stringBuffer)) {
            return context.getString(z ? R.string.video_item_lower_than_minute_ago : R.string.video_item_lower_than_minute_ago_without_back);
        }
        return z ? context.getString(R.string.video_item_date_ago, stringBuffer.toString()) : stringBuffer.toString();
    }

    public static String e(int i, Context context) {
        return i < 0 ? "" : b(context.getResources(), i, R.plurals.video_views, R.string.video_views_count_formatted);
    }
}
