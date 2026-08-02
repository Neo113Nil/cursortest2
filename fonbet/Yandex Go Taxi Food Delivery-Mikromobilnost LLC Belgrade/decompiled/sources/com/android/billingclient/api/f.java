package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import defpackage.ce91;
import defpackage.l0g0;
import defpackage.rfw0;

/* loaded from: classes.dex */
public final class f {
    public final Context a;
    public final l0g0 b;
    public final ce91 c;
    public final zzm d = new zzm(this, true);
    public final zzm e = new zzm(this, false);
    public boolean f;

    public f(Context context, l0g0 l0g0Var, rfw0 rfw0Var) {
        this.a = context;
        this.b = l0g0Var;
        this.c = rfw0Var;
    }

    public final void a(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f = z;
        zzm zzmVar = this.e;
        Context context = this.a;
        zzmVar.zza(context, intentFilter2);
        boolean z2 = this.f;
        zzm zzmVar2 = this.d;
        if (z2) {
            zzmVar2.zzb(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            zzmVar2.zza(context, intentFilter);
        }
    }
}
