package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zac;
import defpackage.az81;
import defpackage.cvw;
import defpackage.dz81;
import defpackage.h3s0;
import defpackage.jm2;
import defpackage.kz81;
import defpackage.ly81;
import defpackage.tqs;
import defpackage.wst;
import defpackage.xst;
import defpackage.y2c;
import java.util.Set;

/* loaded from: classes.dex */
public final class zact extends zac implements wst, xst {
    private static final jm2 zaa = dz81.a;
    private final Context zab;
    private final Handler zac;
    private final jm2 zad;
    private final Set zae;
    private final y2c zaf;
    private kz81 zag;
    private az81 zah;

    public zact(Context context, Handler handler, y2c y2cVar) {
        jm2 jm2Var = zaa;
        this.zab = context;
        this.zac = handler;
        cvw.m(y2cVar, "ClientSettings must not be null");
        this.zaf = y2cVar;
        this.zae = y2cVar.a;
        this.zad = jm2Var;
    }

    public static /* bridge */ /* synthetic */ void zad(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        ConnectionResult zaa2 = zakVar.zaa();
        if (zaa2.isSuccess()) {
            zav zab = zakVar.zab();
            cvw.l(zab);
            ConnectionResult zaa3 = zab.zaa();
            if (!zaa3.isSuccess()) {
                String valueOf = String.valueOf(zaa3);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                ((ly81) zactVar.zah).b(zaa3);
                zactVar.zag.disconnect();
                return;
            }
            ((ly81) zactVar.zah).c(zab.zab(), zactVar.zae);
        } else {
            ((ly81) zactVar.zah).b(zaa2);
        }
        zactVar.zag.disconnect();
    }

    @Override // defpackage.t4e
    public final void onConnected(Bundle bundle) {
        this.zag.b(this);
    }

    @Override // defpackage.yx60
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        ((ly81) this.zah).b(connectionResult);
    }

    @Override // defpackage.t4e
    public final void onConnectionSuspended(int i) {
        ((ly81) this.zah).d(i);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zad, com.google.android.gms.signin.internal.zae
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.zac.post(new tqs((Object) this, (Object) zakVar, false, 22));
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [kz81, om2] */
    public final void zae(az81 az81Var) {
        kz81 kz81Var = this.zag;
        if (kz81Var != null) {
            kz81Var.disconnect();
        }
        this.zaf.g = Integer.valueOf(System.identityHashCode(this));
        jm2 jm2Var = this.zad;
        Context context = this.zab;
        Handler handler = this.zac;
        y2c y2cVar = this.zaf;
        this.zag = jm2Var.c(context, handler.getLooper(), y2cVar, y2cVar.f, this, this);
        this.zah = az81Var;
        Set set = this.zae;
        if (set == null || set.isEmpty()) {
            this.zac.post(new h3s0(24, this));
        } else {
            this.zag.zab();
        }
    }

    public final void zaf() {
        kz81 kz81Var = this.zag;
        if (kz81Var != null) {
            kz81Var.disconnect();
        }
    }
}
