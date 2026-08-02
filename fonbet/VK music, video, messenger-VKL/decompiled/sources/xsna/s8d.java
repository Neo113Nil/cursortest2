package xsna;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ClipParallelProcessor.kt */
/* loaded from: classes16.dex */
public final class s8d {
    public final AtomicBoolean a;
    public final long b;
    public final ExecutorService c;
    public final LinkedBlockingQueue<ivc> d = new LinkedBlockingQueue<>();
    public final AtomicInteger e;
    public final AtomicInteger f;

    public s8d(AtomicBoolean atomicBoolean, cmf cmfVar, int i) {
        this.a = atomicBoolean;
        this.c = cmfVar.e().a();
        AtomicInteger atomicInteger = new AtomicInteger(i);
        this.e = atomicInteger;
        this.f = new AtomicInteger(0);
        Context context = e43.a;
        ActivityManager activityManager = (ActivityManager) (context == null ? null : context).getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long j = 1000;
        long j2 = memoryInfo.totalMem / j;
        this.b = j2;
        lyd.a.d(Arrays.copyOf(new Object[]{"ClipParallelProcessor", "Total available device RAM = " + (j2 / j) + "mb, max parallel tasks number = " + atomicInteger.get()}, 2));
    }
}
