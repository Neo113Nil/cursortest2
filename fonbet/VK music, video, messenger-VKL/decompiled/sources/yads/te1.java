package yads;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.e43;

/* loaded from: classes10.dex */
public final class te1 implements di1 {
    public final fi1 a;
    public final LocationManager b;
    public final n63 c;

    public te1(Context context, fi1 fi1Var) {
        this.a = fi1Var;
        Object systemService = context.getApplicationContext().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.b = locationManager;
        this.c = new n63(context.getApplicationContext(), locationManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    @Override // yads.di1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Location a() {
        List<String> list;
        Location location;
        LocationManager locationManager;
        LocationManager locationManager2;
        try {
            locationManager2 = this.b;
        } catch (Throwable unused) {
        }
        if (locationManager2 != null) {
            list = locationManager2.getAllProviders();
            if (list != null) {
                return null;
            }
            ListBuilder e = e43.e();
            for (String str : list) {
                n63 n63Var = this.c;
                boolean a = n63Var.b.a("android.permission.ACCESS_COARSE_LOCATION");
                boolean a2 = n63Var.b.a("android.permission.ACCESS_FINE_LOCATION");
                boolean contains = n63.c.contains(str);
                if (!n63.d.contains(str) ? !(contains || !a) : !(contains || !a || !a2)) {
                    try {
                        locationManager = n63Var.a;
                    } catch (Throwable unused2) {
                    }
                    if (locationManager != null) {
                        location = locationManager.getLastKnownLocation(str);
                        if (location == null) {
                            e.add(location);
                        }
                    }
                }
                location = null;
                if (location == null) {
                }
            }
            return this.a.a(e.g());
        }
        list = null;
        if (list != null) {
        }
    }
}
