package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import android.os.UserHandle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class tm01 implements ServiceConnection, vo01 {
    public final HashMap b;
    public int c;
    public boolean d;

    @Nullable
    public IBinder e;
    public final fm01 f;
    public ComponentName g;
    public final /* synthetic */ do01 h;

    public tm01(do01 do01Var, fm01 fm01Var) {
        Objects.requireNonNull(do01Var);
        this.h = do01Var;
        this.f = fm01Var;
        this.b = new HashMap();
        this.c = 2;
    }

    public final ConnectionResult a(Executor executor, String str) {
        try {
            Intent a = owz0.a(this.h.f, this.f);
            this.c = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(z401.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                do01 do01Var = this.h;
                o4j o4jVar = do01Var.h;
                Context context = do01Var.f;
                fm01 fm01Var = this.f;
                try {
                    boolean d = o4jVar.d(context, str, a, this, 4225, executor);
                    this.d = d;
                    if (d) {
                        do01Var.g.sendMessageDelayed(do01Var.g.obtainMessage(1, fm01Var), do01Var.j);
                        ConnectionResult connectionResult = ConnectionResult.g;
                        StrictMode.setVmPolicy(vmPolicy);
                        return connectionResult;
                    }
                    this.c = 2;
                    try {
                        do01Var.h.c(do01Var.f, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16);
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (zzaf e) {
            return e.zza;
        }
    }

    public final ConnectionResult c(UserHandle userHandle) {
        try {
            Intent a = owz0.a(this.h.f, this.f);
            this.c = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(z401.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                do01 do01Var = this.h;
                o4j o4jVar = do01Var.h;
                Context context = do01Var.f;
                fm01 fm01Var = this.f;
                ConcurrentHashMap concurrentHashMap = o4jVar.a;
                boolean bindServiceAsUser = o4j.e(context, a) ? false : context.bindServiceAsUser(a, this, 4225, userHandle);
                this.d = bindServiceAsUser;
                if (bindServiceAsUser) {
                    do01Var.g.sendMessageDelayed(do01Var.g.obtainMessage(1, fm01Var), do01Var.j);
                    return ConnectionResult.g;
                }
                this.c = 2;
                return new ConnectionResult(16);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (zzaf e) {
            return e.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        do01 do01Var = this.h;
        synchronized (do01Var.e) {
            try {
                do01Var.g.removeMessages(1, this.f);
                this.e = iBinder;
                this.g = componentName;
                Iterator it = this.b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.c = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        do01 do01Var = this.h;
        synchronized (do01Var.e) {
            try {
                do01Var.g.removeMessages(1, this.f);
                this.e = null;
                this.g = componentName;
                Iterator it = this.b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.c = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
