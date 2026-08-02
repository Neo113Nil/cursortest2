package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import defpackage.aaa1;
import defpackage.b4b1;
import defpackage.j5b1;

/* loaded from: classes11.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public d(zzhb zzhbVar, boolean z) {
        this.a = 0;
        this.b = zzhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zzhb) obj).zzc().I();
                break;
            case 1:
                j5b1 j5b1Var = ((zznf) obj).zza;
                j5b1Var.Rg(new ComponentName(((g) j5b1Var.b).a, "com.google.android.gms.measurement.AppMeasurementService"));
                break;
            default:
                j5b1 j5b1Var2 = ((zznf) ((e) obj).c).zza;
                aaa1 aaa1Var = ((g) j5b1Var2.b).z;
                g.g(aaa1Var);
                aaa1Var.Pg(new b4b1(j5b1Var2, 0));
                break;
        }
    }

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
