package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbp;
import com.google.android.gms.internal.measurement.zzbq;
import defpackage.aaa1;
import defpackage.g6a1;
import defpackage.y1a1;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class zzhj implements ServiceConnection {
    final /* synthetic */ g6a1 zza;
    private final String zzb;

    public zzhj(g6a1 g6a1Var, String str) {
        Objects.requireNonNull(g6a1Var);
        this.zza = g6a1Var;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            y1a1 y1a1Var = this.zza.a.y;
            g.g(y1a1Var);
            y1a1Var.C.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbq zzb = zzbp.zzb(iBinder);
            g6a1 g6a1Var = this.zza;
            if (zzb == null) {
                y1a1 y1a1Var2 = g6a1Var.a.y;
                g.g(y1a1Var2);
                y1a1Var2.C.a("Install Referrer Service implementation was not found");
                return;
            }
            g gVar = g6a1Var.a;
            y1a1 y1a1Var3 = gVar.y;
            g.g(y1a1Var3);
            y1a1Var3.H.a("Install Referrer Service connected");
            aaa1 aaa1Var = gVar.z;
            g.g(aaa1Var);
            aaa1Var.Pg(new e(this, zzb, this));
        } catch (RuntimeException e) {
            y1a1 y1a1Var4 = this.zza.a.y;
            g.g(y1a1Var4);
            y1a1Var4.C.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        y1a1 y1a1Var = this.zza.a.y;
        g.g(y1a1Var);
        y1a1Var.H.a("Install Referrer Service disconnected");
    }

    public final /* synthetic */ String zza() {
        return this.zzb;
    }
}
