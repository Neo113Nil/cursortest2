package yads;

import android.content.Context;
import android.location.LocationManager;
import java.util.Collections;
import java.util.HashSet;
import xsna.e43;

/* loaded from: classes10.dex */
public final class n63 {
    public static final HashSet c = new HashSet(Collections.singletonList("gps"));
    public static final HashSet d = new HashSet(e43.l("gps", "passive"));
    public final LocationManager a;
    public final hd2 b;

    public /* synthetic */ n63(Context context, LocationManager locationManager) {
        this(locationManager, new hd2(context));
    }

    public n63(LocationManager locationManager, hd2 hd2Var) {
        this.a = locationManager;
        this.b = hd2Var;
    }
}
