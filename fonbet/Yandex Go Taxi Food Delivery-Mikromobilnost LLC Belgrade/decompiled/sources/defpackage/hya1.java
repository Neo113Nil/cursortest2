package defpackage;

import android.content.res.Configuration;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public abstract class hya1 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LocationRequest a(ab2 ab2Var) {
        int i;
        int i2;
        long e;
        int i3 = mut.a[ab2Var.d.ordinal()];
        if (i3 == 1) {
            i = 100;
        } else if (i3 == 2) {
            i = 102;
        } else {
            if (i3 != 3) {
                if (i3 != 4) {
                    w511.b();
                    return null;
                }
                i2 = 105;
                long e2 = e3n.e(ab2Var.a);
                cvw.d("intervalMillis must be greater than or equal to 0", e2 < 0);
                zoa1.e(i2);
                e3n e3nVar = ab2Var.b;
                e = e3nVar == null ? e3n.e(e3nVar.a) : -1L;
                cvw.d("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", e != -1 || e >= 0);
                float f = (float) ab2Var.c;
                cvw.d("minUpdateDistanceMeters must be greater than or equal to 0", f >= 0.0f);
                if (e != -1) {
                    e = e2;
                } else if (i2 != 105) {
                    e = Math.min(e, e2);
                }
                return new LocationRequest(i2, e2, e, Math.max(0L, e2), ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, Integer.MAX_VALUE, f, true, -1 != -1 ? e2 : -1L, 0, 0, false, new WorkSource(null), null);
            }
            i = 104;
        }
        i2 = i;
        long e22 = e3n.e(ab2Var.a);
        cvw.d("intervalMillis must be greater than or equal to 0", e22 < 0);
        zoa1.e(i2);
        e3n e3nVar2 = ab2Var.b;
        if (e3nVar2 == null) {
        }
        cvw.d("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", e != -1 || e >= 0);
        float f2 = (float) ab2Var.c;
        cvw.d("minUpdateDistanceMeters must be greater than or equal to 0", f2 >= 0.0f);
        if (e != -1) {
        }
        return new LocationRequest(i2, e22, e, Math.max(0L, e22), ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, Integer.MAX_VALUE, f2, true, -1 != -1 ? e22 : -1L, 0, 0, false, new WorkSource(null), null);
    }

    public static final lum b(wls wlsVar, tls tlsVar) {
        byte b = 0;
        return new lum(new t1m0(b, 17), q5m0.a, new p5m0(wlsVar, tlsVar, b), r5m0.a);
    }

    public static void c(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    public static String d(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        w511.q();
        return null;
    }
}
