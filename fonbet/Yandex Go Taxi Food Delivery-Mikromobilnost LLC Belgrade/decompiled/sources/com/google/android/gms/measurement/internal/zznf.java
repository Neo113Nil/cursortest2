package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import defpackage.a25;
import defpackage.aaa1;
import defpackage.cvw;
import defpackage.j5b1;
import defpackage.p0a1;
import defpackage.y1a1;
import defpackage.yvi0;
import defpackage.z15;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class zznf implements ServiceConnection, z15, a25 {
    final /* synthetic */ j5b1 zza;
    private volatile boolean zzb;
    private volatile p0a1 zzc;

    public zznf(j5b1 j5b1Var) {
        Objects.requireNonNull(j5b1Var);
        this.zza = j5b1Var;
    }

    @Override // defpackage.z15
    public final void onConnected(Bundle bundle) {
        aaa1 aaa1Var = ((g) this.zza.b).z;
        g.g(aaa1Var);
        aaa1Var.Lg();
        synchronized (this) {
            try {
                cvw.l(this.zzc);
                zzgb zzgbVar = (zzgb) this.zzc.i();
                aaa1 aaa1Var2 = ((g) this.zza.b).z;
                g.g(aaa1Var2);
                aaa1Var2.Pg(new e(4, this, zzgbVar));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // defpackage.a25
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        j5b1 j5b1Var = this.zza;
        aaa1 aaa1Var = ((g) j5b1Var.b).z;
        g.g(aaa1Var);
        aaa1Var.Lg();
        y1a1 y1a1Var = ((g) j5b1Var.b).y;
        if (y1a1Var == null || !y1a1Var.c) {
            y1a1Var = null;
        }
        if (y1a1Var != null) {
            y1a1Var.H.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        aaa1 aaa1Var2 = ((g) this.zza.b).z;
        g.g(aaa1Var2);
        aaa1Var2.Pg(new e(5, this, connectionResult));
    }

    @Override // defpackage.z15
    public final void onConnectionSuspended(int i) {
        g gVar = (g) this.zza.b;
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        aaa1Var.Lg();
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        y1a1Var.G.a("Service connection suspended");
        aaa1 aaa1Var2 = gVar.z;
        g.g(aaa1Var2);
        aaa1Var2.Pg(new d(1, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aaa1 aaa1Var = ((g) this.zza.b).z;
        g.g(aaa1Var);
        aaa1Var.Lg();
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                y1a1 y1a1Var = ((g) this.zza.b).y;
                g.g(y1a1Var);
                y1a1Var.z.a("Service connected with null binder");
                return;
            }
            Object obj = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    obj = queryLocalInterface instanceof zzgb ? (zzgb) queryLocalInterface : new zzfz(iBinder);
                    y1a1 y1a1Var2 = ((g) this.zza.b).y;
                    g.g(y1a1Var2);
                    y1a1Var2.H.a("Bound to IMeasurementService interface");
                } else {
                    y1a1 y1a1Var3 = ((g) this.zza.b).y;
                    g.g(y1a1Var3);
                    y1a1Var3.z.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                y1a1 y1a1Var4 = ((g) this.zza.b).y;
                g.g(y1a1Var4);
                y1a1Var4.z.a("Service connect failed to get IMeasurementService");
            }
            if (obj == null) {
                this.zzb = false;
                try {
                    yvi0 s = yvi0.s();
                    j5b1 j5b1Var = this.zza;
                    s.w(((g) j5b1Var.b).a, j5b1Var.w);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                aaa1 aaa1Var2 = ((g) this.zza.b).z;
                g.g(aaa1Var2);
                aaa1Var2.Pg(new f(2, this, obj));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar = (g) this.zza.b;
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        aaa1Var.Lg();
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        y1a1Var.G.a("Service disconnected");
        aaa1 aaa1Var2 = gVar.z;
        g.g(aaa1Var2);
        aaa1Var2.Pg(new e(2, this, componentName));
    }

    public final void zza(Intent intent) {
        j5b1 j5b1Var = this.zza;
        j5b1Var.Gg();
        Context context = ((g) j5b1Var.b).a;
        yvi0 s = yvi0.s();
        synchronized (this) {
            try {
                boolean z = this.zzb;
                j5b1 j5b1Var2 = this.zza;
                if (z) {
                    y1a1 y1a1Var = ((g) j5b1Var2.b).y;
                    g.g(y1a1Var);
                    y1a1Var.H.a("Connection attempt already in progress");
                } else {
                    y1a1 y1a1Var2 = ((g) j5b1Var2.b).y;
                    g.g(y1a1Var2);
                    y1a1Var2.H.a("Using local app measurement service");
                    this.zzb = true;
                    s.o(context, intent, j5b1Var2.w, HProv.PP_SECURITY_LEVEL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    public final void zzc() {
        j5b1 j5b1Var = this.zza;
        j5b1Var.Gg();
        Context context = ((g) j5b1Var.b).a;
        synchronized (this) {
            try {
                if (this.zzb) {
                    y1a1 y1a1Var = ((g) this.zza.b).y;
                    g.g(y1a1Var);
                    y1a1Var.H.a("Connection attempt already in progress");
                } else {
                    if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                        y1a1 y1a1Var2 = ((g) this.zza.b).y;
                        g.g(y1a1Var2);
                        y1a1Var2.H.a("Already awaiting connection attempt");
                        return;
                    }
                    this.zzc = new p0a1(context, Looper.getMainLooper(), this, this);
                    y1a1 y1a1Var3 = ((g) this.zza.b).y;
                    g.g(y1a1Var3);
                    y1a1Var3.H.a("Connecting to remote service");
                    this.zzb = true;
                    cvw.l(this.zzc);
                    this.zzc.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzd(boolean z) {
        this.zzb = false;
    }
}
