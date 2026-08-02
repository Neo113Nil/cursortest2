package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.core.preference.Preference;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes.dex */
public final class wtk {
    public final SharedPreferences a;
    public final vhr b;
    public final Object c;
    public TaskCompletionSource<Void> d;
    public boolean e;

    @Nullable
    public Boolean f;
    public final TaskCompletionSource<Void> g;

    public wtk(vhr vhrVar) {
        Object obj = new Object();
        this.c = obj;
        this.d = new TaskCompletionSource<>();
        this.e = false;
        this.g = new TaskCompletionSource<>();
        vhrVar.a();
        Context context = vhrVar.a;
        this.b = vhrVar;
        SharedPreferences h = Preference.h(context, 0, "com.google.firebase.crashlytics");
        this.a = h;
        Boolean valueOf = h.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(h.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        this.f = valueOf == null ? a(context) : valueOf;
        synchronized (obj) {
            try {
                if (b()) {
                    this.d.trySetResult(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a(Context context) {
        Boolean bool;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
            bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (bool != null) {
                return null;
            }
            return Boolean.valueOf(Boolean.TRUE.equals(bool));
        }
        bool = null;
        if (bool != null) {
        }
    }

    public final synchronized boolean b() {
        boolean z;
        Boolean bool = this.f;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                z = this.b.i();
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        return z;
    }
}
