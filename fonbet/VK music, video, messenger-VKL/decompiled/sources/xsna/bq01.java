package xsna;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.cast.zzao;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class bq01 implements Runnable {
    public final /* synthetic */ ds01 b;
    public final /* synthetic */ zzac c;

    public bq01(nr01 nr01Var, ds01 ds01Var, zzac zzacVar) {
        this.b = ds01Var;
        this.c = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        ds01 ds01Var = this.b;
        dz9.c cVar = ds01Var.d;
        zzac zzacVar = this.c;
        ApplicationMetadata applicationMetadata = zzacVar.e;
        zzao zzaoVar = zzacVar.g;
        if (!o0a.c(applicationMetadata, ds01Var.b)) {
            ds01Var.b = applicationMetadata;
            cVar.onApplicationMetadataChanged(applicationMetadata);
        }
        double d = zzacVar.b;
        boolean z3 = true;
        if (Double.isNaN(d) || Math.abs(d - ds01Var.m) <= 1.0E-7d) {
            z = false;
        } else {
            ds01Var.m = d;
            z = true;
        }
        boolean z4 = zzacVar.c;
        if (z4 != ds01Var.j) {
            ds01Var.j = z4;
            z = true;
        }
        Double.isNaN(zzacVar.h);
        o100 o100Var = ds01.u;
        o100Var.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(ds01Var.l));
        if (cVar != null && (z || ds01Var.l)) {
            cVar.onVolumeChanged();
        }
        int i = zzacVar.d;
        if (i != ds01Var.o) {
            ds01Var.o = i;
            z2 = true;
        } else {
            z2 = false;
        }
        o100Var.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(ds01Var.l));
        if (cVar != null && (z2 || ds01Var.l)) {
            cVar.onActiveInputStateChanged(ds01Var.o);
        }
        int i2 = zzacVar.f;
        if (i2 != ds01Var.p) {
            ds01Var.p = i2;
        } else {
            z3 = false;
        }
        o100Var.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(ds01Var.l));
        if (cVar != null && (z3 || ds01Var.l)) {
            cVar.onStandbyStateChanged(ds01Var.p);
        }
        if (!o0a.c(ds01Var.n, zzaoVar)) {
            ds01Var.n = zzaoVar;
        }
        ds01Var.l = false;
    }
}
