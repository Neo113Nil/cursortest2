package xsna;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WifiLockManager.java */
/* loaded from: classes12.dex */
public final class jpx0 {
    public final a a;
    public final otu b;
    public final otu c;
    public boolean d;
    public boolean e;

    /* compiled from: WifiLockManager.java */
    public static final class a {
        public final Context a;
        public WifiManager.WifiLock b;

        public a(Context context) {
            this.a = context;
        }

        public final void a(boolean z, boolean z2) {
            if (z && this.b == null) {
                Context context = this.a;
                if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    ahn.F("WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    ahn.F("WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.b = createWifiLock;
                    createWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.b;
            if (wifiLock == null) {
                return;
            }
            if (z && z2) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public jpx0(Context context, Looper looper, dvf dvfVar) {
        this.a = new a(context.getApplicationContext());
        this.b = dvfVar.createHandler(looper, null);
        this.c = dvfVar.createHandler(Looper.getMainLooper(), null);
    }

    public final void a(final boolean z, final boolean z2) {
        otu otuVar = this.b;
        if (z && z2) {
            otuVar.post(new Runnable() { // from class: xsna.hpx0
                @Override // java.lang.Runnable
                public final void run() {
                    jpx0.this.a.a(z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c.postDelayed(new v9j(8, this, atomicBoolean), 1000L);
        otuVar.post(new Runnable() { // from class: xsna.ipx0
            @Override // java.lang.Runnable
            public final void run() {
                jpx0 jpx0Var = jpx0.this;
                jpx0Var.getClass();
                atomicBoolean.set(false);
                jpx0Var.a.a(z, z2);
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
