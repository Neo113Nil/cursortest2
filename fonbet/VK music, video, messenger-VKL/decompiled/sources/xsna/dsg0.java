package xsna;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import kotlin.Result;

/* compiled from: RuntimeUtils.kt */
/* loaded from: classes3.dex */
public final class dsg0 {
    public static final dsg0 a = new dsg0();

    public static String a() {
        return blk.F("top -H -n 1 -bq -oTIME -oCMD -p " + Process.myPid() + " -s 1");
    }

    public static String b() {
        return blk.F("top -H -n 1 -bq -o%CPU -oCMD -p " + Process.myPid() + " -s 1");
    }

    public static String c() {
        return blk.F("top -H -n 1 -bq -o%MEM -oCMD -p " + Process.myPid() + " -s 1");
    }

    public static Integer d() {
        String G = blk.G("cat /proc/" + Process.myPid() + "/oom_score");
        if (G != null) {
            return arm0.m(10, G);
        }
        return null;
    }

    public static Integer e() {
        String G = blk.G("cat /proc/" + Process.myPid() + "/oom_score_adj");
        if (G != null) {
            return arm0.m(10, G);
        }
        return null;
    }

    public static tgd0 f() {
        Object failure;
        Integer m;
        Integer m2;
        Integer m3;
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            int totalPss = memoryInfo.getTotalPss() / 1024;
            int i = memoryInfo.nativePss / 1024;
            int i2 = memoryInfo.dalvikPss / 1024;
            String memoryStat = memoryInfo.getMemoryStat("summary.total-swap");
            Integer valueOf = (memoryStat == null || (m3 = arm0.m(10, memoryStat)) == null) ? null : Integer.valueOf(m3.intValue() / 1024);
            Integer H = blk.H();
            String memoryStat2 = memoryInfo.getMemoryStat("summary.graphics");
            Integer valueOf2 = (memoryStat2 == null || (m2 = arm0.m(10, memoryStat2)) == null) ? null : Integer.valueOf(m2.intValue() / 1024);
            String memoryStat3 = memoryInfo.getMemoryStat("summary.stack");
            Integer m4 = memoryStat3 != null ? arm0.m(10, memoryStat3) : null;
            String memoryStat4 = memoryInfo.getMemoryStat("summary.native-heap");
            Integer valueOf3 = (memoryStat4 == null || (m = arm0.m(10, memoryStat4)) == null) ? null : Integer.valueOf(m.intValue() / 1024);
            String runtimeStat = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            Integer m5 = runtimeStat != null ? arm0.m(10, runtimeStat) : null;
            String runtimeStat2 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
            failure = new tgd0(totalPss, i, i2, valueOf, H, valueOf2, m4, valueOf3, m5, runtimeStat2 != null ? arm0.m(10, runtimeStat2) : null);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (tgd0) (failure instanceof Result.Failure ? null : failure);
    }

    public static int g() {
        return (int) ((SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()) / 60000);
    }

    public static xqn0 h(Activity activity) {
        Object failure;
        try {
            ActivityManager activityManager = (ActivityManager) activity.getSystemService(ActivityManager.class);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = 1024;
            failure = new xqn0((int) ((memoryInfo.availMem / j) / j), (int) ((memoryInfo.threshold / j) / j), memoryInfo.lowMemory);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (xqn0) failure;
    }
}
