package defpackage;

import android.net.Uri;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.map.data.repositories.g;
import com.yandex.go.places.map.domain.layer.c;
import java.util.Arrays;
import java.util.Iterator;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes13.dex */
public final class f3h {
    public final h3h a;
    public final PlacesNavigationMode b;
    public final c c;
    public final y4g d;
    public final jzz e;
    public final oep0 f;
    public final w2h g;

    public f3h(h3h h3hVar, PlacesNavigationMode placesNavigationMode, c cVar, y4g y4gVar, jzz jzzVar, oep0 oep0Var, w2h w2hVar) {
        this.a = h3hVar;
        this.b = placesNavigationMode;
        this.c = cVar;
        this.d = y4gVar;
        this.e = jzzVar;
        this.f = oep0Var;
        this.g = w2hVar;
    }

    public static zzs a(Double d, Double d2) {
        if (d == null || d2 == null) {
            jst.e.getClass();
            return null;
        }
        hst hstVar = jst.e;
        String.format("Got destination geo point from URI (lat:%s, lon:%s)", Arrays.copyOf(new Object[]{d, d2}, 2));
        hstVar.getClass();
        return new zzs(d.doubleValue(), d2.doubleValue(), 0, null, null, 28);
    }

    public final Boolean b(Uri uri) {
        String queryParameter;
        if ("route".equalsIgnoreCase(uri.getAuthority()) || "navigator".equalsIgnoreCase(uri.getAuthority()) || "transport_routes".equalsIgnoreCase(uri.getAuthority()) || "mobility_hub".equalsIgnoreCase(uri.getAuthority())) {
            Iterator it = this.c.b.values().iterator();
            while (it.hasNext()) {
                ((g) it.next()).k();
            }
        }
        boolean z = false;
        if (this.b != PlacesNavigationMode.DEEPLINK_NAVIGATION) {
            if ("route".equalsIgnoreCase(uri.getAuthority())) {
                zzs a = a(tcb1.d(uri.getQueryParameter("end-lat")), tcb1.d(uri.getQueryParameter("end-lon")));
                w2h w2hVar = this.g;
                w2hVar.getClass();
                String queryParameter2 = uri.getQueryParameter("end-type");
                String str = null;
                if (queryParameter2 != null && (queryParameter = uri.getQueryParameter("end-id")) != null) {
                    str = ((xnt) w2hVar.a).e(new lj80(queryParameter2, new oj80(queryParameter)), lj80.Companion.serializer());
                }
                if (a != null) {
                    ((pep0) this.f).f(new zsa(9, (y4c0) this.d.get(), new ybf(19, this), new dye(27, this)), new v4c0(a, RoutePointType.POINT_B, str), hxx.a);
                    z = true;
                }
            } else {
                boolean equalsIgnoreCase = "navigator".equalsIgnoreCase(uri.getAuthority());
                h3h h3hVar = this.a;
                if (equalsIgnoreCase) {
                    zzs a2 = a(tcb1.d(uri.getQueryParameter("dst_lat")), tcb1.d(uri.getQueryParameter("dst_lon")));
                    if (a2 != null) {
                        h3hVar.a(a2, uri.toString());
                        z = true;
                    }
                } else if ("transport_routes".equalsIgnoreCase(uri.getAuthority())) {
                    h3hVar.b(this.e.j(uri));
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
