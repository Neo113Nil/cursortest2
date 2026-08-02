package xsna;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes.dex */
public final class dm01 implements ServiceConnection {
    public jn01 d;
    public final /* synthetic */ nq01 g;
    public int b = 0;
    public final Messenger c = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: xsna.xi01
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            dm01 dm01Var = dm01.this;
            synchronized (dm01Var) {
                try {
                    uo01 uo01Var = (uo01) dm01Var.f.get(i);
                    if (uo01Var == null) {
                        return true;
                    }
                    dm01Var.f.remove(i);
                    dm01Var.l();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        uo01Var.c(new com.google.android.gms.cloudmessaging.zzs("Not supported by GmsCore", null));
                        return true;
                    }
                    uo01Var.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    public final ArrayDeque e = new ArrayDeque();
    public final SparseArray f = new SparseArray();

    public /* synthetic */ dm01(nq01 nq01Var) {
        this.g = nq01Var;
    }

    public final synchronized void f(@Nullable String str) {
        g(str, null);
    }

    public final synchronized void g(@Nullable String str, @Nullable SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.b;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.b = 4;
                return;
            }
            this.b = 4;
            o4j.b().c(this.g.a, this);
            com.google.android.gms.cloudmessaging.zzs zzsVar = new com.google.android.gms.cloudmessaging.zzs(str, securityException);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((uo01) it.next()).c(zzsVar);
            }
            this.e.clear();
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                ((uo01) this.f.valueAt(i2)).c(zzsVar);
            }
            this.f.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l() {
        if (this.b == 2 && this.e.isEmpty() && this.f.size() == 0) {
            this.b = 3;
            o4j.b().c(this.g.a, this);
        }
    }

    public final synchronized boolean m(uo01 uo01Var) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.e.add(uo01Var);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.e.add(uo01Var);
            this.g.b.execute(new de01(this));
            return true;
        }
        this.e.add(uo01Var);
        exc0.l(this.b == 0);
        this.b = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (o4j.b().a(this.g.a, intent, this, 1)) {
                this.g.b.schedule(new Runnable() { // from class: xsna.vf01
                    @Override // java.lang.Runnable
                    public final void run() {
                        dm01 dm01Var = dm01.this;
                        synchronized (dm01Var) {
                            if (dm01Var.b == 1) {
                                dm01Var.f("Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                f("Unable to bind to service");
            }
        } catch (SecurityException e) {
            g("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.g.b.execute(new Runnable() { // from class: xsna.oc01
            @Override // java.lang.Runnable
            public final void run() {
                dm01 dm01Var = dm01.this;
                IBinder iBinder2 = iBinder;
                synchronized (dm01Var) {
                    if (iBinder2 == null) {
                        dm01Var.f("Null service connection");
                        return;
                    }
                    try {
                        dm01Var.d = new jn01(iBinder2);
                        dm01Var.b = 2;
                        dm01Var.g.b.execute(new de01(dm01Var));
                    } catch (RemoteException e) {
                        dm01Var.f(e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.g.b.execute(new Runnable() { // from class: xsna.gh01
            @Override // java.lang.Runnable
            public final void run() {
                dm01.this.f("Service disconnected");
            }
        });
    }
}
