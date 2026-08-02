package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.vk.core.preference.Preference;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes.dex */
public final class xtk {
    public final gfe0 a;
    public final boolean b;

    public xtk(Context context, String str, gfe0 gfe0Var) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences h = Preference.h(createDeviceProtectedStorageContext, 0, "com.google.firebase.common.prefs:" + str);
        this.a = gfe0Var;
        boolean z = true;
        if (h.contains("firebase_data_collection_default_enabled")) {
            z = h.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.b = z;
    }
}
