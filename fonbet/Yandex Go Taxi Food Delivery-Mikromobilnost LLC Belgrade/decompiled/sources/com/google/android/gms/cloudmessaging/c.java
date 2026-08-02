package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import defpackage.gnb1;
import defpackage.xfb1;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzp b;

    public /* synthetic */ c(zzp zzpVar, int i) {
        this.a = i;
        this.b = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                this.b.zzd();
                return;
            default:
                this.b.zza(2, "Service disconnected");
                return;
        }
        while (true) {
            zzp zzpVar = this.b;
            synchronized (zzpVar) {
                try {
                    if (zzpVar.zza != 2) {
                        return;
                    }
                    if (zzpVar.zzd.isEmpty()) {
                        zzpVar.zzf();
                        return;
                    }
                    gnb1 gnb1Var = (gnb1) zzpVar.zzd.poll();
                    zzpVar.zze.put(gnb1Var.a, gnb1Var);
                    zzpVar.zzf.b.schedule(new b(zzpVar, gnb1Var, 1), 30L, TimeUnit.SECONDS);
                    Log.isLoggable("MessengerIpcClient", 3);
                    d dVar = zzpVar.zzf;
                    Messenger messenger = zzpVar.zzb;
                    int i = gnb1Var.c;
                    Context context = dVar.a;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = gnb1Var.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", gnb1Var.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(Constants.KEY_DATA, gnb1Var.d);
                    obtain.setData(bundle);
                    try {
                        xfb1 xfb1Var = zzpVar.zzc;
                        Messenger messenger2 = xfb1Var.a;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            zzd zzdVar = xfb1Var.b;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            zzdVar.zzb(obtain);
                        }
                    } catch (RemoteException e) {
                        zzpVar.zza(2, e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
