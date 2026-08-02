package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.c;
import defpackage.atx0;
import defpackage.faa1;
import defpackage.gaa1;
import defpackage.j3b1;

/* loaded from: classes11.dex */
class zzg extends com.google.android.play.core.review.internal.zzg {
    final gaa1 zza;
    final atx0 zzb;
    final /* synthetic */ faa1 zzc;

    public zzg(faa1 faa1Var, gaa1 gaa1Var, atx0 atx0Var) {
        this.zzc = faa1Var;
        this.zza = gaa1Var;
        this.zzb = atx0Var;
    }

    @Override // com.google.android.play.core.review.internal.zzg, com.google.android.play.core.review.internal.zzh
    public void zzb(Bundle bundle) throws RemoteException {
        c cVar = this.zzc.a;
        if (cVar != null) {
            atx0 atx0Var = this.zzb;
            synchronized (cVar.f) {
                cVar.e.remove(atx0Var);
            }
            cVar.a().post(new j3b1(cVar));
        }
        this.zza.a("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
