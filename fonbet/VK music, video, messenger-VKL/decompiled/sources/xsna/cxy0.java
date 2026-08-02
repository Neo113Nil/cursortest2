package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* loaded from: classes13.dex */
public final class cxy0 {
    public static SharedPreferences a;

    public static synchronized SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (cxy0.class) {
            try {
                if (a == null) {
                    a = Preference.h(context.createDeviceProtectedStorageContext(), 0, "aegis");
                }
                sharedPreferences = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
