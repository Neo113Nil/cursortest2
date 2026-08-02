package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import defpackage.cjw0;
import defpackage.kr2;
import defpackage.p2v0;
import defpackage.th91;
import defpackage.zt5;
import java.util.Calendar;

/* loaded from: classes10.dex */
public final class k extends l {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ AppCompatDelegateImpl d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        super(appCompatDelegateImpl);
        this.d = appCompatDelegateImpl;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // androidx.appcompat.app.l
    public final IntentFilter b() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    @Override // androidx.appcompat.app.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c() {
        Location location;
        boolean z;
        long j;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!kr2.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                cjw0 cjw0Var = (cjw0) obj;
                p2v0 p2v0Var = (p2v0) cjw0Var.c;
                LocationManager locationManager = (LocationManager) cjw0Var.b;
                if (p2v0Var.b > System.currentTimeMillis()) {
                    z = p2v0Var.a;
                } else {
                    Context context = (Context) cjw0Var.a;
                    Location location2 = null;
                    if (th91.e(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        if (locationManager.isProviderEnabled("network")) {
                            location = locationManager.getLastKnownLocation("network");
                            if (th91.e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                try {
                                    if (locationManager.isProviderEnabled("gps")) {
                                        location2 = locationManager.getLastKnownLocation("gps");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (location2 != null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                                location = location2;
                            }
                            if (location == null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (zt5.f == null) {
                                    zt5.f = new zt5();
                                }
                                zt5 zt5Var = zt5.f;
                                zt5Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                                zt5Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                                z = zt5Var.a == 1;
                                long j2 = zt5Var.c;
                                long j3 = zt5Var.b;
                                zt5Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                                long j4 = zt5Var.c;
                                if (j2 == -1 || j3 == -1) {
                                    j = currentTimeMillis + 43200000;
                                } else {
                                    if (currentTimeMillis > j3) {
                                        j2 = j4;
                                    } else if (currentTimeMillis > j2) {
                                        j2 = j3;
                                    }
                                    j = j2 + 60000;
                                }
                                p2v0Var.a = z;
                                p2v0Var.b = j;
                            } else {
                                Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                                int i2 = Calendar.getInstance().get(11);
                                if (i2 < 6 || i2 >= 22) {
                                    z = true;
                                }
                            }
                        }
                    }
                    location = null;
                    if (th91.e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    }
                    if (location2 != null) {
                    }
                    location = location2;
                    if (location == null) {
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // androidx.appcompat.app.l
    public final void d() {
        int i = this.c;
        AppCompatDelegateImpl appCompatDelegateImpl = this.d;
        switch (i) {
            case 0:
                appCompatDelegateImpl.applyDayNight();
                break;
            default:
                appCompatDelegateImpl.applyDayNight();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AppCompatDelegateImpl appCompatDelegateImpl, cjw0 cjw0Var) {
        super(appCompatDelegateImpl);
        this.d = appCompatDelegateImpl;
        this.e = cjw0Var;
    }
}
