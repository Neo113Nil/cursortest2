package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.cvw;
import defpackage.s070;
import defpackage.su71;
import defpackage.udy;
import defpackage.x691;

/* loaded from: classes11.dex */
public class StreetViewPanoramaView extends FrameLayout {
    private final d zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewPanoramaView(Context context) {
        super(context);
        cvw.m(context, "context must not be null");
        this.zza = new d(this, context, null);
    }

    public void getStreetViewPanoramaAsync(s070 s070Var) {
        cvw.m(s070Var, "callback must not be null");
        cvw.h("getStreetViewPanoramaAsync() must be called on the main thread");
        d dVar = this.zza;
        udy udyVar = dVar.a;
        if (udyVar == null) {
            dVar.i.add(s070Var);
            return;
        }
        x691 x691Var = (x691) udyVar;
        try {
            x691Var.b.getStreetViewPanoramaAsync(new zzaq(x691Var, null));
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    public final void onCreate(Bundle bundle) {
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

    public final void onLowMemory() {
        this.zza.e();
    }

    public final void onPause() {
        this.zza.f();
    }

    public void onResume() {
        this.zza.g();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.zza.h(bundle);
    }

    public void onStart() {
        this.zza.i();
    }

    public void onStop() {
        this.zza.j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        cvw.m(context, "context must not be null");
        this.zza = new d(this, context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        cvw.m(context, "context must not be null");
        this.zza = new d(this, context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        cvw.m(context, "context must not be null");
        this.zza = new d(this, context, streetViewPanoramaOptions);
    }
}
