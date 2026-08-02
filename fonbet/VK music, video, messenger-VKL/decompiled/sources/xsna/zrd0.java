package xsna;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import com.vk.core.performance.score.PerformanceScoreEventType;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.gw90;

/* compiled from: ProductScoreSessionTracker.kt */
/* loaded from: classes.dex */
public final class zrd0 {
    public static Choreographer b;
    public static volatile UUID f;
    public static urd0 g;
    public static final zrd0 a = new zrd0();
    public static long c = (long) (TimeUnit.SECONDS.toNanos(1) / 60.0f);
    public static gw90.a d = new gw90.a(0);
    public static final HashMap<UUID, yw90> e = new HashMap<>();
    public static final AtomicReference<yw90> h = new AtomicReference<>(null);

    public static Pair a(PerformanceScoreProduct performanceScoreProduct) {
        UUID randomUUID = UUID.randomUUID();
        px30 px30Var = new px30(randomUUID, 25);
        Choreographer choreographer = b;
        dll dllVar = new dll(performanceScoreProduct, px30Var, choreographer != null ? new ihl(choreographer, c, d) : null, g);
        e.put(randomUUID, dllVar);
        return new Pair(randomUUID, dllVar);
    }

    public static void c(Activity activity, gw90.a aVar) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            tv4.b("Have to be called on main thread", com.vk.metrics.eventtracking.b.a);
            return;
        }
        b = Choreographer.getInstance();
        d = aVar;
        Display display = Build.VERSION.SDK_INT >= 30 ? activity.getDisplay() : activity.getWindowManager().getDefaultDisplay();
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        float refreshRate = display.getRefreshRate();
        ref$FloatRef.element = refreshRate;
        if (refreshRate < 30.0f || refreshRate > 200.0f) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{shy.c(ref$FloatRef.element, ", applying 60fps by default", new StringBuilder("Incorrect refresh rate: "))});
            }
            ref$FloatRef.element = 60.0f;
        }
        c = (long) (TimeUnit.SECONDS.toNanos(1L) / ref$FloatRef.element);
    }

    public static void d(Bundle bundle, UUID uuid) {
        bundle.putString("com.vk.PRODUCT_SCORE_SESSION_UUID", uuid.toString());
    }

    public final void b(PerformanceScoreEventType performanceScoreEventType) {
        synchronized (this) {
            try {
                UUID uuid = f;
                if (uuid != null) {
                    yw90 yw90Var = e.get(uuid);
                    if (yw90Var != null) {
                        yw90Var.b(performanceScoreEventType);
                    } else {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.w, new Object[]{"Don't have value of active session in cache"});
                        }
                    }
                } else {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"Don't have active session"});
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(UUID uuid) {
        synchronized (this) {
            if (epx.f(f, uuid)) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Session " + uuid + " is already active"});
                }
            } else {
                f = uuid;
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
