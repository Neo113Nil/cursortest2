package xsna;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.internal.cast.zzfk;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class nr01 extends wwz0 {
    public final AtomicReference a;
    public final zzfk b;

    public nr01(ds01 ds01Var) {
        this.a = new AtomicReference(ds01Var);
        this.b = new zzfk(ds01Var.getLooper());
    }

    @Override // xsna.axz0
    public final void F1(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        ds01 ds01Var = (ds01) this.a.get();
        if (ds01Var == null) {
            return;
        }
        ds01Var.b = applicationMetadata;
        ds01Var.q = applicationMetadata.b;
        ds01Var.r = str2;
        ds01Var.i = str;
        synchronized (ds01.v) {
        }
    }

    @Override // xsna.axz0
    public final void Q(long j) {
        ds01 ds01Var = (ds01) this.a.get();
        if (ds01Var == null) {
            return;
        }
        ds01Var.d(0, j);
    }

    @Override // xsna.axz0
    public final void S0(int i, long j) {
        ds01 ds01Var = (ds01) this.a.get();
        if (ds01Var == null) {
            return;
        }
        ds01Var.d(i, j);
    }

    @Override // xsna.axz0
    public final void a(int i) {
        ds01 ds01Var = null;
        ds01 ds01Var2 = (ds01) this.a.getAndSet(null);
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
        if (ds01Var == null) {
            return;
        }
        ds01.u.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            ds01Var.triggerConnectionSuspended(2);
        }
    }

    @Override // xsna.axz0
    public final void e(int i) {
        ds01 ds01Var = (ds01) this.a.get();
        if (ds01Var == null) {
            return;
        }
        ds01Var.q = null;
        ds01Var.r = null;
        synchronized (ds01.w) {
        }
        if (ds01Var.d != null) {
            this.b.post(new ip01(this, ds01Var, i));
        }
    }

    @Override // xsna.axz0
    public final void i(String str, String str2) {
        ds01 ds01Var = (ds01) this.a.get();
        if (ds01Var == null) {
            return;
        }
        ds01.u.a("Receive (type=text, ns=%s) %s", str, str2);
        this.b.post(new cr01(this, ds01Var, str, str2));
    }

    @Override // xsna.axz0
    public final void o0(zzac zzacVar) {
        ds01 ds01Var = (ds01) this.a.get();
        if (ds01Var == null) {
            return;
        }
        ds01.u.a("onDeviceStatusChanged", new Object[0]);
        this.b.post(new bq01(this, ds01Var, zzacVar));
    }

    @Override // xsna.axz0
    public final void q() {
        ds01.u.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // xsna.axz0
    public final void w0(String str, byte[] bArr) {
        if (((ds01) this.a.get()) == null) {
            return;
        }
        o100 o100Var = ds01.u;
        ds01.u.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // xsna.axz0
    public final void w1(com.google.android.gms.cast.internal.zza zzaVar) {
        ds01 ds01Var = (ds01) this.a.get();
        if (ds01Var == null) {
            return;
        }
        ds01.u.a("onApplicationStatusChanged", new Object[0]);
        this.b.post(new o2t(this, ds01Var, zzaVar));
    }

    @Override // xsna.axz0
    public final void zzf(int i) {
        if (((ds01) this.a.get()) == null) {
            return;
        }
        synchronized (ds01.v) {
        }
    }

    @Override // xsna.axz0
    public final void zzg(int i) {
        if (((ds01) this.a.get()) == null) {
            return;
        }
        synchronized (ds01.w) {
        }
    }

    @Override // xsna.axz0
    public final void zzh(int i) {
        if (((ds01) this.a.get()) == null) {
            return;
        }
        synchronized (ds01.w) {
        }
    }

    @Override // xsna.axz0
    public final void zzc(int i) {
    }

    @Override // xsna.axz0
    public final void zzd(int i) {
    }
}
