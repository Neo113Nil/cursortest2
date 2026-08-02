package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcu;
import defpackage.ieb1;
import defpackage.j5b1;
import defpackage.kz;
import defpackage.vz;
import defpackage.y1a1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public h(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, zzbg zzbgVar, String str) {
        this.a = 0;
        this.b = zzcuVar;
        this.x = zzbgVar;
        this.c = str;
        this.w = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        zzgb zzgbVar2;
        switch (this.a) {
            case 0:
                j5b1 j = ((AppMeasurementDynamiteService) this.w).zza.j();
                zzcu zzcuVar = (zzcu) this.b;
                zzbg zzbgVar = (zzbg) this.x;
                String str = (String) this.c;
                j.Gg();
                j.Hg();
                g gVar = (g) j.b;
                ieb1 ieb1Var = gVar.B;
                g.e(ieb1Var);
                if (com.google.android.gms.common.b.b.d(((g) ieb1Var.b).a, 12451000) == 0) {
                    j.Ug(new kz(13, j, zzbgVar, zzcuVar, str));
                    return;
                }
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.C.a("Not bundling data. Service unavailable or out of date");
                ieb1 ieb1Var2 = gVar.B;
                g.e(ieb1Var2);
                ieb1Var2.qh(zzcuVar, new byte[0]);
                return;
            case 1:
                j5b1 j2 = ((AppMeasurementDynamiteService) this.w).zza.j();
                zzcu zzcuVar2 = (zzcu) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.x;
                j2.Gg();
                j2.Hg();
                j2.Ug(new vz(7, j2, str2, str3, j2.Wg(false), zzcuVar2, false));
                return;
            case 2:
                j5b1 j5b1Var = (j5b1) this.b;
                AtomicReference atomicReference = (AtomicReference) this.x;
                zzr zzrVar = (zzr) this.c;
                Bundle bundle = (Bundle) this.w;
                synchronized (atomicReference) {
                    try {
                        zzgbVar = j5b1Var.x;
                    } catch (RemoteException e) {
                        y1a1 y1a1Var2 = ((g) j5b1Var.b).y;
                        g.g(y1a1Var2);
                        y1a1Var2.z.b(e, "Failed to request trigger URIs; remote exception");
                        atomicReference.notifyAll();
                    }
                    if (zzgbVar != null) {
                        zzgbVar.zzD(zzrVar, bundle, new zzme(j5b1Var, atomicReference));
                        j5b1Var.Tg();
                        return;
                    } else {
                        y1a1 y1a1Var3 = ((g) j5b1Var.b).y;
                        g.g(y1a1Var3);
                        y1a1Var3.z.a("Failed to request trigger URIs; not connected to service");
                        return;
                    }
                }
            default:
                j5b1 j5b1Var2 = (j5b1) this.b;
                AtomicReference atomicReference2 = (AtomicReference) this.x;
                zzr zzrVar2 = (zzr) this.c;
                zzoo zzooVar = (zzoo) this.w;
                synchronized (atomicReference2) {
                    try {
                        zzgbVar2 = j5b1Var2.x;
                    } catch (RemoteException e2) {
                        y1a1 y1a1Var4 = ((g) j5b1Var2.b).y;
                        g.g(y1a1Var4);
                        y1a1Var4.z.b(e2, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference2.notifyAll();
                    }
                    if (zzgbVar2 != null) {
                        zzgbVar2.zzB(zzrVar2, zzooVar, new zzmf(j5b1Var2, atomicReference2));
                        j5b1Var2.Tg();
                        return;
                    } else {
                        y1a1 y1a1Var5 = ((g) j5b1Var2.b).y;
                        g.g(y1a1Var5);
                        y1a1Var5.z.a("[sgtm] Failed to get upload batches; not connected to service");
                        return;
                    }
                }
        }
    }

    public /* synthetic */ h(j5b1 j5b1Var, AtomicReference atomicReference, zzr zzrVar, Parcelable parcelable, int i) {
        this.a = i;
        this.b = j5b1Var;
        this.x = atomicReference;
        this.c = zzrVar;
        this.w = parcelable;
    }

    public h(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2) {
        this.a = 1;
        this.b = zzcuVar;
        this.c = str;
        this.x = str2;
        this.w = appMeasurementDynamiteService;
    }
}
