package sg.bigo.ads.y;

import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.chromium.base.TimeUtils;

/* loaded from: classes9.dex */
public final class e {
    public static int a(@NonNull String str, int i) {
        if (i <= 0) {
            return 0;
        }
        return Math.abs((str + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis() / TimeUtils.MILLISECONDS_PER_DAY))).hashCode()) % i;
    }

    public static String b(@NonNull String str) {
        return (a(str, 901) + 100) + "K";
    }

    public static String c(@NonNull String str) {
        return "4." + (a(str, 7) + 3);
    }

    public static String a(@NonNull String str) {
        return (a(str, 100) + 1) + "M+";
    }
}
