package xsna;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.y8x0;

/* compiled from: WakeLockManager.java */
/* loaded from: classes12.dex */
public final class y8x0 {
    public final a a;
    public final otu b;
    public final otu c;
    public boolean d;
    public boolean e;

    /* compiled from: WakeLockManager.java */
    public static final class a {
        public final Context a;
        public PowerManager.WakeLock b;

        public a(Context context) {
            this.a = context;
        }

        public static void a(a aVar, boolean z, boolean z2) {
            synchronized (aVar) {
                boolean z3 = false;
                if (z) {
                    if (aVar.b == null) {
                        if (aVar.a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                            ahn.F("WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                            return;
                        }
                        PowerManager powerManager = (PowerManager) aVar.a.getSystemService("power");
                        if (powerManager == null) {
                            ahn.F("PowerManager is null, therefore not creating the WakeLock.");
                            return;
                        } else {
                            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                            aVar.b = newWakeLock;
                            newWakeLock.setReferenceCounted(false);
                        }
                    }
                }
                PowerManager.WakeLock wakeLock = aVar.b;
                if (wakeLock == null) {
                    return;
                }
                if (z && z2) {
                    z3 = true;
                }
                if (z3) {
                    wakeLock.acquire();
                } else {
                    wakeLock.release();
                }
            }
        }
    }

    public y8x0(Context context, Looper looper, dvf dvfVar) {
        this.a = new a(context.getApplicationContext());
        this.b = dvfVar.createHandler(looper, null);
        this.c = dvfVar.createHandler(Looper.getMainLooper(), null);
    }

    public final void a(final boolean z, final boolean z2) {
        otu otuVar = this.b;
        if (z && z2) {
            otuVar.post(new Runnable() { // from class: xsna.w8x0
                @Override // java.lang.Runnable
                public final void run() {
                    y8x0.a.a(y8x0.this.a, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c.postDelayed(new aw5(5, this, atomicBoolean), 1000L);
        otuVar.post(new Runnable() { // from class: xsna.x8x0
            @Override // java.lang.Runnable
            public final void run() {
                y8x0 y8x0Var = y8x0.this;
                y8x0Var.getClass();
                atomicBoolean.set(false);
                y8x0.a.a(y8x0Var.a, z, z2);
            }
        });
    }

    public final void b(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (this.d) {
            a(true, z);
        }
    }
}
