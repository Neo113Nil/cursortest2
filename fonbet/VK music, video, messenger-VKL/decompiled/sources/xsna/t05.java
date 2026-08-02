package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: AudiobookChapterProgressTrackerImpl.kt */
/* loaded from: classes3.dex */
public final class t05 implements r05 {
    public final p05 a;
    public final ilb b;
    public final b25 c;
    public final ScheduledExecutorService d;

    public t05(p05 p05Var, ilb ilbVar, b25 b25Var) {
        this.a = p05Var;
        this.b = ilbVar;
        this.c = b25Var;
        ScheduledExecutorService z = asu0.a.z(1, "vk-audiobook-progress-tracker-thread");
        this.d = z;
        xq3 xq3Var = new xq3(this, 1);
        p05Var.getClass();
        z.scheduleWithFixedDelay(xq3Var, 0L, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
    }

    @Override // xsna.r05
    public final void a(final int i, final int i2, final int i3, final String str) {
        this.d.execute(new Runnable() { // from class: xsna.s05
            @Override // java.lang.Runnable
            public final void run() {
                t05 t05Var = t05.this;
                p05 p05Var = t05Var.a;
                String a = jnj.a(i3);
                String str2 = str;
                int i4 = i;
                p05Var.d(new o05(str2, i4, a));
                t05Var.b.g(i4, i2, String.valueOf(t05Var.c.c().b), str2);
            }
        });
    }
}
