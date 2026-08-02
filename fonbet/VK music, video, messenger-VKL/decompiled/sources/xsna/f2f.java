package xsna;

import com.vk.clips.sdk.shared.api.utils.performance.StartScreenType;
import com.vk.metrics.logging.PerfLogger;

/* compiled from: ClipsSbsEventsReporterDelegate.kt */
/* loaded from: classes17.dex */
public final class f2f {
    public final PerfLogger a = new PerfLogger();
    public boolean b;

    /* compiled from: ClipsSbsEventsReporterDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StartScreenType.values().length];
            try {
                iArr[StartScreenType.StartedTabCache.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StartScreenType.StartedTabNetwork.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StartScreenType.StartedWithArguments.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
