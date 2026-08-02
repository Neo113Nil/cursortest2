package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import defpackage.atx0;
import defpackage.d3w;
import defpackage.ntx0;
import defpackage.puy;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
final class zau extends zaa {
    final /* synthetic */ AtomicReference zaa;
    final /* synthetic */ atx0 zab;
    final /* synthetic */ d3w zac;
    final /* synthetic */ c zad;

    public zau(c cVar, AtomicReference atomicReference, atx0 atx0Var, d3w d3wVar) {
        this.zad = cVar;
        this.zaa = atomicReference;
        this.zab = atx0Var;
        this.zac = d3wVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zad, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.zaa.set(moduleInstallResponse);
        }
        ntx0.b(status, null, this.zab);
        if (!status.isSuccess() || (moduleInstallResponse != null && moduleInstallResponse.zaa())) {
            this.zad.c(puy.c(this.zac, d3w.class.getSimpleName()), 27306);
        }
    }
}
