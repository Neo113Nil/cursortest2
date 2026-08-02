package androidx.media3.exoplayer.scheduler;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import androidx.media3.exoplayer.offline.e;
import defpackage.tw21;
import defpackage.v8e;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

/* loaded from: classes10.dex */
public final class b {
    public final Context a;
    public final v8e b;
    public final Requirements c;
    public final Handler d = tw21.o(null);
    public RequirementsWatcher$DeviceStatusChangeReceiver e;
    public int f;
    public RequirementsWatcher$NetworkCallback g;

    public b(Context context, v8e v8eVar, Requirements requirements) {
        this.a = context.getApplicationContext();
        this.b = v8eVar;
        this.c = requirements;
    }

    public final void a() {
        int notMetRequirements = this.c.getNotMetRequirements(this.a);
        if (this.f != notMetRequirements) {
            this.f = notMetRequirements;
            ((e) this.b.b).b(this, notMetRequirements);
        }
    }

    public final int b() {
        Requirements requirements = this.c;
        Context context = this.a;
        this.f = requirements.getNotMetRequirements(context);
        IntentFilter intentFilter = new IntentFilter();
        if (requirements.isNetworkRequired()) {
            if (tw21.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                RequirementsWatcher$NetworkCallback requirementsWatcher$NetworkCallback = new RequirementsWatcher$NetworkCallback(this);
                this.g = requirementsWatcher$NetworkCallback;
                connectivityManager.registerDefaultNetworkCallback(requirementsWatcher$NetworkCallback);
            } else {
                intentFilter.addAction(InternetConnectionStreamHandler.CONNECTIVITY_ACTION);
            }
        }
        if (requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (requirements.isIdleRequired()) {
            if (tw21.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (requirements.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        RequirementsWatcher$DeviceStatusChangeReceiver requirementsWatcher$DeviceStatusChangeReceiver = new RequirementsWatcher$DeviceStatusChangeReceiver(this);
        this.e = requirementsWatcher$DeviceStatusChangeReceiver;
        context.registerReceiver(requirementsWatcher$DeviceStatusChangeReceiver, intentFilter, null, this.d);
        return this.f;
    }
}
