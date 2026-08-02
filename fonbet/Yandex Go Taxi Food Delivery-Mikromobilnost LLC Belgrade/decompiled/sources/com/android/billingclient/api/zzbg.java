package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.zzah;
import defpackage.ce91;
import defpackage.fe91;
import defpackage.fw1;
import defpackage.ns5;
import defpackage.rfw0;
import defpackage.xd91;
import defpackage.z991;

/* loaded from: classes10.dex */
final class zzbg extends zzah {
    final fw1 zza;
    final ce91 zzb;
    final int zzc;

    public /* synthetic */ zzbg(fw1 fw1Var, ce91 ce91Var, int i, z991 z991Var) {
        this.zzb = ce91Var;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzah, com.google.android.gms.internal.play_billing.zzai
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            ((rfw0) this.zzb).k(xd91.b(67, 14, fe91.i), this.zzc);
            throw null;
        }
        int a = com.google.android.gms.internal.play_billing.g.a(bundle, "BillingClient");
        ns5 a2 = fe91.a(a, com.google.android.gms.internal.play_billing.g.e(bundle, "BillingClient"));
        if (a == 0) {
            throw null;
        }
        Log.isLoggable("BillingClient", 5);
        ((rfw0) this.zzb).k(xd91.b(23, 14, a2), this.zzc);
        throw null;
    }
}
