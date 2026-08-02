package ru.mail.verify.core.utils;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* loaded from: classes9.dex */
public class VerificationService extends IntentService {
    private static final ConcurrentHashMap<Object, Boolean> b = new ConcurrentHashMap<>();
    private static volatile long c = 0;

    @Nullable
    private static PowerManager.WakeLock d;
    private final long a;

    public VerificationService() {
        super("VerificationService");
        setIntentRedelivery(true);
        this.a = System.nanoTime();
    }

    public static void a(@NonNull Context context, @NonNull Object obj, boolean z) {
        PowerManager powerManager;
        if (b.putIfAbsent(obj, Boolean.valueOf(z)) == null) {
            FileLog.v("VerificationService", "acquire " + obj);
            if (z) {
                synchronized (VerificationService.class) {
                    try {
                        PowerManager.WakeLock wakeLock = d;
                        if (wakeLock != null && wakeLock.isHeld()) {
                            FileLog.d("VerificationService", "wake lock has been already acquired");
                        }
                        powerManager = (PowerManager) context.getSystemService("power");
                    } finally {
                    }
                    if (powerManager != null) {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ru.mail.verify.core.utils:VerificationService");
                        d = newWakeLock;
                        newWakeLock.acquire(60000L);
                        d.setReferenceCounted(false);
                        c = System.nanoTime();
                        FileLog.d("VerificationService", "wake lock acquired (timestamp: %d)", Long.valueOf(c));
                    }
                }
            }
            try {
                context.startService(new Intent(context, (Class<?>) VerificationService.class));
            } catch (Throwable th) {
                FileLog.e("VerificationService", "failed to start verification service", th);
            }
        }
    }

    public static void b() {
        ConcurrentHashMap<Object, Boolean> concurrentHashMap = b;
        FileLog.v("VerificationService", "releaseAll count: %d", Integer.valueOf(concurrentHashMap.size()));
        concurrentHashMap.clear();
        c();
        synchronized (concurrentHashMap) {
            concurrentHashMap.notify();
        }
    }

    private static synchronized void c() {
        synchronized (VerificationService.class) {
            try {
                PowerManager.WakeLock wakeLock = d;
                if (wakeLock != null) {
                    if (wakeLock.isHeld()) {
                        d.release();
                        d.release();
                    }
                    FileLog.d("VerificationService", "wake lock released (held for time: %d)", Long.valueOf((System.nanoTime() - c) / 1000000));
                    d = null;
                    c = 0L;
                }
            } finally {
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        ConcurrentHashMap<Object, Boolean> concurrentHashMap = b;
        FileLog.v("VerificationService", "service destroyed with count: %d", Integer.valueOf(concurrentHashMap.size()));
        concurrentHashMap.clear();
        c();
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        ru.mail.verify.core.utils.FileLog.v("VerificationService", "onHandleIntent wait for keep alive operation expired, uptime: %d", java.lang.Long.valueOf(r0));
        r5.clear();
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        return;
     */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onHandleIntent(@Nullable Intent intent) {
        FileLog.v("VerificationService", "onHandleIntent before loop with count: %d", Integer.valueOf(b.size()));
        while (true) {
            ConcurrentHashMap<Object, Boolean> concurrentHashMap = b;
            if (concurrentHashMap.isEmpty()) {
                return;
            }
            FileLog.v("VerificationService", "onHandleIntent loop with count: %d", Integer.valueOf(concurrentHashMap.size()));
            try {
                synchronized (concurrentHashMap) {
                    concurrentHashMap.wait(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
                }
                long nanoTime = (System.nanoTime() - this.a) / 1000000;
                if (nanoTime < 0 || nanoTime > 300000) {
                    break;
                }
                a();
                FileLog.v("VerificationService", "onHandleIntent loop end, uptime: %d", Long.valueOf(nanoTime));
            } catch (InterruptedException e) {
                FileLog.e("VerificationService", "onHandleIntent wait failed", e);
                b.clear();
                c();
                return;
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int size = b.size();
        if (size > 0) {
            FileLog.v("VerificationService", "onStartCommand started with count: %d", Integer.valueOf(size));
            return super.onStartCommand(intent, i, i2);
        }
        stopSelf();
        return 2;
    }

    public static void a(@NonNull Object obj) {
        ConcurrentHashMap<Object, Boolean> concurrentHashMap = b;
        Boolean remove = concurrentHashMap.remove(obj);
        if (remove != null) {
            FileLog.v("VerificationService", "release owner: %s with wakeLock: %s", obj, remove);
            if (remove.booleanValue()) {
                Iterator<Map.Entry<Object, Boolean>> it = concurrentHashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<Object, Boolean> next = it.next();
                        if (next.getValue() != null && next.getValue().booleanValue()) {
                            break;
                        }
                    } else {
                        FileLog.d("VerificationService", "no more wakelock owners detected");
                        c();
                        break;
                    }
                }
            }
            ConcurrentHashMap<Object, Boolean> concurrentHashMap2 = b;
            if (concurrentHashMap2.isEmpty()) {
                synchronized (concurrentHashMap2) {
                    concurrentHashMap2.notify();
                }
            }
        }
    }

    private static synchronized void a() {
        synchronized (VerificationService.class) {
            try {
                PowerManager.WakeLock wakeLock = d;
                if (wakeLock != null && wakeLock.isHeld()) {
                    long nanoTime = (System.nanoTime() - c) / 1000000;
                    if (nanoTime < 0 || nanoTime > 60000) {
                        c();
                    }
                }
            } finally {
            }
        }
    }
}
