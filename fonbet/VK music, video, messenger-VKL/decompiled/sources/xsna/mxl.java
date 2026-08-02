package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzbp;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapFragment;
import com.vk.location.common.LocationCommon;
import java.util.concurrent.atomic.AtomicReference;
import xsna.cxl;

/* compiled from: DeliveryPointsMapOneTimeEventHandler.kt */
/* loaded from: classes18.dex */
public final class mxl {
    public final DeliveryPointsMapFragment.b a;
    public final wik b;
    public final bpn0 c = new bpn0(new kk1(6));
    public io.reactivex.rxjava3.disposables.c d;
    public jdr0 e;

    /* compiled from: DeliveryPointsMapOneTimeEventHandler.kt */
    public static final class a implements fzz {
        public final DeliveryPointsMapFragment.b a;

        public a(DeliveryPointsMapFragment.b bVar) {
            this.a = bVar;
        }

        @Override // xsna.fzz
        public final void a(Location location) {
            LocationCommon.a.getClass();
            if (location.equals(LocationCommon.b)) {
                return;
            }
            this.a.invoke(new cxl.p(new Coordinates(location.getLatitude(), location.getLongitude())));
        }
    }

    public mxl(DeliveryPointsMapFragment.b bVar, wik wikVar) {
        this.a = bVar;
        this.b = wikVar;
    }

    @SuppressLint({"MissingPermission"})
    public final void a(Context context) {
        jdr0 jdr0Var = this.e;
        if (jdr0Var != null) {
            AtomicReference<Location> atomicReference = oxz.a;
            com.google.android.gms.common.api.a<a.d.c> aVar = wyz.a;
            new zzbp(context).removeLocationUpdates(jdr0Var);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        AtomicReference<Location> atomicReference2 = oxz.a;
        int i = 11;
        this.d = oxz.c(5000L, context).subscribe(new ji3(new com.vk.movika.sdk.base.logic.processor.d(i, this, context), 24), new np3(new n6f(this, i), 17));
    }
}
