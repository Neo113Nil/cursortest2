package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;

/* loaded from: classes12.dex */
public abstract class hua1 {
    public static final Bitmap a(l8v l8vVar) {
        if (l8vVar instanceof u92) {
            return ((u92) l8vVar).a;
        }
        w511.x("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final void b(BaseDivContextMvvmFragment baseDivContextMvvmFragment, String str) {
        baseDivContextMvvmFragment.getParentFragmentManager().m.remove(str);
        FragmentManager.O(2);
    }

    public static final String c(zuj0 zuj0Var, double d) {
        if (d < 995.0d) {
            return ((avj0) zuj0Var).i(kyh0.scooters_remaining_distance_in_metres, Integer.valueOf(m810.a(m810.a(d) / 10.0d) * 10));
        }
        double pow = Math.pow(10.0d, 1.0d);
        float rint = (float) (Math.rint((((float) d) / 1000.0f) * pow) / pow);
        return ((avj0) zuj0Var).i(kyh0.scooters_remaining_distance_in_km, qpa1.d(((double) rint) % 1.0d) ? Integer.valueOf((int) rint) : Float.valueOf(rint));
    }

    public static final String d(zuj0 zuj0Var, double d) {
        if (d < 995.0d) {
            return ((avj0) zuj0Var).i(kyh0.scooters_remaining_distance_in_metres, Integer.valueOf(m810.a(m810.a(d) / 10.0d) * 10));
        }
        if (d > 5000.0d) {
            return ((avj0) zuj0Var).i(kyh0.scooters_remaining_distance_in_km, Integer.valueOf((int) Math.rint(d / 1000.0d)));
        }
        double pow = Math.pow(10.0d, 1);
        float rint = (float) (Math.rint((((float) d) / 1000.0f) * pow) / pow);
        int i = (int) rint;
        return ((avj0) zuj0Var).i(kyh0.scooters_remaining_distance_in_km, ((double) Math.abs(rint - ((float) i))) < 0.1d ? Integer.valueOf(i) : Float.valueOf(rint));
    }

    public static final boolean e(DrivingRoute drivingRoute) {
        return drivingRoute.getMetadata().getTags().contains("green");
    }

    public static final void f(Bundle bundle, Fragment fragment, String str) {
        fragment.getParentFragmentManager().l0(bundle, str);
    }

    public static final void g(Fragment fragment, String str, wls wlsVar) {
        fragment.getParentFragmentManager().m0(str, fragment, new lcs(wlsVar));
    }

    public static final Bitmap.Config h(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
