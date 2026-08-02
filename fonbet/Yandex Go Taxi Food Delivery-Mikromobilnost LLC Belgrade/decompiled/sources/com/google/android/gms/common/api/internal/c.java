package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.cvw;
import defpackage.kz81;
import defpackage.wst;
import defpackage.xst;
import defpackage.yx81;
import java.util.concurrent.locks.Lock;

/* loaded from: classes11.dex */
public final class c implements wst, xst {
    public final /* synthetic */ yx81 a;

    public /* synthetic */ c(yx81 yx81Var) {
        this.a = yx81Var;
    }

    @Override // defpackage.t4e
    public final void onConnected(Bundle bundle) {
        yx81 yx81Var = this.a;
        cvw.l(yx81Var.K);
        kz81 kz81Var = yx81Var.D;
        cvw.l(kz81Var);
        kz81Var.b(new zaar(yx81Var));
    }

    @Override // defpackage.yx60
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        yx81 yx81Var = this.a;
        Lock lock = yx81Var.b;
        lock.lock();
        try {
            if (yx81Var.E && !connectionResult.hasResolution()) {
                yx81Var.a();
                yx81Var.f();
            } else {
                yx81Var.d(connectionResult);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.t4e
    public final void onConnectionSuspended(int i) {
    }
}
