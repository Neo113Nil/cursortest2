package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.VisibleForTesting;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class xh01 implements ServiceConnection, rd6.a, rd6.b {
    public volatile boolean b;
    public volatile g901 c;
    public final /* synthetic */ yh01 d;

    public xh01(yh01 yh01Var) {
        this.d = yh01Var;
    }

    @Override // xsna.rd6.a
    public final void f(Bundle bundle) {
        exc0.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                exc0.i(this.c);
                v701 v701Var = (v701) this.c.getService();
                kb01 kb01Var = ((mb01) this.d.b).k;
                mb01.k(kb01Var);
                kb01Var.s(new vh01(this, v701Var));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.c = null;
                this.b = false;
            }
        }
    }

    @Override // xsna.rd6.b
    public final void g(@NonNull ConnectionResult connectionResult) {
        exc0.e("MeasurementServiceConnection.onConnectionFailed");
        k901 k901Var = ((mb01) this.d.b).j;
        if (k901Var == null || !k901Var.e) {
            k901Var = null;
        }
        if (k901Var != null) {
            k901Var.l.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.b = false;
            this.c = null;
        }
        kb01 kb01Var = ((mb01) this.d.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new zi2(this, 2));
    }

    @Override // xsna.rd6.a
    public final void onConnectionSuspended(int i) {
        exc0.e("MeasurementServiceConnection.onConnectionSuspended");
        mb01 mb01Var = (mb01) this.d.b;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        k901Var.p.a("Service connection suspended");
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.s(new wh01(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        exc0.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.b = false;
                k901 k901Var = ((mb01) this.d.b).j;
                mb01.k(k901Var);
                k901Var.i.a("Service connected with null binder");
                return;
            }
            v701 v701Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    v701Var = queryLocalInterface instanceof v701 ? (v701) queryLocalInterface : new t701(iBinder);
                    k901 k901Var2 = ((mb01) this.d.b).j;
                    mb01.k(k901Var2);
                    k901Var2.q.a("Bound to IMeasurementService interface");
                } else {
                    k901 k901Var3 = ((mb01) this.d.b).j;
                    mb01.k(k901Var3);
                    k901Var3.i.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                k901 k901Var4 = ((mb01) this.d.b).j;
                mb01.k(k901Var4);
                k901Var4.i.a("Service connect failed to get IMeasurementService");
            }
            if (v701Var == null) {
                this.b = false;
                try {
                    o4j b = o4j.b();
                    yh01 yh01Var = this.d;
                    b.c(((mb01) yh01Var.b).b, yh01Var.f);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                kb01 kb01Var = ((mb01) this.d.b).k;
                mb01.k(kb01Var);
                kb01Var.s(new th01(this, v701Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        exc0.e("MeasurementServiceConnection.onServiceDisconnected");
        mb01 mb01Var = (mb01) this.d.b;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        k901Var.p.a("Service disconnected");
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.s(new uh01(this, componentName));
    }
}
