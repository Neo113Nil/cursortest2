package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: FileSizeFormatter.kt */
/* loaded from: classes14.dex */
public final class kar {
    public final Context a;

    /* compiled from: FileSizeFormatter.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    public kar(Context context) {
        this.a = context;
    }

    public final a a(long j) {
        double d = j;
        Context context = this.a;
        if (d >= 1.0E9d) {
            double d2 = 10;
            double floor = Math.floor((d / 1.0E9d) * d2) / d2;
            return new a(String.format(Locale.FRANCE, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floor)}, 1)) + ' ' + context.getString(R.string.fsize_gb));
        }
        if (d >= 1000000.0d) {
            double d3 = 10;
            double floor2 = Math.floor((d / 1000000.0d) * d3) / d3;
            return new a(String.format(Locale.FRANCE, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floor2)}, 1)) + ' ' + context.getString(R.string.fsize_mb));
        }
        if (d < 1000.0d) {
            return new a("0 ".concat(context.getString(R.string.fsize_kb)));
        }
        return new a(an10.a(d / 1000.0d) + ' ' + context.getString(R.string.fsize_kb));
    }
}
