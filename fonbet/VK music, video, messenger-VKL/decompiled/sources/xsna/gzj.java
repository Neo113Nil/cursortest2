package xsna;

import android.location.Location;
import android.view.View;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.courier_map.feature.state.UnableToGetLocationException;
import com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapFragment;
import com.vk.location.common.LocationCommon;
import java.util.List;
import kotlin.Pair;
import xsna.xyj;

/* compiled from: CourierMapLocationOneTimeEventHandler.kt */
/* loaded from: classes18.dex */
public final class gzj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gzj(Object obj, int i) {
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
                    bVar.a(xyj.c.b.a.b);
                } else {
                    izjVar.a.a(new xyj.c.b.C4055b(new Coordinates(location.getLatitude(), location.getLongitude())));
                }
                break;
            default:
                float floatValue = ((Number) obj).floatValue();
                List list = (List) this.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) ((Pair) list.get(i)).i();
                    view.setScaleX(floatValue);
                    view.setScaleY(floatValue);
                    view.setAlpha(floatValue);
                }
                break;
        }
        return s3q0.a;
    }
}
