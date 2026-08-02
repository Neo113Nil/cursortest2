package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzda;
import defpackage.fka1;
import defpackage.y1a1;

/* loaded from: classes.dex */
public final class o implements fka1 {
    public final zzda a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public o(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zzdaVar;
    }

    @Override // defpackage.fka1
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            g gVar = this.b.zza;
            if (gVar != null) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.C.b(e, "Event listener threw exception");
            }
        }
    }
}
