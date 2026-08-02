package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import defpackage.cd91;
import defpackage.dw00;
import defpackage.k591;
import defpackage.sl81;
import defpackage.su71;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class b extends com.google.android.gms.dynamic.a {
    public final MapView e;
    public final Context f;
    public sl81 g;
    public final GoogleMapOptions h;
    public final ArrayList i = new ArrayList();

    public b(MapView mapView, Context context, GoogleMapOptions googleMapOptions) {
        this.e = mapView;
        this.f = context;
        this.h = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.a
    public final void a(sl81 sl81Var) {
        this.g = sl81Var;
        ArrayList arrayList = this.i;
        Context context = this.f;
        if (this.a == null) {
            try {
                try {
                    dw00.b(context);
                    IMapViewDelegate zzg = cd91.a(context).zzg(ObjectWrapper.wrap(context), this.h);
                    if (zzg == null) {
                        return;
                    }
                    this.g.p(new k591(this.e, zzg));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        k591 k591Var = (k591) this.a;
                        k591Var.getClass();
                        try {
                            k591Var.b.getMapAsync(new zzaf(k591Var, null));
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
}
