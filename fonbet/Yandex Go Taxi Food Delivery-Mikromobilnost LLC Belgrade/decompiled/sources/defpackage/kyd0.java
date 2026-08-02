package defpackage;

import com.ybsdk.core.utils.poller.PollerAnalyticsReporter$PollerResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class kyd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PollerAnalyticsReporter$PollerResult.values().length];
        try {
            iArr[PollerAnalyticsReporter$PollerResult.FINISHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PollerAnalyticsReporter$PollerResult.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PollerAnalyticsReporter$PollerResult.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
