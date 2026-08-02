package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import defpackage.lm71;
import defpackage.ouy;

/* loaded from: classes11.dex */
final class zaab extends zag {
    private final ouy zaa;

    public zaab(ouy ouyVar) {
        this.zaa = ouyVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zag, com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.zaa.c(new lm71(17, moduleInstallStatusUpdate));
    }
}
