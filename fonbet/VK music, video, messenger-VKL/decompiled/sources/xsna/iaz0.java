package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class iaz0 implements wlv {
    public static final iaz0 c = new iaz0(1000);
    public static final iaz0 d = new iaz0(1002);
    public static final iaz0 e = new iaz0(1003);
    public static final iaz0 f = new iaz0(1403);
    public static final iaz0 g = new iaz0(1404);
    public static final iaz0 h = new iaz0(1500);
    public static final iaz0 i = new iaz0(2000);
    public static final iaz0 j = new iaz0(2001);
    public static final iaz0 k = new iaz0(2002);
    public static final iaz0 l = new iaz0(2003);
    public static final iaz0 m = new iaz0(2004);
    public static final iaz0 n = new iaz0(2005);
    public static final iaz0 o = new iaz0(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
    public static final iaz0 p = new iaz0(3001);
    public static final iaz0 q = new iaz0(3002);
    public static final iaz0 r = new iaz0(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE);
    public static final iaz0 s = new iaz0(3004);
    public static final iaz0 t = new iaz0(4001);
    public static final iaz0 u = new iaz0(4002);
    public static final iaz0 v = new iaz0(5000);
    public static final iaz0 w = new iaz0(RtpSenderHelper.AUDIO_BITRATE_MIN);
    public final int a;
    public final String b;

    public iaz0(int i2) {
        String str;
        this.a = i2;
        if (i2 == 1403) {
            str = "request forbidden error";
        } else if (i2 == 1404) {
            str = "request not found error";
        } else if (i2 == 1500) {
            str = "internal server error";
        } else if (i2 == 6000) {
            str = "internal error";
        } else if (i2 == 4001) {
            str = "reloading not allowed error";
        } else if (i2 == 4002) {
            str = "ad is not loaded yet";
        } else if (i2 == 5000) {
            str = "undefined mediation error";
        } else if (i2 != 5001) {
            switch (i2) {
                case 1000:
                    str = "undefined network error";
                    break;
                case 1001:
                    str = "invalid url error";
                    break;
                case 1002:
                    str = "hasn't network connection error";
                    break;
                case 1003:
                    str = "request timeout error";
                    break;
                default:
                    switch (i2) {
                        case 2000:
                            str = "undefined parse error";
                            break;
                        case 2001:
                            str = "empty response error";
                            break;
                        case 2002:
                            str = "invalid json error";
                            break;
                        case 2003:
                            str = "invalid xml error";
                            break;
                        case 2004:
                            str = "invalid ad type error";
                            break;
                        case 2005:
                            str = "required field missed";
                            break;
                        default:
                            switch (i2) {
                                case IronSourceError.ERROR_CAPPING_VALIDATION_FAILED /* 3000 */:
                                    str = "undefined data error";
                                    break;
                                case 3001:
                                    str = "hasn't images error";
                                    break;
                                case 3002:
                                    str = "hasn't html source error";
                                    break;
                                case BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE:
                                    str = "hasn't banners error";
                                    break;
                                case 3004:
                                    str = "invalid banner type error";
                                    break;
                                default:
                                    str = "undefined error";
                                    break;
                            }
                    }
            }
        } else {
            str = "ad not loaded from mediation network";
        }
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdLoadingError{code=");
        sb.append(this.a);
        sb.append(", message='");
        return i5s.a(sb, this.b, "'}");
    }

    public iaz0(String str) {
        this.a = 1000;
        this.b = str;
    }
}
