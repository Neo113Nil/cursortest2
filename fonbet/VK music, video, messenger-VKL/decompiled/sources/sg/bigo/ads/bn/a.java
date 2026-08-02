package sg.bigo.ads.bn;

import android.util.Log;
import com.ironsource.X3;
import sg.bigo.ads.common.utils.u;
import xsna.y57;

/* loaded from: classes9.dex */
public final class a {
    public static void a(int i, int i2, String str, String str2) {
        if (a(i)) {
            if (i == 0) {
                str2 = y57.a(X3.j.d, str, "] ", str2);
            }
            Log.println(i2, "BigoAds", str2);
        }
    }

    public static void a(int i, String str, String str2) {
        a(i, 6, str, str2);
    }

    public static void a(String str, String str2) {
        a(0, 5, str, str2);
    }

    private static boolean a(int i) {
        u.a();
        return u.b() ? i == 2 || i == 1 : i == 2;
    }
}
