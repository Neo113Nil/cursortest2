package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import defpackage.cya1;
import defpackage.fe91;
import defpackage.ms5;
import defpackage.ns5;
import defpackage.q0p;
import defpackage.xd91;

/* loaded from: classes10.dex */
final class zzax extends ResultReceiver {
    final /* synthetic */ q0p zza;
    final /* synthetic */ a zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(a aVar, Handler handler, q0p q0pVar) {
        super(handler);
        this.zzb = aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        ms5 a = ns5.a();
        a.a = i;
        if (i != 0) {
            if (bundle == null) {
                a aVar = this.zzb;
                ns5 ns5Var = fe91.i;
                aVar.getClass();
                int i2 = xd91.a;
                aVar.C(97, 25, ns5Var, null);
                throw null;
            }
            a.b = com.google.android.gms.internal.play_billing.g.e(bundle, "BillingClient");
            int i3 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            this.zzb.p(xd91.c(i3 != 0 ? cya1.c(i3) : 23, 25, a.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
        }
        a.a();
        throw null;
    }
}
