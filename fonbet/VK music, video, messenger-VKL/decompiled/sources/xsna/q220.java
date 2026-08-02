package xsna;

import android.os.Debug;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q220 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        try {
            Runtime runtime = Runtime.getRuntime();
            j = runtime.totalMemory() - runtime.freeMemory();
        } catch (Throwable unused) {
            j = 0;
        }
        int i = (int) ((j / 1024.0f) / 1024.0f);
        int nativeHeapAllocatedSize = (int) ((Debug.getNativeHeapAllocatedSize() / 1024.0f) / 1024.0f);
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{tgw.b(i, "application allocation ", " mb")});
        }
        dx90 dx90Var = ow90.e;
        long j2 = i;
        dx90Var.y(j2);
        Preference.F((long) (dx90Var.x.addAndGet(j2) / dx90Var.y.incrementAndGet()), "performance", "__app_performance_ram_memory_average__");
        c63 c63Var = c63.a;
        if (c63.f) {
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{tgw.b(i, "foreground application allocation ", " mb")});
            }
            dx90Var.y(j2);
            Preference.F((long) (dx90Var.z.addAndGet(j2) / dx90Var.A.incrementAndGet()), "performance", "__app_performance_ram_memory_average_foreground__");
            if (L.m(loggerOutputTarget)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{tgw.b(nativeHeapAllocatedSize, "foreground native allocation ", " mb")});
            return;
        }
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{tgw.b(i, "background application allocation ", " mb")});
        }
        dx90Var.y(j2);
        Preference.F((long) (dx90Var.B.addAndGet(j2) / dx90Var.C.incrementAndGet()), "performance", "__app_performance_ram_memory_average_background__");
        if (L.m(loggerOutputTarget)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{tgw.b(nativeHeapAllocatedSize, "background native allocation ", " mb")});
    }
}
