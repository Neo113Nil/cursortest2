package defpackage;

import android.webkit.WebSettings;
import com.adjust.sdk.Constants;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import org.webrtc.MediaStreamTrack;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes15.dex */
public abstract class gp41 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static final String a(ye0 ye0Var) {
        if (ye0Var instanceof lh21) {
            return oyr.p("default ", ((lh21) ye0Var).p() ? "big" : Constants.SMALL, " image");
        }
        if (ye0Var instanceof qh21) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        if (ye0Var instanceof jh21) {
            return ChatNamespaces.b(((jh21) ye0Var).b) ? "channel" : "chat";
        }
        if (ye0Var instanceof oh21) {
            return "user";
        }
        if ((ye0Var instanceof kh21) || (ye0Var instanceof ph21)) {
            return io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE;
        }
        return "unknown " + ye0Var;
    }

    public static int b(float f) {
        if (f < 1.0f) {
            return ModalContentViewContainer.BASE_SHADOW_COLOR;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return lhc.a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float c(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final lum d() {
        return new lum(new g990(0), h990.a, new mtw(26), i990.a);
    }

    public static final void g(WebSettings webSettings, ThemeType themeType) {
        boolean z = themeType == ThemeType.DARK;
        if (hm91.d("ALGORITHMIC_DARKENING")) {
            vj41.b(webSettings, z);
        }
    }

    public static float h() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public abstract void e();

    public abstract void f();
}
