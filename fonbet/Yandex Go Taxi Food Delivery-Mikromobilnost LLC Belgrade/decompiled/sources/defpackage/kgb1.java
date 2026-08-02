package defpackage;

import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import androidx.core.location.LocationListenerCompat;
import androidx.core.view.b;
import core.flex.ui.OrientationAwareRecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public abstract class kgb1 {
    public static Class a;
    public static Method b;

    public static final u1w a(OrientationAwareRecyclerView orientationAwareRecyclerView) {
        WeakHashMap weakHashMap = b.a;
        n751 a2 = op31.a(orientationAwareRecyclerView);
        if (a2 != null) {
            return a2.a.g(16);
        }
        return null;
    }

    public static final boolean b(ux8 ux8Var) {
        if (!(ux8Var instanceof ox8) && !(ux8Var instanceof sx8) && !(ux8Var instanceof qx8) && !(ux8Var instanceof tx8)) {
            if (ux8Var instanceof px8) {
                return ((px8) ux8Var).i;
            }
            w511.b();
        }
        return false;
    }

    public static boolean c(LocationManager locationManager, String str, mcz mczVar, Executor executor, LocationListenerCompat locationListenerCompat) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            try {
                if (a == null) {
                    a = Class.forName("android.location.LocationRequest");
                }
                if (b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", a, Executor.class, LocationListener.class);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                mczVar.getClass();
                LocationRequest d = i >= 31 ? d7z.d(mczVar) : xbm.d(ngb1.d(mczVar, str));
                if (d != null) {
                    b.invoke(locationManager, d, executor, locationListenerCompat);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
        }
        return false;
    }
}
