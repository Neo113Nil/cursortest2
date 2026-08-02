package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import defpackage.cvw;
import defpackage.dey;
import defpackage.j63;
import defpackage.wn2;

/* loaded from: classes.dex */
public final class zaae extends zap {
    private final j63 zad;
    private final GoogleApiManager zae;

    public zaae(dey deyVar, GoogleApiManager googleApiManager, com.google.android.gms.common.a aVar) {
        super(deyVar, aVar);
        this.zad = new j63();
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zad(Activity activity, GoogleApiManager googleApiManager, wn2 wn2Var) {
        dey fragment = b.getFragment(activity);
        zaae zaaeVar = (zaae) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if (zaaeVar == null) {
            zaaeVar = new zaae(fragment, googleApiManager, com.google.android.gms.common.a.d);
        }
        cvw.m(wn2Var, "ApiKey cannot be null");
        zaaeVar.zad.add(wn2Var);
        googleApiManager.zaA(zaaeVar);
    }

    private final void zae() {
        if (this.zad.isEmpty()) {
            return;
        }
        this.zae.zaA(this);
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onResume() {
        super.onResume();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.b
    public final void onStart() {
        super.onStart();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.b
    public final void onStop() {
        super.onStop();
        this.zae.zaB(this);
    }

    public final j63 zaa() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult, int i) {
        this.zae.zax(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        this.zae.zay();
    }
}
