package defpackage;

import com.yandex.mobile.ads.common.analytics.model.AdAnalyticsStartupError;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class ln71 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdAnalyticsStartupError.values().length];
        try {
            iArr[AdAnalyticsStartupError.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdAnalyticsStartupError.NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdAnalyticsStartupError.INVALID_RESPONSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
