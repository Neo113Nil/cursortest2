package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.zzad;
import defpackage.ce91;
import defpackage.fe91;
import defpackage.fs5;
import defpackage.hs5;
import defpackage.is5;
import defpackage.ms5;
import defpackage.ns5;
import defpackage.rfw0;
import defpackage.xd91;
import defpackage.z991;
import org.json.JSONException;

/* loaded from: classes10.dex */
final class zzbe extends zzad {
    final is5 zza;
    final ce91 zzb;
    final int zzc;

    public /* synthetic */ zzbe(is5 is5Var, ce91 ce91Var, int i, z991 z991Var) {
        this.zza = is5Var;
        this.zzb = ce91Var;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzad, com.google.android.gms.internal.play_billing.zzae
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            ce91 ce91Var = this.zzb;
            ns5 ns5Var = fe91.i;
            ((rfw0) ce91Var).k(xd91.b(63, 13, ns5Var), this.zzc);
            ((fs5) this.zza).b(ns5Var, null);
            return;
        }
        int a = com.google.android.gms.internal.play_billing.g.a(bundle, "BillingClient");
        String e = com.google.android.gms.internal.play_billing.g.e(bundle, "BillingClient");
        ms5 a2 = ns5.a();
        a2.a = a;
        a2.b = e;
        if (a != 0) {
            Log.isLoggable("BillingClient", 5);
            ns5 a3 = a2.a();
            ((rfw0) this.zzb).k(xd91.b(23, 13, a3), this.zzc);
            ((fs5) this.zza).b(a3, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            Log.isLoggable("BillingClient", 5);
            a2.a = 6;
            ns5 a4 = a2.a();
            ((rfw0) this.zzb).k(xd91.b(64, 13, a4), this.zzc);
            ((fs5) this.zza).b(a4, null);
            return;
        }
        try {
            hs5 hs5Var = new hs5(bundle.getString("BILLING_CONFIG"));
            ((fs5) this.zza).b(a2.a(), hs5Var);
        } catch (JSONException unused) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
            ce91 ce91Var2 = this.zzb;
            ns5 ns5Var2 = fe91.i;
            ((rfw0) ce91Var2).k(xd91.b(65, 13, ns5Var2), this.zzc);
            ((fs5) this.zza).b(ns5Var2, null);
        }
    }
}
