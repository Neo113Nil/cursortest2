package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.sa81;
import defpackage.zm61;

/* loaded from: classes11.dex */
final class bl extends bi {
    final /* synthetic */ zm61 c;
    private final sa81 d;

    public bl(zm61 zm61Var, atx0 atx0Var) {
        super(zm61Var, atx0Var);
        this.d = new sa81("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.j, com.google.android.play.integrity.internal.k
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.d.a("onWarmUpExpressIntegrityToken", new Object[0]);
        throw null;
    }
}
