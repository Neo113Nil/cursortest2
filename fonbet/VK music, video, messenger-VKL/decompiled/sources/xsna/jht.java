package xsna;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: GaugeMetadataManager.java */
/* loaded from: classes13.dex */
public final class jht {
    public final Runtime a = Runtime.getRuntime();
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;

    static {
        ra2.d();
    }

    public jht(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
