package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.sa81;
import defpackage.zm61;

/* loaded from: classes11.dex */
final class bk extends bi {
    final /* synthetic */ zm61 c;
    private final sa81 d;
    private final long e;

    public bk(zm61 zm61Var, atx0 atx0Var, long j) {
        super(zm61Var, atx0Var);
        this.d = new sa81("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.j, com.google.android.play.integrity.internal.k
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.d.a("onRequestExpressIntegrityToken", new Object[0]);
        throw null;
    }
}
