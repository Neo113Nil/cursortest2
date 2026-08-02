package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class q1z0 extends oi6 {
    public HashMap a;

    public static void h(Context context, HashMap hashMap) {
        String str;
        ContentResolver contentResolver;
        gu8.c(null, "GoogleAIdDataProvider: Send google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            str = advertisingIdInfo.getId();
            try {
                gu8.c(null, "GoogleAIdDataProvider: Google AId - " + str);
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                int i = !isLimitAdTrackingEnabled ? 1 : 0;
                gu8.c(null, "GoogleAIdDataProvider: Ad tracking enabled - " + isLimitAdTrackingEnabled);
                hashMap.put("advertising_id", str);
                hashMap.put("advertising_tracking_enabled", i + "");
            } catch (Throwable th) {
                th = th;
                eb3.a(null, new StringBuilder("GoogleAIdDataProvider: Failed to send google AId - "), th);
                if ((str != null || str.length() == 0) ? false : !str.matches("^[0]+(-[0]+)+$")) {
                    return;
                } else {
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        if (((str != null || str.length() == 0) ? false : !str.matches("^[0]+(-[0]+)+$")) || (contentResolver = context.getContentResolver()) == null) {
            return;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        hashMap.put("android_id", string);
    }

    public final synchronized Map g(Context context) {
        if (o8z0.b()) {
            gu8.c(null, "GoogleAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.a == null) {
            HashMap hashMap = new HashMap();
            this.a = hashMap;
            h(context, hashMap);
        }
        return new HashMap(this.a);
    }
}
