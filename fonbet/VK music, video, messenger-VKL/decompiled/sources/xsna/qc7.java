package xsna;

import com.facebook.common.memory.MemoryTrimType;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.n220;

/* compiled from: BitmapMemoryCacheTrimStrategy.kt */
/* loaded from: classes.dex */
public final class qc7 implements n220.a {

    /* compiled from: BitmapMemoryCacheTrimStrategy.kt */
    /* loaded from: classes12.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MemoryTrimType.values().length];
            try {
                iArr[MemoryTrimType.OnCloseToDalvikHeapLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MemoryTrimType.OnAppBackgrounded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MemoryTrimType.OnSystemMemoryCriticallyLowWhileAppInForeground.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MemoryTrimType.OnSystemLowMemoryWhileAppInBackgroundLowSeverity.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.n220.a
    public final double a(MemoryTrimType memoryTrimType) {
        int i = a.$EnumSwitchMapping$0[memoryTrimType.ordinal()];
        if (i == 1) {
            return MemoryTrimType.OnCloseToDalvikHeapLimit.h();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return 1.0d;
        }
        ahq.m("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", memoryTrimType);
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }
}
