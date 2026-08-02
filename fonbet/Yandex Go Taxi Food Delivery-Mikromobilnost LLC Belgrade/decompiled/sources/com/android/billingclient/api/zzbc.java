package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.zzz;
import defpackage.ce91;
import defpackage.fe91;
import defpackage.ns5;
import defpackage.r0p;
import defpackage.rfw0;
import defpackage.xd91;
import defpackage.z991;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class zzbc extends zzz {
    final r0p zza;
    final ce91 zzb;
    final int zzc;

    public /* synthetic */ zzbc(r0p r0pVar, ce91 ce91Var, int i, z991 z991Var) {
        this.zzb = ce91Var;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzz, com.google.android.gms.internal.play_billing.zzaa
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            ((rfw0) this.zzb).k(xd91.b(95, 24, fe91.i), this.zzc);
            throw null;
        }
        int a = com.google.android.gms.internal.play_billing.g.a(bundle, "BillingClient");
        ns5 a2 = fe91.a(a, com.google.android.gms.internal.play_billing.g.e(bundle, "BillingClient"));
        if (a != 0) {
            Log.isLoggable("BillingClient", 5);
            ((rfw0) this.zzb).k(xd91.b(23, 24, a2), this.zzc);
            throw null;
        }
        try {
            new JSONObject(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")).optString("externalTransactionToken");
            throw null;
        } catch (JSONException unused) {
            com.google.android.gms.internal.play_billing.g.h("BillingClient");
            ((rfw0) this.zzb).k(xd91.b(104, 24, fe91.i), this.zzc);
            throw null;
        }
    }
}
