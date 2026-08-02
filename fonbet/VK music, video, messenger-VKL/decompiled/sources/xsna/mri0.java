package xsna;

import android.content.Context;
import android.icu.math.BigDecimal;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* compiled from: ServiceUtils.kt */
/* loaded from: classes18.dex */
public final class mri0 {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        decimalFormat.setGroupingUsed(true);
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setGroupingSeparator((char) 8201);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        a = decimalFormat;
    }

    public static final String a(int i) {
        return a.format(new BigDecimal(i).movePointLeft(2));
    }

    public static final String b(int i, Context context) {
        if (i == 0) {
            return "";
        }
        if (i <= 60) {
            return context.getString(R.string.booking_duration_sec, Integer.valueOf(i));
        }
        if (i <= 3600) {
            int i2 = i / 60;
            int i3 = ((i % 60) / 10) * 10;
            return i3 == 0 ? context.getString(R.string.booking_duration_mins, Integer.valueOf(i2)) : context.getString(R.string.booking_duration_mins_secs, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        int i4 = i / 3600;
        int i5 = (i / 60) % 60;
        return i5 == 0 ? context.getResources().getString(R.string.booking_duration_hours, Integer.valueOf(i4)) : context.getResources().getString(R.string.booking_duration_hours_mins, Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static final String c(Context context, ft7 ft7Var, String str) {
        int i = ft7Var.b;
        int i2 = ft7Var.a;
        return (i2 > 0 || i > 0) ? i2 <= 0 ? context.getString(R.string.booking_price_to, a(i), str) : i <= 0 ? context.getString(R.string.booking_price_from, a(i2), str) : i2 == i ? context.getString(R.string.booking_price_fixed, a(i2), str) : context.getString(R.string.booking_price_full, a(i2), a(i), str) : context.getString(R.string.booking_price_no_price);
    }
}
