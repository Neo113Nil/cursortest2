package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.sn2;
import defpackage.tjb1;

/* loaded from: classes11.dex */
final class zzo extends IStatusCallback.Stub {
    final /* synthetic */ atx0 zza;

    public zzo(tjb1 tjb1Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback.Stub, com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        int statusCode = status.getStatusCode();
        atx0 atx0Var = this.zza;
        if (statusCode == 6) {
            atx0Var.b(sn2.a(status));
        } else {
            ntx0.a(status, null, atx0Var);
        }
    }
}
