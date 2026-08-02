package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;

/* compiled from: SizableImage.kt */
/* loaded from: classes18.dex */
public interface fxj0 {

    /* compiled from: SizableImage.kt */
    public static final class a {
        public static String a(int i, String str) {
            return str + (drm0.E(str, '?') ? (drm0.G(str, '?') || drm0.G(str, '&')) ? "" : "&" : "?") + "cs=" + i + "x0";
        }
    }

    static String K7(int i, String str) {
        return str + (drm0.E(str, '?') ? (drm0.G(str, '?') || drm0.G(str, '&')) ? "" : "&" : "?") + "cs=" + i + "x0";
    }

    default float D1() {
        return getHeight() != 0 ? getWidth() / getHeight() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    default int H8(int i) {
        if (D1() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return (int) (i / D1());
    }

    default String X7(int i) {
        if (!c7()) {
            L.i(new IllegalArgumentException("Trying to format an url from non-base url image {url=" + getUrl() + " width=" + getWidth() + " height=" + getHeight() + "} to width=" + i));
        }
        String url = getUrl();
        return url + (drm0.E(url, '?') ? (drm0.G(url, '?') || drm0.G(url, '&')) ? "" : "&" : "?") + "cs=" + i + "x0";
    }

    boolean c7();

    int e6();

    int getHeight();

    String getUrl();

    int getWidth();

    fxj0 kb(int i, int i2, String str);

    default int z8(int i) {
        return (int) (D1() * i);
    }
}
