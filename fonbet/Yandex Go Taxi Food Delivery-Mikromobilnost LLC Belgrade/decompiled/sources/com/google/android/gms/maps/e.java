package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import defpackage.cd91;
import defpackage.dw00;
import defpackage.l791;
import defpackage.sl81;
import defpackage.su71;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class e extends com.google.android.gms.dynamic.a {
    public final SupportMapFragment e;
    public sl81 f;
    public Activity g;
    public final ArrayList h = new ArrayList();

    public e(SupportMapFragment supportMapFragment) {
        this.e = supportMapFragment;
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
                IMapFragmentDelegate zzf = cd91.a(this.g).zzf(ObjectWrapper.wrap(this.g));
                if (zzf == null) {
                    return;
                }
                this.f.p(new l791(this.e, zzf));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    l791 l791Var = (l791) this.a;
                    l791Var.getClass();
                    try {
                        l791Var.b.getMapAsync(new zzat(l791Var, null));
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
                arrayList.clear();
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        } catch (RemoteException e2) {
            su71.e(e2);
        }
    }
}
