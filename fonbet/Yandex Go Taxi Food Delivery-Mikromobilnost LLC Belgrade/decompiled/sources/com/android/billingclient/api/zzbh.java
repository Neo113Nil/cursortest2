package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.zzaj;
import defpackage.ce91;
import defpackage.fe91;
import defpackage.ns5;
import defpackage.p0p;
import defpackage.rfw0;
import defpackage.xd91;
import defpackage.z991;

/* loaded from: classes10.dex */
final class zzbh extends zzaj {
    final p0p zza;
    final ce91 zzb;
    final int zzc;

    public /* synthetic */ zzbh(p0p p0pVar, ce91 ce91Var, int i, z991 z991Var) {
        this.zzb = ce91Var;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaj, com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            ((rfw0) this.zzb).k(xd91.b(92, 23, fe91.i), this.zzc);
            throw null;
        }
        int a = com.google.android.gms.internal.play_billing.g.a(bundle, "BillingClient");
        ns5 a2 = fe91.a(a, com.google.android.gms.internal.play_billing.g.e(bundle, "BillingClient"));
        if (a == 0) {
            throw null;
        }
        Log.isLoggable("BillingClient", 5);
        ((rfw0) this.zzb).k(xd91.b(23, 23, a2), this.zzc);
        throw null;
    }
}
