package defpackage;

import android.util.Log;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.Purpose;
import com.yandex.mapkit.location.SubscriptionSettings;
import com.yandex.mapkit.location.UseInBackground;
import com.yandex.mapkit.navigation.transport.Navigation;
import java.util.Map;

/* loaded from: classes7.dex */
public final class o311 extends q35 {
    public final /* synthetic */ int c = 0;
    public final fni0 d;
    public Object e;

    public o311(ssr ssrVar, v9z v9zVar) {
        super(ssrVar, "location_manager_listener");
        this.d = v9zVar;
        this.e = new hv00();
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.d;
        switch (i) {
            case 0:
                n311 n311Var = (n311) this.e;
                if (n311Var != null) {
                    ((Navigation) ((f311) fni0Var).a).removeListener(n311Var);
                    this.e = null;
                    break;
                }
                break;
            default:
                v9z v9zVar = (v9z) fni0Var;
                LocationManager locationManager = v9zVar.a() ? (LocationManager) v9zVar.a : null;
                if (locationManager != null) {
                    locationManager.unsubscribe((hv00) this.e);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.d;
        switch (i) {
            case 0:
                n311 n311Var = new n311(this);
                ((Navigation) ((f311) fni0Var).a).addListener(n311Var);
                this.e = n311Var;
                break;
            default:
                if (!wk00.y) {
                    Log.e("mapkit_plugin", "trying to listen mapkit location manager while its not initialized");
                    break;
                } else {
                    Map map = obj instanceof Map ? (Map) obj : null;
                    if (map != null) {
                        boolean booleanValue = ((Boolean) map.get("allow_in_background")).booleanValue();
                        v9z v9zVar = (v9z) fni0Var;
                        if (!v9zVar.a()) {
                            v9zVar.a = MapKitFactory.getInstance().createLocationManager();
                        }
                        ((LocationManager) v9zVar.a).subscribeForLocationUpdates(new SubscriptionSettings(booleanValue ? UseInBackground.ALLOW : UseInBackground.DISALLOW, Purpose.GENERAL), (hv00) this.e);
                        break;
                    }
                }
                break;
        }
    }

    public o311(ssr ssrVar, f311 f311Var) {
        super(ssrVar, "transport_navigation_listener");
        this.d = f311Var;
    }
}
