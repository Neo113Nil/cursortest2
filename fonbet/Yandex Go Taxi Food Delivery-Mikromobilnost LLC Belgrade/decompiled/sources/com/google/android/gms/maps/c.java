package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import defpackage.cd91;
import defpackage.dw00;
import defpackage.p691;
import defpackage.sl81;
import defpackage.su71;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class c extends com.google.android.gms.dynamic.a {
    public final StreetViewPanoramaFragment e;
    public sl81 f;
    public Activity g;
    public final ArrayList h = new ArrayList();

    public c(StreetViewPanoramaFragment streetViewPanoramaFragment) {
        this.e = streetViewPanoramaFragment;
    }

    @Override // com.google.android.gms.dynamic.a
    public final void a(sl81 sl81Var) {
        this.f = sl81Var;
        n();
    }

    public final void n() {
        ArrayList arrayList = this.h;
        Activity activity = this.g;
        if (activity == null || this.f == null || this.a != null) {
            return;
        }
        try {
            try {
                dw00.b(activity);
                this.f.p(new p691(this.e, cd91.a(this.g).zzh(ObjectWrapper.wrap(this.g))));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    p691 p691Var = (p691) this.a;
                    p691Var.getClass();
                    try {
                        p691Var.b.getStreetViewPanoramaAsync(new zzam(p691Var, null));
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
                arrayList.clear();
            } catch (RemoteException e2) {
                su71.e(e2);
            }
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
