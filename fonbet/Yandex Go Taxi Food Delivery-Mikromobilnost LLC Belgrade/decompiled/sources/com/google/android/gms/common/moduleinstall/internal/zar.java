package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zar extends zaa {
    final /* synthetic */ atx0 zaa;

    public zar(c cVar, atx0 atx0Var) {
        this.zaa = atx0Var;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zad, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        ntx0.b(status, moduleAvailabilityResponse, this.zaa);
    }
}
