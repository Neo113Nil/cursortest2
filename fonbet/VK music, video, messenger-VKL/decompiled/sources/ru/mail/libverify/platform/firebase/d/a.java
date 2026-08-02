package ru.mail.libverify.platform.firebase.d;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;
import ru.mail.libverify.platform.core.ILog;
import ru.mail.libverify.platform.core.IPlatformUtils;
import ru.mail.libverify.platform.firebase.FirebaseCoreService;
import xsna.drm0;

/* loaded from: classes11.dex */
public final class a implements IPlatformUtils {
    @Override // ru.mail.libverify.platform.core.IPlatformUtils
    public final boolean checkGooglePlayServicesNewer(Context context) {
        String str;
        int[] iArr = b.a;
        if (c.a(context)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (str = packageManager.getPackageInfo("com.google.android.gms", 0).versionName) != null && str.length() != 0) {
                    List c0 = drm0.c0(str, new String[]{"."}, 0, 6);
                    if (c0.size() >= 2) {
                        for (int i = 0; i < 2; i++) {
                            int parseInt = Integer.parseInt((String) c0.get(i));
                            int i2 = iArr[i];
                            if (parseInt > i2) {
                                return true;
                            }
                            if (parseInt >= i2) {
                            }
                        }
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // ru.mail.libverify.platform.core.IPlatformUtils
    public final <T extends BroadcastReceiver> void disableReceiver(Context context, Class<T> cls) {
        FirebaseCoreService.Companion.getClass();
        ILog a = FirebaseCoreService.a.a();
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) cls), 2, 1);
            a.v("Utils", "disabled receiver: ".concat(cls.getName()));
        } catch (Throwable th) {
            a.e("Utils", "failed to disable receiver: ".concat(cls.getName()), th);
        }
    }

    @Override // ru.mail.libverify.platform.core.IPlatformUtils
    public final <T extends BroadcastReceiver> void enableReceiver(Context context, Class<T> cls) {
        FirebaseCoreService.Companion.getClass();
        ILog a = FirebaseCoreService.a.a();
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) cls), 1, 1);
            a.v("Utils", "enabled receiver: ".concat(cls.getName()));
        } catch (Throwable th) {
            a.e("Utils", "failed to enable receiver: ".concat(cls.getName()), th);
        }
    }

    @Override // ru.mail.libverify.platform.core.IPlatformUtils
    public final boolean hasGooglePlayServices(Context context) {
        return c.a(context);
    }
}
