package defpackage;

import com.ybsdk.rconfig.configs.PollingStrategyConfig;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class pyd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PollingStrategyConfig.IntervalType.values().length];
        try {
            iArr[PollingStrategyConfig.IntervalType.BACKOFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PollingStrategyConfig.IntervalType.CONST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
