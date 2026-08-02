package xsna;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import com.vk.dto.common.im.ImageList;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;

/* compiled from: AvatarApiExtensions.kt */
/* loaded from: classes15.dex */
public final class pp5 implements pjw, eer0 {
    public final Object b;
    public final Object c;

    public /* synthetic */ pp5(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.eer0
    public void a() {
        ndr0 ndr0Var = (ndr0) this.b;
        gk9 v = sua.v(ndr0Var.h());
        if (v.a.c == Coordinates.d.c) {
            return;
        }
        hl00 hl00Var = (hl00) this.c;
        try {
            VisibleRegion Y = ((ynv) ndr0Var.a.e().c).Y();
            LatLng latLng = Y.c;
            double d = latLng.b;
            double d2 = latLng.c;
            edr0 edr0Var = new edr0(d, d2);
            edr0 edr0Var2 = new edr0(d, d2);
            LatLng latLng2 = Y.d;
            edr0 edr0Var3 = new edr0(latLng2.b, latLng2.c);
            LatLng latLng3 = Y.e;
            hl00Var.d(v, new v0w0(edr0Var, edr0Var2, edr0Var3, new edr0(latLng3.b, latLng3.c)));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.pjw
    public String f(int i) {
        return i > 0 ? ImageList.Eb(i, i, ((ImageList) this.b).b) : (String) this.c;
    }

    public pp5() {
        this.b = new rra();
        this.c = new qra();
    }
}
