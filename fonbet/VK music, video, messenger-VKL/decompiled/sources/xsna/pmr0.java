package xsna;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.core.preference.Preference;
import java.util.List;

/* compiled from: VendorHelper.kt */
/* loaded from: classes11.dex */
public final class pmr0 {
    public static volatile boolean a;
    public static volatile boolean b;
    public static volatile boolean c;
    public static final List<String> d = e43.l("com.vk.vendor.pushes.HuaweiPushService", "com.huawei.hms.support.api.push.service.HmsMsgService");

    public static boolean a(Context context) {
        if (!Preference.v("vendor", "play_services_available")) {
            Preference.I("vendor", "play_services_available", GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0);
        }
        if (!a) {
            Context applicationContext = context.getApplicationContext();
            a = true;
            asu0.a.getClass();
            asu0.o().execute(new l8i(applicationContext, 2));
        }
        return Preference.d("vendor", "play_services_available", false);
    }

    public static boolean b(Context context) {
        if (!Preference.v("vendor", "hms_services_available")) {
            Preference.I("vendor", "hms_services_available", false);
            asu0.a.getClass();
            asu0.o().execute(new wcn(context, 2));
        }
        if (!b) {
            Context applicationContext = context.getApplicationContext();
            b = true;
            asu0.a.getClass();
            asu0.o().execute(new jvn(applicationContext, 3));
        }
        return Preference.d("vendor", "hms_services_available", false);
    }
}
