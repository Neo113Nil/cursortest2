package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import xsna.gs2;
import xsna.h5s;
import xsna.j630;
import xsna.tpa0;

/* loaded from: classes10.dex */
public final class rq2 {
    public final Context a;
    public final pq2 b;
    public final nq2 c;
    public final Handler d;
    public int e;
    public qq2 f;
    public final Handler g;

    public rq2(Context context, pq2 pq2Var) {
        nq2 nq2Var = nj0.h;
        this.a = context.getApplicationContext();
        this.b = pq2Var;
        this.c = nq2Var;
        this.d = mc3.b();
        this.g = new Handler(h5s.a("ExoPlayer:RequirementsWatcherBackground").getLooper());
    }

    public final void a() {
        this.g.post(new gs2(this, 22));
    }

    public final /* synthetic */ void b() {
        int a = this.c.a(this.a);
        if (this.e != a) {
            this.e = a;
            this.d.post(new tpa0(this, a, 1));
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        if ((this.c.b & 1) != 0) {
            if (mc3.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
                connectivityManager.getClass();
                qq2 qq2Var = new qq2(this);
                this.f = qq2Var;
                connectivityManager.registerDefaultNetworkCallback(qq2Var);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((this.c.b & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((this.c.b & 4) != 0) {
            if (mc3.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((this.c.b & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.a.registerReceiver(new oq2(this), intentFilter, null, this.d);
        return this.e;
    }

    public final void a(int i) {
        ((nj0) ((j630) this.b).c).a(this, i);
    }
}
