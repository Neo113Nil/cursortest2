package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.zzao;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.internal.cast.zzff;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class ds01 extends u2u {
    public static final o100 u = new o100("CastClientImpl", null);
    public static final Object v = new Object();
    public static final Object w = new Object();
    public ApplicationMetadata b;
    public final CastDevice c;
    public final dz9.c d;
    public final HashMap e;
    public final long f;
    public final Bundle g;
    public nr01 h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public double m;
    public zzao n;
    public int o;
    public int p;
    public String q;
    public String r;
    public Bundle s;
    public final HashMap t;

    public ds01(Context context, Looper looper, olc olcVar, CastDevice castDevice, long j, dz9.c cVar, Bundle bundle, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 10, olcVar, (x3j) bVar, (i380) interfaceC0114c);
        this.c = castDevice;
        this.d = cVar;
        this.f = j;
        this.g = bundle;
        this.e = new HashMap();
        new AtomicLong(0L);
        this.t = new HashMap();
        this.o = -1;
        this.p = -1;
        this.b = null;
        this.i = null;
        this.m = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        b();
        this.j = false;
        this.n = null;
        b();
    }

    public final void b() {
        CastDevice castDevice = this.c;
        exc0.j(castDevice, "device should not be null");
        in01 in01Var = castDevice.j;
        if (in01Var.a(2048) || !in01Var.a(4) || in01Var.a(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f);
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof nwz0 ? (nwz0) queryLocalInterface : new nwz0(iBinder);
    }

    public final void d(int i, long j) {
        ue6 ue6Var;
        HashMap hashMap = this.t;
        synchronized (hashMap) {
            ue6Var = (ue6) hashMap.remove(Long.valueOf(j));
        }
        if (ue6Var != null) {
            ue6Var.setResult(new Status(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        Object[] objArr = {this.h, Boolean.valueOf(isConnected())};
        o100 o100Var = u;
        o100Var.a("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        nr01 nr01Var = this.h;
        ds01 ds01Var = null;
        this.h = null;
        if (nr01Var != null) {
            ds01 ds01Var2 = (ds01) nr01Var.a.getAndSet(null);
            if (ds01Var2 != null) {
                ds01Var2.o = -1;
                ds01Var2.p = -1;
                ds01Var2.b = null;
                ds01Var2.i = null;
                ds01Var2.m = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                ds01Var2.b();
                ds01Var2.j = false;
                ds01Var2.n = null;
                ds01Var = ds01Var2;
            }
            if (ds01Var != null) {
                e();
                try {
                    try {
                        nwz0 nwz0Var = (nwz0) getService();
                        ApiMetadata zza = zzff.zza(getContext());
                        Parcel zza2 = nwz0Var.zza();
                        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
                        nwz0Var.zzd(1, zza2);
                    } catch (RemoteException | IllegalStateException unused) {
                        o100Var.b("Error while disconnecting the controller interface", new Object[0]);
                    }
                    return;
                } finally {
                    super.disconnect();
                }
            }
        }
        o100Var.a("already disposed, so short-circuiting", new Object[0]);
    }

    public final void e() {
        u.a("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.e;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    @Override // xsna.rd6
    public final Bundle getConnectionHint() {
        Bundle bundle = this.s;
        if (bundle == null) {
            return super.getConnectionHint();
        }
        this.s = null;
        return bundle;
    }

    @Override // xsna.rd6
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        u.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.q, this.r);
        CastDevice castDevice = this.c;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f);
        Bundle bundle2 = this.g;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        nr01 nr01Var = new nr01(this);
        this.h = nr01Var;
        bundle.putParcelable("listener", new BinderWrapper(nr01Var));
        String str = this.q;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.r;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // xsna.rd6
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        e();
    }

    @Override // xsna.rd6
    public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        u.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.k = true;
            this.l = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.s = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }
}
