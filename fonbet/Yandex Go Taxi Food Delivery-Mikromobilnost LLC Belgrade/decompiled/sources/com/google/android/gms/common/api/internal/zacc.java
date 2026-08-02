package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import defpackage.atx0;
import defpackage.dey;
import java.util.concurrent.CancellationException;

/* loaded from: classes11.dex */
public final class zacc extends zap {
    private atx0 zad;

    private zacc(dey deyVar) {
        super(deyVar, com.google.android.gms.common.a.d);
        this.zad = new atx0();
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zacc zaa(Activity activity) {
        dey fragment = b.getFragment(activity);
        zacc zaccVar = (zacc) fragment.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
        if (zaccVar == null) {
            return new zacc(fragment);
        }
        if (zaccVar.zad.a.n()) {
            zaccVar.zad = new atx0();
        }
        return zaccVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onDestroy() {
        super.onDestroy();
        this.zad.b(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult, int i) {
        String errorMessage = connectionResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        atx0 atx0Var = this.zad;
        atx0Var.a.r(new ApiException(new Status(connectionResult, errorMessage, connectionResult.getErrorCode())));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.zad.b(new ApiException(new Status(8)));
            return;
        }
        int d = this.zac.d(lifecycleActivity, com.google.android.gms.common.b.a);
        atx0 atx0Var = this.zad;
        if (d == 0) {
            atx0Var.c(null);
        } else {
            if (atx0Var.a.n()) {
                return;
            }
            zah(new ConnectionResult(d, null), 0);
        }
    }

    public final Task zad() {
        return this.zad.a;
    }
}
