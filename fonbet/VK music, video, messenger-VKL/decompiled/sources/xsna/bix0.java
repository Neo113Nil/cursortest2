package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.vkontakte.android.R;
import java.util.Calendar;

/* compiled from: WebTimeUtils.kt */
@ozl
/* loaded from: classes6.dex */
public final class bix0 {
    public static final /* synthetic */ int a = 0;

    /* compiled from: WebTimeUtils.kt */
    public static final class a extends ThreadLocal<Calendar> {
        @Override // java.lang.ThreadLocal
        public final Calendar initialValue() {
            return Calendar.getInstance();
        }
    }

    static {
        new a();
    }

    public static String a(int i, Context context) {
        Calendar calendar = Calendar.getInstance();
        calendar.get(1);
        long j = i * 1000;
        Resources resources = context.getResources();
        calendar.setTimeInMillis(j);
        calendar.get(1);
        return resources.getString(R.string.date_format_day_month_year, Integer.valueOf(calendar.get(5)), resources.getStringArray(R.array.vk_months_full)[Math.min(calendar.get(2), 11)], Integer.valueOf(calendar.get(1)));
    }
}
