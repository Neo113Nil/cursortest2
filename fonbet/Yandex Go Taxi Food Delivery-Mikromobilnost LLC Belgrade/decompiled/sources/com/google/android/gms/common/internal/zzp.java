package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import defpackage.cvw;
import defpackage.e3b1;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzp implements Handler.Callback {
    final /* synthetic */ b zza;

    public /* synthetic */ zzp(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar);
        this.zza = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            b bVar = this.zza;
            synchronized (bVar.d) {
                try {
                    e3b1 e3b1Var = (e3b1) message.obj;
                    zzo zzoVar = (zzo) bVar.d.get(e3b1Var);
                    if (zzoVar != null && zzoVar.zzg()) {
                        if (zzoVar.zzd()) {
                            zzoVar.zza("GmsClientSupervisor");
                        }
                        bVar.d.remove(e3b1Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        b bVar2 = this.zza;
        synchronized (bVar2.d) {
            try {
                e3b1 e3b1Var2 = (e3b1) message.obj;
                zzo zzoVar2 = (zzo) bVar2.d.get(e3b1Var2);
                if (zzoVar2 != null && zzoVar2.zze() == 3) {
                    String valueOf = String.valueOf(e3b1Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName zzi = zzoVar2.zzi();
                    if (zzi == null) {
                        e3b1Var2.getClass();
                        zzi = null;
                    }
                    if (zzi == null) {
                        String a = e3b1Var2.a();
                        cvw.l(a);
                        zzi = new ComponentName(a, "unknown");
                    }
                    zzoVar2.onServiceDisconnected(zzi);
                }
            } finally {
            }
        }
        return true;
    }
}
