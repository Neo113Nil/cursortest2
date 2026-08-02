package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import defpackage.cd91;
import defpackage.dw00;
import defpackage.sl81;
import defpackage.su71;
import defpackage.x691;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class d extends com.google.android.gms.dynamic.a {
    public final StreetViewPanoramaView e;
    public final Context f;
    public sl81 g;
    public final StreetViewPanoramaOptions h;
    public final ArrayList i = new ArrayList();

    public d(StreetViewPanoramaView streetViewPanoramaView, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.e = streetViewPanoramaView;
        this.f = context;
        this.h = streetViewPanoramaOptions;
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
                    this.g.p(new x691(this.e, cd91.a(context).zzi(ObjectWrapper.wrap(context), this.h)));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        x691 x691Var = (x691) this.a;
                        x691Var.getClass();
                        try {
                            x691Var.b.getStreetViewPanoramaAsync(new zzaq(x691Var, null));
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
}
