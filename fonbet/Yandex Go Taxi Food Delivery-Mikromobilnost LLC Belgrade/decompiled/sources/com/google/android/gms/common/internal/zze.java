package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import defpackage.ax91;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class zze implements ServiceConnection {
    final /* synthetic */ a zza;
    private final int zzb;

    public zze(a aVar, int i) {
        Objects.requireNonNull(aVar);
        this.zza = aVar;
        this.zzb = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a aVar = this.zza;
        if (iBinder == null) {
            synchronized (aVar.E) {
                i = aVar.L;
            }
            if (i == 3) {
                aVar.S = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = aVar.D;
            handler.sendMessage(handler.obtainMessage(i2, aVar.U.get(), 16));
            return;
        }
        synchronized (aVar.F) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.G = (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new zzaa(iBinder) : (IGmsServiceBroker) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar2 = this.zza;
        int i3 = this.zzb;
        aVar2.getClass();
        ax91 ax91Var = new ax91(aVar2, 0, null);
        Handler handler2 = aVar2.D;
        handler2.sendMessage(handler2.obtainMessage(7, i3, -1, ax91Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.zza;
        synchronized (aVar.F) {
            aVar.G = null;
        }
        a aVar2 = this.zza;
        int i = this.zzb;
        Handler handler = aVar2.D;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
