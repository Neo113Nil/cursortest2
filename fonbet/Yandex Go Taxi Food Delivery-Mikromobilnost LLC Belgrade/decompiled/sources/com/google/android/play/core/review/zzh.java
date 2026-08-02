package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.faa1;
import defpackage.gaa1;

/* loaded from: classes11.dex */
final class zzh extends zzg {
    public zzh(faa1 faa1Var, atx0 atx0Var, String str) {
        super(faa1Var, new gaa1("OnRequestInstallCallback"), atx0Var);
    }

    @Override // com.google.android.play.core.review.zzg, com.google.android.play.core.review.internal.zzg, com.google.android.play.core.review.internal.zzh
    public final void zzb(Bundle bundle) throws RemoteException {
        super.zzb(bundle);
        this.zzb.c(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
