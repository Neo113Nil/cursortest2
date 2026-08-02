package com.google.android.gms.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.gcm.zzj;
import defpackage.bwb1;
import defpackage.cvw;
import defpackage.sjb1;
import defpackage.xvb1;
import defpackage.yvi0;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes11.dex */
final class zzt implements ServiceConnection {
    int state;
    final Messenger zzch;
    xvb1 zzci;
    final Queue<bwb1> zzcj;
    final SparseArray<bwb1> zzck;
    final /* synthetic */ sjb1 zzcl;

    private zzt(sjb1 sjb1Var) {
        this.state = 0;
        this.zzch = new Messenger(new zzj(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.android.gms.iid.zzu
            private final zzt zzcm;

            {
                this.zzcm = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.zzcm.zzd(message);
            }
        }));
        this.zzcj = new ArrayDeque();
        this.zzck = new SparseArray<>();
    }

    private final void zzt() {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            zzd(0, "Null service connection");
            return;
        }
        try {
            this.zzci = new xvb1(iBinder);
            this.state = 2;
            zzt();
        } catch (RemoteException e) {
            zzd(0, e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        zzd(2, "Service disconnected");
    }

    public final synchronized void zzd(int i, String str) {
        try {
            Log.isLoggable("MessengerIpcClient", 3);
            int i2 = this.state;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 == 1 || i2 == 2) {
                Log.isLoggable("MessengerIpcClient", 2);
                this.state = 4;
                yvi0.s();
                throw null;
            }
            if (i2 == 3) {
                this.state = 4;
            } else {
                if (i2 == 4) {
                    return;
                }
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zze(bwb1 bwb1Var) {
        int i = this.state;
        if (i == 0) {
            this.zzcj.add(bwb1Var);
            cvw.o(this.state == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.state = 1;
            new Intent("com.google.android.c2dm.intent.REGISTER").setPackage("com.google.android.gms");
            yvi0.s();
            throw null;
        }
        if (i == 1) {
            this.zzcj.add(bwb1Var);
            return true;
        }
        if (i == 2) {
            this.zzcj.add(bwb1Var);
            zzt();
            return true;
        }
        if (i != 3 && i != 4) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    public final synchronized void zzg(int i) {
        if (this.zzck.get(i) != null) {
            throw new ClassCastException();
        }
    }

    public final synchronized void zzu() {
        if (this.state == 2 && this.zzcj.isEmpty() && this.zzck.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.state = 3;
            yvi0.s();
            throw null;
        }
    }

    public final synchronized void zzv() {
        if (this.state == 1) {
            zzd(1, "Timed out while binding");
        }
    }

    public final boolean zzd(Message message) {
        int i = message.arg1;
        Log.isLoggable("MessengerIpcClient", 3);
        synchronized (this) {
            try {
                if (this.zzck.get(i) != null) {
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
