package xsna;

import android.location.Location;
import com.google.android.gms.fitness.data.Bucket;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.courier_map.feature.state.UnableToGetLocationException;
import com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapFragment;
import com.vk.location.common.LocationCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.xyj;

/* compiled from: CourierMapLocationOneTimeEventHandler.kt */
/* loaded from: classes18.dex */
public final class fzj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fzj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Location location = (Location) obj;
                izj izjVar = (izj) this.c;
                LocationCommon.a.getClass();
                if (epx.f(location, LocationCommon.b)) {
                    CourierMapFragment.b bVar = izjVar.a;
                    new UnableToGetLocationException();
                    bVar.a(xyj.j.a.b);
                } else {
                    izjVar.a.a(new xyj.j.d(new Coordinates(location.getLatitude(), location.getLongitude())));
                }
                return s3q0.a;
            case 1:
                ruk rukVar = (ruk) obj;
                xgx0 xgx0Var = xgx0.a;
                StringBuilder sb = new StringBuilder("GoogleFitDataProvider.readData() -> GF workouts returned, sessions: ");
                List<Bucket> a = rukVar.a();
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                Iterator<T> it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Bucket) it.next()).d);
                }
                sb.append(arrayList);
                sb.append(", thread: ");
                sb.append(Thread.currentThread().getName());
                String sb2 = sb.toString();
                xgx0Var.getClass();
                xgx0.a(sb2);
                ((lq9) this.c).resumeWith(rukVar);
                return s3q0.a;
            default:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
        }
    }
}
