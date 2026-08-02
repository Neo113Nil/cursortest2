package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.l0;
import defpackage.nqb1;
import defpackage.vsb1;
import defpackage.zfb1;

/* loaded from: classes10.dex */
final class zzbz extends com.google.android.gms.internal.play_billing.zzaw {
    private final l0 zza;

    public zzbz(l0 l0Var) {
        this.zza = l0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaw, com.google.android.gms.internal.play_billing.zzax
    public final void zza(int i) {
        l0 l0Var = this.zza;
        Integer valueOf = Integer.valueOf(i);
        l0Var.d = true;
        vsb1 vsb1Var = l0Var.b;
        if (vsb1Var != null) {
            nqb1 nqb1Var = vsb1Var.b;
            nqb1Var.getClass();
            if (zfb1.y.g(nqb1Var, null, valueOf)) {
                zfb1.b(nqb1Var);
                l0Var.a = null;
                l0Var.b = null;
                l0Var.c = null;
            }
        }
    }
}
