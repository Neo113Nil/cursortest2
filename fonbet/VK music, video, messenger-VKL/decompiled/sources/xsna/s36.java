package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BannerView.kt */
/* loaded from: classes6.dex */
public interface s36 extends jel0 {

    /* compiled from: BannerView.kt */
    public static final class a {
        public static void a(s36 s36Var, Context context, float f) {
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == 1.0f) {
                return;
            }
            s36Var.b(context, f);
        }

        public static String b(String str, String str2) {
            return (str2 == null || str2.length() == 0) ? str : fo8.a(str, str2);
        }
    }

    s36 a(String str);

    void b(Context context, float f);

    String c(String str, String str2);

    s36 d(String str);

    s36 e(String str);

    s36 g(String str);

    s36 h(Context context, float f);

    s36 i(String str);

    s36 j(String str);

    s36 k(String str);

    s36 l(String str);

    s36 m(String str);
}
