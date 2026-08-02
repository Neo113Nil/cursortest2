package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class t401 {
    @Nullable
    public static <T extends Parcelable> T a(@Nullable Bundle bundle, String str) {
        ClassLoader classLoader = t401.class.getClassLoader();
        exc0.i(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return (T) bundle2.getParcelable(str);
    }

    public static void b(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable a = a(bundle, "MapOptions");
        if (a != null) {
            c(bundle2, "MapOptions", a);
        }
        Parcelable a2 = a(bundle, "StreetViewPanoramaOptions");
        if (a2 != null) {
            c(bundle2, "StreetViewPanoramaOptions", a2);
        }
        Parcelable a3 = a(bundle, SignalingProtocol.KEY_CAMERA);
        if (a3 != null) {
            c(bundle2, SignalingProtocol.KEY_CAMERA, a3);
        }
        if (bundle.containsKey(X3.i.L)) {
            bundle2.putString(X3.i.L, bundle.getString(X3.i.L));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void c(Bundle bundle, String str, @Nullable Parcelable parcelable) {
        ClassLoader classLoader = t401.class.getClassLoader();
        exc0.i(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
