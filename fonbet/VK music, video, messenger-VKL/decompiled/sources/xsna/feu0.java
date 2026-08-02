package xsna;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.core.preference.Preference;

/* compiled from: VkBaseDeviceIdProvider.kt */
/* loaded from: classes11.dex */
public abstract class feu0 implements rgn0 {
    @Override // xsna.rgn0
    public final String getDeviceId() {
        String s;
        s = Preference.s("device_id_storage", "googleDeviceId", new String());
        if (s.length() > 0) {
            return s;
        }
        return null;
    }

    @Override // xsna.rgn0
    public final void init(Context context) {
        String str;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                try {
                    str = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
                } catch (Throwable unused) {
                    str = null;
                }
                if (str != null) {
                    Preference.H("device_id_storage", "googleDeviceId", str);
                    return;
                }
                return;
            }
        } catch (Throwable unused2) {
        }
        par0.a.getClass();
        par0.e("googleDeviceId isn't available");
    }
}
