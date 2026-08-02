package xsna;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.vk.core.preference.Preference;
import java.util.UUID;
import xsna.i8i;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class oaj0 {

    @NonNull
    public static final i8i<?> b;
    public final Context a;

    static {
        i8i.a a = i8i.a(oaj0.class);
        a.a(gzl.b(qt20.class));
        a.a(gzl.b(Context.class));
        a.f = fp01.b;
        b = a.b();
    }

    public oaj0(@NonNull Context context) {
        this.a = context;
    }

    @NonNull
    public final synchronized String a() {
        String string = c().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        c().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public final synchronized long b() {
        return c().getLong("downloading_begin_time_" + pvf0.a(), 0L);
    }

    public final SharedPreferences c() {
        Context context = this.a;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager == null) {
            return Preference.h(context, 0, "com.google.mlkit.internal");
        }
        int storageEncryptionStatus = devicePolicyManager.getStorageEncryptionStatus();
        if (storageEncryptionStatus != 3 && storageEncryptionStatus != 5) {
            return Preference.h(context, 0, "com.google.mlkit.internal");
        }
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "com.google.mlkit.internal");
        return Preference.h(createDeviceProtectedStorageContext, 0, "com.google.mlkit.internal");
    }
}
