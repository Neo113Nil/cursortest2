package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.scheduler.Requirements;

/* compiled from: RequirementsWatcher.java */
/* loaded from: classes.dex */
public final class t8g0 {
    public final Context a;
    public final b b;
    public final Requirements c;
    public final Handler d = y2r0.p(null);

    @Nullable
    public a e;
    public int f;

    @Nullable
    public c g;

    /* compiled from: RequirementsWatcher.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            t8g0.this.a();
        }
    }

    /* compiled from: RequirementsWatcher.java */
    public interface b {
        void a(t8g0 t8g0Var, int i);
    }

    /* compiled from: RequirementsWatcher.java */
    public final class c extends ConnectivityManager.NetworkCallback {
        public boolean a;
        public boolean b;

        public c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            t8g0.this.d.post(new u8g0(this, 0));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            t8g0.this.d.post(new v8g0(this));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            boolean z = this.a;
            t8g0 t8g0Var = t8g0.this;
            if (z && this.b == hasCapability) {
                if (hasCapability) {
                    t8g0Var.d.post(new v8g0(this));
                }
            } else {
                this.a = true;
                this.b = hasCapability;
                t8g0Var.d.post(new u8g0(this, 0));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            t8g0.this.d.post(new u8g0(this, 0));
        }
    }

    public t8g0(Context context, b bVar, Requirements requirements) {
        this.a = context.getApplicationContext();
        this.b = bVar;
        this.c = requirements;
    }

    public final void a() {
        int a2 = this.c.a(this.a);
        if (this.f != a2) {
            this.f = a2;
            this.b.a(this, a2);
        }
    }

    public final int b() {
        Requirements requirements = this.c;
        Context context = this.a;
        this.f = requirements.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = requirements.b;
        if ((i & 1) != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            c cVar = new c();
            this.g = cVar;
            connectivityManager.registerDefaultNetworkCallback(cVar);
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        a aVar = new a();
        this.e = aVar;
        context.registerReceiver(aVar, intentFilter, null, this.d);
        return this.f;
    }

    public final void c() {
        a aVar = this.e;
        aVar.getClass();
        Context context = this.a;
        context.unregisterReceiver(aVar);
        this.e = null;
        if (this.g != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            c cVar = this.g;
            cVar.getClass();
            connectivityManager.unregisterNetworkCallback(cVar);
            this.g = null;
        }
    }
}
