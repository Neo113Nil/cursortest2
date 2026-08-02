package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcx;
import defpackage.aaa1;
import defpackage.cvw;
import defpackage.ieb1;
import defpackage.j5b1;
import defpackage.nw91;
import defpackage.y1a1;
import defpackage.yja1;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcx zzcxVar) {
        this.a = 6;
        this.b = appMeasurementDynamiteService;
        this.c = zzcxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zzhj zzhjVar = (zzhj) this.c;
                g gVar = zzhjVar.zza.a;
                aaa1 aaa1Var = gVar.z;
                g.g(aaa1Var);
                aaa1Var.Gg();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", zzhjVar.zza());
                try {
                    if (((zzbq) this.b).zze(bundle) == null) {
                        y1a1 y1a1Var = gVar.y;
                        g.g(y1a1Var);
                        y1a1Var.z.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e) {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.b(e.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                aaa1 aaa1Var2 = gVar.z;
                g.g(aaa1Var2);
                aaa1Var2.Gg();
                throw new IllegalStateException("Unexpected call on client side");
            case 1:
                j jVar = ((AppMeasurementDynamiteService) this.c).zza.F;
                g.f(jVar);
                m mVar = (m) this.b;
                jVar.Gg();
                jVar.Hg();
                yja1 yja1Var = jVar.x;
                if (mVar != yja1Var) {
                    cvw.n("EventInterceptor already set.", yja1Var == null);
                }
                jVar.x = mVar;
                return;
            case 2:
                ((zznf) this.c).zza.Rg((ComponentName) this.b);
                return;
            case 3:
                AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.c;
                ieb1 ieb1Var = appMeasurementDynamiteService.zza.B;
                g.e(ieb1Var);
                g gVar2 = appMeasurementDynamiteService.zza;
                if (gVar2.R != null && gVar2.R.booleanValue()) {
                    r2 = true;
                }
                ieb1Var.rh((zzcu) this.b, r2);
                return;
            case 4:
                zznf zznfVar = (zznf) this.c;
                synchronized (zznfVar) {
                    try {
                        zznfVar.zzd(false);
                        j5b1 j5b1Var = zznfVar.zza;
                        if (!j5b1Var.Xg()) {
                            y1a1 y1a1Var3 = ((g) j5b1Var.b).y;
                            g.g(y1a1Var3);
                            y1a1Var3.G.a("Connected to remote service");
                            zzgb zzgbVar = (zzgb) this.b;
                            j5b1Var.Gg();
                            j5b1Var.x = zzgbVar;
                            j5b1Var.Tg();
                            j5b1Var.Vg();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                j5b1 j5b1Var2 = ((zznf) this.c).zza;
                ScheduledExecutorService scheduledExecutorService = j5b1Var2.A;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    j5b1Var2.A = null;
                    return;
                }
                return;
            case 5:
                j5b1 j5b1Var3 = ((zznf) this.c).zza;
                j5b1Var3.x = null;
                if (((ConnectionResult) this.b).getErrorCode() != 7777) {
                    j5b1Var3.Vg();
                    return;
                }
                if (j5b1Var3.A == null) {
                    j5b1Var3.A = Executors.newScheduledThreadPool(1);
                }
                j5b1Var3.A.schedule(new d(2, this), ((Long) nw91.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            default:
                try {
                    ((zzcx) this.c).zze();
                    return;
                } catch (RemoteException e2) {
                    g gVar3 = ((AppMeasurementDynamiteService) this.b).zza;
                    cvw.l(gVar3);
                    y1a1 y1a1Var4 = gVar3.y;
                    g.g(y1a1Var4);
                    y1a1Var4.C.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
                    return;
                }
        }
    }

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public e(zzhj zzhjVar, zzbq zzbqVar, zzhj zzhjVar2) {
        this.a = 0;
        this.b = zzbqVar;
        this.c = zzhjVar;
    }
}
