package xsna;

import com.facebook.common.memory.MemoryTrimType;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.n220;

/* compiled from: NativeMemoryCacheTrimStrategy.java */
/* loaded from: classes.dex */
public final class bw50 implements n220.a {

    /* compiled from: NativeMemoryCacheTrimStrategy.java */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MemoryTrimType.values().length];
            a = iArr;
            try {
                iArr[MemoryTrimType.OnCloseToDalvikHeapLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MemoryTrimType.OnAppBackgrounded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MemoryTrimType.OnSystemMemoryCriticallyLowWhileAppInForeground.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MemoryTrimType.OnSystemLowMemoryWhileAppInBackgroundLowSeverity.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // xsna.n220.a
    public final double a(MemoryTrimType memoryTrimType) {
        int i = a.a[memoryTrimType.ordinal()];
        if (i == 1) {
            return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return 1.0d;
        }
        ahq.m("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", memoryTrimType);
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }
}
