package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.cvw;
import defpackage.k591;
import defpackage.oz60;
import defpackage.qb91;
import defpackage.su71;
import defpackage.udy;

/* loaded from: classes11.dex */
public class MapView extends FrameLayout {
    private final b zza;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public void getMapAsync(oz60 oz60Var) {
        cvw.h("getMapAsync() must be called on the main thread");
        cvw.m(oz60Var, "callback must not be null.");
        b bVar = this.zza;
        udy udyVar = bVar.a;
        if (udyVar == null) {
            bVar.i.add(oz60Var);
            return;
        }
        k591 k591Var = (k591) udyVar;
        try {
            k591Var.b.getMapAsync(new zzaf(k591Var, null));
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zza.b(bundle);
            if (this.zza.a == null) {
                com.google.android.gms.dynamic.a.k(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.zza.d();
    }

    public void onEnterAmbient(Bundle bundle) {
        cvw.h("onEnterAmbient() must be called on the main thread");
        udy udyVar = this.zza.a;
        if (udyVar != null) {
            k591 k591Var = (k591) udyVar;
            k591Var.getClass();
            try {
                Bundle bundle2 = new Bundle();
                qb91.g(bundle, bundle2);
                k591Var.b.onEnterAmbient(bundle2);
                qb91.g(bundle2, bundle);
            } catch (RemoteException e) {
                su71.e(e);
            }
        }
    }

    public void onExitAmbient() {
        cvw.h("onExitAmbient() must be called on the main thread");
        udy udyVar = this.zza.a;
        if (udyVar != null) {
            k591 k591Var = (k591) udyVar;
            k591Var.getClass();
            try {
                k591Var.b.onExitAmbient();
            } catch (RemoteException e) {
                su71.e(e);
            }
        }
    }

    public void onLowMemory() {
        this.zza.e();
    }

    public void onPause() {
        this.zza.f();
    }

    public void onResume() {
        this.zza.g();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.zza.h(bundle);
    }

    public void onStart() {
        this.zza.i();
    }

    public void onStop() {
        this.zza.j();
    }

    public MapView(Context context) {
        super(context);
        this.zza = new b(this, context, null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.zza = new b(this, context, googleMapOptions);
        setClickable(true);
    }
}
